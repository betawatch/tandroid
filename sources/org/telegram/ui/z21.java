package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class z21 extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ d31 d;

    public z21(d31 d31Var, Context context) {
        this.d = d31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        d31 d31Var = this.d;
        return d31Var.f + (d31Var.e < 0 ? d31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        d31 d31Var = this.d;
        if (i10 == d31Var.c) {
            return 2;
        }
        if (i10 == d31Var.e) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) c1Var.a;
        d31 d31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = d31Var.getMediaDataController().getReactionsList().get(i10 - d31Var.d);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) d31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) d31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        View view;
        d31 d31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            c5Var = ((org.telegram.ui.ActionBar.n2) d31Var).parentLayout;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, c5Var, 2);
            iaVar.setImportantForAccessibility(4);
            iaVar.r = d31Var;
            view = iaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = e9Var;
        } else if (i10 == 3) {
            c31 c31Var = new c31(d31Var, context);
            c31Var.a(false);
            view = c31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View nnVar = new org.telegram.ui.Components.nn(context, 23);
            nnVar.setTag(-33024);
            view = nnVar;
        }
        return new org.telegram.ui.Components.il0(view);
    }
}
