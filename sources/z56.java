// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class z56 extends yv1 {
    public boolean Gd;
    public final /* synthetic */ TLRPC.User Hd;
    public final /* synthetic */ TLRPC.User[] Id;
    public final /* synthetic */ long Jd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z56(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j) {
        super(bundle);
        this.Hd = user;
        this.Id = userArr;
        this.Jd = j;
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Gd) {
            return;
        }
        this.Gd = true;
        c41.b0(this).I(R.raw.contact_check, jb6.a0(null, null, 2131751676, m9c.r(this.Hd)), gm.N2(jb6.a0(null, null, 2131751677, m9c.r(this.Id[0])), -1, 0, new fu((Object) this, this.Jd, (byte) 18), null)).j();
    }
}
