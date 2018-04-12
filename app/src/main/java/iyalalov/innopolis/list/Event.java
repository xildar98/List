package iyalalov.innopolis.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Event {

    /*
    events (id INT AUTO_INCREMENT NOT NULL,
		class INT NOT NULL,
		name VARCHAR(255) NOT NULL,
		place VARCHAR(255) NOT NULL,
		attended TEXT NOT NULL,
		date VARCHAR(255) NOT NULL,
		PRIMARY KEY(id),
		FOREIGN KEY (class) REFERENCES classes(id) ON DELETE CASCADE)
     */
    private int id;
    private String name;
    private String place;
    private String attendedId;
    private String date;
    private int classId;

    Event(int id, String name, String place, String date, int classesId,  String attendedId){
        this.id = id;
        this.name = name;
        this.place = place;
        this.attendedId = attendedId;
        this.date = date;
        this.classId = classId;
    }

    int getClassId(){
        return classId;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getPlace(){
        return place;
    }
    String getDate(){
        return date;
    }

    void setAttendedId(String attendedId){
        this.attendedId = attendedId;
    }

    ArrayList<String> getListAttenedId(){
        String id[] = attendedId.split(";");
        return new ArrayList<>(Arrays.asList(id));
    }
}
