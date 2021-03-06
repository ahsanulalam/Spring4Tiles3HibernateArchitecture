package com.ahsan.domain;
// Generated Feb 4, 2016 3:37:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TblPageMaster generated by hbm2java
 */
@Entity
@Table(name="tblPageMaster"
    ,schema="dbo"
    ,catalog="dbAhsan"
)
public class TblPageMaster  implements java.io.Serializable {


     private int id;
     private Integer userid;
     private Set<TblPageDetail> tblPageDetails = new HashSet<>(0);

    public TblPageMaster() {
    }

	
    public TblPageMaster(int id) {
        this.id = id;
    }
    public TblPageMaster(int id, Integer userid, Set tblPageDetails) {
       this.id = id;
       this.userid = userid;
       this.tblPageDetails = tblPageDetails;
    }
   
     @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="userid")
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tblPageMaster")
    public Set<TblPageDetail> getTblPageDetails() {
        return this.tblPageDetails;
    }
    
    public void setTblPageDetails(Set<TblPageDetail> tblPageDetails) {
        this.tblPageDetails = tblPageDetails;
    }




}


