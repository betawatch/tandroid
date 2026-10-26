package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sk extends org.telegram.ui.Components.oo0 {
    public final /* synthetic */ un I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(un unVar, Context context, un unVar2, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, j10, context, unVar2, u6Var);
        this.I = unVar;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void b(boolean z10) {
        un unVar = this.I;
        unVar.A7();
        unVar.y7();
        xk xkVar = unVar.wb;
        if (xkVar != null) {
            xkVar.setTranslationY(unVar.I9 + getCurrentHeight());
        }
        if (z10) {
            unVar.P9 = true;
            unVar.wc();
        }
    }

    @Override // org.telegram.ui.Components.oo0
    public final boolean f(bh.x0 x0Var) {
        int i10;
        un unVar = this.I;
        unVar.C3 = x0Var;
        unVar.D3 = x0Var != null;
        if (x0Var == null) {
            unVar.getMediaDataController().clearFoundMessageObjects();
            unVar.vb(false);
            unVar.Sc(0, 0, -1);
        }
        unVar.Vc();
        unVar.Ic();
        unVar.F3 = unVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = unVar.getMediaDataController();
        String str = unVar.F3;
        long j10 = unVar.f6;
        long j11 = unVar.X6;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, unVar.p4, false, unVar.A3, unVar.B3, (TextUtils.isEmpty(unVar.F3) && unVar.C3 == null) ? false : true, unVar.C3);
        AndroidUtilities.hideKeyboard(unVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void h(boolean z10) {
        super.h(z10);
        un unVar = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = unVar.j0;
        g(w0Var != null && w0Var.v() && a() && unVar.G3 == null);
    }
}
