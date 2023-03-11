package ru.mirea.timonin.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);

       /* View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку  21");
            }*/




    };

    public void itIsNotMe(View view){
        checkBox.setText("Это не я");
        checkBox.setActivated(true);
        checkBox.setChecked(true);
    };
    public void whoAmI(View view){
        checkBox.setText("Мой номер по списку  21");
        checkBox.setActivated(true);
        checkBox.setChecked(true);
    };

        //btnWhoAmI.setOnClickListener(oclBtnWhoAmI);







    }
