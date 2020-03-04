package mx.edu.tesoem.isc.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activitycuatro extends AppCompatActivity {
    private TextView TextView1, TextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitycuatro);
        TextView1=(TextView)findViewById(R.id.suma);
        TextView2=(TextView)findViewById(R.id.multi);

        int dato1 = Integer.parseInt(getIntent().getStringExtra("dato1"));
        int dato2 = Integer.parseInt(getIntent().getStringExtra("dato2"));
        int dato3 = Integer.parseInt(getIntent().getStringExtra("dato3"));

        int suma = dato1+dato2+dato3;
        int mul = dato1*dato2*dato3;

        TextView1.setText(suma);
        TextView2.setText(mul);

    }
}
