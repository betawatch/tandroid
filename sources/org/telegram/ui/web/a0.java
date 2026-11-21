package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
import org.telegram.ui.qx0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class a0 extends bn {
    public boolean vd;
    public final /* synthetic */ TLRPC.User wd;
    public final /* synthetic */ long xd;
    public final /* synthetic */ v0 yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(v0 v0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.yd = v0Var;
        this.wd = user;
        this.xd = j3;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        lc.b0(this).I(R.raw.contact_check, gd.a0(null, null, 2131751727, o10.q(this.wd)), org.telegram.messenger.g0.T2(gd.a0(null, null, 2131751728, o10.q(this.yd.V)), new qx0(this, this.xd, 2))).j();
    }
}
