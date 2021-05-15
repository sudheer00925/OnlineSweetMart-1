package com.cg.onlinesweetmartapplication.repository;

import java.util.List;
<<<<<<< HEAD
import com.cg.onlinesweetmartapplication.entity.SweetOrder;
import com.cg.onlinesweetmartapplication.exceptions.SweetOrderNotFoundException;

public interface SweetOrderRepository  {

	public SweetOrder addSweetOrder(SweetOrder sweetOrder);
	public SweetOrder updateSweetOrder(SweetOrder sweetOrder) throws SweetOrderNotFoundException;
	public SweetOrder cancelSweetOrder(int sweetOrderId) throws SweetOrderNotFoundException;
	public List<SweetOrder> showAllSweetOrders();
=======

import com.cg.onlinesweetmartapplication.exceptions.SweetOrderNotFoundException;
import com.cg.onlinesweetmartapplication.model.SweetOrderDTO;

public interface SweetOrderRepository  {

	public SweetOrderDTO addSweetOrder(SweetOrderDTO sweetOrder);
	public SweetOrderDTO updateSweetOrder(SweetOrderDTO sweetOrder) throws SweetOrderNotFoundException;
	public SweetOrderDTO cancelSweetOrder(int sweetOrderId) throws SweetOrderNotFoundException;
	public List<SweetOrderDTO> showAllSweetOrders();
>>>>>>> branch 'master' of https://github.com/sudheer00925/OnlineSweetMart-1.git
	public double calculateTotalCost(int sweetOrderId);
	
}
