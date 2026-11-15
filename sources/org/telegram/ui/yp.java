package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yp extends mp {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ long e1;
    public final /* synthetic */ qq f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(qq qqVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f1 = qqVar;
        this.d1 = zArr;
        this.e1 = j11;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            qq qqVar = this.f1;
            if (org.telegram.ui.Components.cc.a(qqVar)) {
                long j3 = this.e1;
                if (j3 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        org.telegram.ui.Components.cc.C(a22.first_name, qqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                if (M0 != null) {
                    org.telegram.ui.Components.cc.C(M0.title, qqVar).j();
                }
            }
        }
    }
}
