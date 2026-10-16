package zh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class v7 extends e8 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ h8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(h8 h8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, int i10) {
        super(context, c6Var);
        this.o0 = h8Var;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // zh.e8
    public final void e(int i10) {
        long j10 = i10;
        h8 h8Var = this.o0;
        h8Var.u(j10);
        di.d dVar = h8Var.x;
        if (dVar != null) {
            dVar.g(p7.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), h8Var.R), true, true);
        }
        if (this.m0) {
            bi.e1 e1Var = h8Var.G;
            e1Var.g = j10;
            h8Var.H.set(e1Var);
            int i11 = this.n0;
            f(bi.z.b(i11, i10, 3), bi.z.b(i11, i10, 4), true);
        }
    }

    @Override // zh.e8
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(bi.z.b(i11, i10, 3), bi.z.b(i11, i10, 4), true);
        }
    }
}
