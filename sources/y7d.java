// default package

import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class y7d implements k05, l05 {
    public final zn a;
    public final boolean b;
    public i6d c;

    public y7d(zn znVar, boolean z) {
        this.a = znVar;
        this.b = z;
    }

    @Override // k05
    public final void onConnected(Bundle bundle) {
        xve.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // l05
    public final void onConnectionFailed(ws2 ws2Var) {
        zn znVar = this.a;
        boolean z = this.b;
        xve.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        i6d i6dVar = this.c;
        i6dVar.a.lock();
        try {
            i6dVar.m.x1(ws2Var, znVar, z);
        } finally {
            i6dVar.a.unlock();
        }
    }

    @Override // k05
    public final void onConnectionSuspended(int i) {
        xve.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i);
    }
}
