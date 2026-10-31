package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements fe.e, a70, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.gu0, org.telegram.ui.Components.hk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ y5(y6 y6Var, int i10) {
        this.a = i10;
        this.b = y6Var;
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.a70
    public void a(int i10) {
        org.telegram.messenger.i0.a4(this.b.b);
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        y6 y6Var = this.b;
        ArrayList arrayList = y6Var.f0;
        if (y6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            int i11 = 0;
            int i12 = 1;
            if (u6Var.a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i13 = u6Var.f;
                if (i13 < 0) {
                    y6Var.L = !y6Var.L;
                    y6Var.z0(true);
                    y6Var.x0();
                    return;
                }
                boolean[] zArr = y6Var.d;
                if (i13 < 0) {
                    y6Var.w0(view);
                    return;
                }
                if (zArr[i13]) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < 10; i15++) {
                        if (zArr[i15] && y6Var.v0(i15) > 0) {
                            i14++;
                        }
                    }
                    if (i14 <= 1) {
                        org.telegram.messenger.t2.D.a();
                        org.telegram.messenger.i0.F3(-3.0f, view, null);
                        return;
                    }
                }
                int i16 = u6Var.f;
                boolean z10 = !zArr[i16];
                zArr[i16] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                if (u6Var.i) {
                    while (true) {
                        if (i11 >= y6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            y6Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(y6Var.s0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                y6Var.x0();
                return;
            }
            if (u6Var.c >= 0) {
                d70 d70Var = new d70(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.k1 P = org.telegram.ui.Components.s4.P(y6Var, d70Var, view, f7, f10);
                int i17 = ((u6) arrayList.get(i10)).c;
                d70Var.c0 = i17;
                FrameLayout frameLayout = d70Var.h0;
                org.telegram.ui.ActionBar.b1 b1Var = d70Var.V;
                org.telegram.ui.ActionBar.b1 b1Var2 = d70Var.W;
                org.telegram.ui.Components.p80 p80Var = d70Var.T;
                c70 c70Var = d70Var.b0;
                if (i17 == 3) {
                    b1Var2.setVisibility(0);
                    b1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    c70Var.setVisibility(8);
                    p80Var.setVisibility(8);
                } else {
                    b1Var2.setVisibility(8);
                    b1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    c70Var.setVisibility(0);
                    p80Var.setVisibility(0);
                }
                ArrayList d = d70Var.d0.d(i17);
                d70Var.f0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.k2 k2Var = d70Var.g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.u5 u5Var = c70Var.a;
                    org.telegram.ui.Components.u8 u8Var = c70Var.b;
                    u5Var.l(org.telegram.messenger.cd.L0(2131754475, null), false);
                    c70Var.a.setRightPadding(org.telegram.messenger.i0.L(8.0f));
                    u8Var.b(0, k2Var.getCurrentAccount(), null);
                    u8Var.b(1, k2Var.getCurrentAccount(), null);
                    u8Var.b(2, k2Var.getCurrentAccount(), null);
                    u8Var.a(false);
                } else {
                    int min = Math.min(3, d70Var.f0.size());
                    org.telegram.ui.ActionBar.u5 u5Var2 = c70Var.a;
                    org.telegram.ui.Components.u8 u8Var2 = c70Var.b;
                    u5Var2.setRightPadding(org.telegram.messenger.i0.L((Math.max(0, min - 1) * 12) + 64));
                    c70Var.a.l(org.telegram.messenger.cd.G(d70Var.f0.size(), "ExceptionShort", Integer.valueOf(d70Var.f0.size())), false);
                    for (int i18 = 0; i18 < min; i18++) {
                        u8Var2.b(i18, k2Var.getCurrentAccount(), k2Var.getMessagesController().d2(((org.telegram.messenger.w2) d70Var.f0.get(i18)).a));
                    }
                    u8Var2.a(false);
                }
                d70Var.U.setVisibility(8);
                p80Var.setVisibility(8);
                d70Var.g();
                d70Var.setParentWindow(P);
                d70Var.setCallback(new y5(y6Var, i12));
            }
        }
    }

    @Override // org.telegram.ui.Components.gu0
    public int c() {
        return this.b.R;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        y6 y6Var = this.b;
        sh.b bVar = y6Var.d0;
        LongSparseArray longSparseArray = bVar.c;
        s6 s6Var = new s6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            sh.a aVar = (sh.a) it.next();
            s6Var.a(aVar, aVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(aVar.b);
            if (s6Var2 != null) {
                s6Var2.b(aVar);
                if (s6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(s6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (s6Var.c > 0) {
            y6Var.n0(s6Var, null, null);
        }
        y6Var.d0.d();
        j6 j6Var = y6Var.M;
        if (j6Var != null) {
            j6Var.d();
            y6Var.M.f(false);
        }
        y6Var.z0(true);
        y6Var.x0();
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        switch (this.a) {
            case 0:
                y6 y6Var = this.b;
                y6Var.y0();
                y6Var.fragmentView.invalidate();
                break;
            default:
                y6.Z(this.b, f7);
                break;
        }
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }

    private final /* synthetic */ void e(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
