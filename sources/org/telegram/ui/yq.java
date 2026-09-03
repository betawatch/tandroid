package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yq extends lq {
    public final /* synthetic */ boolean[] a1;
    public final /* synthetic */ long b1;
    public final /* synthetic */ rr c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(rr rrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.c1 = rrVar;
        this.a1 = zArr;
        this.b1 = j12;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.a1[0]) {
            rr rrVar = this.c1;
            if (org.telegram.ui.Components.qc.a(rrVar)) {
                long j10 = this.b1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.qc.C(rrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.qc.C(rrVar, chat.title).j();
                }
            }
        }
    }
}
