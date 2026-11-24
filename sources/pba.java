// default package

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pba implements oy4, qq7, k8, py4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tca b;

    public /* synthetic */ pba(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        WindowInsets g = wzcVar.g();
        tca tcaVar = this.b;
        tcaVar.q0(g);
        iq5 f = wzcVar.a.f(519);
        if (!tcaVar.B2.equals(f)) {
            tcaVar.B2 = f;
            tcaVar.c.requestLayout();
        }
        return wzc.b;
    }

    @Override // py4
    public final int i() {
        return cmb.v0(cmb.c6, this.b.J0);
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        tca tcaVar = this.b;
        switch (b) {
            case 2:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = tcaVar.E2) != null && m8Var.isShowing()) {
                    tcaVar.E2.d(true);
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var2 = tcaVar.E2) != null && m8Var2.isShowing()) {
                    tcaVar.E2.d(true);
                    break;
                }
                break;
        }
    }

    @Override // oy4
    public final void s(int i) {
        tca tcaVar = this.b;
        mr3 mr3Var = tcaVar.J2;
        if (Build.VERSION.SDK_INT < 31 || mr3Var == null) {
            return;
        }
        if (iqd.a(i, 4)) {
            mr3Var.h(tcaVar.X0.e());
        }
        mr3Var.e(tcaVar.O2, tcaVar.b.getWidth(), tcaVar.b.getHeight());
    }
}
