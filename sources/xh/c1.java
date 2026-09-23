package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class c1 extends yh.y3 {
    public final /* synthetic */ r1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(r1 r1Var, Context context, int i10, long j3, d6 d6Var) {
        super(context, i10, j3, d6Var, null);
        this.r1 = r1Var;
    }

    @Override // yh.y3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final xc getBulletinFactory() {
        d6 d6Var;
        r1 r1Var = this.r1;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
