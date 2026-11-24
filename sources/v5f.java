// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
