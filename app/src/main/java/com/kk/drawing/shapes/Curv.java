package com.kk.drawing.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.kk.drawing.interfaces.Shapable;

/**
 * @author yangdong
 */
public class Curv extends ShapeAbstract {

	public Curv(Shapable paintTool) {
		super(paintTool);
	}

	@Override
	public void draw(Canvas canvas, Paint paint) {
		super.draw(canvas, paint);
		canvas.drawPath(mPath, paint);
	}

	@Override
	public String toString() {
		return "curv";
	}
}
