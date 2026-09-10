package wh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a1 extends y4 {
    public final /* synthetic */ p1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p1 p1Var, Context context, int i10, qg.k kVar, long j3, n0 n0Var) {
        super(context, i10, null, kVar, j3, n0Var, false, false);
        this.x0 = p1Var;
    }

    @Override // wh.y4
    public final wc X() {
        f6 f6Var;
        p1 p1Var = this.x0;
        org.telegram.ui.ActionBar.f3 f3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new wc(f3Var, f6Var);
    }
}
