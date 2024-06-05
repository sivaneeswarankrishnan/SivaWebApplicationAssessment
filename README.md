# SivaWebApplicationAssessment

Hi,

Thank you for giving me this opportunity and let get into how to run.

1. Git clone the repo and open the repo using intellij or any other suitable software.
   
2. Make sure you have install mysql db and please check application.properties file in src/main/templates/application.properties.
   
3. Configure according to your setting.
   
4. Open MySql WorkBench and create a database/schema named sivawebapplication.
   
5. Run mvn spring-boot:run.
   
6. As you can see 3 table will be create which is login,order_table and product.
   
7. For login please add manually the ADMIN role. For user, you can register later.
    
8. This is the sample data.
   ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/9dc5e4d0-42b6-4d32-a4d7-ade40dce33f9).
   
9. For the password you must encrypt into bcrypt . You can do this by going to this link (https://bcrypt-generator.com/). Enter your password and decode. Copy the given hash into the database.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/33472474-1477-40f7-9c13-c107f8e52866)

10. Next is setup the product, please follow the field and value given below in order to display product in product page later.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/2b4c5826-a475-480e-9c3e-01be84af11f9)

11. Now open localhost:8080/index or what you set in application.properties.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/0b0d1324-9982-4ab8-a6c2-b28268540bc3)
    
12. Click login to redirect to login.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/0daa6687-1416-4161-a707-fe321d0669bb)
    
13. Click register to redirect to register.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/eb161908-346e-4d45-8fea-c5e3d3c14b8f)
    
14. Register the user.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/4a0736fa-8bd3-4ab0-8ea1-b1787b893365)
    
15. After register login using the registered credentials.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/76b68c98-2c32-4e65-9ae6-f8eef1980e66)
    
16. Product listing will show the product in table product mysql. If you haven't do the step, please go to step 10.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/36729006-8628-4ea9-a8b9-866a75f5e7c1)
    
17. Click on 1 of the 3 product.
    
18. You will be redirect to product page. Choose size and quantity and click buy.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/f6222cb6-4797-4bfa-b29d-5d2d944021e9)

19. You will be prompt order placed.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/e988d7b9-737d-4d41-ba0d-330f206bbd98)

20. Now repeat for another product.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/ee98d34c-6a01-4f5a-baff-1e2803596a02)

21. Then click logout.
    
22. Login using the admin role you created manually earlier.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/1ede7eb8-ee10-448b-9f88-552c7d7cd37e)

23. After login you can see the 2 order you have placed.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/b1afce9c-de06-41e6-8665-d0e0af2531e8)

24. Click Update to Change the status and click delete to delete the order.
    ![image](https://github.com/sivaneeswarankrishnan/SivaWebApplicationAssessment/assets/149932844/f476fdc7-6f13-4551-9421-9a9c6371e370)

Overall, I have created a simple authentication and authorization using spring security in springboot. I have used CRUD as basic and a basic thymeleaf sample for you to see.

Thank you.


