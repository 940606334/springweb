package com.yearcon.productweb.modules.service.help;

import com.yearcon.productweb.modules.dao.help.ArticleDao;
import com.yearcon.productweb.modules.entity.help.HelpArticle;
import com.yearcon.productweb.modules.entity.help.HelpLink;
import com.yearcon.productweb.modules.entity.help.HelpSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ayong
 * @create 2018-03-02 10:23
 **/
@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;
    /**找出所有可用的文章**/
    public List<HelpArticle> findList(){
        return articleDao.findAllByAvailable("1");
    }
    /**根据id查询文章**/
    public HelpArticle findOne(String id){
        return articleDao.findOne(id);
    }
    @Autowired
    private SearchService searchService;

    @Autowired
    private LinkService linkService;

    /**
     * 搜索关键字
     * @param Keyword
     * @return
     */
    public List<HelpArticle> searchList(String Keyword){
        searchService.save(Keyword);
        List<HelpSearch> helpSearchList=searchService.fuzzyQuery(Keyword);
        List<String> articleIdList=new ArrayList<>();
        for (HelpSearch helpSearch:helpSearchList){
            List<HelpLink> helpLinks=linkService.findBySearchId(helpSearch.getId());
            for (HelpLink helpLink:helpLinks){
                articleIdList.add(helpLink.getArticleId());
            }
        }
        List<String> unique=articleIdList.stream().distinct().collect(Collectors.toList());
        List<HelpArticle> helpArticles=new ArrayList<>();
        for(String id:unique){
            HelpArticle helpArticle=findOne(id);
            helpArticles.add(helpArticle);
        }
        return helpArticles;
    }
}
