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

public class InfoActivity extends ActionBarActivity implements OnClickListener {

	private TextView detail1;
	private LinearLayout detail2;
	private TextView detail3;
	private TextView detail4;
	private RelativeLayout p1, p2, p3, p4, p5;
	private ImageView back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		ActionBar actionBar = getSupportActionBar();
		actionBar.hide();
		initView();
		setListener();
	}

	private void initView() {
		detail1 = (TextView) findViewById(R.id.detail1);
		detail2 = (LinearLayout) findViewById(R.id.detail2);
		detail3 = (TextView) findViewById(R.id.detail3);
		detail4 = (TextView) findViewById(R.id.detail4);

		p1 = (RelativeLayout) findViewById(R.id.p1);
		p2 = (RelativeLayout) findViewById(R.id.p2);
		p3 = (RelativeLayout) findViewById(R.id.p3);
		p4 = (RelativeLayout) findViewById(R.id.p4);
		p5 = (RelativeLayout) findViewById(R.id.p5);

		back = (ImageView) findViewById(R.id.back);
	}

	private void setListener() {
		p1.setOnClickListener(this);
		p2.setOnClickListener(this);
		p3.setOnClickListener(this);
		p4.setOnClickListener(this);
		p5.setOnClickListener(this);

		back.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		ImageView arrow;
		int id = arg0.getId();
		if (id == R.id.p1) {
			arrow = (ImageView) p1.getChildAt(1);
			if (detail1.getVisibility() == View.VISIBLE) {
				arrow.setImageResource(R.drawable.red_down);
				detail1.setVisibility(View.GONE);
			} else {
				arrow.setImageResource(R.drawable.red_up);
				detail1.setVisibility(View.VISIBLE);
			}
		} else if (id == R.id.p2) {
			arrow = (ImageView) p2.getChildAt(1);
			if (detail2.getVisibility() == View.VISIBLE) {
				arrow.setImageResource(R.drawable.red_down);
				detail2.setVisibility(View.GONE);
			} else {
				arrow.setImageResource(R.drawable.red_up);
				detail2.setVisibility(View.VISIBLE);
			}
		} else if (id == R.id.p3) {
			arrow = (ImageView) p3.getChildAt(1);
			if (detail3.getVisibility() == View.VISIBLE) {
				arrow.setImageResource(R.drawable.red_down);
				detail3.setVisibility(View.GONE);
			} else {
				arrow.setImageResource(R.drawable.red_up);
				detail3.setVisibility(View.VISIBLE);
			}
		} else if (id == R.id.p4) {
			arrow = (ImageView) p4.getChildAt(1);
			if (detail4.getVisibility() == View.VISIBLE) {
				arrow.setImageResource(R.drawable.red_down);
				detail4.setVisibility(View.GONE);
			} else {
				arrow.setImageResource(R.drawable.red_up);
				detail4.setVisibility(View.VISIBLE);
			}
		} else if (id == R.id.back) {
			InfoActivity.this.finish();
		}
	}
}
