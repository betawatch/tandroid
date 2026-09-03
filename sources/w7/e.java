package w7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends a7.a {
    public final a U0() {
        a aVar;
        Parcel L0 = L0(M0(), 4);
        IBinder readStrongBinder = L0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 5);
        }
        L0.recycle();
        return aVar;
    }

    public final g V0(l6.b bVar) {
        g gVar;
        Parcel M0 = M0();
        g7.b.c(M0, bVar);
        M0.writeInt(0);
        Parcel L0 = L0(M0, 3);
        IBinder readStrongBinder = L0.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 5);
        }
        L0.recycle();
        return gVar;
    }

    public final g7.e W0() {
        g7.e cVar;
        Parcel L0 = L0(M0(), 5);
        IBinder readStrongBinder = L0.readStrongBinder();
        int i10 = g7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof g7.e ? (g7.e) queryLocalInterface : new g7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 5);
        }
        L0.recycle();
        return cVar;
    }
}
