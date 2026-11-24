// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v5f extends ezc implements a6f {
    public final t5f Z(bo7 bo7Var, i6f i6fVar) {
        t5f t5fVar;
        Parcel R = R();
        int i = vgd.a;
        R.writeStrongBinder(bo7Var);
        R.writeInt(1);
        i6fVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            t5fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            t5fVar = queryLocalInterface instanceof t5f ? (t5f) queryLocalInterface : new t5f(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", (byte) 7);
        }
        T.recycle();
        return t5fVar;
    }
}
