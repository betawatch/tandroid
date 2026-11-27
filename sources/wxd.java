// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wxd extends v3d implements oae {
    public final trd Z(br7 br7Var, hre hreVar) {
        trd trdVar;
        Parcel R = R();
        int i = mld.a;
        R.writeStrongBinder(br7Var);
        R.writeInt(1);
        hreVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            trdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            trdVar = queryLocalInterface instanceof trd ? (trd) queryLocalInterface : new trd(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", (byte) 7);
        }
        T.recycle();
        return trdVar;
    }
}
