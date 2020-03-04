package mx.edu.tesoem.isc.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activitytres extends AppCompatActivity {
    private EditText Text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytres);
        Text3 = (EditText)findViewById(R.id.Text3);
    }

    public void dato3 (View v)
    {
        Intent i = new Intent(Activitytres.this,Activitycuatro.class);
        i.putExtra("dato3", Text3.getText());
        startActivity(i);

    }
}
