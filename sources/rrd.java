// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rrd extends d05 {
    @Override // hg0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return queryLocalInterface instanceof sxd ? (sxd) queryLocalInterface : new sxd(iBinder);
    }

    @Override // hg0
    public final a94[] f() {
        return fmd.b;
    }

    @Override // hg0
    public final int i() {
        return 261200000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
