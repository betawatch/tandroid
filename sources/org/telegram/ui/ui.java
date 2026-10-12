package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ui extends org.telegram.ui.Components.ew {
    public final /* synthetic */ fo W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(fo foVar, org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(m2Var, activity, c6Var, arrayList);
        this.W = foVar;
    }

    @Override // org.telegram.ui.Components.ew, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        fo foVar = this.W;
        foVar.getClass();
        foVar.j8(false, true, 0.0f);
    }
}
