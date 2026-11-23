package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ve0 implements i90 {
    public final /* synthetic */ ef0 a;

    public ve0(ef0 ef0Var) {
        this.a = ef0Var;
    }

    @Override // org.telegram.ui.i90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.k0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.i90
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ef0 ef0Var = this.a;
            ef0Var.i0(tL_chatInviteExported2);
            for (int i7 = 0; i7 < ef0Var.j0.size(); i7++) {
                if (((TLRPC.TL_chatInviteExported) ef0Var.j0.get(i7)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        ef0Var.j0.set(i7, tL_chatInviteExported2);
                        ef0Var.o0(true);
                        return;
                    } else {
                        we0 l02 = ef0Var.l0();
                        ef0Var.j0.remove(i7);
                        ef0Var.k0.add(0, tL_chatInviteExported2);
                        ef0Var.n0(l02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.i90
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.h3(new bd0(6, this, tLObject), 200L);
        }
    }
}
