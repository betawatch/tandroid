package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yz extends org.telegram.ui.Components.zj0 {
    public final Context r;
    public final xz s = new xz(this);
    public final /* synthetic */ b00 w;

    public yz(b00 b00Var, Context context) {
        this.w = b00Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(org.telegram.ui.Components.ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int M(int i7) {
        b00 b00Var = this.w;
        if (i7 < b00Var.n.size()) {
            return ((ArrayList) b00Var.r.get(b00Var.n.get(i7))).size() + (i7 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.zj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int P(int i7, int i10) {
        if (i7 < this.w.n.size()) {
            return (i7 == 0 || i10 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int R() {
        b00 b00Var = this.w;
        ArrayList arrayList = b00Var.n;
        int i7 = 0;
        if (b00Var.f.isEmpty() || (arrayList.isEmpty() && b00Var.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !b00Var.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) r1.r.get((String) r1.n.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.zj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.zj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        b00 b00Var = this.w;
        ArrayList arrayList = b00Var.n;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) b00Var.r.get((String) arrayList.get(i7));
            int i12 = f1Var.f;
            boolean z10 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i12 != 1) {
                return;
            }
            if (i7 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i10);
            boolean z11 = k7Var.getMessage() != null && k7Var.getMessage().e1() == fjVar.e1();
            if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && b00Var.N)) {
                z10 = true;
            }
            k7Var.E = z10;
            k7Var.e();
            k7Var.c0 = fjVar;
            k7Var.requestLayout();
            k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, k7Var, fjVar, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        Context context = this.r;
        if (i7 == 0) {
            y3Var = new org.telegram.ui.Cells.y3(context, null);
        } else if (i7 != 1) {
            org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
            vzVar.setViewType(5);
            vzVar.setIsSingleCell(true);
            y3Var = vzVar;
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(1, context, null);
            k7Var.setDelegate(this.s);
            y3Var = k7Var;
        }
        return i5.c.q(y3Var, y3Var, -1, -2);
    }
}
