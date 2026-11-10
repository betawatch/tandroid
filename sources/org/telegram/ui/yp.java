package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yp extends mp {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ long d1;
    public final /* synthetic */ rq e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(rq rqVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.e1 = rqVar;
        this.c1 = zArr;
        this.d1 = j11;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.c1[0]) {
            rq rqVar = this.e1;
            if (org.telegram.ui.Components.gc.a(rqVar)) {
                long j3 = this.d1;
                if (j3 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        org.telegram.ui.Components.gc.C(a22.first_name, rqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                if (M0 != null) {
                    org.telegram.ui.Components.gc.C(M0.title, rqVar).j();
                }
            }
        }
    }
}
