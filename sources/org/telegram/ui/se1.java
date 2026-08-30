package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class se1 extends org.telegram.ui.Components.c70 {
    public final /* synthetic */ long x0;
    public final /* synthetic */ ue1 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se1(ue1 ue1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, long j11) {
        super(context, i10, hVar, j10, p2Var, null);
        this.y0 = ue1Var;
        this.x0 = j11;
    }

    @Override // org.telegram.ui.Components.c70
    public final boolean X() {
        TLRPC.Chat chat = this.y0.b.getMessagesController().getChat(Long.valueOf(this.x0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
