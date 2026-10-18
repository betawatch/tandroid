package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class sk extends org.telegram.ui.Components.fo0 {
    public final /* synthetic */ sn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(sn snVar, Context context, sn snVar2, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j10, context, snVar2, d6Var);
        this.I = snVar;
    }

    @Override // org.telegram.ui.Components.fo0
    public final void b(boolean z10) {
        sn snVar = this.I;
        snVar.w7();
        snVar.u7();
        xk xkVar = snVar.bb;
        if (xkVar != null) {
            xkVar.setTranslationY(snVar.w9 + getCurrentHeight());
        }
        if (z10) {
            snVar.D9 = true;
            snVar.nc();
        }
    }

    @Override // org.telegram.ui.Components.fo0
    public final boolean f(ah.i1 i1Var) {
        int i10;
        sn snVar = this.I;
        snVar.q3 = i1Var;
        snVar.r3 = i1Var != null;
        if (i1Var == null) {
            snVar.getMediaDataController().clearFoundMessageObjects();
            snVar.ob(false);
            snVar.Jc(0, 0, -1);
        }
        snVar.Mc();
        snVar.zc();
        snVar.t3 = snVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = snVar.getMediaDataController();
        String str = snVar.t3;
        long j10 = snVar.T5;
        long j11 = snVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, snVar.d4, false, snVar.o3, snVar.p3, (TextUtils.isEmpty(snVar.t3) && snVar.q3 == null) ? false : true, snVar.q3);
        AndroidUtilities.hideKeyboard(snVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.fo0
    public final void h(boolean z10) {
        super.h(z10);
        sn snVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = snVar.j0;
        g(u0Var != null && u0Var.s() && a() && snVar.u3 == null);
    }
}
