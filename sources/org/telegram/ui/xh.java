package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class xh extends org.telegram.ui.Components.aw {
    public final /* synthetic */ yh W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(yh yhVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(o2Var, activity, g6Var, arrayList);
        this.W = yhVar;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        sn snVar = this.W.p;
        snVar.getClass();
        snVar.j8(false, true, 0.0f);
    }
}
