package com.fincasmendoza.repossitory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fincasmendoza.domain.Product;


//Spring permite creación automática de beans de acceso a datos mediante la anotación @Repository.
@Repository(value = "productDAO")
public class ProductDAOImpl implements ProductDAO {

	private EntityManager em;

	/*
	 * Sets the entity manager.
	 * @Persistence es utiliza para inyectar automáticamente el EntityManager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

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
