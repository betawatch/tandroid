package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j1 extends a9.a implements l3 {
    public final m0 V0(x6.b bVar, n6 n6Var) {
        m0 m0Var;
        Parcel N0 = N0();
        int i10 = y.a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        n6Var.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            m0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            m0Var = queryLocalInterface instanceof m0 ? (m0) queryLocalInterface : new m0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 10);
        }
        P0.recycle();
        return m0Var;
    }
}
