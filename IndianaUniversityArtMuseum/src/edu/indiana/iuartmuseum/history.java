package edu.indiana.iuartmuseum;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.os.Build;


public class history extends ActionBarActivity implements OnClickListener {
	private TextView detail21;
	private LinearLayout detail22;
	private TextView detail23;
	private RelativeLayout p21, p22, p23;
	private ImageView back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.history); //check
		ActionBar actionBar = getSupportActionBar();
		actionBar.hide();
		initView();
		setListener();
	}

	private void initView() {
		//declares the variables in which the dropdowns will display when activated 
		detail21 = (TextView) findViewById(R.id.detail21);
		detail22 = (LinearLayout) findViewById(R.id.detail22);
		detail23 = (TextView) findViewById(R.id.detail23);

		//these are the titles of the dropdowns. what will be clicked
		p21 = (RelativeLayout) findViewById(R.id.p21);
		p22 = (RelativeLayout) findViewById(R.id.p22);
		p23 = (RelativeLayout) findViewById(R.id.p23);


		back = (ImageView) findViewById(R.id.back);
	}

	private void setListener() {
		//allowing the dropdowns to be 'clicked', specifying what to be clicked (this)
		p21.setOnClickListener(this);
		p22.setOnClickListener(this);
		p23.setOnClickListener(this);


		back.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		//this method defines what the dropdowns are to do when clicked. If it is clicked it is visible, if not it is to return to being closed. Breaking allows the method to not be caught in an unending loop. 
		//remember p = title of the dropdown (to be clicked) and the d = what is to be displayed (viewed). This is xml format, so it will be in tree form. 
		// TODO Auto-generated method stub
		ImageView arrow;
		int id = arg0.getId();
		if (id == R.id.p21) {
			arrow = (ImageView) p21.getChildAt(1);
			if (detail21.getVisibility() == View.VISIBLE) {
				arrow.setImageResource(R.drawable.red_down);
				detail21.setVisibility(View.GONE);
			} else {
				arrow.setImageResource(R.drawable.red_up);
				detail21.setVisibility(View.VISIBLE);
			}
		} else if (id == R.id.p22) {
			arrow = (ImageView) p22.getChildAt(1);
			if (detail22.getVisibility() == View.VISIBLE) {
				arrow.setImageResource(R.drawable.red_down);
				detail22.setVisibility(View.GONE);
			} else {
				arrow.setImageResource(R.drawable.red_up);
				detail22.setVisibility(View.VISIBLE);
			}
		} else if (id == R.id.p23) {
			arrow = (ImageView) p23.getChildAt(1);
			if (detail23.getVisibility() == View.VISIBLE) {
				arrow.setImageResource(R.drawable.red_down);
				detail23.setVisibility(View.GONE);
			} else {
				arrow.setImageResource(R.drawable.red_up);
				detail23.setVisibility(View.VISIBLE);
			}
		} else if (id == R.id.back) {
			history.this.finish();
		}
	}
}
