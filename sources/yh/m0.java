package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m0 extends c71 {
    public final /* synthetic */ r0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r0 r0Var, qm0 qm0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(qm0Var, context, i10, 0, true, aVar, e6Var);
        this.N = r0Var;
    }

    @Override // org.telegram.ui.Components.c71, s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        super.v(d1Var, i10);
        View view = d1Var.a;
        if (view instanceof p0) {
            p0 p0Var = (p0) view;
            n0 n0Var = p0Var.v;
            boolean S = this.N.S(n0Var);
            p0Var.c.f(S, false);
            p0Var.r.a(S, false);
            p0Var.setOnClickListener(new xh.a(9, this, n0Var));
        }
    }
}
