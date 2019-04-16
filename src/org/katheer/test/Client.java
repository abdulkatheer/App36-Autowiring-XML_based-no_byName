package org.katheer.test;

import org.katheer.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        autowiring
        ----------
        wiring -> injecting beans to another bean
        autowiring -> injecting bean to another bean automatically without using property tag or constructor-arg tag.

        types
        -----
        a) XML based
        b) Annotation based
        c) Auto Discovery (Stereo types)
        d) Java based

        XML based - autowiring
        ----------------------
        i) autowire=no
        -----------
        This is the default mechanism. We have to explicitly inject values to properties.

        ii) autowire=byName
        ---------------
        When a bean is enabled with autowiring with byName, then it will search for the bean ids matching property names.
        For this method, we've to maintain the same naming conventions in both class and XML code.
        Internally it used setter DI to inject beans.

        How setter DI works actually?
        -----------------------------
        When using property tag or byName autowiring mechanism, internally setter method is used to set values to properties.
        But how these XML code identifies the correct property and inject values to it?
        First of all, it's NOT depending on PROPERTY NAME.
        It is depending on the METHOD NAME of the setter method. Silly you know. He he..

        To test it, I changed one of the properties name in class Address to firstLine1. But I didn't change property tag
            in XML code. The method name of setter method is firstLine and 'name' value in property tag (XML code) is firstLine.
            By matching this, value is set to firstLine1 property of address class.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource/applicationContext.xml");

        Employee emp1 = (Employee) context.getBean("emp1");
        emp1.showEmployeeDetails();

        Employee emp2 = (Employee) context.getBean("emp2");
        emp2.showEmployeeDetails();
    }
}
