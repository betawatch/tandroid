package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class o0 extends w61 {
    public final /* synthetic */ t0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(t0 t0Var, zl0 zl0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(zl0Var, context, i10, 0, true, aVar, d6Var);
        this.N = t0Var;
    }

    @Override // org.telegram.ui.Components.w61, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        super.v(c1Var, i10);
        View view = c1Var.a;
        if (view instanceof r0) {
            r0 r0Var = (r0) view;
            p0 p0Var = r0Var.v;
            boolean P = this.N.P(p0Var);
            r0Var.c.f(P, false);
            r0Var.r.a(P, false);
            r0Var.setOnClickListener(new x(3, this, p0Var));
        }
    }
}
