#include <jni.h>
#include "minitouch_test.h"

JNIEXPORT void JNICALL Java_testforc_com_zou_testforc_VirtualTouchJni_initTouchEnv(JNIEnv *env, jobject jobject){
    init_touch_env();
}
JNIEXPORT void JNICALL Java_testforc_com_zou_testforc_VirtualTouchJni_down(JNIEnv *env, jobject jobject,jint id,jint x,jint y,jint press){
    down(id,x,y,press);
}
JNIEXPORT void JNICALL Java_testforc_com_zou_testforc_VirtualTouchJni_move(JNIEnv *env, jobject jobject,jint id,jint x,jint y,jint press){
    move(id,x,y,press);
}
JNIEXPORT void JNICALL Java_testforc_com_zou_testforc_VirtualTouchJni_up(JNIEnv *env, jobject jobject,jint id){
    up(id);
}
JNIEXPORT void JNICALL Java_testforc_com_zou_testforc_VirtualTouchJni_touch_commit(JNIEnv *env, jobject jobject){
    touch_commit();
}
JNIEXPORT void JNICALL Java_testforc_com_zou_testforc_VirtualTouchJni_closeTouchEnv(JNIEnv *env, jobject jobject){
    close_touch_env();
}

