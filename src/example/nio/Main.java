package example.nio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if these are the same
        boolean result = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for theCoach: " + alphaCoach + "\n");

        //close the context
        context.close();

    }
}
