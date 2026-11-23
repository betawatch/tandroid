package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yx0 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ cy0 d;

    public yx0(cy0 cy0Var, Context context) {
        this.d = cy0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.i0
    public final int b() {
        cy0 cy0Var = this.d;
        return cy0Var.f + (cy0Var.e < 0 ? cy0Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        cy0 cy0Var = this.d;
        if (i7 == cy0Var.c) {
            return 2;
        }
        if (i7 == cy0Var.e) {
            return 3;
        }
        return i7 == b() - 1 ? 4 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) f1Var.a;
        cy0 cy0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) cy0Var.getMediaDataController().h.get(i7 - cy0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.g2) cy0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ri.d0(i10).S());
        i11 = ((org.telegram.ui.ActionBar.g2) cy0Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i11);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        View view;
        cy0 cy0Var = this.d;
        Context context = this.c;
        if (i7 == 0) {
            r4Var = ((org.telegram.ui.ActionBar.g2) cy0Var).parentLayout;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, r4Var, 2);
            baVar.setImportantForAccessibility(4);
            baVar.x = cy0Var;
            view = baVar;
        } else if (i7 == 2) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.gd.N0(2131751340, null));
            view = z8Var;
        } else if (i7 == 3) {
            by0 by0Var = new by0(cy0Var, context);
            by0Var.a(false);
            view = by0Var;
        } else if (i7 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View inVar = new org.telegram.ui.Components.in(context, 22);
            inVar.setTag(-33024);
            view = inVar;
        }
        return new org.telegram.ui.Components.mj0(view);
    }
}
