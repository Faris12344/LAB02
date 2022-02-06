# LAB02_CPIT252
Faris Mohammed Alnahdi
1935595
----------------------

The problem in this code is mostly in the Logger Class , to use singiltun :
we first add a private static Logger object
change the constructor accessability from public to private so that the getLog method can accsess it
add a public static method that will initialize a Logger object if there was no instance was made (check it using if statement)  else will return the object
now in other classes if we want to make a Logger file (instance) we use Logger.getLog() , for one instance only
