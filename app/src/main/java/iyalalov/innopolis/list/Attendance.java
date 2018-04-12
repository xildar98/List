package iyalalov.innopolis.list;


import java.util.ArrayList;
import java.util.List;

public class Attendance {
    ArrayList<User> students;
    ArrayList<String> attendedId;
    ArrayList<String> studentsName;

    Attendance(ArrayList<User> students, ArrayList<String> attendedId){
        this.students = students;
        this.attendedId = attendedId;
        studentsName = new ArrayList<>();
        for (User user:students
             ) {
            studentsName.add(user.getFullName());
        }
    }



    void changePresenceById(String studentsId){
        if(attendedId.contains(studentsId)){
            attendedId.remove(studentsId);
        } else{
            attendedId.add(studentsId);
        }
    }
    void changePresenceByName(String name){
        String studentsId = getIdByName(name);
        changePresenceById(studentsId);
    }


    String getIdByName(String name){
        for (User user: students ) {
            if(name.equals(user.getFullName())){
                return user.getId();
            }
        }
        return null;
    }

    void print(){
        for (String id: attendedId
                ) {
            System.out.println(id);
        }
        System.out.println("");
    }

    String getAllId(){
        String result = "";
        for(String id:attendedId){
            result+=id+";";
        }
        return result;
    }

    boolean present(String id){
        return attendedId.contains(id);
    }

    ArrayList<String> getListStudentsName(){
        return studentsName;
    }


}
