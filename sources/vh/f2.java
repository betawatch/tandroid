package vh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.mb0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                mb0 mb0Var = this.b.c.d;
                mb0Var.getClass();
                h2 h2Var = this.c;
                int R = RecyclerView.R(h2Var);
                if (R != -1) {
                    hk0 hk0Var = mb0Var.T0;
                    if (hk0Var == null) {
                        ik0 ik0Var = mb0Var.U0;
                        if (ik0Var != null) {
                            ik0Var.b(0.0f, 0.0f, R, h2Var);
                            break;
                        }
                    } else {
                        hk0Var.f(R, h2Var);
                        break;
                    }
                }
                break;
            default:
                mb0 mb0Var2 = this.b.c.d;
                mb0Var2.getClass();
                h2 h2Var2 = this.c;
                int R2 = RecyclerView.R(h2Var2);
                if (R2 != -1) {
                    jk0 jk0Var = mb0Var2.V0;
                    if (jk0Var == null) {
                        kk0 kk0Var = mb0Var2.W0;
                        if (kk0Var != null) {
                            kk0Var.b(0.0f, 0.0f, R2, h2Var2);
                            break;
                        }
                    } else {
                        jk0Var.f(R2, h2Var2);
                        break;
                    }
                }
                break;
        }
    }
}
