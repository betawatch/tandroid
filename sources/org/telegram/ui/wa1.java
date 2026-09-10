package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wa1 extends rq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ fb1 e1;
    public final /* synthetic */ ya1 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(ya1 ya1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, fb1 fb1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = ya1Var;
        this.d1 = zArr;
        this.e1 = fb1Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            fb1 fb1Var = this.e1;
            if (org.telegram.ui.Components.wc.a(fb1Var)) {
                org.telegram.ui.Components.wc.C(fb1Var, this.f1.a.first_name).j();
            }
        }
    }
}
