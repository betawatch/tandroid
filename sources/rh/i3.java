package rh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i3 extends org.telegram.ui.web.c1 {
    public final /* synthetic */ n3 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(n3 n3Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.P0 = n3Var;
    }

    @Override // org.telegram.ui.web.c1
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.P0.G.setWebView(y0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n3 n3Var = this.P0;
            if (!n3Var.M) {
                n3Var.M = true;
                n3Var.n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
