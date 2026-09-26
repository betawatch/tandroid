package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class c1 extends yh.x3 {
    public final /* synthetic */ r1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(r1 r1Var, Context context, int i10, long j3, d6 d6Var) {
        super(context, i10, j3, d6Var, null);
        this.r1 = r1Var;
    }

    @Override // yh.x3, org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.i2
    public final xc getBulletinFactory() {
        d6 d6Var;
        r1 r1Var = this.r1;
        org.telegram.ui.ActionBar.c3 c3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new xc(c3Var, d6Var);
    }
}
