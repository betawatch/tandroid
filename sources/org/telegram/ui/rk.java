package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class rk extends org.telegram.ui.Components.jo0 {
    public final /* synthetic */ sn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(sn snVar, Context context, sn snVar2, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, j10, context, snVar2, g6Var);
        this.I = snVar;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void b(boolean z10) {
        sn snVar = this.I;
        snVar.w7();
        snVar.u7();
        wk wkVar = snVar.nb;
        if (wkVar != null) {
            wkVar.setTranslationY(snVar.I9 + getCurrentHeight());
        }
        if (z10) {
            snVar.P9 = true;
            snVar.qc();
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public final boolean f(ah.i1 i1Var) {
        int i10;
        sn snVar = this.I;
        snVar.C3 = i1Var;
        snVar.D3 = i1Var != null;
        if (i1Var == null) {
            snVar.getMediaDataController().clearFoundMessageObjects();
            snVar.qb(false);
            snVar.Mc(0, 0, -1);
        }
        snVar.Pc();
        snVar.Cc();
        snVar.F3 = snVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = snVar.getMediaDataController();
        String str = snVar.F3;
        long j10 = snVar.f6;
        long j11 = snVar.X6;
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, snVar.p4, false, snVar.A3, snVar.B3, (TextUtils.isEmpty(snVar.F3) && snVar.C3 == null) ? false : true, snVar.C3);
        AndroidUtilities.hideKeyboard(snVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void h(boolean z10) {
        super.h(z10);
        sn snVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = snVar.j0;
        g(u0Var != null && u0Var.s() && a() && snVar.G3 == null);
    }
}
