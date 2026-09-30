package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class c1 extends yh.x3 {
    public final /* synthetic */ r1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(r1 r1Var, Context context, int i10, long j3, d6 d6Var) {
        super(context, i10, j3, d6Var, null);
        this.r1 = r1Var;
    }

    @Override // yh.x3, org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.i2
    public final yc getBulletinFactory() {
        d6 d6Var;
        r1 r1Var = this.r1;
        org.telegram.ui.ActionBar.c3 c3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new yc(c3Var, d6Var);
    }
}
