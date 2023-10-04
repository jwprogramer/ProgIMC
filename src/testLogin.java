import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class testLogin {

	
	Login login = new Login();
	
	@Test
    public void testLogin() {
        assertTrue(login.entrar(123));
        assertFalse(login.entrar(111));
    }
}
