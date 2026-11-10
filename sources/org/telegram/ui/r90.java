package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r90 extends cn {
    public boolean td;
    public final /* synthetic */ TLRPC.User ud;
    public final /* synthetic */ TLRPC.User[] vd;
    public final /* synthetic */ long wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.ud = user;
        this.vd = userArr;
        this.wd = j3;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.td) {
            return;
        }
        this.td = true;
        org.telegram.ui.Components.gc.a0(this).I(R.raw.contact_check, org.telegram.messenger.id.a0(null, null, 2131751739, org.telegram.messenger.t10.p(this.ud)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.vd[0])), new bi.r3(this, this.wd, 27))).j();
    }
}
