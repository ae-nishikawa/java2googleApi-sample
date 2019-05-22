package com.sample;

import java.io.IOException;
import java.util.Properties;

public class PorpertyUtil {

	// プロパティファイルpath
	private static final String INIT_FILE_PATH = "/settings/application.properties";

	// プロパティ
	private static Properties properties = null;

	private PorpertyUtil() {

	}

	static {

		try {
			// プロパティファイル読み込み
			properties = new Properties();

			properties.load(PorpertyUtil.class.getResourceAsStream(INIT_FILE_PATH));
		} catch (IOException e){
			System.out.println("プロパティファイル読み込み失敗");

		}

	}

	public static String getProperty(String key) {
		return getProperty(key, null);
	}

	public static String getProperty(String key, String defaultValue) {
		return properties.getProperty(key, defaultValue);
	}
}
