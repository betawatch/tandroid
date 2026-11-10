package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zh extends org.telegram.ui.Components.qu {
    public final /* synthetic */ cn Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(cn cnVar, org.telegram.ui.ActionBar.f2 f2Var, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(f2Var, activity, h6Var, arrayList);
        this.Q1 = cnVar;
    }

    @Override // org.telegram.ui.Components.qu, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        cn cnVar = this.Q1;
        cnVar.getClass();
        cnVar.w8(false, true, 0.0f);
    }
}
