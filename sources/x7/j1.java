package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class j1 extends a9.a implements l3 {
    public final m0 X0(x6.b bVar, n6 n6Var) {
        m0 m0Var;
        Parcel P0 = P0();
        int i10 = y.a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        n6Var.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            m0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            m0Var = queryLocalInterface instanceof m0 ? (m0) queryLocalInterface : new m0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 10);
        }
        R0.recycle();
        return m0Var;
    }
}
