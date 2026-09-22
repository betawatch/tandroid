package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yk extends org.telegram.ui.Components.wn0 {
    public final /* synthetic */ zn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(zn znVar, Context context, zn znVar2, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, znVar2, f6Var);
        this.I = znVar;
    }

    @Override // org.telegram.ui.Components.wn0
    public final void b(boolean z10) {
        zn znVar = this.I;
        znVar.t7();
        znVar.r7();
        cl clVar = znVar.ab;
        if (clVar != null) {
            clVar.setTranslationY(znVar.w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.wn0
    public final boolean f(zg.p0 p0Var) {
        int i10;
        zn znVar = this.I;
        znVar.q3 = p0Var;
        znVar.r3 = p0Var != null;
        if (p0Var == null) {
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

    @Override // org.telegram.ui.Components.wn0
    public final void h(boolean z10) {
        super.h(z10);
        zn znVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = znVar.j0;
        g(v0Var != null && v0Var.s() && a() && znVar.u3 == null);
    }
}
