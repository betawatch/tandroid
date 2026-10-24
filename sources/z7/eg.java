package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class eg extends a9.a {
    public final jg V0(x6.b bVar, bg bgVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        bgVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 3);
        jg createFromParcel = P0.readInt() == 0 ? null : jg.CREATOR.createFromParcel(P0);
        P0.recycle();
        return createFromParcel;
    }
}
