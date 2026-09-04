package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class yk extends org.telegram.ui.Components.hn0 {
    public final /* synthetic */ co I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(co coVar, Context context, co coVar2, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, coVar2, f6Var);
        this.I = coVar;
    }

    @Override // org.telegram.ui.Components.hn0
    public final void b(boolean z10) {
        co coVar = this.I;
        coVar.t7();
        coVar.r7();
        dl dlVar = coVar.bb;
        if (dlVar != null) {
            dlVar.setTranslationY(coVar.w9 + getCurrentHeight());
        }
        if (z10) {
            coVar.D9 = true;
            coVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.hn0
    public final boolean f(ah.j1 j1Var) {
        int i10;
        co coVar = this.I;
        coVar.q3 = j1Var;
        coVar.r3 = j1Var != null;
        if (j1Var == null) {
            coVar.getMediaDataController().clearFoundMessageObjects();
            coVar.kb(false);
            coVar.Fc(0, 0, -1);
        }
        coVar.Ic();
        coVar.vc();
        coVar.t3 = coVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = coVar.getMediaDataController();
        String str = coVar.t3;
        long j3 = coVar.T5;
        long j10 = coVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, coVar.d4, false, coVar.o3, coVar.p3, (TextUtils.isEmpty(coVar.t3) && coVar.q3 == null) ? false : true, coVar.q3);
        AndroidUtilities.hideKeyboard(coVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.hn0
    public final void h(boolean z10) {
        super.h(z10);
        co coVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = coVar.j0;
        g(v0Var != null && v0Var.s() && a() && coVar.u3 == null);
    }
}
