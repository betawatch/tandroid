package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ MessageObject h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ MessageObject v;

    public /* synthetic */ qh(xn xnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.a = i13;
        this.b = xnVar;
        this.c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i11;
        this.h = messageObject;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i12;
        this.v = messageObject2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                xnVar.h8(new qh(xnVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v, 1));
                break;
            default:
                xn xnVar2 = this.b;
                if (this.c == xnVar2.ec) {
                    xnVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            MessagesController.showCantOpenAlert(xnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                            xnVar2.hc = 0;
                            xnVar2.ic = false;
                            xnVar2.x0.f1();
                            break;
                        }
                    } else {
                        xnVar2.lc = (TLRPC.messages_Messages) tLObject;
                    }
                    xnVar2.ya(xnVar2.kc, xnVar2.lc, this.f, this.h, this.n, this.r, this.s, this.v);
                    break;
                }
                break;
        }
    }
}
