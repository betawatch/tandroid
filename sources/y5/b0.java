package y5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b0 extends b7.a {
    public g b;
    public final int c;

    public b0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 11);
        this.b = gVar;
        this.c = i10;
    }

    @Override // b7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) x6.a.a(parcel, Bundle.CREATOR);
            x6.a.b(parcel);
            l.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            x6.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            f0 f0Var = (f0) x6.a.a(parcel, f0.CREATOR);
            x6.a.b(parcel);
            g gVar = this.b;
            l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            l.h(f0Var);
            gVar.M = f0Var;
            if (gVar.C()) {
                e eVar = f0Var.d;
                m a2 = m.a();
                n nVar = eVar == null ? null : eVar.a;
                synchronized (a2) {
                    if (nVar == null) {
                        nVar = m.c;
                    } else {
                        n nVar2 = (n) a2.a;
                        if (nVar2 != null) {
                            if (nVar2.a < nVar.a) {
                            }
                        }
                    }
                    a2.a = nVar;
                }
            }
            Bundle bundle2 = f0Var.a;
            l.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
