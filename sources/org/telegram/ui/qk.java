package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qk extends jh.e {
    public final /* synthetic */ zn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(zn znVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, ij ijVar, ah.c cVar) {
        super(cVar, context, ijVar, f6Var);
        this.L = znVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Ac.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
