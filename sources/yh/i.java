package yh;

import ai.ie;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class i extends ie {
    public final /* synthetic */ n m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context, d6 d6Var) {
        super(context, d6Var);
        this.m0 = nVar;
    }

    @Override // ai.ie
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        n.V(this.m0);
        return true;
    }

    @Override // ai.ie, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // ai.ie
    public final void e(int i10) {
        n.U(this.m0, i10);
    }

    @Override // ai.ie
    public final void setValue(int i10) {
        super.setValue(i10);
        n.U(this.m0, i10);
    }
}
