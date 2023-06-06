package sg.rp.edu.rp.c346.id22038845.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    //String[] fruits; //array

    ArrayList<String> fruits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.arrayListTv);

        //with string array
        /*fruits= new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";*/

        //with string arraylist
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(3,"durian");
        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set((fruits.size()-1),"dragon fruit");

        String v ="Fruits\n=====\n";

        for (int i = 0; i<fruits.size(); i++){
            v += fruits.get(i)+"\n";
        }

        tv.setText(v);



    }
}