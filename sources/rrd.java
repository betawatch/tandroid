// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
