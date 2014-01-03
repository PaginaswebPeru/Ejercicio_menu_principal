package paginasweb.pe.ejercicio_menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final int item_00 = 0;
	private static final int item_01 = 1;
	private static final int item_02 = 2;
	private static final int item_03 = 3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		menu.add(Menu.NONE, item_00, 0, "Opcion 01").setIcon(android.R.drawable.ic_delete);
		menu.add(Menu.NONE, item_01, 1, "Opcion 02").setIcon(android.R.drawable.ic_dialog_alert);;
		menu.add(Menu.NONE, item_02, 2, "Opcion 03").setIcon(android.R.drawable.ic_dialog_email);;
		menu.add(Menu.NONE, item_03, 3, "Opcion 04").setIcon(android.R.drawable.ic_dialog_info);;
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case item_00:
			Toast.makeText(getApplicationContext(), "Opcion 01", Toast.LENGTH_SHORT).show();
			break;
		case item_01:
			Toast.makeText(getApplicationContext(), "Opcion 02", Toast.LENGTH_SHORT).show();
			break;
		case item_02:
			Toast.makeText(getApplicationContext(), "Opcion 03", Toast.LENGTH_SHORT).show();
			break;
		case item_03:
			Toast.makeText(getApplicationContext(), "Opcion 04", Toast.LENGTH_SHORT).show();
			break;
		}
		return true;
	}

}
