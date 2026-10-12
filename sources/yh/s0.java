package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class s0 extends x4 {
    public final /* synthetic */ p1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, long j10, n0 n0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, n0Var, z10, z11);
        this.x0 = p1Var;
    }

    @Override // yh.x4
    public final zc Y() {
        c6 c6Var;
        p1 p1Var = this.x0;
        org.telegram.ui.ActionBar.c3 c3Var = p1Var.container;
        c6Var = p1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
