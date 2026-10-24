package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
