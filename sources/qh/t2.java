package qh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;
    public final /* synthetic */ w2 c;

    public /* synthetic */ t2(u2 u2Var, w2 w2Var, int i10) {
        this.a = i10;
        this.b = u2Var;
        this.c = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k2 k2Var = this.b.c.d;
                k2Var.getClass();
                w2 w2Var = this.c;
                int R = RecyclerView.R(w2Var);
                if (R != -1) {
                    il0 il0Var = k2Var.S0;
                    if (il0Var == null) {
                        jl0 jl0Var = k2Var.T0;
                        if (jl0Var != null) {
                            jl0Var.c(0.0f, 0.0f, R, w2Var);
                            break;
                        }
                    } else {
                        il0Var.f(R, w2Var);
                        break;
                    }
                }
                break;
            default:
                k2 k2Var2 = this.b.c.d;
                k2Var2.getClass();
                w2 w2Var2 = this.c;
                int R2 = RecyclerView.R(w2Var2);
                if (R2 != -1) {
                    kl0 kl0Var = k2Var2.U0;
                    if (kl0Var == null) {
                        ll0 ll0Var = k2Var2.V0;
                        if (ll0Var != null) {
                            ll0Var.c(0.0f, 0.0f, R2, w2Var2);
                            break;
                        }
                    } else {
                        kl0Var.f(R2, w2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
