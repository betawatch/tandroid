package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ya1 extends tq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ hb1 e1;
    public final /* synthetic */ ab1 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(ab1 ab1Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, hb1 hb1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = ab1Var;
        this.d1 = zArr;
        this.e1 = hb1Var;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            hb1 hb1Var = this.e1;
            if (org.telegram.ui.Components.zc.a(hb1Var)) {
                org.telegram.ui.Components.zc.C(hb1Var, this.f1.a.first_name).j();
            }
        }
    }
}
