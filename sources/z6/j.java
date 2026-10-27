package z6;

import android.os.Parcel;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j extends a8.a {
    public final y6.a V0(y6.b bVar, String str, int i10) {
        Parcel N0 = N0();
        n7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(i10);
        Parcel L0 = L0(N0, 2);
        y6.a K0 = y6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }

    public final y6.a W0(y6.b bVar, String str, int i10, y6.b bVar2) {
        Parcel N0 = N0();
        n7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(i10);
        n7.a.c(N0, bVar2);
        Parcel L0 = L0(N0, 8);
        y6.a K0 = y6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }

    public final y6.a X0(y6.b bVar, String str, int i10) {
        Parcel N0 = N0();
        n7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(i10);
        Parcel L0 = L0(N0, 4);
        y6.a K0 = y6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }

    public final y6.a Y0(y6.b bVar, String str, boolean z10, long j10) {
        Parcel N0 = N0();
        n7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(z10 ? 1 : 0);
        N0.writeLong(j10);
        Parcel L0 = L0(N0, 7);
        y6.a K0 = y6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }
}
