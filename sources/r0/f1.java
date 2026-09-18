package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class f1 extends e1 {
    public i0.b o;
    public i0.b p;
    public i0.b q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // r0.i1
    public i0.b h() {
        if (this.p == null) {
            this.p = i0.b.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // r0.i1
    public i0.b j() {
        if (this.o == null) {
            this.o = i0.b.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // r0.i1
    public i0.b l() {
        if (this.q == null) {
            this.q = i0.b.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // r0.c1, r0.i1
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.c.inset(i10, i11, i12, i13));
    }

    @Override // r0.d1, r0.i1
    public void s(i0.b bVar) {
    }
}
