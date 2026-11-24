// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class z36 extends mu1 {
    public boolean vd;
    public final /* synthetic */ TLRPC.User wd;
    public final /* synthetic */ TLRPC.User[] xd;
    public final /* synthetic */ long yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z36(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j) {
        super(bundle);
        this.wd = user;
        this.xd = userArr;
        this.yd = j;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        u21.b0(this).I(R.raw.contact_check, k96.a0(null, null, 2131751727, l7c.q(this.wd)), gl.O2(k96.a0(null, null, 2131751728, l7c.q(this.xd[0])), -1, 0, new et((Object) this, this.yd, (byte) 18), null)).j();
    }
}
