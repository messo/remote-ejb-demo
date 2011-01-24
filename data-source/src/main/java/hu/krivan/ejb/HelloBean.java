package hu.krivan.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author messo
 */
@Stateless(name = "HelloBean")
public class HelloBean implements HelloBeanRemote, HelloBeanLocal {

    @Override
    public String sayHello() {
        return "Hello!";
    }
}
