package JavaTestingResource;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class AuthenticationTest {

    @Test
    public void testLoginCorrecto() {
        // 1. Simulamos el registro de un usuario
        String passwordReal = "MiPasswordSecreto123";
        String saltUsuario = "SalAleatoria987";
        // Al crear el objeto User, este internamente ya calcula y guarda solo el Hash
        User usuario = new User("usuarioPrueba", passwordReal, saltUsuario);

        // 2. Simulamos el inicio de sesión: el servidor genera un desafío
        String desafioServidor = "DesafioRandom555";

        // 3. Simulamos el lado del CLIENTE
        // El cliente teclea su contraseña, calcula su propio hash y luego genera la respuesta al desafío
        String passwordHashCliente = PasswordHash.generatePasswordHash(passwordReal, saltUsuario);
        String respuestaEnviadaPorCliente = PasswordHash.generateClientResponse(desafioServidor, passwordHashCliente);

        // 4. Simulamos el lado del SERVIDOR
        // El servidor llama a validateLogin usando el desafío que envió y el hash que tiene guardado en el objeto User
        boolean loginExitoso = PasswordHash.validateLogin(respuestaEnviadaPorCliente, desafioServidor, usuario.getPasswordHash());

        // 5. Comprobamos que el sistema permite el acceso (debe ser TRUE)
        Assert.assertTrue("La autenticación debe ser exitosa si las contraseñas coinciden", loginExitoso);
    }

    @Test
    public void testLoginIncorrecto() {

        String passwordReal = "MiPasswordSecreto123";
        String saltUsuario = "SalAleatoria987";
        User usuario = new User("usuarioPrueba", passwordReal, saltUsuario);


        String desafioServidor = "DesafioRandom555";


        String passwordEquivocada = "MeHeEquivocado456";
        // El cliente calcula el hash y la respuesta pero con la contraseña errónea
        String passwordHashMalo = PasswordHash.generatePasswordHash(passwordEquivocada, saltUsuario);
        String respuestaMala = PasswordHash.generateClientResponse(desafioServidor, passwordHashMalo);

        boolean loginExitoso = PasswordHash.validateLogin(respuestaMala, desafioServidor, usuario.getPasswordHash());

        Assert.assertFalse("La autenticación debe fallar si la contraseña es incorrecta", loginExitoso);
    }





}
