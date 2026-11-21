package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ org.telegram.messenger.fj h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.messenger.fj w;

    public /* synthetic */ yg(bn bnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.fj fjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.fj fjVar2, int i12) {
        this.a = i12;
        this.b = bnVar;
        this.c = i7;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i10;
        this.h = fjVar;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i11;
        this.w = fjVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                bnVar.y8(new yg(bnVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, 1));
                break;
            default:
                bn bnVar2 = this.b;
                if (this.c == bnVar2.Mc) {
                    bnVar2.Oc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            org.telegram.messenger.mp.d5(org.telegram.messenger.gd.N0(2131752433, null), bnVar2);
                            bnVar2.Pc = 0;
                            bnVar2.Qc = false;
                            bnVar2.A0.g1();
                            break;
                        }
                    } else {
                        bnVar2.Tc = (TLRPC.messages_Messages) tLObject;
                    }
                    bnVar2.ab(bnVar2.Sc, bnVar2.Tc, this.f, this.h, this.n, this.r, this.s, this.w);
                    break;
                }
                break;
        }
    }
}
