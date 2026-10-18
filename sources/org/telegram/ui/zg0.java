package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zg0 implements bb0 {
    public final /* synthetic */ jh0 a;

    public zg0(jh0 jh0Var) {
        this.a = jh0Var;
    }

    @Override // org.telegram.ui.bb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.bb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            jh0 jh0Var = this.a;
            jh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < jh0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) jh0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        jh0Var.i0.set(i10, tL_chatInviteExported2);
                        jh0Var.i0(true);
                        return;
                    } else {
                        ah0 f02 = jh0Var.f0();
                        jh0Var.i0.remove(i10);
                        jh0Var.j0.add(0, tL_chatInviteExported2);
                        jh0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.bb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new yg0(0, this, tLObject), 200L);
        }
    }
}
