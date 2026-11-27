// default package

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xh2 {
    public final z0f a;

    public xh2(z0f z0fVar) {
        xve.h(z0fVar);
        this.a = z0fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xh2)) {
            return false;
        }
        try {
            z0f z0fVar = this.a;
            z0f z0fVar2 = ((xh2) obj).a;
            fre freVar = (fre) z0fVar;
            Parcel R = freVar.R();
            jld.c(R, z0fVar2);
            Parcel Q = freVar.Q(R, 17);
            boolean z = Q.readInt() != 0;
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            p3d.i(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            fre freVar = (fre) this.a;
            Parcel Q = freVar.Q(freVar.R(), 18);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            p3d.i(e);
            return 0;
        }
    }
}
