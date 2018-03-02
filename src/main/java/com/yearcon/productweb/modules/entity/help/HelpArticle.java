package com.yearcon.productweb.modules.entity.help;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author ayong
 * @create 2018-03-02 9:21
 **/
@Entity
@Table(name = "help_article", schema = "jeeplus_schema", catalog = "")
@Data
public class HelpArticle {
    @Id
    private String id;
    private String title;
    private String content;
    private String keyword;
    private String type;
    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;
    private String available;
    private String author;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelpArticle that = (HelpArticle) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(keyword, that.keyword) &&
                Objects.equals(type, that.type) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(available, that.available) &&
                Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, content, keyword, type, createDate, available, author);
    }
}
