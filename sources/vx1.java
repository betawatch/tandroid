// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class vx1 extends mu1 {
    public boolean wd;
    public final /* synthetic */ TLRPC.User xd;
    public final /* synthetic */ TLRPC.User yd;
    public final /* synthetic */ long zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx1(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j) {
        super(bundle);
        this.xd = user;
        this.yd = user2;
        this.zd = j;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.wd) {
            return;
        }
        this.wd = true;
        u21.b0(this).I(R.raw.contact_check, k96.a0(null, null, 2131751727, l7c.r(this.xd)), gl.N2(k96.a0(null, null, 2131751728, l7c.r(this.yd)), -1, 0, new et(this, this.zd, (byte) 6), null)).j();
    }
}
