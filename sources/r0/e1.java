package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class e1 extends d1 {
    public i0.b o;
    public i0.b p;
    public i0.b q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // r0.h1
    public i0.b h() {
        if (this.p == null) {
            this.p = i0.b.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // r0.h1
    public i0.b j() {
        if (this.o == null) {
            this.o = i0.b.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // r0.h1
    public i0.b l() {
        if (this.q == null) {
            this.q = i0.b.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // r0.b1, r0.h1
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.c.inset(i7, i10, i11, i12));
    }

    @Override // r0.c1, r0.h1
    public void s(i0.b bVar) {
    }
}
