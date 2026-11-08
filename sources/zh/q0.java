package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q0 extends a4 {
    public final /* synthetic */ g1 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(g1 g1Var, Context context, int i7, TL_stars.StarGift starGift, long j3, l0 l0Var, boolean z9, boolean z10) {
        super(context, i7, starGift, null, j3, l0Var, z9, z10);
        this.r2 = g1Var;
    }

    @Override // zh.a4
    public final hc e1() {
        g1 g1Var = this.r2;
        return new hc(g1Var.c, g1Var.I0);
    }
}
