package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vq extends iq {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ long d1;
    public final /* synthetic */ pr e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(pr prVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.e1 = prVar;
        this.c1 = zArr;
        this.d1 = j12;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.c1[0]) {
            pr prVar = this.e1;
            if (org.telegram.ui.Components.cc.a(prVar)) {
                long j10 = this.d1;
                if (j10 > 0) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
                    if (Z1 != null) {
                        org.telegram.ui.Components.cc.C(Z1.first_name, prVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
                if (L0 != null) {
                    org.telegram.ui.Components.cc.C(L0.title, prVar).j();
                }
            }
        }
    }
}
