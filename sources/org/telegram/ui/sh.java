package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sh extends org.telegram.ui.Components.ru {
    public final /* synthetic */ cn N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(cn cnVar, org.telegram.ui.ActionBar.f2 f2Var, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(f2Var, activity, g6Var, arrayList);
        this.N1 = cnVar;
    }

    @Override // org.telegram.ui.Components.ru, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        cn cnVar = this.N1;
        cnVar.getClass();
        cnVar.w8(false, true, 0.0f);
    }
}
