package tse.fr.livesports;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FindLive extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_live);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_find_live, menu);
		return true;
	}

}
