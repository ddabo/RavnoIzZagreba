package hr.dabo.ravnoizzagreba;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    String[] weekdayTitles;
    String[] weekdayDescriptions;
    int[] images = {R.drawable.weekday1, R.drawable.weekday2, R.drawable.weekday3, R.drawable.weekday4, R.drawable.weekday5, R.drawable.weekday6, R.drawable.weekday7,
            R.drawable.weekday1, R.drawable.weekday2, R.drawable.weekday3, R.drawable.weekday4, R.drawable.weekday5, R.drawable.weekday6, R.drawable.weekday7,
            R.drawable.weekday1, R.drawable.weekday2, R.drawable.weekday3, R.drawable.weekday4, R.drawable.weekday5, R.drawable.weekday6, R.drawable.weekday7};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Implementing string arrays
        Resources resources = getResources();
        weekdayTitles = resources.getStringArray(R.array.string_array_weekday_titles);
        weekdayDescriptions = resources.getStringArray(R.array.string_array_weekday_descriptions);

        listView = (ListView) findViewById(R.id.list_view);

        WeekdaysAdapter adapter = new WeekdaysAdapter(this, weekdayTitles, images, weekdayDescriptions);
        listView.setAdapter(adapter);

        // Setting an OnItemClickListener on ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SecondActivity.this, getResources().getStringArray(R.array.string_array_weekday_titles)[position], Toast.LENGTH_LONG).show();
            }
        });
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
