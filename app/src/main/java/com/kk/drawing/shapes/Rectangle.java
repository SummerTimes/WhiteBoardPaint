package com.kk.drawing.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.kk.drawing.interfaces.Shapable;

/**
 * @author yangdong
 */
public class Rectangle extends ShapeAbstract {

	public Rectangle(Shapable paintTool) {
		super(paintTool);
	}

	@Override
	public void draw(Canvas canvas, Paint paint) {
		super.draw(canvas, paint);
		canvas.drawRect(x1, y1, x2, y2, paint);
	}

	@Override
	public String toString() {
		return "rectangle";
	}
}
