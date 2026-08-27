package u7;

import android.os.Parcel;
import android.os.RemoteException;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public final d7.h a;

    public a(d7.h hVar) {
        l.h(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            d7.h hVar = this.a;
            d7.h hVar2 = ((a) obj).a;
            d7.f fVar = (d7.f) hVar;
            Parcel M0 = fVar.M0();
            d7.b.c(M0, hVar2);
            Parcel L0 = fVar.L0(M0, 17);
            boolean z10 = L0.readInt() != 0;
            L0.recycle();
            return z10;
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public final int hashCode() {
        try {
            d7.f fVar = (d7.f) this.a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
