package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yk extends org.telegram.ui.Components.hn0 {
    public final /* synthetic */ bo I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(bo boVar, Context context, bo boVar2, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, j3, context, boVar2, e6Var);
        this.I = boVar;
    }

    @Override // org.telegram.ui.Components.hn0
    public final void b(boolean z10) {
        bo boVar = this.I;
        boVar.t7();
        boVar.r7();
        dl dlVar = boVar.ab;
        if (dlVar != null) {
            dlVar.setTranslationY(boVar.w9 + getCurrentHeight());
        }
        if (z10) {
            boVar.D9 = true;
            boVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.hn0
    public final boolean f(zg.p0 p0Var) {
        int i10;
        bo boVar = this.I;
        boVar.q3 = p0Var;
        boVar.r3 = p0Var != null;
        if (p0Var == null) {
            boVar.getMediaDataController().clearFoundMessageObjects();
            boVar.kb(false);
            boVar.Fc(0, 0, -1);
        }
        boVar.Ic();
        boVar.vc();
        boVar.t3 = boVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = boVar.getMediaDataController();
        String str = boVar.t3;
        long j3 = boVar.T5;
        long j10 = boVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, boVar.d4, false, boVar.o3, boVar.p3, (TextUtils.isEmpty(boVar.t3) && boVar.q3 == null) ? false : true, boVar.q3);
        AndroidUtilities.hideKeyboard(boVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.hn0
    public final void h(boolean z10) {
        super.h(z10);
        bo boVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = boVar.j0;
        g(v0Var != null && v0Var.s() && a() && boVar.u3 == null);
    }
}
