package com.yearcon.productweb.modules.service.help;

import com.yearcon.productweb.modules.dao.help.ArticleDao;
import com.yearcon.productweb.modules.entity.help.HelpArticle;
import javassist.compiler.ast.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<HelpArticle> searchList(String Keyword){
        return articleDao.findByAvailableAndKeyword("1", Keyword);
    }
}
