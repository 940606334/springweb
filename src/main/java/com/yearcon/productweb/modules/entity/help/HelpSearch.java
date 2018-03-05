package com.yearcon.productweb.modules.entity.help;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author ayong
 * @create 2018-03-05 9:25
 **/
@Entity
@Table(name = "help_search", schema = "jeeplus_schema", catalog = "")
@Data
public class HelpSearch {
    @Id
    @GeneratedValue
    private int id;
    private String keyword;
    private int count;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelpSearch that = (HelpSearch) o;
        return id == that.id &&
                count == that.count &&
                Objects.equals(keyword, that.keyword);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, keyword, count);
    }
}
