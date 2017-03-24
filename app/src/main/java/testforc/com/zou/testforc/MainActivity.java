package testforc.com.zou.testforc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    private VirtualTouchJni jni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        RootTools.requestSuPermission();
        setContentView(R.layout.activity_main);
        jni = new VirtualTouchJni();
        Button btn_down = (Button) findViewById(R.id.btn_down);
        Button btn_connect = (Button) findViewById(R.id.btn_connect);
        Button btn_close = (Button) findViewById(R.id.btn_close);
        Button btn_commit = (Button) findViewById(R.id.btn_commit);
        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jni.down(0,500,500,50);
            }
        });
        btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jni.connect();
            }
        });
        btn_commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jni.commit();
            }
        });
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jni.close();
            }
        });
//        ShellProcess.execCommand("/data/data/testforc.com.zou.testforc/lib/libhello.so", true);
    }
}