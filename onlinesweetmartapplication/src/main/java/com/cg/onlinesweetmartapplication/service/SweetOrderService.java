package com.cg.onlinesweetmartapplication.service;

import java.util.List;
import com.cg.onlinesweetmartapplication.entity.SweetOrder;
import com.cg.onlinesweetmartapplication.exceptions.SweetOrderNotFoundException;

public interface SweetOrderService  {

	public SweetOrder addSweetOrder(SweetOrder sweetOrder);
	public SweetOrder updateSweetOrder(SweetOrder sweetOrder) throws SweetOrderNotFoundException;
	public SweetOrder cancelSweetOrder(int sweetOrderId) throws SweetOrderNotFoundException;
	public List<SweetOrder> showAllSweetOrders();
	public double calculateTotalCost(int sweetOrderId);
	
}
