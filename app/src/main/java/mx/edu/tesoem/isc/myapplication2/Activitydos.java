package mx.edu.tesoem.isc.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activitydos extends AppCompatActivity {
    private EditText Text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydos);
        Text2 = (EditText)findViewById(R.id.Text2);



    }

    public void dato2 (View v)
    {
        Intent i = new Intent(Activitydos.this,Activitytres.class);
        i.putExtra("dato2", Text2.getText());
        startActivity(i);

    }
}
