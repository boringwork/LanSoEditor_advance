package com.example.lansongeditordemo;

import android.util.Log;

public class LoadLanSongSdk {
	private static boolean isLoaded=false;
	  
	static synchronized void loadLibraries() {
        if (isLoaded)
            return;
        Log.d("lansoeditor","load libraries......");
    	System.loadLibrary("ffmpegeditor");
    	System.loadLibrary("lsdisplay");
    	System.loadLibrary("lsplayer");
    	
	    isLoaded=true;
  }
}