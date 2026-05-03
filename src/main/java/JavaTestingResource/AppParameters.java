package JavaTestingResource;

public class AppParameters {

    public  static  final  String DOMAIN = "127.0.0.1";
    public  static  final  String PORT = "80";

    //Implementacion SINGLETON PATTERN

    private static  AppParameters instance ;

    private  AppParameters(){


    }

    public AppParameters getInstance(){

        if ( instance == null )

            instance = new AppParameters();

        return  instance;
    }



    public  static  String domaindURL(){

        return  "https://"+ DOMAIN + ":" + PORT;
    }



}
