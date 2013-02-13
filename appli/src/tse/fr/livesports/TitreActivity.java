package tse.fr.livesports;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TitreActivity extends Activity {


	private OnClickListener clickListenerbuttonSearch = new View.OnClickListener() 
	{
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(TitreActivity.this, FindLive.class);
			startActivity(intent);
		}
	};


	private OnClickListener clickListenerbuttonFavoris = new View.OnClickListener() 
	{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

		}
	};

	private OnClickListener clickListenerbuttonCreate = new View.OnClickListener() 
	{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

		}
	};

	Button bSearch = null;
	Button bFavoris = null;
	Button bCreate = null;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_titre);

		bSearch = (Button) findViewById(R.id.buttonSearch);
		bFavoris = (Button) findViewById(R.id.buttonFavoris);
		bCreate = (Button) findViewById(R.id.buttonCreate);

		bSearch.setOnClickListener(clickListenerbuttonSearch);
		bFavoris.setOnClickListener(clickListenerbuttonFavoris);
		bCreate.setOnClickListener(clickListenerbuttonCreate);

		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_titre, menu);
			return true;
		}





	}
