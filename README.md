# monitor
Monitors an application whether it's alive or not

## Description:
This small utility tool check if the status code of the given URL is 200 (OK) or not.
If the status is not OK then it sends an email to a pre-configured email address.

## Configuration: 
* First you can change the email content message and status code in Contants.java
* Set the email sending parameters in Spring-Mail.xml mailSender bean. 
* Set from, to and subject in Spring-Mail.xml customeMailMessage bean

## Create runnable jar: 
* Go to the project's root directory
* Run
```
mvn clean install
```


## Usage:
You can find the generated jar in the target directory: monitor-1.0-jar-with-dependencies.jar 
You need to use the application host URL as the 
first argument of the command
Example: 
```
java -jar [project dir]/target/monitor-1.0-jar-with-dependencies.jar http://mydomain.com/appname
```
