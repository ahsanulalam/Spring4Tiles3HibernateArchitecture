/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahsan.serviceImpl;

import com.ahsan.daoInterface.PageRepositoryInterface;
import com.ahsan.domain.TblArticle;
import com.ahsan.service.PageServiceInterface;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 
 * @author HP
 */
@Service
public class PageServiceImplementation implements PageServiceInterface{
    
    @Autowired
    protected PageRepositoryInterface pageRepositoryInterface;
    
    @Override
    public Collection<TblArticle> getAllArticle() {
		// TODO Auto-generated method stub
		return pageRepositoryInterface.getAllArticle();
	}
}
