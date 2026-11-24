// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class spd extends fdd implements evd {
    public static evd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof evd ? (evd) queryLocalInterface : new jjd(iBinder);
    }
}
