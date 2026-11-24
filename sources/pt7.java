// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pt7 extends q59 {
    public k17 c;
    public Integer d;
    public sb e;
    public boolean f;
    public int h;

    @Override // q59
    public final boolean D(u69 u69Var) {
        if (u69Var.b() == 0) {
            return false;
        }
        return this.c.D(u69Var);
    }

    @Override // y59
    public final int b() {
        k17 k17Var = this.c;
        int K = k17Var.K();
        k17Var.N0 = K;
        return K + 1;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return -983904;
        }
        return this.c.d(i - 1);
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        if (i > 0) {
            this.c.t(u69Var, i - 1);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        if (i != -983904) {
            return this.c.x(viewGroup, i);
        }
        sb sbVar = new sb((byte) 22, viewGroup.getContext(), this);
        this.e = sbVar;
        return new b59(sbVar);
    }
}
