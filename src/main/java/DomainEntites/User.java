package DomainEntites;

public class User {
private String name;
private String password;


public  User(){

    name= "Tomeu";
    password="secret";

}

public  String getName(){
    return  name;
}

public String getPassword(){
    return password;
}

}
