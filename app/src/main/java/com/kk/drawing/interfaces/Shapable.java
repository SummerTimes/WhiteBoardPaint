package com.kk.drawing.interfaces;

/**
 * 
 * @author yangdong
 *
 */
import android.graphics.Path;

import com.kk.drawing.painttools.FirstCurrentPosition;

public interface Shapable {

	public Path getPath();

	public FirstCurrentPosition getFirstLastPoint();

	void setShap(ShapesInterface shape);
}
