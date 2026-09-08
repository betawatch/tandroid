package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class za0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab0 b;
    public final /* synthetic */ AccountInstance c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;

    public /* synthetic */ za0(ab0 ab0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.a = i10;
        this.b = ab0Var;
        this.c = accountInstance;
        this.d = j3;
        this.e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new za0(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                AccountInstance accountInstance = this.c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf(groupCall == null || !groupCall.call.rtmp_stream), this.b.g, this.e, accountInstance);
                break;
        }
    }
}
