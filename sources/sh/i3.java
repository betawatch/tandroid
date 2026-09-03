package sh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i3 extends org.telegram.ui.web.a1 {
    public final /* synthetic */ n3 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(n3 n3Var, Context context, g6 g6Var, int i10) {
        super(i10, context, g6Var, true);
        this.M0 = n3Var;
    }

    @Override // org.telegram.ui.web.a1
    public final void G(org.telegram.ui.web.x0 x0Var) {
        this.M0.G.setWebView(x0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n3 n3Var = this.M0;
            if (!n3Var.M) {
                n3Var.M = true;
                n3Var.n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
