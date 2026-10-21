package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class ka extends a9.a implements ma {
    public final ja V0(x6.b bVar, oa oaVar) {
        ja jaVar;
        Parcel N0 = N0();
        int i10 = y.a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        oaVar.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            jaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            jaVar = queryLocalInterface instanceof ja ? (ja) queryLocalInterface : new ja(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 10);
        }
        P0.recycle();
        return jaVar;
    }
}
