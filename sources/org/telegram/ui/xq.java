package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xq extends kq {
    public final /* synthetic */ boolean[] a1;
    public final /* synthetic */ long b1;
    public final /* synthetic */ qr c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq(qr qrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.c1 = qrVar;
        this.a1 = zArr;
        this.b1 = j12;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.a1[0]) {
            qr qrVar = this.c1;
            if (org.telegram.ui.Components.qc.a(qrVar)) {
                long j10 = this.b1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.qc.C(qrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.qc.C(qrVar, chat.title).j();
                }
            }
        }
    }
}
