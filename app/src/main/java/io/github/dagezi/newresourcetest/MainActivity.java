package io.github.dagezi.newresourcetest;

import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.iButton) ImageButton iButton;
    @Bind(R.id.npButton) AppCompatButton npButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        npButton.setSupportBackgroundTintList(getResources().getColorStateList(R.color.button_colors));

        Drawable roundRects = DrawableCompat.wrap(getResources().getDrawable(R.drawable.round_rect));
        DrawableCompat.setTintList(roundRects, getResources().getColorStateList(R.color.button_colors));
        iButton.setImageDrawable(roundRects);
    }

    public void disableIButton(View view) {
        iButton.setEnabled(!iButton.isEnabled());
    }

    public void disableNpButton(View view) {
        npButton.setEnabled(!npButton.isEnabled());
    }
}
