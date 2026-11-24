// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oza extends ke2 {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ xza e1;
    public final /* synthetic */ qza f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oza(qza qzaVar, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, boolean[] zArr, xza xzaVar) {
        super(j, j2, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z, null);
        this.f1 = qzaVar;
        this.d1 = zArr;
        this.e1 = xzaVar;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            xza xzaVar = this.e1;
            if (c41.a(xzaVar)) {
                c41.C(this.f1.a.first_name, xzaVar).j();
            }
        }
    }
}
