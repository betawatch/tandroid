package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class c8 extends l8 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ o8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(o8 o8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int i10) {
        super(context, d6Var);
        this.o0 = o8Var;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // yh.l8
    public final void e(int i10) {
        long j3 = i10;
        o8 o8Var = this.o0;
        o8Var.s(j3);
        ci.d dVar = o8Var.x;
        if (dVar != null) {
            dVar.g(w7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), o8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = o8Var.G;
            m1Var.g = j3;
            o8Var.H.set(m1Var);
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override // yh.l8
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
