package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vk extends org.telegram.ui.Components.pn0 {
    public final /* synthetic */ xn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(xn xnVar, Context context, xn xnVar2, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, j10, context, xnVar2, g6Var);
        this.F = xnVar;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void b(boolean z4) {
        xn xnVar = this.F;
        xnVar.t7();
        xnVar.r7();
        al alVar = xnVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.t9 + getCurrentHeight());
        }
        if (z4) {
            xnVar.A9 = true;
            xnVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public final boolean f(ng.q0 q0Var) {
        int i10;
        xn xnVar = this.F;
        xnVar.n3 = q0Var;
        xnVar.o3 = q0Var != null;
        if (q0Var == null) {
            xnVar.getMediaDataController().clearFoundMessageObjects();
            xnVar.kb(false);
            xnVar.Fc(0, 0, -1);
        }
        xnVar.Ic();
        xnVar.vc();
        xnVar.q3 = xnVar.g0.getSearchField().getText().toString();
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str = xnVar.q3;
        long j10 = xnVar.Q5;
        long j11 = xnVar.I6;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, xnVar.a4, false, xnVar.l3, xnVar.m3, (TextUtils.isEmpty(xnVar.q3) && xnVar.n3 == null) ? false : true, xnVar.n3);
        AndroidUtilities.hideKeyboard(xnVar.g0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void h(boolean z4) {
        super.h(z4);
        xn xnVar = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = xnVar.g0;
        g(w0Var != null && w0Var.s() && a() && xnVar.r3 == null);
    }
}
