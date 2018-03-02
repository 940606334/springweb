package com.yearcon.productweb.modules.dao.help;

import com.yearcon.productweb.modules.entity.help.HelpArticle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleDao extends CrudRepository<HelpArticle,String> {
    List<HelpArticle> findAllByAvailable(String available);

     @Override
    HelpArticle findOne(String id);
    @Query(value="select * from help_article a where a.keyword like CONCAT('%',:keyword,'%')" +
            "AND a.available=:available",nativeQuery=true)
     List<HelpArticle> findByAvailableAndKeyword(@Param("available") String available,
                                                 @Param("keyword") String keyword);
}
