package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s21 extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ w21 d;

    public s21(w21 w21Var, Context context) {
        this.d = w21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // f2.p0
    public final int h() {
        w21 w21Var = this.d;
        return w21Var.h + (w21Var.f < 0 ? w21Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        w21 w21Var = this.d;
        if (i10 == w21Var.d) {
            return 2;
        }
        if (i10 == w21Var.f) {
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
        w21 w21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = w21Var.getMediaDataController().getReactionsList().get(i10 - w21Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        View view;
        w21 w21Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            f5Var = ((org.telegram.ui.ActionBar.p2) w21Var).parentLayout;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, f5Var, 2);
            eaVar.setImportantForAccessibility(4);
            eaVar.r = w21Var;
            view = eaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = a9Var;
        } else if (i10 == 3) {
            v21 v21Var = new v21(w21Var, context);
            v21Var.a(false);
            view = v21Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View jnVar = new org.telegram.ui.Components.jn(context, 20);
            jnVar.setTag(-33024);
            view = jnVar;
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
