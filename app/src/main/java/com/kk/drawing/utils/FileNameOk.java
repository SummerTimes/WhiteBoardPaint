package com.kk.drawing.utils;

import java.io.File;

import static java.util.regex.Pattern.compile;

/**
 * @author yangdong
 */
public class FileNameOk {

	public static boolean isFileNameOk(File file) {
		return compile("[\\w%+,/=_-]+").matcher(file.getPath()).matches();
	}
}
