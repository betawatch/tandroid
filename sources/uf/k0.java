package uf;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final /* synthetic */ u0 a;

    public k0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onLocationAcquired(Location location) {
        u0 u0Var = this.a;
        TLRPC.User user = u0Var.t0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        u0Var.w0 = location;
        u0Var.T(true, user, u0Var.o0, "");
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onUnableLocationAcquire() {
        this.a.Q();
    }
}
