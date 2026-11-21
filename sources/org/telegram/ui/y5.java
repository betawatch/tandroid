package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements te.b, c60, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.pt0, org.telegram.ui.Components.rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;

    public /* synthetic */ y5(x6 x6Var, int i7) {
        this.a = i7;
        this.b = x6Var;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 0:
                x6 x6Var = this.b;
                x6Var.z0();
                x6Var.fragmentView.invalidate();
                break;
            default:
                x6.a0(this.b, f10);
                break;
        }
    }

    @Override // org.telegram.ui.c60
    public void a(int i7) {
        org.telegram.messenger.g0.Z3(this.b.b);
    }

    @Override // org.telegram.ui.Components.pt0
    public int b() {
        return this.b.S;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        x6 x6Var = this.b;
        ArrayList arrayList = x6Var.g0;
        if (x6Var.getParentActivity() != null && i7 >= 0 && i7 < arrayList.size()) {
            t6 t6Var = (t6) arrayList.get(i7);
            int i10 = 0;
            int i11 = 1;
            if (t6Var.a == 11 && (view instanceof org.telegram.ui.Cells.d2)) {
                int i12 = t6Var.f;
                if (i12 < 0) {
                    x6Var.M = !x6Var.M;
                    x6Var.A0(true);
                    x6Var.y0();
                    return;
                }
                boolean[] zArr = x6Var.d;
                if (i12 < 0) {
                    x6Var.x0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && x6Var.w0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        org.telegram.messenger.q2.E.a();
                        org.telegram.messenger.g0.E3(-3.0f, view, null);
                        return;
                    }
                }
                int i15 = t6Var.f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.d2) view).c(z10, true);
                if (t6Var.i) {
                    while (true) {
                        if (i10 >= x6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = x6Var.b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            x6Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((t6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.d2) childAt).c(x6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                x6Var.y0();
                return;
            }
            if (t6Var.c >= 0) {
                f60 f60Var = new f60(view.getContext(), x6Var);
                org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.c5.N(x6Var, f60Var, view, f10, f11);
                int i16 = ((t6) arrayList.get(i7)).c;
                f60Var.d0 = i16;
                FrameLayout frameLayout = f60Var.i0;
                org.telegram.ui.ActionBar.y0 y0Var = f60Var.W;
                org.telegram.ui.ActionBar.y0 y0Var2 = f60Var.a0;
                org.telegram.ui.Components.m80 m80Var = f60Var.U;
                e60 e60Var = f60Var.c0;
                if (i16 == 3) {
                    y0Var2.setVisibility(0);
                    y0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    e60Var.setVisibility(8);
                    m80Var.setVisibility(8);
                } else {
                    y0Var2.setVisibility(8);
                    y0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    e60Var.setVisibility(0);
                    m80Var.setVisibility(0);
                }
                ArrayList d = f60Var.e0.d(i16);
                f60Var.g0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.g2 g2Var = f60Var.h0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.m5 m5Var = e60Var.a;
                    org.telegram.ui.Components.e9 e9Var = e60Var.b;
                    m5Var.l(org.telegram.messenger.gd.N0(2131754472, null), false);
                    e60Var.a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    e9Var.b(0, g2Var.getCurrentAccount(), null);
                    e9Var.b(1, g2Var.getCurrentAccount(), null);
                    e9Var.b(2, g2Var.getCurrentAccount(), null);
                    e9Var.a(false);
                } else {
                    int min = Math.min(3, f60Var.g0.size());
                    org.telegram.ui.ActionBar.m5 m5Var2 = e60Var.a;
                    org.telegram.ui.Components.e9 e9Var2 = e60Var.b;
                    m5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    e60Var.a.l(org.telegram.messenger.gd.G(f60Var.g0.size(), "ExceptionShort", Integer.valueOf(f60Var.g0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        e9Var2.b(i17, g2Var.getCurrentAccount(), g2Var.getMessagesController().g2(((org.telegram.messenger.t2) f60Var.g0.get(i17)).a));
                    }
                    e9Var2.a(false);
                }
                f60Var.V.setVisibility(8);
                m80Var.setVisibility(8);
                f60Var.g();
                f60Var.setParentWindow(N);
                f60Var.setCallback(new y5(x6Var, i11));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        x6 x6Var = this.b;
        ei.c cVar = x6Var.e0;
        LongSparseArray longSparseArray = cVar.c;
        r6 r6Var = new r6(0L);
        Iterator it = cVar.j.iterator();
        while (it.hasNext()) {
            ei.b bVar = (ei.b) it.next();
            r6Var.a(bVar, bVar.d);
            r6 r6Var2 = (r6) longSparseArray.get(bVar.b);
            if (r6Var2 != null) {
                r6Var2.b(bVar);
                if (r6Var2.c <= 0) {
                    longSparseArray.remove(bVar.b);
                    cVar.b.remove(r6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (r6Var.c > 0) {
            x6Var.o0(r6Var, null, null);
        }
        x6Var.e0.d();
        i6 i6Var = x6Var.N;
        if (i6Var != null) {
            i6Var.d();
            x6Var.N.f(false);
        }
        x6Var.A0(true);
        x6Var.y0();
    }

    private final /* synthetic */ void c(float f10, int i7) {
    }

    private final /* synthetic */ void d(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
