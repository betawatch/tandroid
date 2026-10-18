package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class a1 extends y4 {
    public final /* synthetic */ p1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p1 p1Var, Context context, int i10, sg.k kVar, long j10, m0 m0Var) {
        super(context, i10, null, kVar, j10, m0Var, false, false);
        this.x0 = p1Var;
    }

    @Override // yh.y4
    public final xc Y() {
        d6 d6Var;
        p1 p1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = p1Var.container;
        d6Var = p1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
