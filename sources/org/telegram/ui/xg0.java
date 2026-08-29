package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xg0 implements db0 {
    public final /* synthetic */ hh0 a;

    public xg0(hh0 hh0Var) {
        this.a = hh0Var;
    }

    @Override // org.telegram.ui.db0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.db0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            hh0 hh0Var = this.a;
            hh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < hh0Var.e0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) hh0Var.e0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        hh0Var.e0.set(i10, tL_chatInviteExported2);
                        hh0Var.i0(true);
                        return;
                    } else {
                        yg0 f02 = hh0Var.f0();
                        hh0Var.e0.remove(i10);
                        hh0Var.f0.add(0, tL_chatInviteExported2);
                        hh0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.db0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new lf0(2, this, tLObject), 200L);
        }
    }
}
