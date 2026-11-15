package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vx0 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ zx0 d;

    public vx0(zx0 zx0Var, Context context) {
        this.d = zx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.h0
    public final int b() {
        zx0 zx0Var = this.d;
        return zx0Var.f + (zx0Var.e < 0 ? zx0Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        zx0 zx0Var = this.d;
        if (i7 == zx0Var.c) {
            return 2;
        }
        if (i7 == zx0Var.e) {
            return 3;
        }
        return i7 == b() - 1 ? 4 : 1;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) e1Var.a;
        zx0 zx0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) zx0Var.getMediaDataController().h.get(i7 - zx0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.si.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i11);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.o4 o4Var;
        View view;
        zx0 zx0Var = this.d;
        Context context = this.c;
        if (i7 == 0) {
            o4Var = ((org.telegram.ui.ActionBar.e2) zx0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, o4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.x = zx0Var;
            view = z9Var;
        } else if (i7 == 2) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(org.telegram.messenger.hd.M0(2131751352, null));
            view = y8Var;
        } else if (i7 == 3) {
            yx0 yx0Var = new yx0(zx0Var, context);
            yx0Var.a(false);
            view = yx0Var;
        } else if (i7 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View bnVar = new org.telegram.ui.Components.bn(context, 22);
            bnVar.setTag(-33024);
            view = bnVar;
        }
        return new org.telegram.ui.Components.cj0(view);
    }
}
