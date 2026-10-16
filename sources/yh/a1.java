package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class a1 extends x4 {
    public final /* synthetic */ p1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p1 p1Var, Context context, int i10, sg.k kVar, long j10, n0 n0Var) {
        super(context, i10, null, kVar, j10, n0Var, false, false);
        this.x0 = p1Var;
    }

    @Override // yh.x4
    public final zc Y() {
        c6 c6Var;
        p1 p1Var = this.x0;
        org.telegram.ui.ActionBar.c3 c3Var = p1Var.container;
        c6Var = p1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
