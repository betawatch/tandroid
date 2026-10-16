package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b1 extends zh.r3 {
    public final /* synthetic */ p1 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p1 p1Var, Context context, int i10, long j10, c6 c6Var) {
        super(context, i10, j10, c6Var, null);
        this.s1 = p1Var;
    }

    @Override // zh.r3, org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.i2
    public final zc getBulletinFactory() {
        c6 c6Var;
        p1 p1Var = this.s1;
        org.telegram.ui.ActionBar.c3 c3Var = p1Var.container;
        c6Var = p1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
