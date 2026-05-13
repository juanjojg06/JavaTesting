package javatesting;


import org.junit.Test;
import DomainEntites.User;
import static org. junit. Assert.*;

public class UserTest {

    @Test
    public  void conturcUserTest(){

        User usuari = new User("Tomeu" ,"secret" );
        assertTrue(usuari != null);
        assertEquals(usuari.getName(), "Tomeu");
        //assertEquals(usuari.getPassword(),"secret");

        assertTrue(usuari.verifyPassword("secret"));
    }
}
