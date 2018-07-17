package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvList;

    ArrayList<Todolist> altodoList;
    CustomAdapter caList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.listView);

        altodoList = new ArrayList<>();

        Calendar date2 = Calendar.getInstance();
        date2.set(2018, 9, 22);

        Calendar date1 = Calendar.getInstance();
        date1.set(2018, 7, 1);

        Todolist list1 = new Todolist("MSA", date1);
        Todolist list2 = new Todolist("Go for haircut", date2);
        altodoList.add(list1);
        altodoList.add(list2);

        caList = new CustomAdapter(this, R.layout.todolist,altodoList);

        lvList.setAdapter(caList);
    }
}