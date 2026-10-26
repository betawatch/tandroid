package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zg0 implements cb0 {
    public final /* synthetic */ jh0 a;

    public zg0(jh0 jh0Var) {
        this.a = jh0Var;
    }

    @Override // org.telegram.ui.cb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.g0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.cb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            jh0 jh0Var = this.a;
            jh0Var.e0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < jh0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) jh0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        jh0Var.i0.set(i10, tL_chatInviteExported2);
                        jh0Var.k0(true);
                        return;
                    } else {
                        ah0 h02 = jh0Var.h0();
                        jh0Var.i0.remove(i10);
                        jh0Var.j0.add(0, tL_chatInviteExported2);
                        jh0Var.j0(h02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.cb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new wb0(17, this, tLObject), 200L);
        }
    }
}
