package com.cg.onlinesweetmartapplication.repository;


import java.util.List;

<<<<<<< HEAD
import com.cg.onlinesweetmartapplication.entity.Cart;
import com.cg.onlinesweetmartapplication.exceptions.CartNotFoundException;

public interface CartRepository {

	public Cart addCart(Cart Cart);
	public Cart updateCart(Cart Cart) throws CartNotFoundException;
	public Cart cancelCart(int CartId) throws CartNotFoundException;
	public List<Cart> showAllCarts();
	public List<Cart> showAllCarts(int cartdId);
=======
import com.cg.onlinesweetmartapplication.exceptions.CartNotFoundException;
import com.cg.onlinesweetmartapplication.model.CartDTO;

public interface CartRepository {

	public CartDTO addCart(CartDTO Cart);
	public CartDTO updateCart(CartDTO Cart) throws CartNotFoundException;
	public CartDTO cancelCart(int CartId) throws CartNotFoundException;
	public List<CartDTO> showAllCarts();
	public List<CartDTO> showAllCarts(int cartdId);
>>>>>>> branch 'master' of https://github.com/sudheer00925/OnlineSweetMart-1.git
}
