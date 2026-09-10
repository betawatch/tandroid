package wh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b1 extends xh.x3 {
    public final /* synthetic */ p1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p1 p1Var, Context context, int i10, long j3, f6 f6Var) {
        super(context, i10, j3, f6Var, null);
        this.r1 = p1Var;
    }

    @Override // xh.x3, org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public final wc getBulletinFactory() {
        f6 f6Var;
        p1 p1Var = this.r1;
        org.telegram.ui.ActionBar.f3 f3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new wc(f3Var, f6Var);
    }
}
