package th;

import android.view.KeyEvent;
import android.view.View;
import i7.b6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f3 extends b6 {
    public final /* synthetic */ n3 a;
    public final /* synthetic */ p3 b;

    public f3(p3 p3Var, n3 n3Var) {
        this.b = p3Var;
        this.a = n3Var;
    }

    @Override // i7.b6
    public final void a(boolean z10) {
        this.a.b0();
        p3 p3Var = this.b;
        if (z10) {
            d3 d3Var = p3Var.j3;
            p3Var.l3 = d3Var.G0;
            p3Var.m3 = d3Var.H0;
            p3Var.n3 = d3Var.I0;
            p3Var.setEditTextsLocked(true);
            p3Var.n3();
            p3Var.V2();
            return;
        }
        final int i10 = p3Var.l3;
        final int i11 = p3Var.m3;
        final int i12 = p3Var.n3;
        p3Var.l3 = -1;
        p3Var.m3 = -1;
        p3Var.n3 = 0;
        boolean z11 = p3Var.o3;
        final float f9 = p3Var.p3;
        final float f10 = p3Var.q3;
        p3Var.o3 = false;
        p3Var.setEditTextsLocked(false);
        p3Var.V2();
        if (z11) {
            p3Var.post(new Runnable() { // from class: th.e3
                @Override // java.lang.Runnable
                public final void run() {
                    p3 p3Var2 = f3.this.b;
                    for (int i13 = 0; i13 < p3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = p3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof t5;
                        float f11 = f9;
                        float f12 = f10;
                        if (z12) {
                            t5 t5Var = (t5) childAt;
                            if (p3.h4(t5Var.getEditText(), f11, f12)) {
                                return;
                            }
                            if (t5Var.n() && p3.h4(t5Var.getAuthorEditText(), f11, f12)) {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (p3.h4(((i0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof q0) && p3.h4(((q0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        p3.K1(p3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            p3Var.post(new nh.c0(this, i10, i12, i11, 3));
            return;
        }
        View findFocus = p3Var.findFocus();
        if (findFocus instanceof d1) {
            p3Var.post(new y0((d1) findFocus, 2));
        }
    }
}
