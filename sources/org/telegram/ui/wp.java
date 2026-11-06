package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class wp extends kp {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ long d1;
    public final /* synthetic */ oq e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(oq oqVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.e1 = oqVar;
        this.c1 = zArr;
        this.d1 = j11;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.c1[0]) {
            oq oqVar = this.e1;
            if (org.telegram.ui.Components.hc.a(oqVar)) {
                long j3 = this.d1;
                if (j3 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        org.telegram.ui.Components.hc.C(a22.first_name, oqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                if (M0 != null) {
                    org.telegram.ui.Components.hc.C(M0.title, oqVar).j();
                }
            }
        }
    }
}
