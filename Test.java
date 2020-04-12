import java.sql.SQLException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.bank.service.TAService;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Create an Empty Container
		
		DefaultListableBeanFactory beans = new DefaultListableBeanFactory();
		
		//Load the bean definitions into container
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beans);
		reader.loadBeanDefinitions(new FileSystemResource("src/applicationConfig.xml"));
		
		TAService taService  = beans.getBean("taService",TAService.class);
		
		taService.transferAmount(101, 102, 5000);
		System.out.println("Transfer Amount Success");
		

	}

}
