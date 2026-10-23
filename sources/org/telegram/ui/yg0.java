package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class yg0 implements za0 {
    public final /* synthetic */ ih0 a;

    public yg0(ih0 ih0Var) {
        this.a = ih0Var;
    }

    @Override // org.telegram.ui.za0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.za0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ih0 ih0Var = this.a;
            ih0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ih0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ih0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        ih0Var.i0.set(i10, tL_chatInviteExported2);
                        ih0Var.i0(true);
                        return;
                    } else {
                        zg0 f02 = ih0Var.f0();
                        ih0Var.i0.remove(i10);
                        ih0Var.j0.add(0, tL_chatInviteExported2);
                        ih0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.za0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new xg0(0, this, tLObject), 200L);
        }
    }
}
