package vh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.nb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;
    public final /* synthetic */ h2 c;

    public /* synthetic */ f2(g2 g2Var, h2 h2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
        this.c = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nb0 nb0Var = this.b.c.d;
                nb0Var.getClass();
                h2 h2Var = this.c;
                int R = RecyclerView.R(h2Var);
                if (R != -1) {
                    gk0 gk0Var = nb0Var.T0;
                    if (gk0Var == null) {
                        hk0 hk0Var = nb0Var.U0;
                        if (hk0Var != null) {
                            hk0Var.b(0.0f, 0.0f, R, h2Var);
                            break;
                        }
                    } else {
                        gk0Var.f(R, h2Var);
                        break;
                    }
                }
                break;
            default:
                nb0 nb0Var2 = this.b.c.d;
                nb0Var2.getClass();
                h2 h2Var2 = this.c;
                int R2 = RecyclerView.R(h2Var2);
                if (R2 != -1) {
                    ik0 ik0Var = nb0Var2.V0;
                    if (ik0Var == null) {
                        jk0 jk0Var = nb0Var2.W0;
                        if (jk0Var != null) {
                            jk0Var.b(0.0f, 0.0f, R2, h2Var2);
                            break;
                        }
                    } else {
                        ik0Var.f(R2, h2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
