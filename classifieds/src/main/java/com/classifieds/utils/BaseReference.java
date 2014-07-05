package com.classifieds.utils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaseReference<E extends BaseReference<E>> {

	private String name;

	private int code;

	private String label;

	private String description;

	public String getName() {
		return name;
	}

	public long getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}

	public String getDescription() {
		return description;
	}

	private static Map<Class<? extends BaseReference<?>>, Map<String, BaseReference<?>>> elements = new LinkedHashMap<Class<? extends BaseReference<?>>, Map<String, BaseReference<?>>>();

	public BaseReference(final String name, final int code, final String label) {
		this(name, code, label, label);
	}

	public BaseReference(final String name, final int code, final String label,
			final String description) {
		this.name = name;
		this.code = code;
		this.label = label;
		this.description = description;
		Map<String, BaseReference<?>> typeElements = elements.get(getClass());
		if (typeElements == null) {
			typeElements = new LinkedHashMap<String, BaseReference<?>>();
			elements.put(getMasterCodesClass(), typeElements);
		}
		typeElements.put(name, this);
	}

	public BaseReference() {
		super();
	}

	@SuppressWarnings("unchecked")
	public static <T extends BaseReference<T>> T valueOf(Class<T> enumType,
			String name) {
		return (T) elements.get(enumType).get(name);
	}

	@SuppressWarnings("unchecked")
	private Class<? extends BaseReference<?>> getMasterCodesClass() {
		return (Class<? extends BaseReference<?>>) getClass();
	}

	@SuppressWarnings("unchecked")
	public static <E> E[] values(Class<E> enumType) {
		Collection<BaseReference<?>> values = elements.get(enumType).values();
		int n = values.size();
		E[] typedValues = (E[]) Array.newInstance(enumType, n);
		int i = 0;
		for (BaseReference<?> value : values) {
			Array.set(typedValues, i, value);
			i++;
		}

		return typedValues;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setDescription(String description) {
		this.description = description;
	}

 	public String toStringLabel() {
		return label;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseReference other = (BaseReference) obj;
		if (code != other.code)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
 	
	

}
