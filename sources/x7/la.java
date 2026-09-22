package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class la extends a9.a implements na {
    public final ka W0(x6.b bVar, pa paVar) {
        ka kaVar;
        Parcel O0 = O0();
        int i10 = y.a;
        O0.writeStrongBinder(bVar);
        O0.writeInt(1);
        paVar.writeToParcel(O0, 0);
        Parcel Q0 = Q0(O0, 1);
        IBinder readStrongBinder = Q0.readStrongBinder();
        if (readStrongBinder == null) {
            kaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            kaVar = queryLocalInterface instanceof ka ? (ka) queryLocalInterface : new ka(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 10);
        }
        Q0.recycle();
        return kaVar;
    }
}
