package xh;

import android.view.MotionEvent;
import org.telegram.ui.Components.c90;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class v0 extends c90 {
    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
