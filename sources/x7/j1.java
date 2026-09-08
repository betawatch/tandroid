package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j1 extends a9.a implements l3 {
    public final m0 W0(x6.b bVar, n6 n6Var) {
        m0 m0Var;
        Parcel O0 = O0();
        int i10 = y.a;
        O0.writeStrongBinder(bVar);
        O0.writeInt(1);
        n6Var.writeToParcel(O0, 0);
        Parcel Q0 = Q0(O0, 1);
        IBinder readStrongBinder = Q0.readStrongBinder();
        if (readStrongBinder == null) {
            m0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            m0Var = queryLocalInterface instanceof m0 ? (m0) queryLocalInterface : new m0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 10);
        }
        Q0.recycle();
        return m0Var;
    }
}
