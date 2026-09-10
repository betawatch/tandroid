package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class f1 extends e1 {
    public i0.c o;
    public i0.c p;
    public i0.c q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // r0.i1
    public i0.c h() {
        if (this.p == null) {
            this.p = i0.c.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // r0.i1
    public i0.c j() {
        if (this.o == null) {
            this.o = i0.c.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // r0.i1
    public i0.c l() {
        if (this.q == null) {
            this.q = i0.c.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // r0.c1, r0.i1
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.c.inset(i10, i11, i12, i13));
    }

    @Override // r0.d1, r0.i1
    public void s(i0.c cVar) {
    }
}
