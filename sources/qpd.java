// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qpd extends e1d {
    public hh0 b;
    public final int c;

    public qpd(hh0 hh0Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 6);
        this.b = hh0Var;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r5.a >= r9.a) goto L24;
     */
    @Override // e1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) nid.a(parcel, Bundle.CREATOR);
            nid.c(parcel);
            ite.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.u(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i == 2) {
            parcel.readInt();
            nid.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            ape apeVar = (ape) nid.a(parcel, ape.CREATOR);
            nid.c(parcel);
            hh0 hh0Var = this.b;
            ite.i(hh0Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            ite.h(apeVar);
            hh0Var.B = apeVar;
            if (hh0Var.x()) {
                qt2 qt2Var = apeVar.d;
                nl9 C0 = nl9.C0();
                ol9 ol9Var = qt2Var == null ? null : qt2Var.a;
                synchronized (C0) {
                    if (ol9Var == null) {
                        ol9Var = nl9.d;
                    } else {
                        ol9 ol9Var2 = (ol9) C0.b;
                        if (ol9Var2 != null) {
                        }
                    }
                    C0.b = ol9Var;
                }
            }
            Bundle bundle2 = apeVar.a;
            ite.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.u(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
