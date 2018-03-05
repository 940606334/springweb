package com.yearcon.productweb.modules.web.help;

import com.yearcon.productweb.common.json.JsonResult;
import com.yearcon.productweb.modules.entity.help.HelpArticle;
import com.yearcon.productweb.modules.entity.sys.SysDict;
import com.yearcon.productweb.modules.service.help.ArticleService;
import com.yearcon.productweb.modules.service.sys.DicService;
import com.yearcon.productweb.modules.service.help.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ayong
 * @create 2018-03-01 15:41
 **/
@Controller
@RequestMapping(value = "help")
public class HelpController {
    @Autowired
    private DicService dicService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private SearchService searchService;
    @RequestMapping(value = "index")
    public String index(Model model, String keyword){
        //System.out.println("index()");
        model.addAttribute("searchListSize",-1);
        if (keyword!=null&&(!"".equals(keyword))){
            List<HelpArticle> helpArticles = articleService.searchList(keyword);
            model.addAttribute("searchList",helpArticles);
            model.addAttribute("searchListSize",helpArticles.size());
        }
        List<SysDict> help_for = dicService.findByType("help_type");
        model.addAttribute("dictList",help_for);
        List<HelpArticle> list = articleService.findList();
        model.addAttribute("articleList",list);
        model.addAttribute("keyword",keyword);
        return "modules/help/default";
    }

    @RequestMapping(value="article_info")
    @ResponseBody
    public JsonResult getArticle(String id){
        HelpArticle one = articleService.findOne(id);
        return new JsonResult(true,"操作成功",one);
    }

    /*@RequestMapping(value = "search")
    @ResponseBody
    public JsonResult search(String keyword){
        List<HelpArticle> helpArticles = articleService.searchList(keyword);
        if(helpArticles.size()==0){
            return new JsonResult(false,"对不起，没有找到“"+keyword+"“相关的信息");
        }
        return new JsonResult(true,"共找到"+helpArticles.size()+"条相关结果",helpArticles);
    }*/
}
