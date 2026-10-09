package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v7 extends e8 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ h8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(h8 h8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i10) {
        super(context, e6Var);
        this.o0 = h8Var;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // yh.e8
    public final void e(int i10) {
        long j3 = i10;
        h8 h8Var = this.o0;
        h8Var.u(j3);
        ci.d dVar = h8Var.x;
        if (dVar != null) {
            dVar.g(p7.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), h8Var.R), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = h8Var.G;
            m1Var.g = j3;
            h8Var.H.set(m1Var);
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override // yh.e8
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
