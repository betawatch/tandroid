// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class uu7 extends c79 {
    public r17 c;
    public Integer d;
    public tb e;
    public boolean f;
    public int h;

    @Override // c79
    public final boolean D(f89 f89Var) {
        if (f89Var.b() == 0) {
            return false;
        }
        return this.c.D(f89Var);
    }

    @Override // j79
    public final int b() {
        r17 r17Var = this.c;
        int K = r17Var.K();
        r17Var.N0 = K;
        return K + 1;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return -983904;
        }
        return this.c.d(i - 1);
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (i > 0) {
            this.c.t(f89Var, i - 1);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        if (i != -983904) {
            return this.c.x(viewGroup, i);
        }
        tb tbVar = new tb((byte) 22, viewGroup.getContext(), this);
        this.e = tbVar;
        return new n69(tbVar);
    }
}
