package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zz extends org.telegram.ui.Components.zj0 {
    public final Context r;
    public final yz s = new yz(this);
    public final /* synthetic */ c00 w;

    public zz(c00 c00Var, Context context) {
        this.w = c00Var;
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
        c00 c00Var = this.w;
        if (i7 < c00Var.n.size()) {
            return ((ArrayList) c00Var.r.get(c00Var.n.get(i7))).size() + (i7 == 0 ? 0 : 1);
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
        c00 c00Var = this.w;
        ArrayList arrayList = c00Var.n;
        int i7 = 0;
        if (c00Var.f.isEmpty() || (arrayList.isEmpty() && c00Var.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !c00Var.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) ((ArrayList) r1.r.get((String) r1.n.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.zj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.zj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        c00 c00Var = this.w;
        ArrayList arrayList = c00Var.n;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) c00Var.r.get((String) arrayList.get(i7));
            int i12 = f1Var.f;
            boolean z10 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i12 != 1) {
                return;
            }
            if (i7 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i10);
            boolean z11 = l7Var.getMessage() != null && l7Var.getMessage().e1() == gjVar.e1();
            if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && c00Var.N)) {
                z10 = true;
            }
            l7Var.E = z10;
            l7Var.e();
            l7Var.c0 = gjVar;
            l7Var.requestLayout();
            l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.kk(this, l7Var, gjVar, z11, 4));
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
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
            yzVar.setViewType(5);
            yzVar.setIsSingleCell(true);
            y3Var = yzVar;
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(1, context, null);
            l7Var.setDelegate(this.s);
            y3Var = l7Var;
        }
        return i5.c.q(y3Var, y3Var, -1, -2);
    }
}
