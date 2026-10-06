package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class c1 extends yh.y3 {
    public final /* synthetic */ q1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(q1 q1Var, Context context, int i10, long j3, d6 d6Var) {
        super(context, i10, j3, d6Var, null);
        this.r1 = q1Var;
    }

    @Override // yh.y3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final yc getBulletinFactory() {
        d6 d6Var;
        q1 q1Var = this.r1;
        org.telegram.ui.ActionBar.d3 d3Var = q1Var.container;
        d6Var = q1Var.resourcesProvider;
        return new yc(d3Var, d6Var);
    }
}
