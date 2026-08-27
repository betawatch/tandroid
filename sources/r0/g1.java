package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class g1 extends f1 {
    public i0.c o;
    public i0.c p;
    public i0.c q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // r0.j1
    public i0.c h() {
        if (this.p == null) {
            this.p = i0.c.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // r0.j1
    public i0.c j() {
        if (this.o == null) {
            this.o = i0.c.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // r0.j1
    public i0.c l() {
        if (this.q == null) {
            this.q = i0.c.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // r0.d1, r0.j1
    public m1 m(int i10, int i11, int i12, int i13) {
        return m1.h(null, this.c.inset(i10, i11, i12, i13));
    }

    @Override // r0.e1, r0.j1
    public void s(i0.c cVar) {
    }
}
