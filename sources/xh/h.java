package xh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import yh.o8;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class h extends o8 {
    public final /* synthetic */ m m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, d6 d6Var) {
        super(context, d6Var);
        this.m0 = mVar;
    }

    @Override // yh.o8
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        m.S(this.m0);
        return true;
    }

    @Override // yh.o8, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // yh.o8
    public final void e(int i10) {
        m.R(this.m0, i10);
    }

    @Override // yh.o8
    public final void setValue(int i10) {
        super.setValue(i10);
        m.R(this.m0, i10);
    }
}
