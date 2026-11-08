package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t41 extends kp {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ c51 d1;
    public final /* synthetic */ v41 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(v41 v41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, boolean[] zArr, c51 c51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z9, null);
        this.e1 = v41Var;
        this.c1 = zArr;
        this.d1 = c51Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.c1[0]) {
            c51 c51Var = this.d1;
            if (org.telegram.ui.Components.hc.a(c51Var)) {
                org.telegram.ui.Components.hc.C(this.e1.a.first_name, c51Var).j();
            }
        }
    }
}
