package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class vk extends org.telegram.ui.Components.un0 {
    public final /* synthetic */ wn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(wn wnVar, Context context, wn wnVar2, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j3, context, wnVar2, d6Var);
        this.I = wnVar;
    }

    @Override // org.telegram.ui.Components.un0
    public final void b(boolean z10) {
        wn wnVar = this.I;
        wnVar.t7();
        wnVar.r7();
        al alVar = wnVar.ab;
        if (alVar != null) {
            alVar.setTranslationY(wnVar.w9 + getCurrentHeight());
        }
        if (z10) {
            wnVar.D9 = true;
            wnVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.un0
    public final boolean f(zg.o0 o0Var) {
        int i10;
        wn wnVar = this.I;
        wnVar.q3 = o0Var;
        wnVar.r3 = o0Var != null;
        if (o0Var == null) {
            wnVar.getMediaDataController().clearFoundMessageObjects();
            wnVar.kb(false);
            wnVar.Fc(0, 0, -1);
        }
        wnVar.Ic();
        wnVar.vc();
        wnVar.t3 = wnVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = wnVar.getMediaDataController();
        String str = wnVar.t3;
        long j3 = wnVar.T5;
        long j10 = wnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, wnVar.d4, false, wnVar.o3, wnVar.p3, (TextUtils.isEmpty(wnVar.t3) && wnVar.q3 == null) ? false : true, wnVar.q3);
        AndroidUtilities.hideKeyboard(wnVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.un0
    public final void h(boolean z10) {
        super.h(z10);
        wn wnVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = wnVar.j0;
        g(u0Var != null && u0Var.s() && a() && wnVar.u3 == null);
    }
}
