// default package

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ti2 {
    public final kye a;

    public ti2(kye kyeVar) {
        ite.h(kyeVar);
        this.a = kyeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ti2)) {
            return false;
        }
        try {
            kye kyeVar = this.a;
            kye kyeVar2 = ((ti2) obj).a;
            roe roeVar = (roe) kyeVar;
            Parcel R = roeVar.R();
            tid.c(R, kyeVar2);
            Parcel Q = roeVar.Q(R, 17);
            boolean z = Q.readInt() != 0;
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            i2d.h(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            roe roeVar = (roe) this.a;
            Parcel Q = roeVar.Q(roeVar.R(), 18);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            i2d.h(e);
            return 0;
        }
    }
}
