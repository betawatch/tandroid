package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;
import org.telegram.ui.ox0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        kc.b0(this).I(R.raw.contact_check, gd.a0(null, null, 2131751727, n10.q(this.wd)), org.telegram.messenger.g0.T2(gd.a0(null, null, 2131751728, n10.q(this.yd.V)), new ox0(this, this.xd, 2))).j();
    }
}
