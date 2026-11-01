package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sa0 extends un {
    public boolean kd;
    public final /* synthetic */ TLRPC.User ld;
    public final /* synthetic */ TLRPC.User[] md;
    public final /* synthetic */ long nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.ld = user;
        this.md = userArr;
        this.nd = j10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.kd) {
            return;
        }
        this.kd = true;
        org.telegram.ui.Components.cc.a0(this).I(R.raw.contact_check, org.telegram.messenger.dd.a0(null, null, 2131751740, org.telegram.messenger.i20.p(this.ld)), org.telegram.messenger.i0.T2(org.telegram.messenger.dd.a0(null, null, 2131751741, org.telegram.messenger.i20.p(this.md[0])), new bi.e(this, this.nd, 16))).j();
    }
}
