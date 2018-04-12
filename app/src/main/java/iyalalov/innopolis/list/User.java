package iyalalov.innopolis.list;


public class User {

    /*
    users(id VARCHAR(120) NOT NULL,
		name VARCHAR(255) NOT NULL,
		surname VARCHAR(255) NOT NULL,
		email  VARCHAR(255) NOT NULL,
		password VARCHAR(255) NOT NULL,
		status VARCHAR(20) NOT NULL,
		PRIMARY KEY(id))
     */
    private String fullName;
    private String id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String status;

    private String suka_github3;




    /*
         Create 'User' by database id
     */
    User(String id){

        //TODO
        this.id = id;
        name = "def";

    }

    /*
        Create 'User' by values
     */
    User(String id, String name,String surname,String email,String status,String password){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.status = status;
        this.password = password;

        this.fullName = name + " " + surname;
    }

    /*
        without password
     */
    User(String id, String name,String surname,String email,String status){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.status = status;
        this.password = "";

        this.fullName = name + " " + surname;
    }

    /*
        without status and password
     */

    User(String id, String name,String surname,String email){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.status = "";
        this.password = "";

        this.fullName = name + " " + surname;
    }

    String getFullName(){
        return fullName;
    }
    String getId(){
        return id;
    }
    String getName() { return  name;}
    String getSurname() {return fullName;};
    String getEmail() {return email;}
    String getStatus() {return status;};

}
