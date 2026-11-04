package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tz extends org.telegram.ui.Components.oj0 {
    public final Context r;
    public final sz s = new sz(this);
    public final /* synthetic */ wz w;

    public tz(wz wzVar, Context context) {
        this.w = wzVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        return null;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int M(int i3) {
        wz wzVar = this.w;
        if (i3 < wzVar.n.size()) {
            return ((ArrayList) wzVar.r.get(wzVar.n.get(i3))).size() + (i3 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.oj0
    public final Object O(int i3, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int P(int i3, int i10) {
        if (i3 < this.w.n.size()) {
            return (i3 == 0 || i10 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int R() {
        wz wzVar = this.w;
        ArrayList arrayList = wzVar.n;
        int i3 = 0;
        if (wzVar.f.isEmpty() || (arrayList.isEmpty() && wzVar.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !wzVar.O) {
            i3 = 1;
        }
        return size + i3;
    }

    @Override // org.telegram.ui.Components.oj0
    public final View T(int i3, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
        }
        if (i3 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i3 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) ((ArrayList) r1.r.get((String) r1.n.get(i3))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void W(int i3, int i10, u4.d1 d1Var) {
        wz wzVar = this.w;
        ArrayList arrayList = wzVar.n;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) wzVar.r.get((String) arrayList.get(i3));
            int i12 = d1Var.f;
            boolean z10 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i12 != 1) {
                return;
            }
            if (i3 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i10);
            boolean z11 = j7Var.getMessage() != null && j7Var.getMessage().f1() == ziVar.f1();
            if (i10 != arrayList2.size() - 1 || (i3 == arrayList.size() - 1 && wzVar.N)) {
                z10 = true;
            }
            j7Var.E = z10;
            j7Var.e();
            j7Var.c0 = ziVar;
            j7Var.requestLayout();
            j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, j7Var, ziVar, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x3 x3Var;
        Context context = this.r;
        if (i3 == 0) {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        } else if (i3 != 1) {
            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
            izVar.setViewType(5);
            izVar.setIsSingleCell(true);
            x3Var = izVar;
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(1, context, null);
            j7Var.setDelegate(this.s);
            x3Var = j7Var;
        }
        return k2.p1.p(x3Var, x3Var, -1, -2);
    }
}
