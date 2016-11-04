Page Title: Search

#Object Definitions
====================================================================================
area_searchResult           css      #b_content
txt_resultCount             xpath    //span[@class='sb_count' and contains(text(),'results')]	
search_keyword_on_result_page    xpath         //span[@class='search-keyword'][contains(text(),'${tab}')]
number_of_search_results        xpath           //span[@class='search-result-num']	
product_image                  xpath            (//picture[@class="picture-elem"])['${number}']
search_keyword_on_result_page   xpath            //span[@class='search-keyword'][contains(text(),'${keyword}')]     
number_of_search_results       css               .count
Heading_on_Result_Page      xpath         //div[contains(@class,"sub-cat-name")][contains(text(),'${tab}')]
images                       xpath       //img[contains(@class,"product-image ")]


name_of_first_Prodcut       xpath        (//p[@class="product-title"])[1]
 ====================================================================================