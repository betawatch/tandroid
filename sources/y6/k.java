package y6;

import android.os.Parcel;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class k extends a9.a {
    public final x6.a V0(x6.b bVar, String str, int i10, x6.b bVar2) {
        Parcel N0 = N0();
        m7.a.c(N0, bVar);
        N0.writeString(str);
        N0.writeInt(i10);
        m7.a.c(N0, bVar2);
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
        Parcel L0 = L0(N0, 3);
        x6.a K0 = x6.b.K0(L0.readStrongBinder());
        L0.recycle();
        return K0;
    }
}
