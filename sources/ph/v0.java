package ph;

import android.content.Context;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v0 extends g4 {
    public final /* synthetic */ l1 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(l1 l1Var, Context context, int i10, kg.m mVar, long j10, n0 n0Var) {
        super(context, i10, null, mVar, j10, n0Var, false, false);
        this.r2 = l1Var;
    }

    @Override // ph.g4
    public final cc e1() {
        l1 l1Var = this.r2;
        return new cc(l1Var.c, l1Var.I0);
    }
}
