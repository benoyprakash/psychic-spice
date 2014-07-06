package com.classifieds.utils;

import java.util.HashMap;
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
	   
	public static class CategoryList extends BaseReference{
		
		
		private static Map<Integer, CategoryList> codeMap = new HashMap<Integer, CategoryList>();
		private static Map<String, CategoryList> labelMap = new HashMap<String, CategoryList>();
		private static Map<Integer, String> keyValueMap = new HashMap<Integer, String>();
		
//		HOME_APPLIANCE(10, "Home Needs"), MOBILES_AND_GADGETS(20, "Mobiles & Gadgets");
		
		public static final CategoryList HOME_NEEDS = new CategoryList("HomeNeedsCategory", 10, "Home Needs","", CategoryList.HOME_NEEDS);
		public static final CategoryList MOBILES_AND_GADGETS = new CategoryList("Mobiles and Gadgets", 11, "Mobiles and Gadgets","", CategoryList.MOBILES_AND_GADGETS);
		
		public CategoryList(String name, int code, String label, String desc, BaseReference refObject){
			super(name, code, label, desc, refObject);
			codeMap.put(code, this);
			labelMap.put(label, this);
			keyValueMap.put(code, label);
		}
		
		public static Map<String, CategoryList> getAllLabels(){
			return labelMap;
		}
        public static Map<Integer, CategoryList> getAllCodes(){
        	return codeMap;
        }
        public static Map<Integer, String> getKeyValueMap(){
        	return keyValueMap;
        }
        

	}
	   
	   public static class HomeNeedsCategory extends BaseReference<HomeNeedsCategory> {
		   
		   	// CATEGORY REFERENCE : 10
		   	// SUBCATEGORY REFERENCE : 10 to 99
		   	// CHILD SUBCATEGORY REFERENCE : 100 to 999
	        protected static Map<String, BaseReference<?>> labelmap = new LinkedHashMap<String, BaseReference<?>>();
	        protected static Map<Integer, BaseReference<?>> codemap = new LinkedHashMap<Integer, BaseReference<?>>();

	        public static final HomeNeedsCategory FURNITURES = new HomeNeedsCategory("FURNITURES", 1010, "Furnitures","Table, Chair, Sofa.");
	        public static final HomeNeedsCategory APPLIANCES = new HomeNeedsCategory("APPLIANCES", 1011, "Appliances", "Fridge, TV, AC");
	        public static final HomeNeedsCategory KITCHEN_WARES = new HomeNeedsCategory("KITCHEN_WARES", 1012, "Kitchen wares", "Crokery, dishes, plates");
	        public static final HomeNeedsCategory ANTIQUES = new HomeNeedsCategory("ANTIQUES", 1013, "Antiques", "Gifts / show case items.");
	        public static final HomeNeedsCategory HOME_DECORS = new HomeNeedsCategory("HOME_DECORS", 1014, "Home Decors", "");
	        public static final HomeNeedsCategory ART = new HomeNeedsCategory("ART PAINTING", 1015, "Art", "Art works, paintings, clay models");
	        public static final HomeNeedsCategory LIGHTS = new HomeNeedsCategory("LIGHTS", 1016, "Lights", "Lights, chandeliers etc");
	        public static final HomeNeedsCategory OTHER_HOUSE_HOLD = new HomeNeedsCategory("OTHERS HOUSE HOLD", 1017, "Other House hold items", "Other House hold items");
	        

	        public HomeNeedsCategory(String name, int code, String label, String desc) {
	            super(name, code, label, desc);
	            codemap.put(code, this);
	            labelmap.put(label, this);
	        }

	        public HomeNeedsCategory() {
	        }

	        public static <E> BaseReference<? extends BaseReference<?>>[] values() {
	            return values(HomeNeedsCategory.class);
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
	   
	   public static class MobilesAndGadgets extends BaseReference<MobilesAndGadgets> {
		   
		   	// CATEGORY REFERENCE : 11
		   	// SUBCATEGORY REFERENCE : 10 to 99
		   	// CHILD SUBCATEGORY REFERENCE : 100 to 999
	        protected static Map<String, BaseReference<?>> labelmap = new LinkedHashMap<String, BaseReference<?>>();
	        protected static Map<Integer, BaseReference<?>> codemap = new LinkedHashMap<Integer, BaseReference<?>>();

	        public static final MobilesAndGadgets MOBILES = new MobilesAndGadgets("Mobile Phones", 1110, "Mobile Phones","Mobile Phones");
	        public static final MobilesAndGadgets HEAD_PHONES = new MobilesAndGadgets("Head Phones", 1111, "Head Phones", "Head Phones");

	        public MobilesAndGadgets(String name, int code, String label, String desc) {
	            super(name, code, label, desc);
	            codemap.put(code, this);
	            labelmap.put(label, this);
	        }

	        public MobilesAndGadgets() {
	        }

	        public static <E> BaseReference<? extends BaseReference<?>>[] values() {
	            return values(MobilesAndGadgets.class);
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
