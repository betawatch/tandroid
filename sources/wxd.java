// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
