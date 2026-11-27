// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ru0 extends zu1 {
    public boolean Jd;
    public final /* synthetic */ TLRPC.User Kd;
    public final /* synthetic */ long Ld;
    public final /* synthetic */ rv0 Md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru0(rv0 rv0Var, Bundle bundle, TLRPC.User user, long j) {
        super(bundle);
        this.Md = rv0Var;
        this.Kd = user;
        this.Ld = j;
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Jd) {
            return;
        }
        this.Jd = true;
        d31.b0(this).I(R.raw.contact_check, ob6.a0(null, null, 2131751704, lbc.r(this.Kd)), hl.N2(ob6.a0(null, null, 2131751705, lbc.r(this.Md.V)), -1, 0, new kt(this, this.Ld, (byte) 3), null)).j();
    }
}
