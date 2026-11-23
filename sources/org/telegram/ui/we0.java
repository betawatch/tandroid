package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class we0 implements j90 {
    public final /* synthetic */ ff0 a;

    public we0(ff0 ff0Var) {
        this.a = ff0Var;
    }

    @Override // org.telegram.ui.j90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.k0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.j90
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ff0 ff0Var = this.a;
            ff0Var.i0(tL_chatInviteExported2);
            for (int i7 = 0; i7 < ff0Var.j0.size(); i7++) {
                if (((TLRPC.TL_chatInviteExported) ff0Var.j0.get(i7)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        ff0Var.j0.set(i7, tL_chatInviteExported2);
                        ff0Var.o0(true);
                        return;
                    } else {
                        xe0 l02 = ff0Var.l0();
                        ff0Var.j0.remove(i7);
                        ff0Var.k0.add(0, tL_chatInviteExported2);
                        ff0Var.n0(l02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.j90
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.h3(new fe0(2, this, tLObject), 200L);
        }
    }
}
