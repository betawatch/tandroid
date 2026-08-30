package ph;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                    il0 il0Var = l2Var.S0;
                    if (il0Var == null) {
                        jl0 jl0Var = l2Var.T0;
                        if (jl0Var != null) {
                            jl0Var.c(0.0f, 0.0f, R, x2Var);
                            break;
                        }
                    } else {
                        il0Var.f(R, x2Var);
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
                    kl0 kl0Var = l2Var2.U0;
                    if (kl0Var == null) {
                        ll0 ll0Var = l2Var2.V0;
                        if (ll0Var != null) {
                            ll0Var.c(0.0f, 0.0f, R2, x2Var2);
                            break;
                        }
                    } else {
                        kl0Var.f(R2, x2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
