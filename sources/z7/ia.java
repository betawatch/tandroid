package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ia extends b8.a implements ka {
    public final ha X0(z6.b bVar, ma maVar) {
        ha haVar;
        Parcel P0 = P0();
        int i3 = x.a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        maVar.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            haVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            haVar = queryLocalInterface instanceof ha ? (ha) queryLocalInterface : new ha(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 11);
        }
        R0.recycle();
        return haVar;
    }
}
