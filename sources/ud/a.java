package ud;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
