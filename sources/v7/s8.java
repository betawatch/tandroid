package v7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class s8 {
    public static s7.e a;

    public static a6.i a(Bitmap bitmap) {
        n6.l.i(bitmap, "image must not be null");
        try {
            s7.e eVar = a;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel O0 = cVar.O0();
            s7.b.b(O0, bitmap);
            Parcel N0 = cVar.N0(O0, 6);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new a6.i(L0);
        } catch (RemoteException e7) {
            throw new androidx.car.app.j(e7);
        }
    }

    public static a6.i b(int i10) {
        try {
            s7.e eVar = a;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel O0 = cVar.O0();
            O0.writeInt(i10);
            Parcel N0 = cVar.N0(O0, 1);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new a6.i(L0);
        } catch (RemoteException e7) {
            throw new androidx.car.app.j(e7);
        }
    }
}
