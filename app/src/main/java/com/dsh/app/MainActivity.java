package com.dsh.app;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("搞定！专属 APK 构建成功！");
        tv.setTextSize(24);
        setContentView(tv);
    }
}
