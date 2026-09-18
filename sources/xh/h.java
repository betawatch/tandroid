package xh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import yh.n8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class h extends n8 {
    public final /* synthetic */ m m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, f6 f6Var) {
        super(context, f6Var);
        this.m0 = mVar;
    }

    @Override // yh.n8
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        m.U(this.m0);
        return true;
    }

    @Override // yh.n8, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // yh.n8
    public final void e(int i10) {
        m.T(this.m0, i10);
    }

    @Override // yh.n8
    public final void setValue(int i10) {
        super.setValue(i10);
        m.T(this.m0, i10);
    }
}
