package JavaTestingResource;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AppParametersTest {

    public  static  final  String DOMAIN_EXPECTED = "127.0.0.1";

    public  static  final  String PORT_EXPECTED = "80";
    public  static  final  String URL_EXPECTED =  "https://"+ DOMAIN_EXPECTED + ":" + PORT_EXPECTED;
@Test


    public  void domaindURLCorrect(){

    Assert.assertEquals( "Retorna la part FQDN " , DOMAIN_EXPECTED , AppParameters.DOMAIN);

    }


    @Test

public void correctPORT(){

        Assert.assertEquals( "Retorna el port correcto " , PORT_EXPECTED , AppParameters.PORT);

    }



    @Test

    public void correctUrl(){

        Assert.assertEquals( "Retorna el port correcto " , URL_EXPECTED , AppParameters.domaindURL() ) ;

    }

@Test


    public void  singletonCorrectness(){

     AppParameters instl1 = AppParameters.getInstance();
    AppParameters instl2 = AppParameters.getInstance();
    Assert.assertTrue("Comprovacion unicitat instancia del singleton", (instl1 == instl2));
}


    @Test


    public void  singletonCorrectness2(){

        AppParameters instl1 = AppParameters.getInstance();
        AppParameters instl2 = new AppParameters();
        Assert.assertTrue("Comprovacion unicitat instancia del singleton", (instl1 == instl2));
    }

}
