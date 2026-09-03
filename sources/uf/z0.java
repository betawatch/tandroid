package uf;

import android.view.ViewGroup;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.nw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z0 extends rl0 {
    public u0 c;
    public Integer d;
    public nw0 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.b() == 0) {
            return false;
        }
        return this.c.D(m1Var);
    }

    @Override // f2.p0
    public final int h() {
        u0 u0Var = this.c;
        int K = u0Var.K();
        u0Var.I0 = K;
        return K + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.c.j(i10 - 1);
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (i10 > 0) {
            this.c.v(m1Var, i10 - 1);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.x(viewGroup, i10);
        }
        nw0 nw0Var = new nw0(this, viewGroup.getContext(), 10);
        this.e = nw0Var;
        return new el0(nw0Var);
    }
}
