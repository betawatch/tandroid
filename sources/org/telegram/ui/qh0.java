package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qh0 implements yb0 {
    public final /* synthetic */ ai0 a;

    public qh0(ai0 ai0Var) {
        this.a = ai0Var;
    }

    @Override // org.telegram.ui.yb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.yb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ai0 ai0Var = this.a;
            ai0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ai0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ai0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        ai0Var.i0.set(i10, tL_chatInviteExported2);
                        ai0Var.i0(true);
                        return;
                    } else {
                        rh0 f02 = ai0Var.f0();
                        ai0Var.i0.remove(i10);
                        ai0Var.j0.add(0, tL_chatInviteExported2);
                        ai0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.yb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new oa0(23, this, tLObject), 200L);
        }
    }
}
