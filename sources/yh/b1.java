package yh;

import ai.k7;
import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class b1 extends k7 {
    public final /* synthetic */ p1 B1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p1 p1Var, Context context, int i10, long j10, d6 d6Var) {
        super(context, i10, j10, d6Var, null);
        this.B1 = p1Var;
    }

    @Override // ai.k7, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final xc getBulletinFactory() {
        d6 d6Var;
        p1 p1Var = this.B1;
        org.telegram.ui.ActionBar.d3 d3Var = p1Var.container;
        d6Var = p1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
