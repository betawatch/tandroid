package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class qk extends org.telegram.ui.Components.go0 {
    public final /* synthetic */ qn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(qn qnVar, Context context, qn qnVar2, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j10, context, qnVar2, d6Var);
        this.I = qnVar;
    }

    @Override // org.telegram.ui.Components.go0
    public final void b(boolean z10) {
        qn qnVar = this.I;
        qnVar.w7();
        qnVar.u7();
        vk vkVar = qnVar.bb;
        if (vkVar != null) {
            vkVar.setTranslationY(qnVar.w9 + getCurrentHeight());
        }
        if (z10) {
            qnVar.D9 = true;
            qnVar.oc();
        }
    }

    @Override // org.telegram.ui.Components.go0
    public final boolean f(ah.i1 i1Var) {
        int i10;
        qn qnVar = this.I;
        qnVar.q3 = i1Var;
        qnVar.r3 = i1Var != null;
        if (i1Var == null) {
            qnVar.getMediaDataController().clearFoundMessageObjects();
            qnVar.pb(false);
            qnVar.Kc(0, 0, -1);
        }
        qnVar.Nc();
        qnVar.Ac();
        qnVar.t3 = qnVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = qnVar.getMediaDataController();
        String str = qnVar.t3;
        long j10 = qnVar.T5;
        long j11 = qnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, qnVar.d4, false, qnVar.o3, qnVar.p3, (TextUtils.isEmpty(qnVar.t3) && qnVar.q3 == null) ? false : true, qnVar.q3);
        AndroidUtilities.hideKeyboard(qnVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.go0
    public final void h(boolean z10) {
        super.h(z10);
        qn qnVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = qnVar.j0;
        g(u0Var != null && u0Var.s() && a() && qnVar.u3 == null);
    }
}
