package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class uh0 implements zb0 {
    public final /* synthetic */ ei0 a;

    public uh0(ei0 ei0Var) {
        this.a = ei0Var;
    }

    @Override // org.telegram.ui.zb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.zb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ei0 ei0Var = this.a;
            ei0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ei0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ei0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        ei0Var.i0.set(i10, tL_chatInviteExported2);
                        ei0Var.i0(true);
                        return;
                    } else {
                        vh0 f02 = ei0Var.f0();
                        ei0Var.i0.remove(i10);
                        ei0Var.j0.add(0, tL_chatInviteExported2);
                        ei0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.zb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new wc0(17, this, tLObject), 200L);
        }
    }
}
