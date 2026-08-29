package v7;

import android.os.Parcel;
import android.os.RemoteException;
import e7.i;
import org.telegram.ui.Components.n;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f {
    public final e7.a a;

    public f(e7.a aVar) {
        l.h(aVar);
        this.a = aVar;
    }

    public final void a(n nVar) {
        e7.a aVar = this.a;
        try {
            j6.a aVar2 = (j6.a) nVar.b;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            e7.b.c(M0, aVar2);
            iVar.Q0(M0, 18);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            e7.a aVar = this.a;
            e7.a aVar2 = ((f) obj).a;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            e7.b.c(M0, aVar2);
            Parcel L0 = iVar.L0(M0, 16);
            boolean z10 = L0.readInt() != 0;
            L0.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new a6.b(e10);
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
            throw new a6.b(e10);
        }
    }
}
