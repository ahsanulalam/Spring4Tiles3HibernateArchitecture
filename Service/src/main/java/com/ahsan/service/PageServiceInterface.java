/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahsan.service;

import com.ahsan.domain.TblArticle;
import java.util.Collection;

/**
 *
 * @author HP
 */
public interface PageServiceInterface {
    public Collection<TblArticle> getAllArticle();
}
