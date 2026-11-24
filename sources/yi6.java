// default package

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yi6 {
    public final i5d a;

    public yi6(i5d i5dVar) {
        fre.h(i5dVar);
        this.a = i5dVar;
    }

    public final void a(lj9 lj9Var) {
        i5d i5dVar = this.a;
        try {
            yi5 yi5Var = (yi5) lj9Var.b;
            rhf rhfVar = (rhf) i5dVar;
            Parcel R = rhfVar.R();
            sgd.c(R, yi5Var);
            rhfVar.V(R, 18);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yi6)) {
            return false;
        }
        try {
            i5d i5dVar = this.a;
            i5d i5dVar2 = ((yi6) obj).a;
            rhf rhfVar = (rhf) i5dVar;
            Parcel R = rhfVar.R();
            sgd.c(R, i5dVar2);
            Parcel Q = rhfVar.Q(R, 16);
            boolean z = Q.readInt() != 0;
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            fvc.g(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            rhf rhfVar = (rhf) this.a;
            Parcel Q = rhfVar.Q(rhfVar.R(), 17);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            fvc.g(e);
            return 0;
        }
    }
}
