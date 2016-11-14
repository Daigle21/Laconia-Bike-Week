package michaeldaigle.com.laconiabikeweek;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Saturday_June18 extends ListActivity {

    String[] saturday_events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday__june18);

        saturday_events = getResources().getStringArray(R.array.saturday_events);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, saturday_events);
        setListAdapter(adapter);

    }
}
