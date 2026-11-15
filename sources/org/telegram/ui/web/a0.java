package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.an;
import org.telegram.ui.n31;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class a0 extends an {
    public boolean ud;
    public final /* synthetic */ TLRPC.User vd;
    public final /* synthetic */ long wd;
    public final /* synthetic */ v0 xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(v0 v0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.xd = v0Var;
        this.vd = user;
        this.wd = j3;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.ud) {
            return;
        }
        this.ud = true;
        cc.a0(this).I(R.raw.contact_check, hd.a0(null, null, 2131751739, q10.p(this.vd)), org.telegram.messenger.g0.U2(hd.a0(null, null, 2131751740, q10.p(this.xd.V)), new n31(this, this.wd, 1))).j();
    }
}
