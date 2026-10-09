package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d1 extends yh.s3 {
    public final /* synthetic */ r1 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(r1 r1Var, Context context, int i10, long j3, e6 e6Var) {
        super(context, i10, j3, e6Var, null);
        this.s1 = r1Var;
    }

    @Override // yh.s3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final ad getBulletinFactory() {
        e6 e6Var;
        r1 r1Var = this.s1;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new ad(d3Var, e6Var);
    }
}
