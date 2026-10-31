package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class d1 extends c1 {
    public i0.c o;
    public i0.c p;
    public i0.c q;

    public d1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // r0.g1
    public i0.c h() {
        if (this.p == null) {
            this.p = i0.c.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // r0.g1
    public i0.c j() {
        if (this.o == null) {
            this.o = i0.c.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // r0.g1
    public i0.c l() {
        if (this.q == null) {
            this.q = i0.c.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // r0.a1, r0.g1
    public j1 m(int i10, int i11, int i12, int i13) {
        return j1.h(null, this.c.inset(i10, i11, i12, i13));
    }

    @Override // r0.b1, r0.g1
    public void s(i0.c cVar) {
    }
}
