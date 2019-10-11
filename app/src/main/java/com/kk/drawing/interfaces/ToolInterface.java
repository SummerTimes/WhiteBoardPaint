package com.kk.drawing.interfaces;

/**
 * 
 * @author yangdong
 *
 */
import android.graphics.Canvas;

//���л��ʶ�Ӧ��ʵ������ӿ�
public interface ToolInterface {

	public void draw(Canvas canvas);

	public void touchDown(float x, float y);

	public void touchMove(float x, float y);

	public void touchUp(float x, float y);

	public boolean hasDraw();
}
