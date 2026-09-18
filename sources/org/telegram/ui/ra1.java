package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ra1 extends pq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ ab1 e1;
    public final /* synthetic */ ta1 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra1(ta1 ta1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, ab1 ab1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = ta1Var;
        this.d1 = zArr;
        this.e1 = ab1Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            ab1 ab1Var = this.e1;
            if (org.telegram.ui.Components.vc.a(ab1Var)) {
                org.telegram.ui.Components.vc.C(ab1Var, this.f1.a.first_name).j();
            }
        }
    }
}
