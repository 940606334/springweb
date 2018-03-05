package com.yearcon.productweb.modules.dao.help;

import com.yearcon.productweb.modules.entity.help.HelpSearch;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author ayong
 * @create 2018-03-05 9:27
 **/
public interface SearchDao  extends CrudRepository<HelpSearch,Integer>{

    HelpSearch findByKeyword(String keyword);

    @Query(value="select * from help_search a where a.keyword like CONCAT('%',:keyword,'%')" ,nativeQuery=true)
    List<HelpSearch> fuzzyQuery(@Param("keyword") String keyword);
}
