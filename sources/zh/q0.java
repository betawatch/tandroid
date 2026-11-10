package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q0 extends b4 {
    public final /* synthetic */ g1 u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(g1 g1Var, Context context, int i7, TL_stars.StarGift starGift, long j3, l0 l0Var, boolean z9, boolean z10) {
        super(context, i7, starGift, null, j3, l0Var, z9, z10);
        this.u2 = g1Var;
    }

    @Override // zh.b4
    public final gc e1() {
        g1 g1Var = this.u2;
        return new gc(g1Var.c, g1Var.I0);
    }
}
