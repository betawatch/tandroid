package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xg0 implements ab0 {
    public final /* synthetic */ hh0 a;

    public xg0(hh0 hh0Var) {
        this.a = hh0Var;
    }

    @Override // org.telegram.ui.ab0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.d0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.ab0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            hh0 hh0Var = this.a;
            hh0Var.b0(tL_chatInviteExported2);
            for (int i9 = 0; i9 < hh0Var.e0.size(); i9++) {
                if (((TLRPC.TL_chatInviteExported) hh0Var.e0.get(i9)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        hh0Var.e0.set(i9, tL_chatInviteExported2);
                        hh0Var.h0(true);
                        return;
                    } else {
                        yg0 e02 = hh0Var.e0();
                        hh0Var.e0.remove(i9);
                        hh0Var.f0.add(0, tL_chatInviteExported2);
                        hh0Var.g0(e02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ab0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new cf0(5, this, tLObject), 200L);
        }
    }
}
