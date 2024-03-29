package com.kk.drawing.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.drawing.R;
import com.kk.drawing.interfaces.OnClickOkListener;
import com.kk.drawing.utils.ImageButtonTools;

/**
 * @author yangdong
 */
public class OkDialog extends Dialog implements View.OnClickListener {

	private OnClickOkListener mListener;
	private ImageView mImageView;
	private ImageButton mOkButton;
	private Context mContext;
	private TextView mTextView;

	public OkDialog(Context context, OnClickOkListener listener) {
		super(context);
		mListener = listener;
		mContext = context;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.okdialog);
		mOkButton = (ImageButton) findViewById(R.id.imageButtonOkDialogOk);
		mImageView = (ImageView) findViewById(R.id.imageViewOkDialogCaution);
		mTextView = (TextView) findViewById(R.id.textViewOkDialogMsg);

		mImageView.setImageResource(R.drawable.caution);
		mTextView.setTextSize(20);
		mOkButton.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.finished));
		mOkButton.setOnClickListener(this);
		ImageButtonTools.setButtonFocusChanged(mOkButton);
		this.setTitle("ע��");
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.imageButtonOkDialogOk:
				mListener.onClickOk();
				dismiss();
				break;
			default:
				break;
		}
	}

	public void setMessage(String msg) {
		mTextView.setText(msg);
	}
}
