package michaeldaigle.com.laconiabikeweek;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Wednesday_June15 extends ListActivity {

    String[] wednesday_events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday__june15);

        wednesday_events = getResources().getStringArray(R.array.wednesday_events);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, wednesday_events);
        setListAdapter(adapter);

    }
}
