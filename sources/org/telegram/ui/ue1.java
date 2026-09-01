package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ue1 extends org.telegram.ui.Components.e70 {
    public final /* synthetic */ long x0;
    public final /* synthetic */ we1 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue1(we1 we1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, long j11) {
        super(context, i10, hVar, j10, p2Var, null);
        this.y0 = we1Var;
        this.x0 = j11;
    }

    @Override // org.telegram.ui.Components.e70
    public final boolean X() {
        TLRPC.Chat chat = this.y0.b.getMessagesController().getChat(Long.valueOf(this.x0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
