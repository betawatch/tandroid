package yh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import zh.e8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class i extends e8 {
    public final /* synthetic */ n m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context, c6 c6Var) {
        super(context, c6Var);
        this.m0 = nVar;
    }

    @Override // zh.e8
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        n.V(this.m0);
        return true;
    }

    @Override // zh.e8, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // zh.e8
    public final void e(int i10) {
        n.U(this.m0, i10);
    }

    @Override // zh.e8
    public final void setValue(int i10) {
        super.setValue(i10);
        n.U(this.m0, i10);
    }
}
