package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r10 extends org.telegram.ui.Components.nl0 {
    public final Context r;
    public final q10 s = new q10(this);
    public final /* synthetic */ u10 v;

    public r10(u10 u10Var, Context context) {
        this.v = u10Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.bl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.bl0
    public final void G(org.telegram.ui.Components.rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.nl0
    public final int M(int i10) {
        u10 u10Var = this.v;
        if (i10 < u10Var.n.size()) {
            return ((ArrayList) u10Var.r.get(u10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.nl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.nl0
    public final int P(int i10, int i11) {
        if (i10 < this.v.n.size()) {
            return (i10 == 0 || i11 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.nl0
    public final int R() {
        u10 u10Var = this.v;
        ArrayList arrayList = u10Var.n;
        int i10 = 0;
        if (u10Var.f.isEmpty() || (arrayList.isEmpty() && u10Var.J)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !u10Var.K) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.nl0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.t3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.t3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void W(int i10, int i11, f2.l1 l1Var) {
        u10 u10Var = this.v;
        ArrayList arrayList = u10Var.n;
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) u10Var.r.get((String) arrayList.get(i10));
            int i13 = l1Var.f;
            boolean z4 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.t3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            if (i13 != 1) {
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            boolean z10 = k7Var.getMessage() != null && k7Var.getMessage().getId() == messageObject.getId();
            if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && u10Var.J)) {
                z4 = true;
            }
            k7Var.y = z4;
            k7Var.e();
            k7Var.V = messageObject;
            k7Var.requestLayout();
            k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, k7Var, messageObject, z10, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t3 t3Var;
        Context context = this.r;
        if (i10 == 0) {
            t3Var = new org.telegram.ui.Cells.t3(context, null);
        } else if (i10 != 1) {
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
            u00Var.setViewType(5);
            u00Var.setIsSingleCell(true);
            t3Var = u00Var;
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 1, null);
            k7Var.setDelegate(this.s);
            t3Var = k7Var;
        }
        return ai.n(t3Var, t3Var, -1, -2);
    }
}
