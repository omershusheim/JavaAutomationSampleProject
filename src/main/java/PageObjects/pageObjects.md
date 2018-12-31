The pageObjects concept

PageObject is a design pattern used to:
1. Simplify the way we identify and maintain the UI of the application we are testing
2. Write readable code that will be easy to other developers to understand and use

You can see many approaches to using PageObject. this one is mine:

First of all we will create  a class called a GenericPageObject. this class will contain an instance of the webDriver/RemoteWebDriver (Which I like to put in a wrapping class , usually called webDriverWrapper)