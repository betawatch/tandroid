package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xe0 implements j90 {
    public final /* synthetic */ gf0 a;

    public xe0(gf0 gf0Var) {
        this.a = gf0Var;
    }

    @Override // org.telegram.ui.j90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.k0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.j90
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            gf0 gf0Var = this.a;
            gf0Var.i0(tL_chatInviteExported2);
            for (int i7 = 0; i7 < gf0Var.j0.size(); i7++) {
                if (((TLRPC.TL_chatInviteExported) gf0Var.j0.get(i7)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        gf0Var.j0.set(i7, tL_chatInviteExported2);
                        gf0Var.o0(true);
                        return;
                    } else {
                        ye0 l02 = gf0Var.l0();
                        gf0Var.j0.remove(i7);
                        gf0Var.k0.add(0, tL_chatInviteExported2);
                        gf0Var.n0(l02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.j90
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.h3(new we0(0, this, tLObject), 200L);
        }
    }
}
