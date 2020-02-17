# Java Application Example with Unit Tests 

## Prerequisites  
Make sure you have the following installed on your machine:  
- latest JAVA SDK  
- latest Maven  
  
## Using the application    
- Installing the app, creating the jar  
 ```
       $ mvn install 
 ```   
- Running the app by yourself  
 ```
       $ mvn exec:java
 ```  

## About the application
The application converts arabic numbers to roman numbers under the following assumptions:
1. Standard Roman Representation is used  
2. Negative Numbers not accepted  
3. Zero is "nulla"  
4. Maximum accepted number is 3999  
5. Fractions of numbers are not accepted

 

