package pf;

import android.view.ViewGroup;
import f2.o1;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.aj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z0 extends yk0 {
    public u0 c;
    public Integer d;
    public aj0 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(o1 o1Var) {
        if (o1Var.b() == 0) {
            return false;
        }
        return this.c.D(o1Var);
    }

    @Override // f2.q0
    public final int h() {
        u0 u0Var = this.c;
        int K = u0Var.K();
        u0Var.H0 = K;
        return K + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.c.j(i10 - 1);
    }

    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        if (i10 > 0) {
            this.c.v(o1Var, i10 - 1);
        }
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.x(viewGroup, i10);
        }
        aj0 aj0Var = new aj0(this, viewGroup.getContext(), 10);
        this.e = aj0Var;
        return new lk0(aj0Var);
    }
}
