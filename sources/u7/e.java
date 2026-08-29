package u7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.internal.cast.a {
    public final a U0() {
        a aVar;
        Parcel L0 = L0(M0(), 4);
        IBinder readStrongBinder = L0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 4);
        }
        L0.recycle();
        return aVar;
    }

    public final g V0(j6.b bVar) {
        g gVar;
        Parcel M0 = M0();
        e7.b.c(M0, bVar);
        M0.writeInt(0);
        Parcel L0 = L0(M0, 3);
        IBinder readStrongBinder = L0.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 4);
        }
        L0.recycle();
        return gVar;
    }

    public final e7.e W0() {
        e7.e cVar;
        Parcel L0 = L0(M0(), 5);
        IBinder readStrongBinder = L0.readStrongBinder();
        int i10 = e7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof e7.e ? (e7.e) queryLocalInterface : new e7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 4);
        }
        L0.recycle();
        return cVar;
    }
}
