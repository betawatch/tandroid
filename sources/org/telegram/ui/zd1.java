package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class zd1 extends org.telegram.ui.Components.v70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ be1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd1(be1 be1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, long j11) {
        super(context, i10, hVar, j10, n2Var, null);
        this.B0 = be1Var;
        this.A0 = j11;
    }

    @Override // org.telegram.ui.Components.v70
    public final boolean Y() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
