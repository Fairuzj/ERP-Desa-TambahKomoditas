package com.my.projekPKL;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	
	private String JenisKomoditas = "";
	private String Komoditas = "";
	
	private ArrayList<String> jeniskomoditas = new ArrayList<>();
	private ArrayList<String> komoditas = new ArrayList<>();
	private ArrayList<String> luaslahan = new ArrayList<>();
	private ArrayList<String> phpanen = new ArrayList<>();
	private ArrayList<String> nik = new ArrayList<>();
	
	private LinearLayout linear5;
	private ScrollView vscroll2;
	private Button button1;
	private ImageView imageview5;
	private TextView textview5;
	private LinearLayout linear11;
	private TextView textview1;
	private Spinner jk;
	private TextView textview2;
	private Spinner k;
	private TextView textview3;
	private LinearLayout linear4;
	private TextView textview4;
	private EditText edittext2;
	private TextView textview6;
	private EditText edittext3;
	private TextView textview7;
	private EditText edittext4;
	private TextView textview8;
	private LinearLayout linear15;
	private TextView textview9;
	private EditText edittext7;
	private TextView textview10;
	private LinearLayout linear12;
	private TextView textview11;
	private EditText edittext9;
	private TextView textview12;
	private LinearLayout linear16;
	private TextView textview13;
	private LinearLayout linear18;
	private EditText edittext1;
	private Spinner ll;
	private EditText edittext10;
	private Spinner php;
	private EditText edittext8;
	private Spinner nikkk;
	private ImageView imageview4;
	private Button button2;
	private ImageView imageview3;
	private Button button3;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		button1 = (Button) findViewById(R.id.button1);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview1 = (TextView) findViewById(R.id.textview1);
		jk = (Spinner) findViewById(R.id.jk);
		textview2 = (TextView) findViewById(R.id.textview2);
		k = (Spinner) findViewById(R.id.k);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview4 = (TextView) findViewById(R.id.textview4);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview6 = (TextView) findViewById(R.id.textview6);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		textview7 = (TextView) findViewById(R.id.textview7);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview9 = (TextView) findViewById(R.id.textview9);
		edittext7 = (EditText) findViewById(R.id.edittext7);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview11 = (TextView) findViewById(R.id.textview11);
		edittext9 = (EditText) findViewById(R.id.edittext9);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		ll = (Spinner) findViewById(R.id.ll);
		edittext10 = (EditText) findViewById(R.id.edittext10);
		php = (Spinner) findViewById(R.id.php);
		edittext8 = (EditText) findViewById(R.id.edittext8);
		nikkk = (Spinner) findViewById(R.id.nikkk);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		button2 = (Button) findViewById(R.id.button2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		button3 = (Button) findViewById(R.id.button3);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
		jeniskomoditas.add("Pertanian");
		jeniskomoditas.add("Perkebunan");
		jk.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, jeniskomoditas));
		komoditas.add("Padi");
		komoditas.add("Teh");
		komoditas.add("Kopi");
		k.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, komoditas));
		luaslahan.add("m");
		luaslahan.add("ha");
		luaslahan.add("km");
		ll.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, luaslahan));
		phpanen.add("ton");
		phpanen.add("kg");
		php.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, phpanen));
		nik.add("NIK");
		nik.add("KK");
		nikkk.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, nik));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
