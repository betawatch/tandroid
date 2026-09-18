package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class e8 extends n8 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ q8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(q8 q8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, int i10) {
        super(context, f6Var);
        this.o0 = q8Var;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // yh.n8
    public final void e(int i10) {
        long j3 = i10;
        q8 q8Var = this.o0;
        q8Var.s(j3);
        ci.d dVar = q8Var.x;
        if (dVar != null) {
            dVar.g(y7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), q8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = q8Var.G;
            m1Var.g = j3;
            q8Var.H.set(m1Var);
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override // yh.n8
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
