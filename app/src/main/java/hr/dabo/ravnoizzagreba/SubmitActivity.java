package hr.dabo.ravnoizzagreba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Damjan on 02-Apr-17.
 */

public class SubmitActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        Button clickMe2 = (Button)findViewById(R.id.button_click_me_2);
        clickMe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SubmitActivity.this, "Better luck next time!", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onClickClickMe(View view) {
        Toast.makeText(this, "Bravo!", Toast.LENGTH_LONG).show();
    }
}
