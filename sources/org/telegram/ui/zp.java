package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zp extends np {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ long e1;
    public final /* synthetic */ rq f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(rq rqVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f1 = rqVar;
        this.d1 = zArr;
        this.e1 = j11;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            rq rqVar = this.f1;
            if (org.telegram.ui.Components.lc.a(rqVar)) {
                long j3 = this.e1;
                if (j3 > 0) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
                    if (c22 != null) {
                        org.telegram.ui.Components.lc.C(c22.first_name, rqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                if (O0 != null) {
                    org.telegram.ui.Components.lc.C(O0.title, rqVar).j();
                }
            }
        }
    }
}
