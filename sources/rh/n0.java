package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.qv0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n0 extends q51 {
    public final /* synthetic */ t0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, uk0 uk0Var, Context context, int i10, qh.d dVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(uk0Var, context, i10, 0, true, dVar, p6Var);
        this.P = t0Var;
    }

    @Override // org.telegram.ui.Components.q51, s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        super.t(c1Var, i10);
        View view = c1Var.a;
        if (view instanceof q0) {
            q0 q0Var = (q0) view;
            o0 o0Var = q0Var.w;
            boolean f12 = this.P.f1(o0Var);
            q0Var.c.f(f12, false);
            q0Var.r.a(f12, false);
            q0Var.setOnClickListener(new qv0(28, this, o0Var));
        }
    }
}
