package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v41 extends mp {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ e51 d1;
    public final /* synthetic */ x41 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(x41 x41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, boolean[] zArr, e51 e51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z9, null);
        this.e1 = x41Var;
        this.c1 = zArr;
        this.d1 = e51Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.c1[0]) {
            e51 e51Var = this.d1;
            if (org.telegram.ui.Components.gc.a(e51Var)) {
                org.telegram.ui.Components.gc.C(this.e1.a.first_name, e51Var).j();
            }
        }
    }
}
