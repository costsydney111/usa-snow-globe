
package com.example.usasnowsglobe;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.rgb(12, 30, 58));
        layout.setPadding(24, 24, 24, 24);

        TextView title = new TextView(this);
        title.setText("❄️ USA Snow Globe 🇺🇸");
        title.setTextColor(Color.WHITE);
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);

        TextView message = new TextView(this);
        message.setText("Welcome to the USA Snow Globe!\n\nYour snowy adventure starts here.");
        message.setTextColor(Color.WHITE);
        message.setTextSize(18);
        message.setGravity(Gravity.CENTER);
        message.setPadding(0, 32, 0, 0);

        layout.addView(title);
        layout.addView(message);
        setContentView(layout);
    }
}
