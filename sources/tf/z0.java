package tf;

import android.view.ViewGroup;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.nw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z0 extends ql0 {
    public u0 c;
    public Integer d;
    public nw0 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.ql0
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
        nw0 nw0Var = new nw0(this, viewGroup.getContext(), 10);
        this.e = nw0Var;
        return new dl0(nw0Var);
    }
}
