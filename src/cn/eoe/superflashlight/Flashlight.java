package cn.eoe.superflashlight;

import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

public class Flashlight extends BaseActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Point point = new Point();
		
		getWindowManager().getDefaultDisplay().getSize(point);
		
		LayoutParams laParams = (LayoutParams)mImageViewFlashlightController.getLayoutParams();
		laParams.height = point.y * 3/4;
		laParams.width = point.x / 3;
		
		mImageViewFlashlightController.setLayoutParams(laParams);

	}
	
	public void onClick_Flashlight(View view)
	{
		if(!getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH))
		{
			Toast.makeText(this, "当前设备没有闪光灯", Toast.LENGTH_LONG).show();
			return;
		}
	}
}
 