package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class sa1 extends qq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ bb1 e1;
    public final /* synthetic */ ua1 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa1(ua1 ua1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, bb1 bb1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = ua1Var;
        this.d1 = zArr;
        this.e1 = bb1Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            bb1 bb1Var = this.e1;
            if (org.telegram.ui.Components.yc.a(bb1Var)) {
                org.telegram.ui.Components.yc.C(bb1Var, this.f1.a.first_name).j();
            }
        }
    }
}
