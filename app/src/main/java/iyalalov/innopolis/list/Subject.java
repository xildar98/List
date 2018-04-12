package iyalalov.innopolis.list;

public class Subject {
    private String name;
    private int id;

    /*subjects(id INT AUTO_INCREMENT NOT NULL,
		name VARCHAR(255) NOT NULL,
		PRIMARY KEY(id))

		*/

    Subject(int id,String name){
        this. id = id;
        this.name = name;
    }

    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
}
