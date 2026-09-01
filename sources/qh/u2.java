package qh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;
    public final /* synthetic */ x2 c;

    public /* synthetic */ u2(v2 v2Var, x2 x2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
        this.c = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l2 l2Var = this.b.c.d;
                l2Var.getClass();
                x2 x2Var = this.c;
                int R = RecyclerView.R(x2Var);
                if (R != -1) {
                    jl0 jl0Var = l2Var.S0;
                    if (jl0Var == null) {
                        kl0 kl0Var = l2Var.T0;
                        if (kl0Var != null) {
                            kl0Var.c(0.0f, 0.0f, R, x2Var);
                            break;
                        }
                    } else {
                        jl0Var.f(R, x2Var);
                        break;
                    }
                }
                break;
            default:
                l2 l2Var2 = this.b.c.d;
                l2Var2.getClass();
                x2 x2Var2 = this.c;
                int R2 = RecyclerView.R(x2Var2);
                if (R2 != -1) {
                    ll0 ll0Var = l2Var2.U0;
                    if (ll0Var == null) {
                        ml0 ml0Var = l2Var2.V0;
                        if (ml0Var != null) {
                            ml0Var.c(0.0f, 0.0f, R2, x2Var2);
                            break;
                        }
                    } else {
                        ll0Var.f(R2, x2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
