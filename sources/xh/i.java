package xh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import yh.e8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i extends e8 {
    public final /* synthetic */ o m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Context context, e6 e6Var) {
        super(context, e6Var);
        this.m0 = oVar;
    }

    @Override // yh.e8
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        o.V(this.m0);
        return true;
    }

    @Override // yh.e8, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // yh.e8
    public final void e(int i10) {
        o.U(this.m0, i10);
    }

    @Override // yh.e8
    public final void setValue(int i10) {
        super.setValue(i10);
        o.U(this.m0, i10);
    }
}
