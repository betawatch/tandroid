package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi implements org.telegram.messenger.pr {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qi(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.pr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                an anVar = ((si) this.c).b;
                if (i7 > 0 && anVar.getParentActivity() != null) {
                    org.telegram.ui.Components.cc.a0(anVar).m(this.b ? org.telegram.ui.Components.bc.H : org.telegram.ui.Components.bc.J, i7, 0, 0, anVar.Aa).j();
                    break;
                }
                break;
            default:
                ri riVar = (ri) this.c;
                an anVar2 = riVar.b.b;
                if (i7 < 50) {
                    anVar2.Ta(anVar2.s4, true);
                    break;
                } else {
                    TLRPC.Chat chat = anVar2.e;
                    TLRPC.User user = anVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.t4.r(anVar2, true, chat, user, false, false, false, z10, new w0(riVar, z10));
                    break;
                }
        }
    }
}
