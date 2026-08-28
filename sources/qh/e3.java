package qh;

import android.view.KeyEvent;
import android.view.View;
import g7.a6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e3 extends a6 {
    public final /* synthetic */ m3 a;
    public final /* synthetic */ o3 b;

    public e3(o3 o3Var, m3 m3Var) {
        this.b = o3Var;
        this.a = m3Var;
    }

    @Override // g7.a6
    public final void a(boolean z10) {
        this.a.h0();
        o3 o3Var = this.b;
        if (z10) {
            c3 c3Var = o3Var.j3;
            o3Var.l3 = c3Var.G0;
            o3Var.m3 = c3Var.H0;
            o3Var.n3 = c3Var.I0;
            o3Var.setEditTextsLocked(true);
            o3Var.n3();
            o3Var.V2();
            return;
        }
        final int i9 = o3Var.l3;
        final int i10 = o3Var.m3;
        final int i11 = o3Var.n3;
        o3Var.l3 = -1;
        o3Var.m3 = -1;
        o3Var.n3 = 0;
        boolean z11 = o3Var.o3;
        final float f10 = o3Var.p3;
        final float f11 = o3Var.q3;
        o3Var.o3 = false;
        o3Var.setEditTextsLocked(false);
        o3Var.V2();
        if (z11) {
            o3Var.post(new Runnable() { // from class: qh.d3
                @Override // java.lang.Runnable
                public final void run() {
                    o3 o3Var2 = e3.this.b;
                    for (int i12 = 0; i12 < o3Var2.getChildCount(); i12++) {
                        KeyEvent.Callback childAt = o3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof s5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            s5 s5Var = (s5) childAt;
                            if (o3.h4(s5Var.getEditText(), f12, f13)) {
                                return;
                            }
                            if (s5Var.n() && o3.h4(s5Var.getAuthorEditText(), f12, f13)) {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (o3.h4(((i0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof q0) && o3.h4(((q0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i9;
                    if (i13 >= 0) {
                        o3.K1(o3Var2, i13, i11, i10);
                    }
                }
            });
            return;
        }
        if (i9 >= 0) {
            o3Var.post(new kh.c0(this, i9, i11, i10, 3));
            return;
        }
        View findFocus = o3Var.findFocus();
        if (findFocus instanceof d1) {
            o3Var.post(new y0((d1) findFocus, 2));
        }
    }
}
