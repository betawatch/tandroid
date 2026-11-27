// default package

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
