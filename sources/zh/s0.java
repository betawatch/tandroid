package zh;

import android.content.Context;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class s0 extends a4 {
    public final /* synthetic */ g1 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(g1 g1Var, Context context, int i7, ug.j jVar, long j3, l0 l0Var) {
        super(context, i7, null, jVar, j3, l0Var, false, false);
        this.r2 = g1Var;
    }

    @Override // zh.a4
    public final hc e1() {
        g1 g1Var = this.r2;
        return new hc(g1Var.c, g1Var.I0);
    }
}
