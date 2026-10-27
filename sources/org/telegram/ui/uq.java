package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uq extends iq {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ long d1;
    public final /* synthetic */ mr e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(mr mrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.e1 = mrVar;
        this.c1 = zArr;
        this.d1 = j12;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.c1[0]) {
            mr mrVar = this.e1;
            if (org.telegram.ui.Components.wc.a(mrVar)) {
                long j10 = this.d1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.wc.C(mrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.wc.C(mrVar, chat.title).j();
                }
            }
        }
    }
}
