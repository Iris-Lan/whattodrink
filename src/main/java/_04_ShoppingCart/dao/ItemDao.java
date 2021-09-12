package _04_ShoppingCart.dao;

import java.util.List;
import java.util.Set;

import _04_ShoppingCart.model.ItemBean;
import _04_ShoppingCart.model.ItemToppingBean;

public interface ItemDao {

	void save(ItemBean itemBean);
	
	void updateItemStatus(ItemBean itemBean, String itemStatus);

	List<ItemBean> findByOrderId(String order_id);
	
	ItemBean findById(Integer item_id);
	
	List<ItemBean> findAllUnfinishedItemsByOrderIdOrderByOrderDate(String order_id);
	
	
	String getHealthReminderByCustomerId(Integer customerId);

	void updateItemBean(ItemBean itemBean);

	

//	void deleteOrderItemById(Integer item_id);
	


}
