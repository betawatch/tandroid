package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class v11 extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ z11 d;

    public v11(z11 z11Var, Context context) {
        this.d = z11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        z11 z11Var = this.d;
        return z11Var.h + (z11Var.f < 0 ? z11Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        z11 z11Var = this.d;
        if (i10 == z11Var.d) {
            return 2;
        }
        if (i10 == z11Var.f) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) b1Var.a;
        z11 z11Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = z11Var.getMediaDataController().getReactionsList().get(i10 - z11Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) z11Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) z11Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        View view;
        z11 z11Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) z11Var).parentLayout;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, d5Var, 2);
            faVar.setImportantForAccessibility(4);
            faVar.r = z11Var;
            view = faVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = d9Var;
        } else if (i10 == 3) {
            y11 y11Var = new y11(z11Var, context);
            y11Var.a(false);
            view = y11Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View unVar = new org.telegram.ui.Components.un(context, 23);
            unVar.setTag(-33024);
            view = unVar;
        }
        return new org.telegram.ui.Components.tl0(view);
    }
}
