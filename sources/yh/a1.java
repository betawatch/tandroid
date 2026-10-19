package yh;

import ai.l7;
import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class a1 extends l7 {
    public final /* synthetic */ o1 B1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(o1 o1Var, Context context, int i10, long j10, d6 d6Var) {
        super(context, i10, j10, d6Var, null);
        this.B1 = o1Var;
    }

    @Override // ai.l7, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final xc getBulletinFactory() {
        d6 d6Var;
        o1 o1Var = this.B1;
        org.telegram.ui.ActionBar.d3 d3Var = o1Var.container;
        d6Var = o1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
