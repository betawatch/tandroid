package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vk extends org.telegram.ui.Components.in0 {
    public final /* synthetic */ xn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(xn xnVar, Context context, xn xnVar2, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j3, context, xnVar2, d6Var);
        this.I = xnVar;
    }

    @Override // org.telegram.ui.Components.in0
    public final void b(boolean z10) {
        xn xnVar = this.I;
        xnVar.t7();
        xnVar.r7();
        al alVar = xnVar.ab;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.w9 + getCurrentHeight());
        }
        if (z10) {
            xnVar.D9 = true;
            xnVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.in0
    public final boolean f(zg.p0 p0Var) {
        int i10;
        xn xnVar = this.I;
        xnVar.q3 = p0Var;
        xnVar.r3 = p0Var != null;
        if (p0Var == null) {
            xnVar.getMediaDataController().clearFoundMessageObjects();
            xnVar.kb(false);
            xnVar.Fc(0, 0, -1);
        }
        xnVar.Ic();
        xnVar.vc();
        xnVar.t3 = xnVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str = xnVar.t3;
        long j3 = xnVar.T5;
        long j10 = xnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, xnVar.d4, false, xnVar.o3, xnVar.p3, (TextUtils.isEmpty(xnVar.t3) && xnVar.q3 == null) ? false : true, xnVar.q3);
        AndroidUtilities.hideKeyboard(xnVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.in0
    public final void h(boolean z10) {
        super.h(z10);
        xn xnVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = xnVar.j0;
        g(v0Var != null && v0Var.s() && a() && xnVar.u3 == null);
    }
}
