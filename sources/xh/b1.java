package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class b1 extends z4 {
    public final /* synthetic */ r1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(r1 r1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.x0 = r1Var;
    }

    @Override // xh.z4
    public final yc X() {
        d6 d6Var;
        r1 r1Var = this.x0;
        org.telegram.ui.ActionBar.c3 c3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new yc(c3Var, d6Var);
    }
}
