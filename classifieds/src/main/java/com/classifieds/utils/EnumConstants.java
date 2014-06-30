package com.classifieds.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EnumConstants {

	   public static class Status extends BaseEnum<Status> {

	        protected static Map<String, BaseEnum<?>> labelmap = new LinkedHashMap<String, BaseEnum<?>>();
	        protected static Map<Long, BaseEnum<?>> codemap = new LinkedHashMap<Long, BaseEnum<?>>();

	        public static final Status INACTIVE = new Status("INACTIVE", 0, "INACTIVE");
	        public static final Status ACTIVE = new Status("ACTIVE", 1, "ACTIVE");
	        public static final Status SUSPEND = new Status("SUSPEND", 3, "SUSPEND");

	        public Status(String name, long code, String label) {
	            super(name, code, label);
	            codemap.put(code, this);
	            labelmap.put(label, this);
	        }

	        public Status() {
	        }

	        public static <E> BaseEnum<? extends BaseEnum<?>>[] values() {
	            return values(Status.class);
	        }

	        public static BaseEnum<?> getTypeFromLabel(String label) {
	            return labelmap.get(label);
	        }

	        public static BaseEnum<?> getTypeFromCode(long code) {

	            return codemap.get(code);
	        }

	        public static <E extends BaseEnum<?>> Set<String> getAllLabels() {
	            return labelmap.keySet();
	        }
	    }
	   
	   
}
