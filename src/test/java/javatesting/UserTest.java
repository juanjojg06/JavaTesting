package javatesting;


import org.junit.Test;
import DomainEntites.User;
import static org. junit. Assert.*;

public class UserTest {

    @Test
    public  void conturcUserTest(){

        User usuari = new User();
        assertTrue(usuari != null);
    }
}
