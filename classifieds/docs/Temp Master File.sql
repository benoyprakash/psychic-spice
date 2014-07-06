-- Temporary Master
COMMIT;

insert into classifiedsdb1.seller_information (seller_id, email, land_phone_no, mobile_no, name, seller_type) values
(1, 'benoyprakash@gmail.com', '0489-5645872', '6548421543', 'Benoy', 1);

COMMIT;

insert into  classifiedsdb1.post (post_id, description, location, location_id, price, pri_image, seller_type, sub_cat_id, title, seller) values 
(1, 'private String street;', 'Aluva', '1', '100', 'https://farm6.staticflickr.com/5035/cameras/72157625858229685_model_huge_3a1ee48e6f.jpg', '1', '1010', 'Nikon Camers', 1),
(2, 'private String street;', 'Palarivattom', '2', '250', NULL, '2', '1011', 'Lorem Ipsum', 1),
(3, 'private String street;', 'Kochi', '3', '25000', NULL, '3', '1012', 'Neque porro quisquam est qui dolorem ipsum', 1),
(4, 'private String street;', 'Thopumpady', '4', '2536', 'https://yy1.staticflickr.com/2693/5738113132_a2f3c3f626.jpg', '4', '1010', 'Barbie dolls', 1),
(5, 'private String street;', 'Fort Kochi', '5', '245', NULL, '5', '1012', '1914 translation by H. Rackham', 1);

COMMIT;
