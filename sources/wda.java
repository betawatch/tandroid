// default package

import android.graphics.Typeface;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wda extends hb {
    public final /* synthetic */ xda x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wda(xda xdaVar, xda xdaVar2) {
        super(xdaVar2);
        this.x = xdaVar;
    }

    @Override // hb
    public final boolean b() {
        kea keaVar = this.x.q0;
        if (keaVar.J || !keaVar.T1) {
            return false;
        }
        return !keaVar.n1.m();
    }

    @Override // hb
    public final void e(float f, float f2, boolean z) {
        xda xdaVar = this.x;
        kea keaVar = xdaVar.q0;
        int i = kea.T2;
        for (int i2 = 0; i2 < keaVar.b.getChildCount(); i2++) {
            View childAt = keaVar.b.getChildAt(i2);
            if (childAt != keaVar.q1 && childAt != keaVar.v1 && childAt != keaVar.N1[1] && childAt != keaVar.x1 && childAt != keaVar.m1 && childAt != keaVar.X1 && childAt != keaVar.p1) {
                childAt.setTranslationY(f);
            }
        }
        mda mdaVar = keaVar.A1;
        keaVar.o2 = f;
        int i3 = xdaVar.l0;
        if (i3 != -1) {
            if (!z) {
                f2 = 1.0f - f2;
            }
            float f3 = 1.0f - f2;
            keaVar.k2 = (int) ((xdaVar.m0 * f2) + (i3 * f3));
            float f4 = ((i3 - r5) * f3) + f;
            mdaVar.setTranslationY(f4);
            if (z) {
                keaVar.B1.setTranslationY(f4);
            } else {
                keaVar.B1.setTranslationY(f4 + keaVar.A1.getPaddingTop());
            }
        } else {
            int i4 = xdaVar.n0;
            if (i4 != -1) {
                float f5 = 1.0f - f2;
                keaVar.k2 = (int) ((xdaVar.o0 * f2) + (i4 * f5));
                if (!z) {
                    f5 = f2;
                }
                if (z) {
                    mdaVar.setTranslationY(f - ((i4 - r5) * f2));
                } else {
                    mdaVar.setTranslationY(((r5 - i4) * f5) + f);
                }
            }
        }
        keaVar.A1.setTopGlowOffset((int) (keaVar.k2 + keaVar.o2));
        keaVar.l1.setTranslationY(keaVar.k2 + keaVar.o2);
        keaVar.L1.setTranslationY(keaVar.k2 + keaVar.o2);
        keaVar.m1.invalidate();
        keaVar.F0 = keaVar.o2;
        keaVar.c.invalidate();
        keaVar.U0();
        xdaVar.invalidate();
    }

    @Override // hb
    public final void f() {
        kea keaVar = this.x.q0;
        qda qdaVar = keaVar.n1;
        if (qdaVar == null || !qdaVar.m()) {
            Typeface typeface = hl.a;
        }
        keaVar.m2 = false;
        int i = keaVar.k2;
        keaVar.l2 = i;
        keaVar.A1.setTopGlowOffset(i);
        keaVar.l1.setTranslationY(keaVar.k2);
        keaVar.L1.setTranslationY(keaVar.k2);
        keaVar.A1.setTranslationY(0.0f);
        keaVar.B1.setTranslationY(0.0f);
        keaVar.U0();
    }

    @Override // hb
    public final void g(int i, boolean z) {
        xda xdaVar = this.x;
        kea keaVar = xdaVar.q0;
        int i2 = keaVar.l2;
        int i3 = keaVar.k2;
        if (i2 != i3) {
            xdaVar.l0 = i2;
            xdaVar.m0 = i3;
            keaVar.m2 = true;
            keaVar.k2 = i2;
            i3 = i2;
        } else {
            xdaVar.l0 = -1;
            i2 = -1;
        }
        int i4 = xdaVar.j0;
        int i5 = xdaVar.k0;
        if (i4 != i5) {
            xdaVar.n0 = 0;
            xdaVar.o0 = 0;
            keaVar.m2 = true;
            int i6 = i4 - i5;
            if (z) {
                xdaVar.o0 = i6;
            } else {
                xdaVar.o0 = 0 - i6;
                i2 = xdaVar.m0;
            }
            keaVar.k2 = i2;
            i3 = i2;
        } else {
            xdaVar.n0 = -1;
        }
        keaVar.A1.setTopGlowOffset((int) (keaVar.o2 + i3));
        keaVar.l1.setTranslationY(keaVar.o2 + keaVar.k2);
        keaVar.L1.setTranslationY(keaVar.o2 + keaVar.k2);
        xdaVar.invalidate();
    }
}
