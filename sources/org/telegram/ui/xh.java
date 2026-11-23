package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xh extends org.telegram.ui.Components.bv {
    public final /* synthetic */ bn R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(bn bnVar, org.telegram.ui.ActionBar.g2 g2Var, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList) {
        super(g2Var, activity, i6Var, arrayList);
        this.R1 = bnVar;
    }

    @Override // org.telegram.ui.Components.bv, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        bn bnVar = this.R1;
        bnVar.getClass();
        bnVar.x8(false, true, 0.0f);
    }
}
