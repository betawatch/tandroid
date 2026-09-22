package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ui extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ bo l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, bo boVar) {
        super(activity, e6Var, false);
        this.l2 = boVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        bo boVar = this.l2;
        W(boVar.R0.getY() + y3, boVar.X0.getBackgroundSizeY());
    }
}
