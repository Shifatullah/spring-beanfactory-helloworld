# BeanFactory Concepts

- It is an implementation of factory pattern
- It is used to get beans from IoC container
- It provides basic IoC functionality
- It performs lazy initialization
- It doesn't support internationalization
- It requires separate instance of Resource
- It doesn't support annotation based dependency injection

# Prerequisites

- Download and install JDK 10 in `C:\Program Files\Java\jdk-10` folder and this path in `PATH` environment variable
	
- Download commons logging 1.2 and spring framework 5.0.5 and extract it into `c:\dev\libs folder`

# Steps

- Create `xml-beanfactory-helloworld` folder in `c:\dev\noideprojects` folder
	
- Create `src` and `lib` folders inside `c:\dev\noideprojects` folder
	
- Copy `commons-logging-1.2.jar`, `spring-core-5.0.5.RELEASE.jar`, `spring-beans-5.0.5.RELEASE.jar`, `spring-context-5.0.5.RELEASE.jar` and `spring-expression-5.0.5.RELEASE.jar` to `lib` folder from `c:\dev\libs folder`
	
- Create `HelloWorld` class in `src` folder with Message property setter and `printMessage()` method
	
- Create `Beans.xml` file in `src` folder and define the bean for HelloWorld class with the property value Message set to Hello World
	
- Create `MainApplication` class in src folder to create context using `beans.xml` file, get the bean, and ask bean to print message it got from `beans.xml` file
	
- Change directory to src folder: `CD c:\dev\noideprojects\xml-beanfactory-helloworld\src`
	
- Compile the application: `javac -classpath "../lib/spring-core-5.0.5.RELEASE.jar;../lib/spring-beans-5.0.5.RELEASE.jar;"  MainApplication.java  HelloWorld.java`
- Execute the application: `java -classpath "../lib/commons-logging-1.2.jar;../lib/spring-core-5.0.5.RELEASE.jar;../lib/spring-beans-5.0.5.RELEASE.jar;"  MainApplication`
	
- Or create jar file:  `jar cvfm ../xml-beanfactory-helloworld.jar manifest.txt MainApplication.class HelloWorld.class beans.xml`
	
- Execute jar file: `java -jar ../xml-beanfactory-helloworld.jar`
  
- Or to make it executable by double click: `assoc .jar=jarfile` and `ftype jarfile="C:\Program Files\Java\jdk-10\bin\java.exe" -jar "%1" %*`
- Double click the `xml-beanfactory-helloworld.jar` file present in `c:\dev\noideprojects\xml-beanfactory-helloworld`
