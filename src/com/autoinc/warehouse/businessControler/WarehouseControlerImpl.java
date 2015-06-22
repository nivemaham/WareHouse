package com.autoinc.warehouse.businessControler;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.autoinc.warehouse.dao.InventoryDAO;
import com.autoinc.warehouse.util.HibernateUtil;
import com.autoinc.warehouse.util.HibernateUtilImpl;
import com.autoinc.warehouse.util.WareHouseException;

public class WarehouseControlerImpl implements WarehouseControler {

	HibernateUtil hibernateUtil = new HibernateUtilImpl();

	@Override
	public Boolean checkAvailability(int productId, int quantity) throws WareHouseException{

		Session session = hibernateUtil.getSession();
		session.beginTransaction();
		Query query = session
				.createQuery("from InventoryDAO where warehouseId=1 and productSpecId=:prodId ");
		query.setParameter("prodId", productId);

		@SuppressWarnings("unchecked")
		List<InventoryDAO> inventory = (List<InventoryDAO>) query.list();
		
		session.getTransaction().commit();
		session.close();
		if(inventory==null || inventory.size()==0)
		{
			return false;
//			throw new WareHouseException("No product specification available for id "+productId);
		}
		if (inventory.get(0).getQuantity() > quantity) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean reserveProducts(int productSpecId, int qunatity)
			throws WareHouseException {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		String hql = "SELECT E FROM InventoryDAO E WHERE E.productSpecId =:productSpecId";
		Query query = session.createQuery(hql);
		query.setParameter("productSpecId", productSpecId);
		List<InventoryDAO> results = (List<InventoryDAO>) query.list();

		if (results.isEmpty()) {
			session.getTransaction().commit();
			session.close();
			throw new WareHouseException("No products available for spec "
					+ productSpecId);
		}
		
		if(results.get(0).getQuantity()-qunatity>0)
		{
			results.get(0).setQuantity(results.get(0).getQuantity()-qunatity);
			session.saveOrUpdate(results.get(0));
		}
		else if(results.size()>1 &&results.get(1).getQuantity()-qunatity>0){
			results.get(1).setQuantity(results.get(1).getQuantity()-qunatity);
			session.saveOrUpdate(results.get(1));
		}
		else{
			throw new WareHouseException(qunatity+" Products are not available in stock for spec "
					+ productSpecId);
		}
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean freeReservedProducts(int productSpecId, int qunatity , int warehouseId)
			throws WareHouseException {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		String hql = "SELECT E FROM InventoryDAO E WHERE E.productSpecId =:productSpecId and E.warehouse.id=:warehouseId";
		Query query = session.createQuery(hql);
		query.setParameter("productSpecId", productSpecId);
		query.setParameter("warehouseId", warehouseId);
		List<InventoryDAO> results = (List<InventoryDAO>) query.list();

		if (results.isEmpty()) {
			session.getTransaction().commit();
			session.close();
			throw new WareHouseException("No products reserved for spec "
					+ productSpecId);
		}
		
			results.get(0).setQuantity(results.get(0).getQuantity()+qunatity);
			session.saveOrUpdate(results.get(0));
//			throw new WareHouseException(qunatity+" Products are not available in stock for spec "
//					+ productSpecId);
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
		
		