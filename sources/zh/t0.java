package zh;

import android.content.Context;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t0 extends b4 {
    public final /* synthetic */ h1 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(h1 h1Var, Context context, int i7, ug.j jVar, long j3, l0 l0Var) {
        super(context, i7, null, jVar, j3, l0Var, false, false);
        this.r2 = h1Var;
    }

    @Override // zh.b4
    public final hc e1() {
        h1 h1Var = this.r2;
        return new hc(h1Var.c, h1Var.I0);
    }
}
