package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qf1 extends org.telegram.ui.Components.k70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ sf1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(sf1 sf1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(context, i10, iVar, j3, p2Var, null);
        this.B0 = sf1Var;
        this.A0 = j10;
    }

    @Override // org.telegram.ui.Components.k70
    public final boolean X() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
