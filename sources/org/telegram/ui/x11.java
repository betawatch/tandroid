package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class x11 extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ b21 d;

    public x11(b21 b21Var, Context context) {
        this.d = b21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        b21 b21Var = this.d;
        return b21Var.h + (b21Var.f < 0 ? b21Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        b21 b21Var = this.d;
        if (i10 == b21Var.d) {
            return 2;
        }
        if (i10 == b21Var.f) {
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
        b21 b21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = b21Var.getMediaDataController().getReactionsList().get(i10 - b21Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) b21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) b21Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        View view;
        b21 b21Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) b21Var).parentLayout;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, d5Var, 2);
            faVar.setImportantForAccessibility(4);
            faVar.r = b21Var;
            view = faVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = d9Var;
        } else if (i10 == 3) {
            a21 a21Var = new a21(b21Var, context);
            a21Var.a(false);
            view = a21Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View unVar = new org.telegram.ui.Components.un(context, 23);
            unVar.setTag(-33024);
            view = unVar;
        }
        return new org.telegram.ui.Components.sl0(view);
    }
}
