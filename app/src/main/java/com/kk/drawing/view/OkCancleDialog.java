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
public class OkCancleDialog extends Dialog implements View.OnClickListener {

	private OnClickOkListener mListener;
	private ImageView mImageView;
	private ImageButton mOkButton;
	private ImageButton mCancelButton;
	private Context mContext;
	private TextView mTextView;

	public OkCancleDialog(Context context, OnClickOkListener listener) {
		super(context);
		mListener = listener;
		mContext = context;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.okcancledialog);
		mOkButton = (ImageButton) findViewById(R.id.imageButtonOkCancleDialogOk);
		mCancelButton = (ImageButton) findViewById(R.id.imageButtonOkCancleDialogCancle);
		mImageView = (ImageView) findViewById(R.id.imageViewOkCancleDialog);
		mTextView = (TextView) findViewById(R.id.textViewOkCanleDialogMsg);

		mImageView.setImageResource(R.drawable.caution);
		mTextView.setTextSize(20);
		mOkButton.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.finished));
		mOkButton.setOnClickListener(this);
		mCancelButton.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.cancle));
		mCancelButton.setOnClickListener(this);

		ImageButtonTools.setButtonFocusChanged(mOkButton);
		ImageButtonTools.setButtonFocusChanged(mCancelButton);
		this.setTitle(mContext.getString(R.string.notice));
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.imageButtonOkCancleDialogOk:
				mListener.onClickOk();
				dismiss();
				break;
			case R.id.imageButtonOkCancleDialogCancle:
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
