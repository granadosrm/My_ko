package mx.edu.tesoem.isc.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText Text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Text1 = (EditText)findViewById(R.id.Text1);
    }

    public void dato1 (View v)
    {
        Intent i = new Intent(MainActivity.this,Activitydos.class);
        i.putExtra("dato1", Text1.getText());
        startActivity(i);

    }



}



