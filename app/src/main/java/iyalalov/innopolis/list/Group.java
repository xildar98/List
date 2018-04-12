package iyalalov.innopolis.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {


    /*
        groups(id VARCHAR(120) NOT NULL,
		representative VARCHAR(120),
		PRIMARY KEY(id))
     */
    private String id;
    private String representativeId;


    /*
        Create 'Group' by values
     */
    Group(String id,String representativeId){
        this.id = id;
        this.representativeId = representativeId;
    }

    String getId(){
        return id;
    }

    String getRepresentativeId(){
        return representativeId;
    }

}
