package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class th implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ MessageObject h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ MessageObject v;

    public /* synthetic */ th(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.a = i13;
        this.b = znVar;
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
                zn znVar = this.b;
                znVar.h8(new th(znVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v, 1));
                break;
            default:
                zn znVar2 = this.b;
                if (this.c == znVar2.ec) {
                    znVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                            znVar2.hc = 0;
                            znVar2.ic = false;
                            znVar2.x0.g1();
                            break;
                        }
                    } else {
                        znVar2.lc = (TLRPC.messages_Messages) tLObject;
                    }
                    znVar2.ya(znVar2.kc, znVar2.lc, this.f, this.h, this.n, this.r, this.s, this.v);
                    break;
                }
                break;
        }
    }
}
