package com.yearcon.productweb.modules.entity.help;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author ayong
 * @create 2018-03-05 13:44
 **/
@Entity
@Table(name = "help_link", schema = "jeeplus_schema", catalog = "")
@Data
public class HelpLink {
    @Id
    private String id;
    @Basic
    @Column(name = "search_id")
    private Integer searchId;
    @Basic
    @Column(name = "article_id")
    private String articleId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelpLink helpLink = (HelpLink) o;
        return Objects.equals(id, helpLink.id) &&
                Objects.equals(searchId, helpLink.searchId) &&
                Objects.equals(articleId, helpLink.articleId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, searchId, articleId);
    }
}
