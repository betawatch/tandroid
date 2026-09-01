package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a {
    public final g7.h a;

    public a(g7.h hVar) {
        m.h(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            g7.h hVar = this.a;
            g7.h hVar2 = ((a) obj).a;
            g7.f fVar = (g7.f) hVar;
            Parcel M0 = fVar.M0();
            g7.b.c(M0, hVar2);
            Parcel L0 = fVar.L0(M0, 17);
            boolean z4 = L0.readInt() != 0;
            L0.recycle();
            return z4;
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }

    public final int hashCode() {
        try {
            g7.f fVar = (g7.f) this.a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }
}
