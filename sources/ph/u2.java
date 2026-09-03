package ph;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    hl0 hl0Var = l2Var.S0;
                    if (hl0Var == null) {
                        il0 il0Var = l2Var.T0;
                        if (il0Var != null) {
                            il0Var.c(0.0f, 0.0f, R, x2Var);
                            break;
                        }
                    } else {
                        hl0Var.d(R, x2Var);
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
                    jl0 jl0Var = l2Var2.U0;
                    if (jl0Var == null) {
                        kl0 kl0Var = l2Var2.V0;
                        if (kl0Var != null) {
                            kl0Var.c(0.0f, 0.0f, R2, x2Var2);
                            break;
                        }
                    } else {
                        jl0Var.d(R2, x2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
