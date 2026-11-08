package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class wx0 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ay0 d;

    public wx0(ay0 ay0Var, Context context) {
        this.d = ay0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.g0
    public final int b() {
        ay0 ay0Var = this.d;
        return ay0Var.f + (ay0Var.e < 0 ? ay0Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        ay0 ay0Var = this.d;
        if (i7 == ay0Var.c) {
            return 2;
        }
        if (i7 == ay0Var.e) {
            return 3;
        }
        return i7 == b() - 1 ? 4 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) d1Var.a;
        ay0 ay0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ay0Var.getMediaDataController().h.get(i7 - ay0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ui.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i11);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.q4 q4Var;
        View view;
        ay0 ay0Var = this.d;
        Context context = this.c;
        if (i7 == 0) {
            q4Var = ((org.telegram.ui.ActionBar.f2) ay0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.x = ay0Var;
            view = z9Var;
        } else if (i7 == 2) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.id.M0(2131751353, null));
            view = z8Var;
        } else if (i7 == 3) {
            zx0 zx0Var = new zx0(ay0Var, context);
            zx0Var.a(false);
            view = zx0Var;
        } else if (i7 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View tmVar = new org.telegram.ui.Components.tm(context, 22);
            tmVar.setTag(-33024);
            view = tmVar;
        }
        return new org.telegram.ui.Components.xi0(view);
    }
}
