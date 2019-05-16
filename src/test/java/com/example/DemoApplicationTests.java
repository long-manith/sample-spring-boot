package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
    public void shouldAnswerWithTrue()
    {
        PropertyConfigurator.configure("log4j.properties");
        BasicConfigurator.configure();
        logger.debug("Hello toto*****************************************************************************************************************************************************************************************************");
        assertTrue( true );
    }
    public Integer additionner (Integer a, Integer b)
  {
 		Integer somme;
 		somme = a + b;
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
