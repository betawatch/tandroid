package zh;

import android.content.Context;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
