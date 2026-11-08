package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class vz extends org.telegram.ui.Components.kj0 {
    public final Context r;
    public final uz s = new uz(this);
    public final /* synthetic */ yz w;

    public vz(yz yzVar, Context context) {
        this.w = yzVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int M(int i7) {
        yz yzVar = this.w;
        if (i7 < yzVar.n.size()) {
            return ((ArrayList) yzVar.r.get(yzVar.n.get(i7))).size() + (i7 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.kj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int P(int i7, int i10) {
        if (i7 < this.w.n.size()) {
            return (i7 == 0 || i10 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int R() {
        yz yzVar = this.w;
        ArrayList arrayList = yzVar.n;
        int i7 = 0;
        if (yzVar.f.isEmpty() || (arrayList.isEmpty() && yzVar.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !yzVar.N) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) r1.r.get((String) r1.n.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        yz yzVar = this.w;
        ArrayList arrayList = yzVar.n;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) yzVar.r.get((String) arrayList.get(i7));
            int i12 = d1Var.f;
            boolean z9 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i12 != 1) {
                return;
            }
            if (i7 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i10);
            boolean z10 = k7Var.getMessage() != null && k7Var.getMessage().f1() == ijVar.f1();
            if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && yzVar.M)) {
                z9 = true;
            }
            k7Var.D = z9;
            k7Var.e();
            k7Var.b0 = ijVar;
            k7Var.requestLayout();
            k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, k7Var, ijVar, z10, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        Context context = this.r;
        if (i7 == 0) {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        } else if (i7 != 1) {
            org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
            mzVar.setViewType(5);
            mzVar.setIsSingleCell(true);
            x3Var = mzVar;
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(1, context, null);
            k7Var.setDelegate(this.s);
            x3Var = k7Var;
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}
