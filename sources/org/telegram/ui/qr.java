package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qr extends org.telegram.ui.Components.a30 {
    public final /* synthetic */ yr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(yr yrVar, Activity activity, yr yrVar2) {
        super(activity, yrVar2);
        this.b = yrVar;
    }

    @Override // org.telegram.ui.Components.a30
    public final void o() {
        yr yrVar = this.b;
        yrVar.getMessagesController().convertToGigaGroup(yrVar.getParentActivity(), yrVar.r, yrVar, new b1(this, 24));
    }

    @Override // org.telegram.ui.Components.a30
    public final void n() {
    }
}
