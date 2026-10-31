package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w00 extends org.telegram.ui.Components.ok0 {
    public final Context r;
    public final v00 s = new v00(this);
    public final /* synthetic */ z00 w;

    public w00(z00 z00Var, Context context) {
        this.w = z00Var;
        this.r = context;
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
        if (i10 < this.w.n.size()) {
            return (i10 == 0 || i11 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int R() {
        z00 z00Var = this.w;
        ArrayList arrayList = z00Var.n;
        int i10 = 0;
        if (z00Var.f.isEmpty() || (arrayList.isEmpty() && z00Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !z00Var.N) {
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
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        z00 z00Var = this.w;
        ArrayList arrayList = z00Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) z00Var.r.get((String) arrayList.get(i10));
            int i13 = c1Var.f;
            boolean z10 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i13 != 1) {
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i11);
            boolean z11 = o7Var.getMessage() != null && o7Var.getMessage().f1() == jjVar.f1();
            if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && z00Var.M)) {
                z10 = true;
            }
            o7Var.D = z10;
            o7Var.e();
            o7Var.b0 = jjVar;
            o7Var.requestLayout();
            o7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, o7Var, jjVar, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        Context context = this.r;
        if (i10 == 0) {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        } else if (i10 != 1) {
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
            zzVar.setViewType(5);
            zzVar.setIsSingleCell(true);
            z3Var = zzVar;
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(1, context, null);
            o7Var.setDelegate(this.s);
            z3Var = o7Var;
        }
        return sc.e.o(z3Var, z3Var, -1, -2);
    }
}
