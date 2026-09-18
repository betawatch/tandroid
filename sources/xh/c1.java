package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class c1 extends yh.y3 {
    public final /* synthetic */ r1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(r1 r1Var, Context context, int i10, long j3, e6 e6Var) {
        super(context, i10, j3, e6Var, null);
        this.r1 = r1Var;
    }

    @Override // yh.y3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final xc getBulletinFactory() {
        e6 e6Var;
        r1 r1Var = this.r1;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new xc(d3Var, e6Var);
    }
}
