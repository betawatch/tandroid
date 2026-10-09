package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zk extends org.telegram.ui.Components.no0 {
    public final /* synthetic */ zn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(zn znVar, Context context, zn znVar2, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, j3, context, znVar2, e6Var);
        this.I = znVar;
    }

    @Override // org.telegram.ui.Components.no0
    public final void b(boolean z10) {
        zn znVar = this.I;
        znVar.w7();
        znVar.u7();
        el elVar = znVar.bb;
        if (elVar != null) {
            elVar.setTranslationY(znVar.w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.nc();
        }
    }

    @Override // org.telegram.ui.Components.no0
    public final boolean f(zg.n0 n0Var) {
        int i10;
        zn znVar = this.I;
        znVar.q3 = n0Var;
        znVar.r3 = n0Var != null;
        if (n0Var == null) {
            znVar.getMediaDataController().clearFoundMessageObjects();
            znVar.ob(false);
            znVar.Jc(0, 0, -1);
        }
        znVar.Mc();
        znVar.zc();
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

    @Override // org.telegram.ui.Components.no0
    public final void h(boolean z10) {
        super.h(z10);
        zn znVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = znVar.j0;
        g(v0Var != null && v0Var.s() && a() && znVar.u3 == null);
    }
}
