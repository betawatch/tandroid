package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.cn;
import org.telegram.ui.r31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class b0 extends cn {
    public boolean td;
    public final /* synthetic */ TLRPC.User ud;
    public final /* synthetic */ long vd;
    public final /* synthetic */ x0 wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x0 x0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.wd = x0Var;
        this.ud = user;
        this.vd = j3;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.td) {
            return;
        }
        this.td = true;
        gc.a0(this).I(R.raw.contact_check, id.a0(null, null, 2131751739, t10.p(this.ud)), org.telegram.messenger.g0.U2(id.a0(null, null, 2131751740, t10.p(this.wd.U)), new r31(this, this.vd, 1))).j();
    }
}
