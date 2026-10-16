package y6;

import android.os.Parcel;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
