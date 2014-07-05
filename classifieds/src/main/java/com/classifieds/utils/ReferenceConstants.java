package com.classifieds.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReferenceConstants {

	   public static class Status extends BaseReference<Status> {

	        protected static Map<String, BaseReference<?>> labelmap = new LinkedHashMap<String, BaseReference<?>>();
	        protected static Map<Long, BaseReference<?>> codemap = new LinkedHashMap<Long, BaseReference<?>>();

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

	        public static <E> BaseReference<? extends BaseReference<?>>[] values() {
	            return values(Status.class);
	        }

	        public static BaseReference<?> getTypeFromLabel(String label) {
	            return labelmap.get(label);
	        }

	        public static BaseReference<?> getTypeFromCode(long code) {

	            return codemap.get(code);
	        }

	        public static <E extends BaseReference<?>> Set<String> getAllLabels() {
	            return labelmap.keySet();
	        }
	    }
	   
	   
}
