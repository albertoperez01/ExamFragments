package com.example.examfragments;

import android.os.Bundle;
import android.widget.SeekBar;

private int seekR, seekG, seekB;

public class ThirdFragment implements SeekBar.OnSeekBarChangeListener {

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.RedSeekBar:
                seekR = progress;
                break;
            case R.id.GreenSeekBar:
                seekG = progress;
                break;
            case R.id.BlueSeekBar:
                seekB = progress;
                break;
        }

        doSomethingWithColor();
    }
};

@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_changer);

        SeekBar sbR = (SeekBar) findViewById(R.id.RedSeekBar);
        SeekBar sbG = (SeekBar) findViewById(R.id.GreenSeekBar);
        SeekBar sbB = (SeekBar) findViewById(R.id.BlueSeekBar);

        MySeekBarChangeListener msbclR = new MySeekBarChangeListener();
        MySeekBarChangeListener msbclG = new MySeekBarChangeListener();
        MySeekBarChangeListener msbclB = new MySeekBarChangeListener();

        sbR.setOnSeekBarChangeListener(msbclR);
        sbG.setOnSeekBarChangeListener(msbclG);
        sbB.setOnSeekBarChangeListener(msbclB);

        }
@Override
private void doSomethingWithColor() {
        int color = Color.rgb(seekR, seekG, seekB);
        // Do something with color
        }
