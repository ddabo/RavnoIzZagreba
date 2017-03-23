package hr.dabo.ravnoizzagreba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    String[] data = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.single_row, R.id.text_view_row, data);
        listView.setAdapter(arrayAdapter);
    }

    /* Comment made for merge testing
    *  Just some other words in this comment made for testing pull request.
    *
    *  This is only written in Branch01.
    *  So this is only written in Branch02. Yes it is.
    *  This is Branch02 code.
    *
    *  Now here is a line of text for practicing pull requests.
    *  And another one.
    * */
}
