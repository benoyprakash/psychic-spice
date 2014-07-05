package com.classifieds.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReferenceConstants {

	   public static class Status extends BaseReference<Status> {

	        protected static Map<String, BaseReference<?>> labelmap = new LinkedHashMap<String, BaseReference<?>>();
	        protected static Map<Integer, BaseReference<?>> codemap = new LinkedHashMap<Integer, BaseReference<?>>();

	        public static final Status INACTIVE = new Status("INACTIVE", 0, "INACTIVE");
	        public static final Status ACTIVE = new Status("ACTIVE", 1, "ACTIVE");
	        public static final Status SUSPEND = new Status("SUSPEND", 3, "SUSPEND");

	        public Status(String name, int code, String label) {
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
	   
	   
	   public static class HomeApplianceCategory extends BaseReference<HomeApplianceCategory> {
		   
		   	// CATEGORY REFERENCE : 10
		   	// SUBCATEGORY REFERENCE : 10 to 99
		   	// CHILD SUBCATEGORY REFERENCE : 100 to 999
	        protected static Map<String, BaseReference<?>> labelmap = new LinkedHashMap<String, BaseReference<?>>();
	        protected static Map<Integer, BaseReference<?>> codemap = new LinkedHashMap<Integer, BaseReference<?>>();

	        public static final HomeApplianceCategory FURNITURES = new HomeApplianceCategory("FURNITURES", 1010, "Furnitures","Table, Chair, Sofa.");
	        public static final HomeApplianceCategory APPLIANCES = new HomeApplianceCategory("APPLIANCES", 1011, "Appliances", "Fridge, TV, AC");
	        public static final HomeApplianceCategory KITCHEN_WARES = new HomeApplianceCategory("KITCHEN_WARES", 1012, "Kitchen wares", "Crokery, dishes, plates");
	        public static final HomeApplianceCategory ANTIQUES = new HomeApplianceCategory("ANTIQUES", 1013, "Antiques", "Gifts / show case items.");
	        public static final HomeApplianceCategory HOME_DECORS = new HomeApplianceCategory("HOME_DECORS", 1014, "Home Decors", "");
	        public static final HomeApplianceCategory ART = new HomeApplianceCategory("ART PAINTING", 1015, "Art", "Art works, paintings, clay models");
	        public static final HomeApplianceCategory LIGHTS = new HomeApplianceCategory("LIGHTS", 1016, "Lights", "Lights, chandeliers etc");
	        public static final HomeApplianceCategory OTHER_HOUSE_HOLD = new HomeApplianceCategory("OTHERS HOUSE HOLD", 1017, "Other House hold items", "Other House hold items");
	        

	        public HomeApplianceCategory(String name, int code, String label, String desc) {
	            super(name, code, label, desc);
	            codemap.put(code, this);
	            labelmap.put(label, this);
	        }

	        public HomeApplianceCategory() {
	        }

	        public static <E> BaseReference<? extends BaseReference<?>>[] values() {
	            return values(HomeApplianceCategory.class);
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
	        
	        public static Map<Integer, BaseReference<?>> getAllCodes(){
	        	return codemap;
	        }
	    }
	   
	   
}
