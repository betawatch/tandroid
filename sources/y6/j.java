package y6;

import android.os.Parcel;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class j extends a9.a {
    public final x6.a V0(x6.b bVar, String str, int i10) {
        Parcel N0 = N0();
        m7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(i10);
        Parcel L0 = L0(N0, 2);
        x6.a K0 = x6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }

    public final x6.a W0(x6.b bVar, String str, int i10, x6.b bVar2) {
        Parcel N0 = N0();
        m7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(i10);
        m7.a.c(N0, bVar2);
        Parcel L0 = L0(N0, 8);
        x6.a K0 = x6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }

    public final x6.a X0(x6.b bVar, String str, int i10) {
        Parcel N0 = N0();
        m7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(i10);
        Parcel L0 = L0(N0, 4);
        x6.a K0 = x6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }

    public final x6.a Y0(x6.b bVar, String str, boolean z10, long j10) {
        Parcel N0 = N0();
        m7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(z10 ? 1 : 0);
        N0.writeLong(j10);
        Parcel L0 = L0(N0, 7);
        x6.a K0 = x6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }
}
