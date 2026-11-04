package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j1 extends b8.a implements l3 {
    public final l0 X0(z6.b bVar, n6 n6Var) {
        l0 l0Var;
        Parcel P0 = P0();
        int i3 = x.a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        n6Var.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            l0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            l0Var = queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new l0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 11);
        }
        R0.recycle();
        return l0Var;
    }
}
