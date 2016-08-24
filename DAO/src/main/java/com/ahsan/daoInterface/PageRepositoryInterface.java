/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahsan.daoInterface;

import com.ahsan.domain.TblArticle;
import com.ahsan.genericDAO.GenericRepositoryInterface;
import java.util.Collection;

/**
 *
 * @author HP
 */
public interface PageRepositoryInterface extends GenericRepositoryInterface<TblArticle>{
    public Collection<TblArticle> getAllArticle();
}
