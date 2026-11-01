package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yf0 implements ka0 {
    public final /* synthetic */ ig0 a;

    public yf0(ig0 ig0Var) {
        this.a = ig0Var;
    }

    @Override // org.telegram.ui.ka0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.k0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.ka0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ig0 ig0Var = this.a;
            ig0Var.i0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ig0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ig0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        ig0Var.i0.set(i10, tL_chatInviteExported2);
                        ig0Var.o0(true);
                        return;
                    } else {
                        zf0 l02 = ig0Var.l0();
                        ig0Var.i0.remove(i10);
                        ig0Var.j0.add(0, tL_chatInviteExported2);
                        ig0Var.n0(l02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ka0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.i0.h3(new if0(2, this, tLObject), 200L);
        }
    }
}
