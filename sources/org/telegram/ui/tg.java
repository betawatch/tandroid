package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ org.telegram.messenger.zi h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.messenger.zi w;

    public /* synthetic */ tg(wm wmVar, int i3, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.zi ziVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.zi ziVar2, int i12) {
        this.a = i12;
        this.b = wmVar;
        this.c = i3;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i10;
        this.h = ziVar;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i11;
        this.w = ziVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                wmVar.w8(new tg(wmVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                wm wmVar2 = this.b;
                if (this.c == wmVar2.Jc) {
                    wmVar2.Lc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            org.telegram.messenger.hp.R4(org.telegram.messenger.bd.M0(2131752445, null), wmVar2);
                            wmVar2.Mc = 0;
                            wmVar2.Nc = false;
                            wmVar2.A0.g1();
                            break;
                        }
                    } else {
                        wmVar2.Qc = (TLRPC.messages_Messages) tLObject;
                    }
                    wmVar2.Xa(wmVar2.Pc, wmVar2.Qc, this.f, this.h, this.n, this.r, this.s, this.w);
                    break;
                }
                break;
        }
    }
}
