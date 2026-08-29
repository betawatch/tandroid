package rf;

import android.view.ViewGroup;
import f2.n1;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.op0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a1 extends il0 {
    public v0 c;
    public Integer d;
    public op0 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        if (n1Var.b() == 0) {
            return false;
        }
        return this.c.D(n1Var);
    }

    @Override // f2.p0
    public final int h() {
        v0 v0Var = this.c;
        int K = v0Var.K();
        v0Var.H0 = K;
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
    public final void v(n1 n1Var, int i10) {
        if (i10 > 0) {
            this.c.v(n1Var, i10 - 1);
        }
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.x(viewGroup, i10);
        }
        op0 op0Var = new op0(this, viewGroup.getContext(), 10);
        this.e = op0Var;
        return new vk0(op0Var);
    }
}
