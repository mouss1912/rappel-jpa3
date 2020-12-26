package com.managers;

import javax.persistence.EntityManager;

public class MasterManager {
	private EntityManager em;

	public MasterManager(EntityManager em) {
		super();
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
}
