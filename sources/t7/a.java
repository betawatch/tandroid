package t7;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final c7.h a;

    public a(c7.h hVar) {
        l.h(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            c7.h hVar = this.a;
            c7.h hVar2 = ((a) obj).a;
            c7.f fVar = (c7.f) hVar;
            Parcel M0 = fVar.M0();
            c7.b.c(M0, hVar2);
            Parcel L0 = fVar.L0(M0, 17);
            boolean z10 = L0.readInt() != 0;
            L0.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final int hashCode() {
        try {
            c7.f fVar = (c7.f) this.a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }
}
