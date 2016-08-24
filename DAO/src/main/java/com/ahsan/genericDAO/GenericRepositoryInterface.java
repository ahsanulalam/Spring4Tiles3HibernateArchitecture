/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahsan.genericDAO;

/**
 *
 * @author HP
 * @param <T>
 */
public interface GenericRepositoryInterface<T> {
    public T save(T obj);
    public Boolean delete(T obj);
    public T edit(T obj);
  //  public T find(Integer empId);
    
	  
}
