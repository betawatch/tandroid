// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x7f extends f1d implements c8f {
    public final v7f Z(eq7 eq7Var, k8f k8fVar) {
        v7f v7fVar;
        Parcel R = R();
        int i = wid.a;
        R.writeStrongBinder(eq7Var);
        R.writeInt(1);
        k8fVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            v7fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            v7fVar = queryLocalInterface instanceof v7f ? (v7f) queryLocalInterface : new v7f(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", (byte) 7);
        }
        T.recycle();
        return v7fVar;
    }
}
