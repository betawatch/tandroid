package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
