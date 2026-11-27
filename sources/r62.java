// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r62 extends y46 {
    public final /* synthetic */ q22 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r62(q22 q22Var, Context context) {
        super(context);
        this.r = q22Var;
    }

    @Override // y46
    public final int k(int i, View view) {
        int i2;
        a72 a72Var = (a72) this.r.V;
        if (a72Var.W0) {
            i = -1;
        }
        int k = super.k(i, view);
        if (a72Var.W0) {
            k += hl.L(160.0f);
        }
        if (!a72Var.W0) {
            k = uh9.f(7.0f, a72Var.S0 - hl.m, k);
        }
        if (a72Var.W0 && k == 0 && (i2 = a72Var.X0) >= 0) {
            a72Var.j0(i2);
            a72Var.X0 = -1;
        }
        a72Var.W0 = false;
        return k;
    }

    @Override // y46
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
