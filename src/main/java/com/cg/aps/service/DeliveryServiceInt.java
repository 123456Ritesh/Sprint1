package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.DeliveryEntity;



public interface DeliveryServiceInt {

	public long add(DeliveryEntity bean);
	
	public void update(DeliveryEntity bean);
	
	public void delete(DeliveryEntity bean);
	
	public DeliveryEntity findByName(String name);
	
	public DeliveryEntity findByPk(long id);
	
	public List<DeliveryEntity> search(DeliveryEntity bean, long pageNo, int pageSize);
	
	public List<DeliveryEntity> search(DeliveryEntity bean);
	
	
}
