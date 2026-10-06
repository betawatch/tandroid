package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class b1 extends z4 {
    public final /* synthetic */ q1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(q1 q1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.x0 = q1Var;
    }

    @Override // xh.z4
    public final yc W() {
        d6 d6Var;
        q1 q1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = q1Var.container;
        d6Var = q1Var.resourcesProvider;
        return new yc(d3Var, d6Var);
    }
}
