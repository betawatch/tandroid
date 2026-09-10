package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w10 extends org.telegram.ui.Components.rl0 {
    public final Context r;
    public final v10 s = new v10(this);
    public final /* synthetic */ z10 v;

    public w10(z10 z10Var, Context context) {
        this.v = z10Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(org.telegram.ui.Components.vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int M(int i10) {
        z10 z10Var = this.v;
        if (i10 < z10Var.n.size()) {
            return ((ArrayList) z10Var.r.get(z10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.rl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int P(int i10, int i11) {
        if (i10 < this.v.n.size()) {
            return (i10 == 0 || i11 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int R() {
        z10 z10Var = this.v;
        ArrayList arrayList = z10Var.n;
        int i10 = 0;
        if (z10Var.f.isEmpty() || (arrayList.isEmpty() && z10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !z10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.rl0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        z10 z10Var = this.v;
        ArrayList arrayList = z10Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) z10Var.r.get((String) arrayList.get(i10));
            int i13 = c1Var.f;
            boolean z10 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            if (i13 != 1) {
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            boolean z11 = o7Var.getMessage() != null && o7Var.getMessage().getId() == messageObject.getId();
            if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && z10Var.M)) {
                z10 = true;
            }
            o7Var.y = z10;
            o7Var.e();
            o7Var.b0 = messageObject;
            o7Var.requestLayout();
            o7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.rk(this, o7Var, messageObject, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        Context context = this.r;
        if (i10 == 0) {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        } else if (i10 != 1) {
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
            a10Var.setViewType(5);
            a10Var.setIsSingleCell(true);
            u3Var = a10Var;
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 1, null);
            o7Var.setDelegate(this.s);
            u3Var = o7Var;
        }
        return com.google.android.gms.internal.vision.e2.j(u3Var, u3Var, -1, -2);
    }
}
