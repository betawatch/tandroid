package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class b1 extends z4 {
    public final /* synthetic */ r1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(r1 r1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.x0 = r1Var;
    }

    @Override // xh.z4
    public final xc X() {
        f6 f6Var;
        r1 r1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        f6Var = r1Var.resourcesProvider;
        return new xc(d3Var, f6Var);
    }
}
