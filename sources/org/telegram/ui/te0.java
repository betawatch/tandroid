package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class te0 implements g90 {
    public final /* synthetic */ cf0 a;

    public te0(cf0 cf0Var) {
        this.a = cf0Var;
    }

    @Override // org.telegram.ui.g90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.k0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.g90
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            cf0 cf0Var = this.a;
            cf0Var.i0(tL_chatInviteExported2);
            for (int i7 = 0; i7 < cf0Var.i0.size(); i7++) {
                if (((TLRPC.TL_chatInviteExported) cf0Var.i0.get(i7)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        cf0Var.i0.set(i7, tL_chatInviteExported2);
                        cf0Var.o0(true);
                        return;
                    } else {
                        ue0 l02 = cf0Var.l0();
                        cf0Var.i0.remove(i7);
                        cf0Var.j0.add(0, tL_chatInviteExported2);
                        cf0Var.n0(l02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.g90
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.i3(new zc0(9, this, tLObject), 200L);
        }
    }
}
