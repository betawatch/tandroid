package zf;

import android.view.ViewGroup;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.bo0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c1 extends tk0 {
    public x0 c;
    public Integer d;
    public bo0 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() == 0) {
            return false;
        }
        return this.c.D(c1Var);
    }

    @Override // s4.g0
    public final int b() {
        x0 x0Var = this.c;
        int K = x0Var.K();
        x0Var.M0 = K;
        return K + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.c.d(i10 - 1);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (i10 > 0) {
            this.c.t(c1Var, i10 - 1);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.w(viewGroup, i10);
        }
        bo0 bo0Var = new bo0(this, viewGroup.getContext(), 15);
        this.e = bo0Var;
        return new dk0(bo0Var);
    }
}
