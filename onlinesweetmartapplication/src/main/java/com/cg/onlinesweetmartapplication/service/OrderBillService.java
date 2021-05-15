package com.cg.onlinesweetmartapplication.service;

import java.util.List;

<<<<<<< HEAD
import com.cg.onlinesweetmartapplication.entity.OrderBill;
import com.cg.onlinesweetmartapplication.exceptions.OrderBillNotFoundException;

public interface OrderBillService {
	public OrderBill addOrderBill(OrderBill OrderBill);
	public OrderBill updateOrderBill(OrderBill OrderBill) throws OrderBillNotFoundException;
	public OrderBill cancelOrderBill(int OrderBillId) throws OrderBillNotFoundException;
	public List<OrderBill> showAllOrderBills();
	public List<OrderBill> showAllOrderBills(int OrderBilldId);
=======
import com.cg.onlinesweetmartapplication.exceptions.OrderBillNotFoundException;
import com.cg.onlinesweetmartapplication.model.OrderBillDTO;

public interface OrderBillService {
	public OrderBillDTO addOrderBill(OrderBillDTO OrderBill);
	public OrderBillDTO updateOrderBill(OrderBillDTO OrderBill) throws OrderBillNotFoundException;
	public OrderBillDTO cancelOrderBill(int OrderBillId) throws OrderBillNotFoundException;
	public List<OrderBillDTO> showAllOrderBills();
	public List<OrderBillDTO> showAllOrderBills(int OrderBilldId);
>>>>>>> branch 'master' of https://github.com/sudheer00925/OnlineSweetMart-1.git

}
