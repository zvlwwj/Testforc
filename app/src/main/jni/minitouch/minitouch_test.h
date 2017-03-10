#ifndef MINTOUCH_TEST__H
#define MINTOUCH_TEST__H
#ifdef __cplusplus
extern "C" {
#endif
extern static void init_touch_env();
extern static void down(int contact, int x, int y, int pressure);
extern static void move(int contact, int x, int y, int pressure);
extern static void up(int contact);
extern static void touch_commit();
extern static void close_touch_env();
#ifdef __cplusplus
}