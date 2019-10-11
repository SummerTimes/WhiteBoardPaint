package com.kk.drawing.utils;

import android.graphics.ColorMatrixColorFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;

/**
 * @author yangdong
 */
public class ImageButtonTools {

	private ImageButtonTools() {

	}

	/**
	 * ���������ť���е���ɫ����
	 */
	public final static float[] BT_SELECTED = new float[] {//
			2, 0, 0, 0, 2,//
			0, 2, 0, 0, 2, //
			0, 0, 2, 0, 2, //
			0, 0, 0, 1, 0
	};//
	/**
	 * ��ť�ָ�ԭ״����ɫ����
	 */
	public final static float[] BT_NOT_SELECTED = new float[] { //
			1, 0, 0, 0, 0,//
			0, 1, 0, 0, 0,//
			0, 0, 1, 0, 0,//
			0, 0, 0, 1, 0
	};//

	/**
	 * ��ť����ı�
	 */
	public final static OnFocusChangeListener buttonOnFocusChangeListener = new OnFocusChangeListener() {

		@Override
		public void onFocusChange(View v, boolean hasFocus) {
			if (hasFocus) {
				v.getBackground().setColorFilter(new ColorMatrixColorFilter(BT_SELECTED));
				v.setBackgroundDrawable(v.getBackground());
			} else {
				v.getBackground().setColorFilter(new ColorMatrixColorFilter(BT_NOT_SELECTED));
				v.setBackgroundDrawable(v.getBackground());
			}
		}

	};

	/**
	 * ��ť��������Ч��
	 */
	public final static OnTouchListener buttonOnTouchListener = new OnTouchListener() {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			if (event.getAction() == MotionEvent.ACTION_DOWN) {
				v.getBackground().setColorFilter(new ColorMatrixColorFilter(BT_SELECTED));
				v.setBackgroundDrawable(v.getBackground());
			} else if (event.getAction() == MotionEvent.ACTION_UP) {
				v.getBackground().setColorFilter(new ColorMatrixColorFilter(BT_NOT_SELECTED));
				v.setBackgroundDrawable(v.getBackground());
			}
			return false;
		}

	};

	public final static void setButtonFocusChanged(View inView) {
		inView.setOnTouchListener(buttonOnTouchListener);
		inView.setOnFocusChangeListener(buttonOnFocusChangeListener);
	}

}
