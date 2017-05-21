package com.fincasmendoza.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fincasmendoza.domain.Product;

//Spring permite creaci�n autom�tica de beans de acceso a datos mediante la anotaci�n @Repository.
@Repository(value = "productDAO")
public class ProductDAOImpl implements ProductDAO {

	private EntityManager em;

	/*
	 * Sets the entity manager.
	 * 
	 * @Persistence es utiliza para inyectar autom�ticamente el EntityManager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	// Transactional permite utilizar de forma transparente los rollbacks
	// commits etc.
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Product> getProductList() {
		return em.createQuery("select p from Product p order by p.id").getResultList();
	}

	@Transactional(readOnly = false)
	public int saveProduct(Product prod) {
		em.merge(prod);
		return 0;
	}
}
