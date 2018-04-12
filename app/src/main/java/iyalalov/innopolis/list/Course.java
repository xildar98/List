package iyalalov.innopolis.list;

public class Course {

   /* courses(id INT AUTO_INCREMENT NOT NULL,
            name VARCHAR(255) NOT NULL,
    year VARCHAR(120) NOT NULL,
    subject INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(subject) REFERENCES subjects(id) ON DELETE CASCADE)*/


   private String name;
   private int id;
   private int subjectId;
   private String year;

   Course(int id,String name,int subjectId,String year){
       this.id = id;
       this.name = name;
       this.subjectId = subjectId;
       this.year = year;

   }

   String getName(){
       return name;
   }
   int getId(){
       return id;
   }
   String getYear(){
       return year;
   }

   int getSubject(){
       return subjectId;
   }




}
