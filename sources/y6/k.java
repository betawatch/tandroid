package y6;

import android.os.Parcel;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class k extends a9.a {
    public final x6.a W0(x6.b bVar, String str, int i10, x6.b bVar2) {
        Parcel O0 = O0();
        m7.a.c(O0, bVar);
        O0.writeString(str);
        O0.writeInt(i10);
        m7.a.c(O0, bVar2);
        Parcel M0 = M0(O0, 2);
        x6.a L0 = x6.b.L0(M0.readStrongBinder());
        M0.recycle();
        return L0;
    }

    public final x6.a X0(x6.b bVar, String str, int i10, x6.b bVar2) {
        Parcel O0 = O0();
        m7.a.c(O0, bVar);
        O0.writeString(str);
        O0.writeInt(i10);
        m7.a.c(O0, bVar2);
        Parcel M0 = M0(O0, 3);
        x6.a L0 = x6.b.L0(M0.readStrongBinder());
        M0.recycle();
        return L0;
    }
}
