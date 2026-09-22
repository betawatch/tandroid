package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class d8 extends m8 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ p8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(p8 p8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i10) {
        super(context, e6Var);
        this.o0 = p8Var;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // yh.m8
    public final void e(int i10) {
        long j3 = i10;
        p8 p8Var = this.o0;
        p8Var.s(j3);
        ci.d dVar = p8Var.x;
        if (dVar != null) {
            dVar.g(x7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), p8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = p8Var.G;
            m1Var.g = j3;
            p8Var.H.set(m1Var);
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override // yh.m8
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
