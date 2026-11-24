// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rv0 extends yv1 {
    public boolean Gd;
    public final /* synthetic */ TLRPC.User Hd;
    public final /* synthetic */ long Id;
    public final /* synthetic */ qw0 Jd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv0(qw0 qw0Var, Bundle bundle, TLRPC.User user, long j) {
        super(bundle);
        this.Jd = qw0Var;
        this.Hd = user;
        this.Id = j;
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Gd) {
            return;
        }
        this.Gd = true;
        c41.b0(this).I(R.raw.contact_check, jb6.a0(null, null, 2131751676, m9c.r(this.Hd)), gm.N2(jb6.a0(null, null, 2131751677, m9c.r(this.Jd.V)), -1, 0, new fu(this, this.Id, (byte) 3), null)).j();
    }
}
