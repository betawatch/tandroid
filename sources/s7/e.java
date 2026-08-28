package s7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends b7.a {
    public final a U0() {
        a aVar;
        Parcel L0 = L0(M0(), 4);
        IBinder readStrongBinder = L0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 1);
        }
        L0.recycle();
        return aVar;
    }

    public final g V0(h6.b bVar) {
        g gVar;
        Parcel M0 = M0();
        c7.b.c(M0, bVar);
        M0.writeInt(0);
        Parcel L0 = L0(M0, 3);
        IBinder readStrongBinder = L0.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 1);
        }
        L0.recycle();
        return gVar;
    }

    public final c7.e W0() {
        c7.e cVar;
        Parcel L0 = L0(M0(), 5);
        IBinder readStrongBinder = L0.readStrongBinder();
        int i9 = c7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof c7.e ? (c7.e) queryLocalInterface : new c7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 1);
        }
        L0.recycle();
        return cVar;
    }
}
