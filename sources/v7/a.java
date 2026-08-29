package v7;

import android.os.Parcel;
import android.os.RemoteException;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public final e7.h a;

    public a(e7.h hVar) {
        l.h(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            e7.h hVar = this.a;
            e7.h hVar2 = ((a) obj).a;
            e7.f fVar = (e7.f) hVar;
            Parcel M0 = fVar.M0();
            e7.b.c(M0, hVar2);
            Parcel L0 = fVar.L0(M0, 17);
            boolean z10 = L0.readInt() != 0;
            L0.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }

    public final int hashCode() {
        try {
            e7.f fVar = (e7.f) this.a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }
}
