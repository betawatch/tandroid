package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.f31;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class b0 extends wm {
    public boolean sd;
    public final /* synthetic */ TLRPC.User td;
    public final /* synthetic */ long ud;
    public final /* synthetic */ w0 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(w0 w0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.vd = w0Var;
        this.td = user;
        this.ud = j10;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.sd) {
            return;
        }
        this.sd = true;
        fc.a0(this).I(R.raw.contact_check, bd.a0(null, null, 2131751740, l10.p(this.td)), org.telegram.messenger.g0.U2(bd.a0(null, null, 2131751741, l10.p(this.vd.V)), new f31(this, this.ud, 1))).j();
    }
}
