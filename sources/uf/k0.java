package uf;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
