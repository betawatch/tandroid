package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class b0 extends un {
    public boolean kd;
    public final /* synthetic */ TLRPC.User ld;
    public final /* synthetic */ long md;
    public final /* synthetic */ z0 nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z0 z0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.nd = z0Var;
        this.ld = user;
        this.md = j10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.kd) {
            return;
        }
        this.kd = true;
        cc.a0(this).I(R.raw.contact_check, dd.a0(null, null, 2131751740, i20.p(this.ld)), org.telegram.messenger.i0.T2(dd.a0(null, null, 2131751741, i20.p(this.nd.U)), new bi.e(this, this.md, 20))).j();
    }
}
