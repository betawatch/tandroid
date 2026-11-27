// default package

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class usd {
    public static gme a;

    public static zm9 a(Bitmap bitmap) {
        try {
            gme gmeVar = a;
            xve.i(gmeVar, "IBitmapDescriptorFactory is not initialized");
            nae naeVar = (nae) gmeVar;
            Parcel R = naeVar.R();
            jld.b(R, bitmap);
            Parcel Q = naeVar.Q(R, 6);
            al5 T = br7.T(Q.readStrongBinder());
            Q.recycle();
            return new zm9(T);
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }

    public static zm9 b(int i) {
        try {
            gme gmeVar = a;
            xve.i(gmeVar, "IBitmapDescriptorFactory is not initialized");
            nae naeVar = (nae) gmeVar;
            Parcel R = naeVar.R();
            R.writeInt(i);
            Parcel Q = naeVar.Q(R, 1);
            al5 T = br7.T(Q.readStrongBinder());
            Q.recycle();
            return new zm9(T);
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }
}
