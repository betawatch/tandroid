package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class xk extends org.telegram.ui.Components.un0 {
    public final /* synthetic */ zn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(zn znVar, Context context, zn znVar2, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, znVar2, f6Var);
        this.I = znVar;
    }

    @Override // org.telegram.ui.Components.un0
    public final void b(boolean z10) {
        zn znVar = this.I;
        znVar.t7();
        znVar.r7();
        bl blVar = znVar.ab;
        if (blVar != null) {
            blVar.setTranslationY(znVar.w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.un0
    public final boolean f(zg.o0 o0Var) {
        int i10;
        zn znVar = this.I;
        znVar.q3 = o0Var;
        znVar.r3 = o0Var != null;
        if (o0Var == null) {
            znVar.getMediaDataController().clearFoundMessageObjects();
            znVar.kb(false);
            znVar.Fc(0, 0, -1);
        }
        znVar.Ic();
        znVar.vc();
        znVar.t3 = znVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str = znVar.t3;
        long j3 = znVar.T5;
        long j10 = znVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, znVar.d4, false, znVar.o3, znVar.p3, (TextUtils.isEmpty(znVar.t3) && znVar.q3 == null) ? false : true, znVar.q3);
        AndroidUtilities.hideKeyboard(znVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.un0
    public final void h(boolean z10) {
        super.h(z10);
        zn znVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = znVar.j0;
        g(v0Var != null && v0Var.s() && a() && znVar.u3 == null);
    }
}
