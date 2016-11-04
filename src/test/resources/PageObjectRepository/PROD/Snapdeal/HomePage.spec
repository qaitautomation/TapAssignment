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

textbox_Search     id 		inputValEnter
search_btn         css     button[class*="searchformButton"] 
Item_In_Cart       xpath    //span[@class='count'][contains(text(),'1')]
Add_Cart_Button           xpath             //div[@id='add-cart-button-id']

 Unique_Link_on_HomePage    xpath   //span[text()="All Offers"]     
 Suggestion_Box           xpath    //div[@class="suggestionBox"]
 Suggestion_Term         xpath     //span[@class="search-text"][text()="${search}"]
 
 
Product_Image_Large          xpath   //img[@class="cloudzoom"]
Product_Name                 xpath     //h1[@class="pdp-e-i-head"]
Price                        xpath    //span[@class="payBlkBig"]

Product_Name_On_Cart_Page     xpath    //a[@class="cart-link"]
Product_Price_On_Cart_Page     xpath  //span[@class="price"]  

Place_Order      xpath    //a[contains(@class,'btn marR5')]

====================================================================================
