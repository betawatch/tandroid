package xh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f8 extends o8 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ r8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(r8 r8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, int i10) {
        super(context, f6Var);
        this.o0 = r8Var;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // xh.o8
    public final void e(int i10) {
        long j3 = i10;
        r8 r8Var = this.o0;
        r8Var.s(j3);
        bi.d dVar = r8Var.x;
        if (dVar != null) {
            dVar.g(z7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), r8Var.Q), true, true);
        }
        if (this.m0) {
            zh.k0 k0Var = r8Var.G;
            k0Var.g = j3;
            r8Var.H.set(k0Var);
            int i11 = this.n0;
            f(zh.o.b(i11, i10, 3), zh.o.b(i11, i10, 4), true);
        }
    }

    @Override // xh.o8
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(zh.o.b(i11, i10, 3), zh.o.b(i11, i10, 4), true);
        }
    }
}
