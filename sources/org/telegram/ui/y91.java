package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y91 extends kq {
    public final /* synthetic */ boolean[] a1;
    public final /* synthetic */ ha1 b1;
    public final /* synthetic */ aa1 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(aa1 aa1Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, boolean[] zArr, ha1 ha1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z4, null);
        this.c1 = aa1Var;
        this.a1 = zArr;
        this.b1 = ha1Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.a1[0]) {
            ha1 ha1Var = this.b1;
            if (org.telegram.ui.Components.qc.a(ha1Var)) {
                org.telegram.ui.Components.qc.C(ha1Var, this.c1.a.first_name).j();
            }
        }
    }
}
