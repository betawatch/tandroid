package p6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 extends com.google.android.gms.internal.cast.o {
    public d b;
    public final int c;

    public d0(d dVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.b = dVar;
        this.c = i3;
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) o7.g.a(parcel, Bundle.CREATOR);
            o7.g.c(parcel);
            m.h(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.v(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i3 == 2) {
            parcel.readInt();
            o7.g.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            h0 h0Var = (h0) o7.g.a(parcel, h0.CREATOR);
            o7.g.c(parcel);
            d dVar = this.b;
            m.h(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            m.g(h0Var);
            dVar.B = h0Var;
            if (dVar.w()) {
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
            this.b.v(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
