package u7;

import android.os.Parcel;
import android.os.RemoteException;
import d7.i;
import n2.b0;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f {
    public final d7.a a;

    public f(d7.a aVar) {
        l.h(aVar);
        this.a = aVar;
    }

    public final void a(b0 b0Var) {
        d7.a aVar = this.a;
        try {
            i6.a aVar2 = (i6.a) b0Var.b;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            d7.b.c(M0, aVar2);
            iVar.Q0(M0, 18);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            d7.a aVar = this.a;
            d7.a aVar2 = ((f) obj).a;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            d7.b.c(M0, aVar2);
            Parcel L0 = iVar.L0(M0, 16);
            boolean z10 = L0.readInt() != 0;
            L0.recycle();
            return z10;
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
