package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x91 extends jq {
    public final /* synthetic */ boolean[] a1;
    public final /* synthetic */ ga1 b1;
    public final /* synthetic */ z91 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x91(z91 z91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, boolean[] zArr, ga1 ga1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z4, null);
        this.c1 = z91Var;
        this.a1 = zArr;
        this.b1 = ga1Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.a1[0]) {
            ga1 ga1Var = this.b1;
            if (org.telegram.ui.Components.qc.a(ga1Var)) {
                org.telegram.ui.Components.qc.C(ga1Var, this.c1.a.first_name).j();
            }
        }
    }
}
