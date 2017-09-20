package jmendez.escoladeltreball.org.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    Soy un cutre
    Otra vez
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_clickOnClick(View view){
        Toast.makeText(this,"Button clicked!",Toast.LENGTH_LONG).show();


    }


}
