package com.coderhouse.interfaces;

import java.util.List;

public interface DAOInterface<T> {

	T save(T object);

	T getById(Integer id);

	List<T> getAll();

	T update(Integer id, T object) throws Exception;

	void delete(Integer id);

}