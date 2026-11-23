package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s41 extends np {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ b51 e1;
    public final /* synthetic */ u41 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s41(u41 u41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, b51 b51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = u41Var;
        this.d1 = zArr;
        this.e1 = b51Var;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            b51 b51Var = this.e1;
            if (org.telegram.ui.Components.kc.a(b51Var)) {
                org.telegram.ui.Components.kc.C(this.f1.a.first_name, b51Var).j();
            }
        }
    }
}
