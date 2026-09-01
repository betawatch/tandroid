package uf;

import android.view.ViewGroup;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.iw0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z0 extends sl0 {
    public u0 c;
    public Integer d;
    public iw0 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.sl0
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
        iw0 iw0Var = new iw0(this, viewGroup.getContext(), 10);
        this.e = iw0Var;
        return new fl0(iw0Var);
    }
}
