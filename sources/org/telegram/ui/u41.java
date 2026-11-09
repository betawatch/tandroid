package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u41 extends mp {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ d51 d1;
    public final /* synthetic */ w41 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(w41 w41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, boolean[] zArr, d51 d51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z9, null);
        this.e1 = w41Var;
        this.c1 = zArr;
        this.d1 = d51Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.c1[0]) {
            d51 d51Var = this.d1;
            if (org.telegram.ui.Components.hc.a(d51Var)) {
                org.telegram.ui.Components.hc.C(this.e1.a.first_name, d51Var).j();
            }
        }
    }
}
