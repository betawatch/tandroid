package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b {
    public final g7.h a;

    public b(g7.h hVar) {
        m.h(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        try {
            g7.h hVar = this.a;
            g7.h hVar2 = ((b) obj).a;
            g7.f fVar = (g7.f) hVar;
            Parcel M0 = fVar.M0();
            g7.b.c(M0, hVar2);
            Parcel L0 = fVar.L0(M0, 17);
            boolean z4 = L0.readInt() != 0;
            L0.recycle();
            return z4;
        } catch (RemoteException e) {
            throw new a7.b(e);
        }
    }

    public final int hashCode() {
        try {
            g7.f fVar = (g7.f) this.a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new a7.b(e);
        }
    }
}
