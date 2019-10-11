package com.kk.drawing.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.util.Log;

import com.kk.drawing.utils.PaintConstants.PATH;

/**
 * @author yangdong
 */
public class SDCardFiles {

	public static List<File> getPaintPadPicFiles() {
		List<File> imageFiles = new ArrayList<File>();
		File f = new File(PATH.SAVE_PATH);
		// �����ǰ·�������ڣ��򴴽�·��
		if (!f.exists()) {
			if (!f.mkdirs()) {
				Log.d("debug", "in getPaintPadPicFiles");
			}
		}
		File[] files = f.listFiles();
		// ����ļ�����
		if (files.length != 0) {
			/* �������ļ�����ArrayList�� */
			for (int i = 0; i < files.length; i++) {
				// �����ͼƬ�ļ��������file
				if (isImageFile(files[i].getPath())) {
					imageFiles.add(files[i]);
				}
			}
		}
		return imageFiles;
	}

	public static List<String> getPaintPadPicPaths() {
		List<File> imageFiles = getPaintPadPicFiles();
		List<String> filePathList = new ArrayList<String>();
		for (File file : imageFiles) {
			filePathList.add(file.getPath());
		}
		return filePathList;
	}

	public static List<String> getPaintPadPicNames() {
		List<String> nameList = new ArrayList<String>();
		List<File> imageFiles = getPaintPadPicFiles();
		for (File file : imageFiles) {
			nameList.add(file.getName());
		}
		return nameList;
	}

	public static boolean fileNameExists(String name) {
		List<String> nameList = getPaintPadPicNames();
		if (nameList.contains(name)) {
			return true;
		}
		return false;
	}

	private static boolean isImageFile(String fName) {
		boolean imageExist;

		/* ȡ����չ�� */
		String end = fName.substring(fName.lastIndexOf(".") + 1, fName.length()).toLowerCase();

		/* ����չ�������;���MimeType */
		if (end.equals("jpg") || end.equals("gif") || end.equals("png") || end.equals("jpeg") || end.equals("bmp")) {
			imageExist = true;
		} else {
			imageExist = false;
		}
		return imageExist;
	}
}
