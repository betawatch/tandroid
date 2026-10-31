package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u00 extends org.telegram.ui.Components.ok0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ z00 w;

    public u00(z00 z00Var, Context context, int i10) {
        this.w = z00Var;
        this.r = context;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(org.telegram.ui.Components.tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int M(int i10) {
        z00 z00Var = this.w;
        if (i10 < z00Var.n.size()) {
            return ((ArrayList) z00Var.r.get(z00Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.ok0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int P(int i10, int i11) {
        if (i10 >= this.w.n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.s;
        return (i12 == 2 || i12 == 4) ? 3 : 1;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int R() {
        z00 z00Var = this.w;
        int i10 = 0;
        if (z00Var.n.isEmpty()) {
            return 0;
        }
        int size = z00Var.n.size();
        if (!z00Var.n.isEmpty() && !z00Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.ok0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return i10 == 0 || i11 != 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        boolean z10;
        z00 z00Var = this.w;
        ArrayList arrayList = z00Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) z00Var.r.get((String) arrayList.get(i10));
            int i13 = c1Var.f;
            boolean z11 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) arrayList2.get(0)).k.date, false));
                return;
            }
            boolean z12 = true;
            if (i13 != 1) {
                if (i13 != 3) {
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i11);
                boolean z13 = k7Var.getMessage() != null && k7Var.getMessage().f1() == jjVar.f1();
                if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && z00Var.M)) {
                    z11 = true;
                }
                k7Var.f(jjVar, z11);
                k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, k7Var, jjVar, z13, 3));
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList2.get(i11);
            if (l7Var.getMessage() == null || l7Var.getMessage().f1() != jjVar2.f1()) {
                z10 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !z00Var.M)) {
                z12 = z10;
            }
            l7Var.c(jjVar2, z12);
            l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, l7Var, jjVar2, z11, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.z3(context, null);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.l7(2, context, null);
        } else {
            if (i10 != 2) {
                frameLayout2 = new org.telegram.ui.Components.ts0(this, context);
                return sc.e.o(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
            int i11 = this.s;
            if (i11 == 2 || i11 == 4) {
                zzVar.setViewType(4);
            } else {
                zzVar.setViewType(3);
            }
            zzVar.setIsSingleCell(true);
            frameLayout = zzVar;
        }
        frameLayout2 = frameLayout;
        return sc.e.o(frameLayout2, frameLayout2, -1, -2);
    }
}
