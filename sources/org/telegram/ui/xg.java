package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ org.telegram.messenger.ij h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.messenger.ij w;

    public /* synthetic */ xg(an anVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.ij ijVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.ij ijVar2, int i12) {
        this.a = i12;
        this.b = anVar;
        this.c = i7;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i10;
        this.h = ijVar;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i11;
        this.w = ijVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                anVar.w8(new xg(anVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                an anVar2 = this.b;
                if (this.c == anVar2.Ic) {
                    anVar2.Kc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            org.telegram.messenger.qp.R4(org.telegram.messenger.hd.M0(2131752445, null), anVar2);
                            anVar2.Lc = 0;
                            anVar2.Mc = false;
                            anVar2.z0.g1();
                            break;
                        }
                    } else {
                        anVar2.Pc = (TLRPC.messages_Messages) tLObject;
                    }
                    anVar2.Xa(anVar2.Oc, anVar2.Pc, this.f, this.h, this.n, this.r, this.s, this.w);
                    break;
                }
                break;
        }
    }
}
