package yd;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public interface a {
    boolean forceEnableVibration();

    long getLongPressDuration();

    boolean ignoreHapticFeedbackSettings(float f10, float f11);

    boolean needCancelTouchBySlopMove();

    boolean needClickAt(View view, float f10, float f11);

    boolean needLongPress(float f10, float f11);

    void onClickAt(View view, float f10, float f11);

    void onClickTouchDown(View view, float f10, float f11);

    void onClickTouchMove(View view, float f10, float f11);

    void onClickTouchUp(View view, float f10, float f11);

    void onLongPressCancelled(View view, float f10, float f11);

    void onLongPressFinish(View view, float f10, float f11);

    void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13);

    boolean onLongPressRequestedAt(View view, float f10, float f11);
}
