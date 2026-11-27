// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yxd extends v3d {
    public final agd Z() {
        agd agdVar;
        Parcel Q = Q(R(), 4);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            agdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            agdVar = queryLocalInterface instanceof agd ? (agd) queryLocalInterface : new agd(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", (byte) 6);
        }
        Q.recycle();
        return agdVar;
    }

    public final b1f a0(br7 br7Var) {
        b1f b1fVar;
        Parcel R = R();
        jld.c(R, br7Var);
        R.writeInt(0);
        Parcel Q = Q(R, 3);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            b1fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            b1fVar = queryLocalInterface instanceof b1f ? (b1f) queryLocalInterface : new b1f(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", (byte) 6);
        }
        Q.recycle();
        return b1fVar;
    }

    public final gme b0() {
        gme naeVar;
        Parcel Q = Q(R(), 5);
        IBinder readStrongBinder = Q.readStrongBinder();
        int i = sge.b;
        if (readStrongBinder == null) {
            naeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            naeVar = queryLocalInterface instanceof gme ? (gme) queryLocalInterface : new nae(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", (byte) 6);
        }
        Q.recycle();
        return naeVar;
    }
}
