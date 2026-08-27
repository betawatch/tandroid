package pf;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final /* synthetic */ u0 a;

    public k0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onLocationAcquired(Location location) {
        u0 u0Var = this.a;
        TLRPC.User user = u0Var.s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        u0Var.v0 = location;
        u0Var.T(true, user, u0Var.n0, "");
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onUnableLocationAcquire() {
        this.a.Q();
    }
}
