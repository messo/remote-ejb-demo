package hu.krivan.ejb;

import javax.ejb.Remote;

/**
 *
 * @author messo
 */
@Remote
public interface HelloBeanRemote {

    String sayHello();
}
