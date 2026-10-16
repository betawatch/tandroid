package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class m0 extends a71 {
    public final /* synthetic */ r0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r0 r0Var, mm0 mm0Var, Context context, int i10, ii.a aVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(mm0Var, context, i10, 0, true, aVar, c6Var);
        this.N = r0Var;
    }

    @Override // org.telegram.ui.Components.a71, s4.g0
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
