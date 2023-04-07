package com.jsp.jese8.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.jese8.dto.EmpDto;

public class EmpDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(EmpDto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();

	}

	public void update(int id, String role) {
		EmpDto e1 = entityManager.find(EmpDto.class, id);
		e1.setRole(role);
		entityTransaction.begin();
		entityManager.merge(e1);
		entityTransaction.commit();

	}

	public void delete(int id) {
		EmpDto e1 = entityManager.find(EmpDto.class, id);
		entityTransaction.begin();
		entityManager.remove(e1);
		entityTransaction.commit();
	}

	public EmpDto fetchbyId(int id) {
		EmpDto e1 = entityManager.find(EmpDto.class, id);

		return e1;

	}

	public List<EmpDto> fetchAll() {
		Query query = entityManager.createQuery("select x from EmpDto x");
		List<EmpDto> dto = query.getResultList();
		return dto;

	}
}