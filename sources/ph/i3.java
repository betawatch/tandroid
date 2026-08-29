package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i3 extends org.telegram.ui.web.z0 {
    public final /* synthetic */ n3 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(n3 n3Var, Context context, c6 c6Var, int i10) {
        super(i10, context, c6Var, true);
        this.L0 = n3Var;
    }

    @Override // org.telegram.ui.web.z0
    public final void G(org.telegram.ui.web.w0 w0Var) {
        this.L0.F.setWebView(w0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n3 n3Var = this.L0;
            if (!n3Var.L) {
                n3Var.L = true;
                n3Var.n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
