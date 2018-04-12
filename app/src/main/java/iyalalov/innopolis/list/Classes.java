package iyalalov.innopolis.list;

import java.security.SecureRandom;
import java.util.zip.CheckedOutputStream;

public class Classes {

    /*
        classes(id INT AUTO_INCREMENT NOT NULL,
		name VARCHAR(255) NOT NULL,
		teacher VARCHAR(255),
		course INT NOT NULL,
		PRIMARY KEY(id),
		FOREIGN KEY(course) REFERENCES courses(id) ON DELETE CASCADE)
     */
    private String name;
    private String teacher;
    private int courseId;
    private int id;

    Classes(int id, String name, String teacher, int courseId){
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.courseId = courseId;
    }

    String getName(){
        return name;
    }
    String getTeacher(){
        return teacher;
    }
    int getId(){
        return id;
    }
    int getCourseId(){
        return courseId;
    }

}
