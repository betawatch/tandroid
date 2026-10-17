package yh;

import ai.he;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class i extends he {
    public final /* synthetic */ n m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context, d6 d6Var) {
        super(context, d6Var);
        this.m0 = nVar;
    }

    @Override // ai.he
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        n.V(this.m0);
        return true;
    }

    @Override // ai.he, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // ai.he
    public final void e(int i10) {
        n.U(this.m0, i10);
    }

    @Override // ai.he
    public final void setValue(int i10) {
        super.setValue(i10);
        n.U(this.m0, i10);
    }
}
