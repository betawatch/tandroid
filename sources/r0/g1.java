package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class g1 extends f1 {
    public i0.b o;
    public i0.b p;
    public i0.b q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // r0.j1
    public i0.b h() {
        if (this.p == null) {
            this.p = i0.b.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // r0.j1
    public i0.b j() {
        if (this.o == null) {
            this.o = i0.b.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // r0.j1
    public i0.b l() {
        if (this.q == null) {
            this.q = i0.b.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // r0.d1, r0.j1
    public m1 m(int i10, int i11, int i12, int i13) {
        return m1.h(null, this.c.inset(i10, i11, i12, i13));
    }

    @Override // r0.e1, r0.j1
    public void s(i0.b bVar) {
    }
}
