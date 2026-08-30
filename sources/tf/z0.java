package tf;

import android.view.ViewGroup;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.gw0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z0 extends rl0 {
    public u0 c;
    public Integer d;
    public gw0 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.b() == 0) {
            return false;
        }
        return this.c.D(l1Var);
    }

    @Override // f2.o0
    public final int h() {
        u0 u0Var = this.c;
        int K = u0Var.K();
        u0Var.I0 = K;
        return K + 1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.c.j(i10 - 1);
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (i10 > 0) {
            this.c.v(l1Var, i10 - 1);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.x(viewGroup, i10);
        }
        gw0 gw0Var = new gw0(this, viewGroup.getContext(), 10);
        this.e = gw0Var;
        return new el0(gw0Var);
    }
}
