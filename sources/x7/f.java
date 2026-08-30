package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
import g7.i;
import ph.j5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f {
    public final g7.a a;

    public f(g7.a aVar) {
        m.h(aVar);
        this.a = aVar;
    }

    public final void a(j5 j5Var) {
        g7.a aVar = this.a;
        try {
            l6.a aVar2 = (l6.a) j5Var.b;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, aVar2);
            iVar.Q0(M0, 18);
        } catch (RemoteException e) {
            throw new a7.b(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            g7.a aVar = this.a;
            g7.a aVar2 = ((f) obj).a;
            i iVar = (i) aVar;
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
            i iVar = (i) this.a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new a7.b(e);
        }
    }
}
