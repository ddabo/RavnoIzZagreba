package hr.dabo.ravnoizzagreba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Changing the text in TextView
        textViewHelloWorld = (TextView) findViewById(R.id.text_hello_world);
        textViewHelloWorld.setText(getResources().getText(R.string.welcome));
    }

    public void onClickToListView(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClickToFab(View view) {
        Intent intent = new Intent(this, FabActivity.class);
        startActivity(intent);
    }

    public void onClickToDetails(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
    
    /* Comment made straight from GitHub editor. */
}
