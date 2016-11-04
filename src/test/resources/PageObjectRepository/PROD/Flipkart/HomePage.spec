Page Title: Bing

#Object Definitions
====================================================================================
inp_searchTextBox 		 	id       sb_form_q
btn_search                  id       sb_form_go
compose_mail 		    id        zb__NEW_MENU_title
receiver_email	  	    xpath     //input[@id='zv__COMPOSE-1_to_control']
send_btn 			xpath	//*[@id='zb__COMPOSE-1__SEND_title']
subject                     xpath	//*[@id='zv__COMPOSE-1_subject_control']
sent_mails		    xpath	//*[@id='zti__main_Mail__5_textCell']
list_mails 		    xpath	//ul[@id='zl__CLV-main__rows']
mail_span		    xpath	//*[@id='zlif__CLV-main__811__su']/span

textbox_Search    xpath      //input[contains(@title,'Search for Products')]
search_btn         css     button[type='submit']
 Add_Cart_Button  xpath   //button[@class="_3zLR9i _3Plo8Q _19RW-r"]
 Go_To_Cart       xpath   //button[@class="_3zLR9i VID7GA"]
 Item_In_Cart     xpath       //span[@id='cartCount'][contains(text(),'1')]  
 
Unique_Link_on_HomePage    xpath   //span[text()="Go quickly to"] 
Suggestion_Box           xpath     //ul[@class='col-11-12 _1PBbw8 _26x3Jb']
Suggestion_Term         xpath      //ul[@class="col-11-12 _1PBbw8 _26x3Jb"]//a[contains(text(),'${term}')]

Product_Image_Large          xpath    //img[@class="sfescn"]
Product_Name                 xpath     //h1[@class="_3eAQiD"]
Price                        xpath     //div[@class="_1vC4OE _37U4_g"] 

Product_Name_On_Cart_Page     xpath    //span[@class="title fk-font-14"] 
Product_Price_On_Cart_Page     xpath   //div[@class="carty-price line"]    

Place_Order                  xpath     //button[contains(@class,"btn btn-orange")]
         
====================================================================================
