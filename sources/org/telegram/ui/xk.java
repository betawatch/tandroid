package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xk extends org.telegram.ui.Components.nn0 {
    public final /* synthetic */ zn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(zn znVar, Context context, zn znVar2, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j10, context, znVar2, f6Var);
        this.F = znVar;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void b(boolean z4) {
        zn znVar = this.F;
        znVar.t7();
        znVar.r7();
        cl clVar = znVar.Ya;
        if (clVar != null) {
            clVar.setTranslationY(znVar.t9 + getCurrentHeight());
        }
        if (z4) {
            znVar.A9 = true;
            znVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public final boolean f(mg.q0 q0Var) {
        int i10;
        zn znVar = this.F;
        znVar.n3 = q0Var;
        znVar.o3 = q0Var != null;
        if (q0Var == null) {
            znVar.getMediaDataController().clearFoundMessageObjects();
            znVar.kb(false);
            znVar.Fc(0, 0, -1);
        }
        znVar.Ic();
        znVar.vc();
        znVar.q3 = znVar.g0.getSearchField().getText().toString();
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str = znVar.q3;
        long j10 = znVar.Q5;
        long j11 = znVar.I6;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, znVar.a4, false, znVar.l3, znVar.m3, (TextUtils.isEmpty(znVar.q3) && znVar.n3 == null) ? false : true, znVar.n3);
        AndroidUtilities.hideKeyboard(znVar.g0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void h(boolean z4) {
        super.h(z4);
        zn znVar = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = znVar.g0;
        g(w0Var != null && w0Var.s() && a() && znVar.r3 == null);
    }
}
