package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zk extends hi.l3 {
    public final /* synthetic */ an X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(an anVar, Activity activity) {
        super(activity, 3);
        this.X0 = anVar;
    }

    @Override // hi.l3, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.X0.R1);
    }
}
