/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahsan.daoImpl;

import com.ahsan.daoInterface.PageRepositoryInterface;
import com.ahsan.domain.TblArticle;
import com.ahsan.genericDAO.GenericRepositoryInterfaceImpl;
import java.util.Collection;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
@Transactional
public class PageRepositoryImplementation extends GenericRepositoryInterfaceImpl<TblArticle> implements PageRepositoryInterface{
    
    public PageRepositoryImplementation() {
		// TODO Auto-generated constructor stub
                super(TblArticle.class);
	}
    
    @Override
     public Collection<TblArticle> getAllArticle(){
     	TypedQuery<TblArticle> query;
            query = entityManager.createQuery("select a from TblArticle a", TblArticle.class);
		return query.getResultList();

     } 
    
}
