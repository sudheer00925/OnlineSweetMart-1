package com.cg.onlinesweetmartapplication.service;

import java.util.List;

<<<<<<< HEAD
import com.cg.onlinesweetmartapplication.entity.SweetItem;
import com.cg.onlinesweetmartapplication.exceptions.SweetItemNotFoundException;

public interface SweetItemService {

	public SweetItem addSweetItem(SweetItem SweetItem);
	public SweetItem updateSweetItem(SweetItem SweetItem) throws SweetItemNotFoundException;
	public SweetItem cancelSweetItem(int SweetItemId) throws SweetItemNotFoundException;
	public List<SweetItem> showAllSweetItems();
=======
import com.cg.onlinesweetmartapplication.exceptions.SweetItemNotFoundException;
import com.cg.onlinesweetmartapplication.model.SweetItemDTO;

public interface SweetItemService {

	public SweetItemDTO addSweetItem(SweetItemDTO SweetItem);
	public SweetItemDTO updateSweetItem(SweetItemDTO SweetItem) throws SweetItemNotFoundException;
	public SweetItemDTO cancelSweetItem(int SweetItemId) throws SweetItemNotFoundException;
	public List<SweetItemDTO> showAllSweetItems();
>>>>>>> branch 'master' of https://github.com/sudheer00925/OnlineSweetMart-1.git

}
