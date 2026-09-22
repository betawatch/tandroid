package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class c1 extends yh.y3 {
    public final /* synthetic */ r1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(r1 r1Var, Context context, int i10, long j3, f6 f6Var) {
        super(context, i10, j3, f6Var, null);
        this.r1 = r1Var;
    }

    @Override // yh.y3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final xc getBulletinFactory() {
        f6 f6Var;
        r1 r1Var = this.r1;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        f6Var = r1Var.resourcesProvider;
        return new xc(d3Var, f6Var);
    }
}
