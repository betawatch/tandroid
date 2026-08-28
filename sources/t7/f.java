package t7;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import c7.i;
import m5.c0;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public final c7.a a;

    public f(c7.a aVar) {
        l.h(aVar);
        this.a = aVar;
    }

    public final void a(c0 c0Var) {
        c7.a aVar = this.a;
        try {
            h6.a aVar2 = (h6.a) c0Var.b;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            c7.b.c(M0, aVar2);
            iVar.Q0(M0, 18);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            c7.a aVar = this.a;
            c7.a aVar2 = ((f) obj).a;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            c7.b.c(M0, aVar2);
            Parcel L0 = iVar.L0(M0, 16);
            boolean z10 = L0.readInt() != 0;
            L0.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }
}
