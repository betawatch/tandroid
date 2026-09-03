package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x21 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ b31 d;

    public x21(b31 b31Var, Context context) {
        this.d = b31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // f2.p0
    public final int h() {
        b31 b31Var = this.d;
        return b31Var.h + (b31Var.f < 0 ? b31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        b31 b31Var = this.d;
        if (i10 == b31Var.d) {
            return 2;
        }
        if (i10 == b31Var.f) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) m1Var.a;
        b31 b31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = b31Var.getMediaDataController().getReactionsList().get(i10 - b31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        View view;
        b31 b31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            f5Var = ((org.telegram.ui.ActionBar.p2) b31Var).parentLayout;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, f5Var, 2);
            eaVar.setImportantForAccessibility(4);
            eaVar.r = b31Var;
            view = eaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = a9Var;
        } else if (i10 == 3) {
            a31 a31Var = new a31(b31Var, context);
            a31Var.a(false);
            view = a31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View inVar = new org.telegram.ui.Components.in(context, 20);
            inVar.setTag(-33024);
            view = inVar;
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
