package michaeldaigle.com.laconiabikeweek;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Saturday_June11 extends ListActivity {

    String[] events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday_june11);

        events = getResources().getStringArray(R.array.events);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, events);
        setListAdapter(adapter);

    }
}
