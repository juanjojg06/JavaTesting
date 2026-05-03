package JavaTestingResource;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AppParametersTest {

    public  static  final  String DOMAIN_EXPECTED = "10.0.0.43";

    public  static  final  String PORT_EXPECTED = "80";

@Test


    public  void domaindURLCorrect(){

    Assert.assertEquals( "Retorna la part FQDN " , DOMAIN_EXPECTED , AppParameters.DOMAIN);

    }



}
