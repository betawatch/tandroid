package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r90 extends bn {
    public boolean vd;
    public final /* synthetic */ TLRPC.User wd;
    public final /* synthetic */ TLRPC.User[] xd;
    public final /* synthetic */ long yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.wd = user;
        this.xd = userArr;
        this.yd = j3;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        org.telegram.ui.Components.lc.b0(this).I(R.raw.contact_check, org.telegram.messenger.hd.a0(null, null, 2131751727, org.telegram.messenger.p10.q(this.wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.a0(null, null, 2131751728, org.telegram.messenger.p10.q(this.xd[0])), new bi.c4(this, this.yd, 28))).j();
    }
}
