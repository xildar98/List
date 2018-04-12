package iyalalov.innopolis.list;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> studentsName;

    private boolean[] itemToggled;

    Attendance attendance;

    private class MyArrayAdapter<T> extends ArrayAdapter<T>
    {
        public MyArrayAdapter(Context context, int resource, int textViewResourceId, List<T> objects) {
            super(context, resource, textViewResourceId, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = super.getView(position, convertView, parent);
            ImageView imageView = (ImageView) itemView.findViewById(R.id.img);
            imageView.setImageResource(itemToggled[position] ? R.drawable.on : R.drawable.off);
            return itemView;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generate();

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new MyArrayAdapter<String>(this, R.layout.list_item, R.id.txt, studentsName));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                itemToggled[position] = ! itemToggled[position];

                attendance.changePresenceByName(studentsName.get(position));

                ImageView imageView = (ImageView) itemView.findViewById(R.id.img);
                imageView.setImageResource(itemToggled[position] ? R.drawable.on : R.drawable.off);

                Toast.makeText(MainActivity.this, attendance.getAllId(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generate(){
        User user1 = new User("1","Arsen 1", " pidor", "a.kuzmin@innopolis.ru");
        User user2 = new User("2","Arsen 2", " pidor", "a.kuzmin@innopolis.ru");
        User user3 = new User("3","Arsen 3", " pidor", "a.kuzmin@innopolis.ru");

        Event event = new Event(1,"as","asd","asd",555,"ss");

        ArrayList<User> students = new ArrayList<>();
        students.add(user1);
        students.add(user2);
        students.add(user3);

        ArrayList<String> id = new ArrayList<>();
        id.add(user2.getId());


        attendance = new Attendance(students,id);

        studentsName = attendance.getListStudentsName();

        itemToggled = new boolean[studentsName.size()];
        Arrays.fill(itemToggled, false);
        for(int i =0;i<studentsName.size();++i){
            String name = studentsName.get(i);
            if(attendance.present(attendance.getIdByName(name))){
                itemToggled[i] = true;
            }
        }
    }
}


