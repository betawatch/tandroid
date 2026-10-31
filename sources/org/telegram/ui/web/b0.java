package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class b0 extends un {
    public boolean jd;
    public final /* synthetic */ TLRPC.User kd;
    public final /* synthetic */ long ld;
    public final /* synthetic */ z0 md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z0 z0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.md = z0Var;
        this.kd = user;
        this.ld = j10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.jd) {
            return;
        }
        this.jd = true;
        cc.a0(this).I(R.raw.contact_check, cd.a0(null, null, 2131751740, h20.p(this.kd)), org.telegram.messenger.i0.T2(cd.a0(null, null, 2131751741, h20.p(this.md.U)), new bi.e(this, this.ld, 20))).j();
    }
}
