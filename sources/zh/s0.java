package zh;

import android.content.Context;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s0 extends b4 {
    public final /* synthetic */ g1 u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(g1 g1Var, Context context, int i7, ug.j jVar, long j3, l0 l0Var) {
        super(context, i7, null, jVar, j3, l0Var, false, false);
        this.u2 = g1Var;
    }

    @Override // zh.b4
    public final gc e1() {
        g1 g1Var = this.u2;
        return new gc(g1Var.c, g1Var.I0);
    }
}
