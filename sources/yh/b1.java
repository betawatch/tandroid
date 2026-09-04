package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b1 extends zh.w3 {
    public final /* synthetic */ p1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p1 p1Var, Context context, int i10, long j3, f6 f6Var) {
        super(context, i10, j3, f6Var, null);
        this.r1 = p1Var;
    }

    @Override // zh.w3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final yc getBulletinFactory() {
        f6 f6Var;
        p1 p1Var = this.r1;
        org.telegram.ui.ActionBar.d3 d3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new yc(d3Var, f6Var);
    }
}
