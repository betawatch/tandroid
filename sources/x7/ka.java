package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class ka extends a9.a implements ma {
    public final ja W0(x6.b bVar, oa oaVar) {
        ja jaVar;
        Parcel O0 = O0();
        int i10 = y.a;
        O0.writeStrongBinder(bVar);
        O0.writeInt(1);
        oaVar.writeToParcel(O0, 0);
        Parcel Q0 = Q0(O0, 1);
        IBinder readStrongBinder = Q0.readStrongBinder();
        if (readStrongBinder == null) {
            jaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            jaVar = queryLocalInterface instanceof ja ? (ja) queryLocalInterface : new ja(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 10);
        }
        Q0.recycle();
        return jaVar;
    }
}
