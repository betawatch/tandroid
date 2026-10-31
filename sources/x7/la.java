package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class la extends a9.a implements na {
    public final ka X0(x6.b bVar, pa paVar) {
        ka kaVar;
        Parcel P0 = P0();
        int i10 = y.a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        paVar.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            kaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            kaVar = queryLocalInterface instanceof ka ? (ka) queryLocalInterface : new ka(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 10);
        }
        R0.recycle();
        return kaVar;
    }
}
