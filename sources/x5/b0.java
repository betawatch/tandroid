package x5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 extends a7.a {
    public g b;
    public final int c;

    public b0(g gVar, int i9) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 11);
        this.b = gVar;
        this.c = i9;
    }

    @Override // a7.a
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) w6.a.a(parcel, Bundle.CREATOR);
            w6.a.b(parcel);
            l.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i9 == 2) {
            parcel.readInt();
            w6.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i9 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            f0 f0Var = (f0) w6.a.a(parcel, f0.CREATOR);
            w6.a.b(parcel);
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
