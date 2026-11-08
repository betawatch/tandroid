package q6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d0 extends a8.q {
    public d b;
    public final int c;

    public d0(d dVar, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 9);
        this.b = dVar;
        this.c = i7;
    }

    @Override // a8.q
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) p7.g.a(parcel, Bundle.CREATOR);
            p7.g.c(parcel);
            m.h(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.w(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i7 == 2) {
            parcel.readInt();
            p7.g.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i7 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            h0 h0Var = (h0) p7.g.a(parcel, h0.CREATOR);
            p7.g.c(parcel);
            d dVar = this.b;
            m.h(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            m.g(h0Var);
            dVar.B = h0Var;
            if (dVar.x()) {
                f fVar = h0Var.d;
                n a10 = n.a();
                o oVar = fVar == null ? null : fVar.a;
                synchronized (a10) {
                    if (oVar == null) {
                        oVar = n.c;
                    } else {
                        o oVar2 = (o) a10.a;
                        if (oVar2 != null) {
                            if (oVar2.a < oVar.a) {
                            }
                        }
                    }
                    a10.a = oVar;
                }
            }
            Bundle bundle2 = h0Var.a;
            m.h(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.w(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
