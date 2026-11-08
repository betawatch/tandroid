package s6;

import android.os.IBinder;
import android.os.IInterface;
import q6.h;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a extends h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 253600000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new b(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 8);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return n7.b.c;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // q6.d
    public final boolean r() {
        return true;
    }
}
