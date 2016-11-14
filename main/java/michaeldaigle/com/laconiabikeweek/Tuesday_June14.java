package michaeldaigle.com.laconiabikeweek;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Tuesday_June14 extends ListActivity {

    String[] tuesday_events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday__june14);

        tuesday_events = getResources().getStringArray(R.array.tuesday_events);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, tuesday_events);
        setListAdapter(adapter);

    }
}
