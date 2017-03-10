package testforc.com.zou.testforc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private VirtualTouchJni jni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jni = new VirtualTouchJni();
        jni.initTouchEnv();
        jni.down(0,500,500,50);
//        ShellProcess.execCommand("/data/data/testforc.com.zou.testforc/lib/libhello.so", true);
    }
}