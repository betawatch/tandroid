package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class f8 extends o8 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ r8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(r8 r8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int i10) {
        super(context, d6Var);
        this.o0 = r8Var;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // yh.o8
    public final void e(int i10) {
        long j3 = i10;
        r8 r8Var = this.o0;
        r8Var.s(j3);
        ci.d dVar = r8Var.x;
        if (dVar != null) {
            dVar.g(z7.b1(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), r8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = r8Var.G;
            m1Var.g = j3;
            r8Var.H.set(m1Var);
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override // yh.o8
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
