package com.classifieds.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ClassifiedsRepositoryImpl implements ClassifiedsRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public int executeNativeQuery(String sqlString) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object merge(Object domain) {
		em.merge(domain);
		return null;
	}

	@Override
	public void persist(Object domain) {
		// TODO Auto-generated method stub
		em.persist(domain);
		
	}

	@Override
	public void remove(Object domain) {
		// TODO Auto-generated method stub
		em.remove(domain);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
	}
	
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

}
