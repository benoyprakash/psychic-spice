package com.classifieds.repository;

public interface ClassifiedsRepository {
	int executeNativeQuery(String sqlString);

	Object merge(Object domain);

	void persist(Object domain);

	void remove(Object domain);

	void flush();
}
