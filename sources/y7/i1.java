package y7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i1 extends a8.a implements k3 {
    public final l0 V0(y6.b bVar, m6 m6Var) {
        l0 l0Var;
        Parcel N0 = N0();
        int i10 = x.a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        m6Var.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            l0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            l0Var = queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new l0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 11);
        }
        P0.recycle();
        return l0Var;
    }
}
