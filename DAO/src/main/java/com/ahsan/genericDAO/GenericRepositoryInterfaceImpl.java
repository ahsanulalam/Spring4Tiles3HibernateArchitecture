/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahsan.genericDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
import javax.transaction.Transactional;


@Repository
@Transactional
public class GenericRepositoryInterfaceImpl<T> implements GenericRepositoryInterface<T> {

    @PersistenceContext
    protected EntityManager entityManager;
    
    private Class<T> type;
    
    public GenericRepositoryInterfaceImpl()
    {
                
    }
    public GenericRepositoryInterfaceImpl(Class<T> type)
    {
        this.type = type;
                
    }
    
    @Override
    public T save(T obj) {
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        //entityManager.flush();
        return obj;
    }

    @Override
    public Boolean delete(T obj) {
        try{
        entityManager.remove(obj);
        } catch (Exception ex){
            return false;
        }
        return true;
    }

    @Override
    public T edit(T obj) {
        try{
            return entityManager.merge(obj);
        }catch (Exception ex){
            return null;
        }
    }
    
   /* @Override
	public T find(Integer empId) {
		// TODO Auto-generated method stub
		return entityManager.find(type.class, empId);
	}*/
}
