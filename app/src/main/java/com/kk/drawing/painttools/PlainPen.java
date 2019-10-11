package com.kk.drawing.painttools;

/**
 * 
 * @author yangdong
 *
 */
import android.graphics.Paint;

import com.kk.drawing.interfaces.ToolInterface;

//��ͨ����
public class PlainPen extends PenAbstract implements ToolInterface {

	public PlainPen(int size, int penColor) {
		this(size, penColor, Paint.Style.STROKE);
	}

	public PlainPen(int size, int penColor, Paint.Style style) {
		super(size, penColor, style);
	}

	@Override
	public String toString() {
		return "\tplainPen: " + "\tshap: " + currentShape + "\thasDraw: " + hasDraw() + "\tsize: " + penSize + "\tstyle:" + style;
	}
}
