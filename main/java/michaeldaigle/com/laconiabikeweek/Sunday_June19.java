package michaeldaigle.com.laconiabikeweek;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Sunday_June19 extends ListActivity {

    String[] lastday_events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday__june19);

        lastday_events = getResources().getStringArray(R.array.lastday_events);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, lastday_events);
        setListAdapter(adapter);

    }
}
