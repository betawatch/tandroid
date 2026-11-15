package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wz extends org.telegram.ui.Components.pj0 {
    public final Context r;
    public final vz s = new vz(this);
    public final /* synthetic */ zz w;

    public wz(zz zzVar, Context context) {
        this.w = zzVar;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(org.telegram.ui.Components.uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int M(int i7) {
        zz zzVar = this.w;
        if (i7 < zzVar.n.size()) {
            return ((ArrayList) zzVar.r.get(zzVar.n.get(i7))).size() + (i7 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.pj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int P(int i7, int i10) {
        if (i7 < this.w.n.size()) {
            return (i7 == 0 || i10 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int R() {
        zz zzVar = this.w;
        ArrayList arrayList = zzVar.n;
        int i7 = 0;
        if (zzVar.f.isEmpty() || (arrayList.isEmpty() && zzVar.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !zzVar.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override // org.telegram.ui.Components.pj0
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) ((ArrayList) r1.r.get((String) r1.n.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.pj0
    public final void W(int i7, int i10, v4.e1 e1Var) {
        zz zzVar = this.w;
        ArrayList arrayList = zzVar.n;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) zzVar.r.get((String) arrayList.get(i7));
            int i12 = e1Var.f;
            boolean z10 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) arrayList2.get(0)).k.date, false));
                return;
            }
            if (i12 != 1) {
                return;
            }
            if (i7 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i10);
            boolean z11 = j7Var.getMessage() != null && j7Var.getMessage().e1() == gjVar.e1();
            if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && zzVar.N)) {
                z10 = true;
            }
            j7Var.E = z10;
            j7Var.e();
            j7Var.c0 = gjVar;
            j7Var.requestLayout();
            j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.bk(this, j7Var, gjVar, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        Context context = this.r;
        if (i7 == 0) {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        } else if (i7 != 1) {
            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
            pzVar.setViewType(5);
            pzVar.setIsSingleCell(true);
            x3Var = pzVar;
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(1, context, null);
            j7Var.setDelegate(this.s);
            x3Var = j7Var;
        }
        return i5.c.q(x3Var, x3Var, -1, -2);
    }
}
