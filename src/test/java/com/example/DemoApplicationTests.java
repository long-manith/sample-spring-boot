package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assume;
import org.junit.Assert;
import org.junit.Ignore;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	static final Logger logger = Logger.getLogger(DemoApplicationTests.class);

	@Test
	public void contextLoads() {
	}
	@Test
    public void shouldAnswerWithTrue()
    {
        BasicConfigurator.configure();
        logger.debug("Hello toto*****************************************************************************************************************************************************************************************************");
        assertTrue( true );
    }
    public Integer additionner (Integer a, Integer b)
  {
 		Integer somme;
 		somme = a - b;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("La somme vaut " + somme);
                return somme;
   }
      @Test
    public void additionner_integers_should_return_an_integer () {
                 Integer somme = additionner(2, 3) ;
                 if (somme == 5)     
                 { 
                 System.out.println("La somme vaut " + somme + " OK");
                 assertTrue( true );
                 }
                 else
                 {
                 System.out.println("La somme vaut " + somme + " KO");
                 assertTrue( false);
                 }
  }
}
