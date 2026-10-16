package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
