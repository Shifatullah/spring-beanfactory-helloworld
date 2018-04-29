import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApplication {
	public static void main(String[] args){
		// Create factory
		BeanFactory factory = new DefaultListableBeanFactory();
		
		// Load beans definitions
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory)factory);
		Resource resource = new ClassPathResource("beans.xml");
		reader.loadBeanDefinitions(resource);
		
		// Get bean
		System.out.println("Getting bean instance...");
		HelloWorld objHelloWorld = (HelloWorld) factory.getBean("helloworld");
		
		// Print helloworld message
		objHelloWorld.printMessage();	

		// Wait for user to enter exit
		System.out.println("Press any key to exit...");
		System.console().readLine();
	}
}