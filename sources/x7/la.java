package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class la extends a9.a implements na {
    public final ka V0(x6.b bVar, pa paVar) {
        ka kaVar;
        Parcel N0 = N0();
        int i10 = y.a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        paVar.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            kaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            kaVar = queryLocalInterface instanceof ka ? (ka) queryLocalInterface : new ka(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 10);
        }
        P0.recycle();
        return kaVar;
    }
}
