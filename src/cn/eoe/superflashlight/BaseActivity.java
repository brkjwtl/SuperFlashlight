package cn.eoe.superflashlight;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class BaseActivity extends Activity {
	protected ImageView mImageViewFlashlight;
	protected ImageView mImageViewFlashlightController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mImageViewFlashlight = (ImageView) findViewById(R.id.imageview_flashlight);
		mImageViewFlashlightController = (ImageView) findViewById(R.id.imageview_flashlight_controller);

	}
}
