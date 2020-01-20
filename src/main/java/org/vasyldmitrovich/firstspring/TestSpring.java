package org.vasyldmitrovich.firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main (String[]args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        TestBean testBean = context.getBean("testBean",TestBean.class);
        boolean menOrWomen = testBean.getGender();
        String genderIs = "";
        if (menOrWomen) {
            genderIs = "Men";
        }
        else {
            genderIs = "Woman";
        }
        System.out.println("This person name is: "+testBean.getName()+"\n" +
                "This is: "+genderIs+"\n" +
                "and is: "+testBean.getAge()+" years old");
        context.close();
    }
}
