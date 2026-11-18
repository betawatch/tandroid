package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t41 extends np {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ c51 e1;
    public final /* synthetic */ v41 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(v41 v41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, c51 c51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = v41Var;
        this.d1 = zArr;
        this.e1 = c51Var;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            c51 c51Var = this.e1;
            if (org.telegram.ui.Components.lc.a(c51Var)) {
                org.telegram.ui.Components.lc.C(this.f1.a.first_name, c51Var).j();
            }
        }
    }
}
