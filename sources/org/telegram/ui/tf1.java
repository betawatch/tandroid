package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tf1 extends org.telegram.ui.Components.a80 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ vf1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf1(vf1 vf1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.m2 m2Var, long j11) {
        super(context, i10, hVar, j10, m2Var, null);
        this.B0 = vf1Var;
        this.A0 = j11;
    }

    @Override // org.telegram.ui.Components.a80
    public final boolean Y() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
