package hr.dabo.ravnoizzagreba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHelloWorld = (TextView) findViewById(R.id.text_hello_world);
        textViewHelloWorld.setText(getResources().getText(R.string.welcome));
    }
}
