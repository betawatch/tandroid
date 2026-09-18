package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class n0 extends x51 {
    public final /* synthetic */ s0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(s0 s0Var, ml0 ml0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(ml0Var, context, i10, 0, true, aVar, f6Var);
        this.N = s0Var;
    }

    @Override // org.telegram.ui.Components.x51, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        super.v(c1Var, i10);
        View view = c1Var.a;
        if (view instanceof q0) {
            q0 q0Var = (q0) view;
            o0 o0Var = q0Var.v;
            boolean R = this.N.R(o0Var);
            q0Var.c.f(R, false);
            q0Var.r.a(R, false);
            q0Var.setOnClickListener(new w(3, this, o0Var));
        }
    }
}
