package zf;

import android.location.Location;
import org.telegram.messenger.mz;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n0 implements mz {
    public final /* synthetic */ x0 a;

    public n0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // org.telegram.messenger.mz
    public final void E() {
        this.a.Q();
    }

    @Override // org.telegram.messenger.mz
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
