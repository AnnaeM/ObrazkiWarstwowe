package com.example.obrazkiwarstwowe;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		ImageView testimage = (ImageView)findViewById(R.id.obrazek);
		
		testimage.setImageDrawable(getResources().getDrawable(R.layout.layer));
		Resources r = getResources();
		Drawable[] layers = new Drawable[3];
		layers[0] = r.getDrawable(R.drawable.baza);
		layers[1] = r.getDrawable(R.drawable.spodnie);		
		layers[2] = r.getDrawable(R.drawable.gora);	
		LayerDrawable layerDrawable = new LayerDrawable(layers);
		testimage.setImageDrawable(layerDrawable);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
