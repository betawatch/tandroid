package rf;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final /* synthetic */ v0 a;

    public l0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onLocationAcquired(Location location) {
        v0 v0Var = this.a;
        TLRPC.User user = v0Var.s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        v0Var.v0 = location;
        v0Var.T(true, user, v0Var.n0, "");
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onUnableLocationAcquire() {
        this.a.Q();
    }
}
