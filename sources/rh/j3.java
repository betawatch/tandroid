package rh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j3 extends org.telegram.ui.web.a1 {
    public final /* synthetic */ o3 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(o3 o3Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.M0 = o3Var;
    }

    @Override // org.telegram.ui.web.a1
    public final void G(org.telegram.ui.web.w0 w0Var) {
        this.M0.G.setWebView(w0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            o3 o3Var = this.M0;
            if (!o3Var.M) {
                o3Var.M = true;
                o3Var.n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
