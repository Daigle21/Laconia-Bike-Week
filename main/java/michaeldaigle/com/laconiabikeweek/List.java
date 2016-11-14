package michaeldaigle.com.laconiabikeweek;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends ListActivity {

      String[] days_of_the_week;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        days_of_the_week = getResources().getStringArray(R.array.days_of_the_week);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view, days_of_the_week);
        setListAdapter(adapter);
    }
    @Override
    protected void onListItemClick(ListView lv, View v, int position, long id) {
        super.onListItemClick(lv, v, position, id);
        String openClass = days_of_the_week[position];
        try {
            Class selected = Class.forName("michaeldaigle.com.bikeweeklaconianh." + openClass);
            Intent selectedIntent = new Intent(this, selected);
            startActivity(selectedIntent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}