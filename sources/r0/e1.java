package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class e1 extends d1 {
    public i0.c o;
    public i0.c p;
    public i0.c q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // r0.h1
    public i0.c h() {
        if (this.p == null) {
            this.p = i0.c.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // r0.h1
    public i0.c j() {
        if (this.o == null) {
            this.o = i0.c.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // r0.h1
    public i0.c l() {
        if (this.q == null) {
            this.q = i0.c.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // r0.b1, r0.h1
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.c.inset(i10, i11, i12, i13));
    }

    @Override // r0.c1, r0.h1
    public void s(i0.c cVar) {
    }
}
