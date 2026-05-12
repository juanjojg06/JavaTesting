package JavaTestingResource;

public class PasswordHash {




    public static String generatePasswordHash(String password, String salt) {

        String combinedInput = salt + password;
        return HashUtils.applySHA256(combinedInput);
    }


    public static String generateClientResponse(String challenge, String passwordHash) {

        String combinedInput = challenge + passwordHash;
        return HashUtils.applySHA256(combinedInput);
    }


    public static boolean validateLogin(String clientResponse, String serverChallenge, String storedPasswordHash) {
        String expectedResponse = generateClientResponse(serverChallenge, storedPasswordHash);
        return expectedResponse.equals(clientResponse);
    }

}
