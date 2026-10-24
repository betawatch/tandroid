package v7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class o8 {
    public static s7.e a;

    public static z2.b a(Bitmap bitmap) {
        n6.l.i(bitmap, "image must not be null");
        try {
            s7.e eVar = a;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel N0 = cVar.N0();
            s7.b.b(N0, bitmap);
            Parcel M0 = cVar.M0(N0, 6);
            x6.a K0 = x6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new z2.b(K0);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    public static z2.b b(int i10) {
        try {
            s7.e eVar = a;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel N0 = cVar.N0();
            N0.writeInt(i10);
            Parcel M0 = cVar.M0(N0, 1);
            x6.a K0 = x6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new z2.b(K0);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }
}
