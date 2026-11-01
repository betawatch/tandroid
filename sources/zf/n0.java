package zf;

import android.location.Location;
import org.telegram.messenger.nz;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n0 implements nz {
    public final /* synthetic */ x0 a;

    public n0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // org.telegram.messenger.nz
    public final void E() {
        this.a.Q();
    }

    @Override // org.telegram.messenger.nz
    public final void F(Location location) {
        x0 x0Var = this.a;
        TLRPC.User user = x0Var.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        x0Var.z0 = location;
        x0Var.T(true, user, x0Var.r0, "");
    }
}
