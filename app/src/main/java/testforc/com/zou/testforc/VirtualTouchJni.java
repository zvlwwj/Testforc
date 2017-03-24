package testforc.com.zou.testforc;

/**
 * Created by zou on 2017/3/9.
 */

public class VirtualTouchJni {
    static {
        System.loadLibrary("minitouch-client");
    }
    public native void down(int id ,int x ,int y,int press);
    public native void move(int id ,int x ,int y,int press);
    public native void up(int id);
    public native void commit();
    public native void connect();
    public native void close();
}
