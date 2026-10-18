package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class z0 extends x4 {
    public final /* synthetic */ o1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(o1 o1Var, Context context, int i10, sg.k kVar, long j10, l0 l0Var) {
        super(context, i10, null, kVar, j10, l0Var, false, false);
        this.x0 = o1Var;
    }

    @Override // yh.x4
    public final xc Y() {
        d6 d6Var;
        o1 o1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = o1Var.container;
        d6Var = o1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
