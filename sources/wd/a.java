package wd;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public interface a {
    boolean forceEnableVibration();

    long getLongPressDuration();

    boolean ignoreHapticFeedbackSettings(float f9, float f10);

    boolean needCancelTouchBySlopMove();

    boolean needClickAt(View view, float f9, float f10);

    boolean needLongPress(float f9, float f10);

    void onClickAt(View view, float f9, float f10);

    void onClickTouchDown(View view, float f9, float f10);

    void onClickTouchMove(View view, float f9, float f10);

    void onClickTouchUp(View view, float f9, float f10);

    void onLongPressCancelled(View view, float f9, float f10);

    void onLongPressFinish(View view, float f9, float f10);

    void onLongPressMove(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12);

    boolean onLongPressRequestedAt(View view, float f9, float f10);
}
