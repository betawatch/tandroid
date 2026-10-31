package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ta0 extends un {
    public boolean jd;
    public final /* synthetic */ TLRPC.User kd;
    public final /* synthetic */ TLRPC.User[] ld;
    public final /* synthetic */ long md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.kd = user;
        this.ld = userArr;
        this.md = j10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.jd) {
            return;
        }
        this.jd = true;
        org.telegram.ui.Components.cc.a0(this).I(R.raw.contact_check, org.telegram.messenger.cd.a0(null, null, 2131751740, org.telegram.messenger.h20.p(this.kd)), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.a0(null, null, 2131751741, org.telegram.messenger.h20.p(this.ld[0])), new bi.e(this, this.md, 16))).j();
    }
}
