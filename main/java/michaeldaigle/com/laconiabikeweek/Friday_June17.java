package michaeldaigle.com.laconiabikeweek;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Friday_June17 extends ListActivity {

    String[] friday_events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday__june17);

        friday_events = getResources().getStringArray(R.array.friday_events);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, friday_events);
        setListAdapter(adapter);

    }
}
