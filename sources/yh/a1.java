package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a1 extends x4 {
    public final /* synthetic */ p1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p1 p1Var, Context context, int i10, sg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.x0 = p1Var;
    }

    @Override // yh.x4
    public final yc X() {
        f6 f6Var;
        p1 p1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new yc(d3Var, f6Var);
    }
}
