// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q3d extends zz4 {
    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return queryLocalInterface instanceof a5d ? (a5d) queryLocalInterface : new a5d(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", (byte) 1);
    }

    @Override // hh0
    public final o94[] f() {
        return wfd.c;
    }

    @Override // hh0
    public final int i() {
        return 253600000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // hh0
    public final boolean p() {
        return true;
    }
}
