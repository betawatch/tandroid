// default package

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vf4 implements s69, t69 {
    public final /* synthetic */ fg4 a;

    public /* synthetic */ vf4(fg4 fg4Var) {
        this.a = fg4Var;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        ag4 ag4Var;
        fg4 fg4Var = this.a;
        if (fg4Var.K.b()) {
            dg4 dg4Var = (dg4) view;
            if (!fg4Var.n) {
                if (i != fg4Var.L || (ag4Var = fg4Var.K) == null) {
                    fg4Var.i(dg4Var.b, i);
                    return;
                } else {
                    ag4Var.e();
                    return;
                }
            }
            if (i != 0) {
                int L = hl.L(6.0f);
                RectF rectF = dg4Var.f;
                float f3 = L;
                if (rectF.left - f3 >= f || rectF.right + f3 <= f) {
                    return;
                }
                fg4Var.K.l(dg4Var.b.a);
            }
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        fg4 fg4Var = this.a;
        if (!fg4Var.K.b() || fg4Var.n || !fg4Var.K.g((dg4) view)) {
            return false;
        }
        fg4Var.G.f1(true);
        return true;
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
