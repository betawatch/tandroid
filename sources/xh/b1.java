package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b1 extends yh.z3 {
    public final /* synthetic */ q1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(q1 q1Var, Context context, int i10, long j3, e6 e6Var) {
        super(context, i10, j3, e6Var, null);
        this.r1 = q1Var;
    }

    @Override // yh.z3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final vc getBulletinFactory() {
        e6 e6Var;
        q1 q1Var = this.r1;
        org.telegram.ui.ActionBar.d3 d3Var = q1Var.container;
        e6Var = q1Var.resourcesProvider;
        return new vc(d3Var, e6Var);
    }
}
