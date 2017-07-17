package cn.eoe.superflashlight;

import cn.eoe.superflashlight.widget.HideTextView;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class ColorLight extends Bulb {
	protected int mCurrentColorLight = Color.RED;
	protected HideTextView mHideTextViewColorLight;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mHideTextViewColorLight = (HideTextView)findViewById(R.id.textview_hide_color_light);
	}
	
	public void onClick_ShowColorPicker(View view)
	{
		
	}

}
