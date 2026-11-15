package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tu0 extends org.telegram.ui.Components.po0 {
    public final /* synthetic */ uu0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(uu0 uu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = uu0Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.i3(new mp0(this, hVar, i7, 20), 250L);
        }
    }
}
