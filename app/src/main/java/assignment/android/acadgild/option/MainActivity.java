package assignment.android.acadgild.option;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, Menu.NONE, "Computer");
        menu.add(0, 2, Menu.NONE, "Gamepad");
        menu.add(0, 3, Menu.NONE, "Camera");
        menu.add(0, 4, Menu.NONE, "Vedio");
        menu.add(0, 5, Menu.NONE, "Email");


        return true;
    }
}
