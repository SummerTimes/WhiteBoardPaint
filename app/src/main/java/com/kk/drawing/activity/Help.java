package com.kk.drawing.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.kk.drawing.R;
import com.kk.drawing.utils.ImageButtonTools;

/**
 * @author yangdong
 *
 */
public class Help extends Activity implements OnClickListener {

	private ImageButton backButton = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
		backButton = (ImageButton) findViewById(R.id.helpReturnImageButton);
		backButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.finished));
		ImageButtonTools.setButtonFocusChanged(backButton);
		backButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.helpReturnImageButton:
				this.finish();
				break;
			default:
				break;
		}
	}
}
