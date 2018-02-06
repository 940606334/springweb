package com.yearcon.productweb.modules.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author ayong
 * @create 2018-02-05 16:24
 **/
@Entity
@Data
@Table(name = "product_care", schema = "jeeplus_schema", catalog = "")
public class ProductCare {
    @Id
    private String id;
    @Basic
    @Column(name = "product_no")
    private String productNo;
    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;
    @Basic
    @Column(name = "update_date")
    private Timestamp updateDate;
    @Basic
    @Column(name = "create_by")
    private String createBy;
    @Basic
    private String content;
    @Basic
    private String type;
    @Basic
    @Column(name = "twocode_url")
    private String twocodeUrl;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCare that = (ProductCare) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(productNo, that.productNo) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(content, that.content) &&
                Objects.equals(type, that.type) &&
                Objects.equals(twocodeUrl, that.twocodeUrl);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, productNo, createDate, updateDate, createBy, content, type, twocodeUrl);
    }
}
