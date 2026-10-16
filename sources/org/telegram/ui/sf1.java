package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class sf1 extends org.telegram.ui.Components.z70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ uf1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf1(uf1 uf1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.m2 m2Var, long j11) {
        super(context, i10, hVar, j10, m2Var, null);
        this.B0 = uf1Var;
        this.A0 = j11;
    }

    @Override // org.telegram.ui.Components.z70
    public final boolean Y() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
