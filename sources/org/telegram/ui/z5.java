package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements te.b, a60, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.et0, org.telegram.ui.Components.hj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ z5(y6 y6Var, int i7) {
        this.a = i7;
        this.b = y6Var;
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 0:
                y6 y6Var = this.b;
                y6Var.z0();
                y6Var.fragmentView.invalidate();
                break;
            default:
                y6.a0(this.b, f10);
                break;
        }
    }

    @Override // org.telegram.ui.a60
    public void a(int i7) {
        org.telegram.messenger.g0.a4(this.b.b);
    }

    @Override // org.telegram.ui.Components.et0
    public int b() {
        return this.b.S;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        y6 y6Var = this.b;
        ArrayList arrayList = y6Var.g0;
        if (y6Var.getParentActivity() != null && i7 >= 0 && i7 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i7);
            int i10 = 0;
            int i11 = 1;
            if (u6Var.a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i12 = u6Var.f;
                if (i12 < 0) {
                    y6Var.M = !y6Var.M;
                    y6Var.A0(true);
                    y6Var.y0();
                    return;
                }
                boolean[] zArr = y6Var.d;
                if (i12 < 0) {
                    y6Var.x0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && y6Var.w0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        org.telegram.messenger.p2.E.a();
                        org.telegram.messenger.g0.F3(-3.0f, view, null);
                        return;
                    }
                }
                int i15 = u6Var.f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                if (u6Var.i) {
                    while (true) {
                        if (i10 >= y6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            y6Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(y6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                y6Var.y0();
                return;
            }
            if (u6Var.c >= 0) {
                d60 d60Var = new d60(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.t4.N(y6Var, d60Var, view, f10, f11);
                int i16 = ((u6) arrayList.get(i7)).c;
                d60Var.d0 = i16;
                FrameLayout frameLayout = d60Var.i0;
                org.telegram.ui.ActionBar.z0 z0Var = d60Var.W;
                org.telegram.ui.ActionBar.z0 z0Var2 = d60Var.a0;
                org.telegram.ui.Components.z70 z70Var = d60Var.U;
                c60 c60Var = d60Var.c0;
                if (i16 == 3) {
                    z0Var2.setVisibility(0);
                    z0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    c60Var.setVisibility(8);
                    z70Var.setVisibility(8);
                } else {
                    z0Var2.setVisibility(8);
                    z0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    c60Var.setVisibility(0);
                    z70Var.setVisibility(0);
                }
                ArrayList d = d60Var.e0.d(i16);
                d60Var.g0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.e2 e2Var = d60Var.h0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.j5 j5Var = c60Var.a;
                    org.telegram.ui.Components.w8 w8Var = c60Var.b;
                    j5Var.l(org.telegram.messenger.hd.M0(2131754475, null), false);
                    c60Var.a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    w8Var.b(0, e2Var.getCurrentAccount(), null);
                    w8Var.b(1, e2Var.getCurrentAccount(), null);
                    w8Var.b(2, e2Var.getCurrentAccount(), null);
                    w8Var.a(false);
                } else {
                    int min = Math.min(3, d60Var.g0.size());
                    org.telegram.ui.ActionBar.j5 j5Var2 = c60Var.a;
                    org.telegram.ui.Components.w8 w8Var2 = c60Var.b;
                    j5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    c60Var.a.l(org.telegram.messenger.hd.G(d60Var.g0.size(), "ExceptionShort", Integer.valueOf(d60Var.g0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        w8Var2.b(i17, e2Var.getCurrentAccount(), e2Var.getMessagesController().e2(((org.telegram.messenger.s2) d60Var.g0.get(i17)).a));
                    }
                    w8Var2.a(false);
                }
                d60Var.V.setVisibility(8);
                z70Var.setVisibility(8);
                d60Var.g();
                d60Var.setParentWindow(N);
                d60Var.setCallback(new z5(y6Var, i11));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        y6 y6Var = this.b;
        ei.c cVar = y6Var.e0;
        LongSparseArray longSparseArray = cVar.c;
        s6 s6Var = new s6(0L);
        Iterator it = cVar.j.iterator();
        while (it.hasNext()) {
            ei.b bVar = (ei.b) it.next();
            s6Var.a(bVar, bVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(bVar.b);
            if (s6Var2 != null) {
                s6Var2.b(bVar);
                if (s6Var2.c <= 0) {
                    longSparseArray.remove(bVar.b);
                    cVar.b.remove(s6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (s6Var.c > 0) {
            y6Var.o0(s6Var, null, null);
        }
        y6Var.e0.d();
        j6 j6Var = y6Var.N;
        if (j6Var != null) {
            j6Var.d();
            y6Var.N.f(false);
        }
        y6Var.A0(true);
        y6Var.y0();
    }

    private final /* synthetic */ void c(float f10, int i7) {
    }

    private final /* synthetic */ void d(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
