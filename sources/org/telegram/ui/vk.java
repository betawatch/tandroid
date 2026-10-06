package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class vk extends org.telegram.ui.Components.ao0 {
    public final /* synthetic */ yn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(yn ynVar, Context context, yn ynVar2, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j3, context, ynVar2, d6Var);
        this.I = ynVar;
    }

    @Override // org.telegram.ui.Components.ao0
    public final void b(boolean z10) {
        yn ynVar = this.I;
        ynVar.t7();
        ynVar.r7();
        al alVar = ynVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(ynVar.u9 + getCurrentHeight());
        }
        if (z10) {
            ynVar.B9 = true;
            ynVar.ic();
        }
    }

    @Override // org.telegram.ui.Components.ao0
    public final boolean f(zg.m0 m0Var) {
        int i10;
        yn ynVar = this.I;
        ynVar.o3 = m0Var;
        ynVar.p3 = m0Var != null;
        if (m0Var == null) {
            ynVar.getMediaDataController().clearFoundMessageObjects();
            ynVar.jb(false);
            ynVar.Ec(0, 0, -1);
        }
        ynVar.Hc();
        ynVar.uc();
        ynVar.r3 = ynVar.h0.getSearchField().getText().toString();
        MediaDataController mediaDataController = ynVar.getMediaDataController();
        String str = ynVar.r3;
        long j3 = ynVar.R5;
        long j10 = ynVar.J6;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, ynVar.b4, false, ynVar.m3, ynVar.n3, (TextUtils.isEmpty(ynVar.r3) && ynVar.o3 == null) ? false : true, ynVar.o3);
        AndroidUtilities.hideKeyboard(ynVar.h0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.ao0
    public final void h(boolean z10) {
        super.h(z10);
        yn ynVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = ynVar.h0;
        g(v0Var != null && v0Var.s() && a() && ynVar.s3 == null);
    }
}
