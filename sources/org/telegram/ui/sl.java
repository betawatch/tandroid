package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class sl extends org.telegram.ui.Components.uj0 implements fi.z6 {
    public final /* synthetic */ an f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(an anVar, Context context, ym ymVar) {
        super(context, ymVar);
        this.f3 = anVar;
    }

    @Override // fi.z6
    public final void a(int[] iArr) {
        an anVar = this.f3;
        iArr[0] = ((int) anVar.O9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.k5.B(3.0f, anVar.A0.getPaddingBottom(), anVar.A0.getMeasuredHeight());
    }
}
