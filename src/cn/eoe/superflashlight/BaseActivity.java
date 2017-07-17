package cn.eoe.superflashlight;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.widget.ImageView;

public class BaseActivity extends Activity {
	protected ImageView mImageViewFlashlight;
	protected ImageView mImageViewFlashlightController;
	protected Camera mCamera;
	protected Parameters mParameters;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mImageViewFlashlight = (ImageView) findViewById(R.id.imageview_flashlight);
		mImageViewFlashlightController = (ImageView) findViewById(R.id.imageview_flashlight_controller);

	}
}
