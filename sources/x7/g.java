package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g {
    public final g7.a a;

    public g(g7.a aVar) {
        m.h(aVar);
        this.a = aVar;
    }

    public final void a(a aVar) {
        g7.a aVar2 = this.a;
        try {
            l6.a aVar3 = (l6.a) aVar.a;
            g7.i iVar = (g7.i) aVar2;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, aVar3);
            iVar.Q0(M0, 18);
        } catch (RemoteException e) {
            throw new a7.b(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        try {
            g7.a aVar = this.a;
            g7.a aVar2 = ((g) obj).a;
            g7.i iVar = (g7.i) aVar;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, aVar2);
            Parcel L0 = iVar.L0(M0, 16);
            boolean z4 = L0.readInt() != 0;
            L0.recycle();
            return z4;
        } catch (RemoteException e) {
            throw new a7.b(e);
        }
    }

    public final int hashCode() {
        try {
            g7.i iVar = (g7.i) this.a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new a7.b(e);
        }
    }
}
