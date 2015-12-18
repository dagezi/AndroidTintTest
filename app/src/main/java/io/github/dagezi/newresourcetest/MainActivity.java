package io.github.dagezi.newresourcetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.iButton) ImageButton iButton;
    @Bind(R.id.npButton) Button npButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    public void disableIButton(View view) {
        iButton.setEnabled(!iButton.isEnabled());
    }

    public void disableNpButton(View view) {
        npButton.setEnabled(!npButton.isEnabled());
    }
}
