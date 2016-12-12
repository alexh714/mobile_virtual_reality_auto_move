package com.epicgames.ue4;

import com.YourCompany.VR_practice.OBBDownloaderService;
import com.YourCompany.VR_practice.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

