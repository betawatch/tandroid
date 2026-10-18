package v7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class o8 {
    public static s7.e a;

    public static a6.m a(Bitmap bitmap) {
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
            return new a6.m(K0);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    public static a6.m b(int i10) {
        try {
            s7.e eVar = a;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel N0 = cVar.N0();
            N0.writeInt(i10);
            Parcel M0 = cVar.M0(N0, 1);
            x6.a K0 = x6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new a6.m(K0);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }
}
