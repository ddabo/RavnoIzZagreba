package hr.dabo.ravnoizzagreba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Damjan on 02-Apr-17.
 */

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    public void onClickSubmit(View view){
        Intent intent = new Intent(this, SubmitActivity.class);
        startActivity(intent);
    }

}
