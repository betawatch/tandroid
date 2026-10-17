package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class fg extends a9.a {
    public final kg V0(x6.b bVar, cg cgVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        cgVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 3);
        kg createFromParcel = P0.readInt() == 0 ? null : kg.CREATOR.createFromParcel(P0);
        P0.recycle();
        return createFromParcel;
    }
}
