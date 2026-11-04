package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class up extends ip {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ long e1;
    public final /* synthetic */ nq f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(nq nqVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i3, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i3, true, false, null);
        this.f1 = nqVar;
        this.d1 = zArr;
        this.e1 = j12;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            nq nqVar = this.f1;
            if (org.telegram.ui.Components.fc.a(nqVar)) {
                long j10 = this.e1;
                if (j10 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
                    if (a22 != null) {
                        org.telegram.ui.Components.fc.C(a22.first_name, nqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
                if (M0 != null) {
                    org.telegram.ui.Components.fc.C(M0.title, nqVar).j();
                }
            }
        }
    }
}
