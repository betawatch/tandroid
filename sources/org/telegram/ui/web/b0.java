package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
import org.telegram.ui.p31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class b0 extends an {
    public boolean rd;
    public final /* synthetic */ TLRPC.User sd;
    public final /* synthetic */ long td;
    public final /* synthetic */ x0 ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x0 x0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.ud = x0Var;
        this.sd = user;
        this.td = j3;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.rd) {
            return;
        }
        this.rd = true;
        hc.a0(this).I(R.raw.contact_check, hd.a0(null, null, 2131751740, t10.p(this.sd)), org.telegram.messenger.g0.U2(hd.a0(null, null, 2131751741, t10.p(this.ud.U)), new p31(this, this.td, 1))).j();
    }
}
