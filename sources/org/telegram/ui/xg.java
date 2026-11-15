package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ org.telegram.messenger.gj h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.messenger.gj w;

    public /* synthetic */ xg(an anVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.gj gjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.gj gjVar2, int i12) {
        this.a = i12;
        this.b = anVar;
        this.c = i7;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i10;
        this.h = gjVar;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i11;
        this.w = gjVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                anVar.y8(new xg(anVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                an anVar2 = this.b;
                if (this.c == anVar2.Lc) {
                    anVar2.Nc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            org.telegram.messenger.np.S4(org.telegram.messenger.hd.M0(2131752445, null), anVar2);
                            anVar2.Oc = 0;
                            anVar2.Pc = false;
                            anVar2.A0.g1();
                            break;
                        }
                    } else {
                        anVar2.Sc = (TLRPC.messages_Messages) tLObject;
                    }
                    anVar2.ab(anVar2.Rc, anVar2.Sc, this.f, this.h, this.n, this.r, this.s, this.w);
                    break;
                }
                break;
        }
    }
}
