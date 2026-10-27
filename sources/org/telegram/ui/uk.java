package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uk extends org.telegram.ui.Components.po0 {
    public final /* synthetic */ wn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(wn wnVar, Context context, wn wnVar2, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, j10, context, wnVar2, u6Var);
        this.I = wnVar;
    }

    @Override // org.telegram.ui.Components.po0
    public final void b(boolean z10) {
        wn wnVar = this.I;
        wnVar.C7();
        wnVar.A7();
        zk zkVar = wnVar.Ab;
        if (zkVar != null) {
            zkVar.setTranslationY(wnVar.M9 + getCurrentHeight());
        }
        if (z10) {
            wnVar.T9 = true;
            wnVar.Ac();
        }
    }

    @Override // org.telegram.ui.Components.po0
    public final boolean f(bh.x0 x0Var) {
        int i10;
        wn wnVar = this.I;
        wnVar.C3 = x0Var;
        wnVar.D3 = x0Var != null;
        if (x0Var == null) {
            wnVar.getMediaDataController().clearFoundMessageObjects();
            wnVar.zb(false);
            wnVar.Wc(0, 0, -1);
        }
        wnVar.Zc();
        wnVar.Mc();
        wnVar.F3 = wnVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = wnVar.getMediaDataController();
        String str = wnVar.F3;
        long j10 = wnVar.j6;
        long j11 = wnVar.b7;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, wnVar.p4, false, wnVar.A3, wnVar.B3, (TextUtils.isEmpty(wnVar.F3) && wnVar.C3 == null) ? false : true, wnVar.C3);
        AndroidUtilities.hideKeyboard(wnVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.po0
    public final void h(boolean z10) {
        super.h(z10);
        wn wnVar = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = wnVar.j0;
        g(w0Var != null && w0Var.v() && a() && wnVar.G3 == null);
    }
}
