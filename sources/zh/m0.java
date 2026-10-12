package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class m0 extends z61 {
    public final /* synthetic */ r0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r0 r0Var, mm0 mm0Var, Context context, int i10, ii.a aVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(mm0Var, context, i10, 0, true, aVar, c6Var);
        this.N = r0Var;
    }

    @Override // org.telegram.ui.Components.z61, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        super.v(b1Var, i10);
        View view = b1Var.a;
        if (view instanceof p0) {
            p0 p0Var = (p0) view;
            n0 n0Var = p0Var.v;
            boolean S = this.N.S(n0Var);
            p0Var.c.f(S, false);
            p0Var.r.a(S, false);
            p0Var.setOnClickListener(new yh.a(9, this, n0Var));
        }
    }
}
