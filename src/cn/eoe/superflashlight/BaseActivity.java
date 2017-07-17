package cn.eoe.superflashlight;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class BaseActivity extends Activity {
	protected enum UIType {
		UI_TYPE_MAIN, UI_TYPE_FLASHLIGHT, UI_TYPE_WARNINGLIGHT, UI_TYPE_MORSE, UI_TYPE_BLUB, UI_TYPE_COLOR, UI_TYPE_POLICE, UI_TYPE_SETTINGS
	}

	protected ImageView mImageViewFlashlight;
	protected ImageView mImageViewFlashlightController;
	protected ImageView mImageViewWarningLight1;
	protected ImageView mImageViewWarningLight2;
	protected Camera mCamera;
	protected Parameters mParameters;

	protected FrameLayout mUIFlashlight;
	protected LinearLayout mUIMain;
	protected LinearLayout mUIWarningLight;

	protected UIType mCurrentUIType = UIType.UI_TYPE_FLASHLIGHT;
	protected UIType mLastUIType = UIType.UI_TYPE_FLASHLIGHT;

	protected int mDefaultScreenBrightness;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mUIFlashlight = (FrameLayout) findViewById(R.id.framelayout_flashlight);
		mUIMain = (LinearLayout) findViewById(R.id.linearlayout_main);
		mUIWarningLight = (LinearLayout) findViewById(R.id.linearlayout_warning_light);
		mImageViewFlashlight = (ImageView) findViewById(R.id.imageview_flashlight);
		mImageViewFlashlightController = (ImageView) findViewById(R.id.imageview_flashlight_controller);
		mImageViewWarningLight1 = (ImageView) findViewById(R.id.imageview_warning_light1);
		mImageViewWarningLight2 = (ImageView) findViewById(R.id.imageview_warning_light2);
		
		mDefaultScreenBrightness  = getScreenBrightness();

	}

	protected void hideAllUI() {
		mUIMain.setVisibility(View.GONE);
		mUIFlashlight.setVisibility(View.GONE);
		mUIWarningLight.setVisibility(View.GONE);
	}

	protected void screenBrightness(float value) {
		try {
			WindowManager.LayoutParams layout = getWindow().getAttributes();
			layout.screenBrightness = value;
			getWindow().setAttributes(layout);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	protected int getScreenBrightness() {
		int value = 0;
		try {
			value = android.provider.Settings.System.getInt(
					getContentResolver(),
					android.provider.Settings.System.SCREEN_BRIGHTNESS);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return value;

	}
}
