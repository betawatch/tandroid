package r5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g {
    public static final u5.b c = new u5.b("SessionManager", null);
    public final y a;
    public final Context b;

    public g(y yVar, Context context) {
        this.a = yVar;
        this.b = context;
    }

    public final void a(h hVar) {
        b6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.a;
            z zVar = new z(hVar);
            Parcel M0 = yVar.M0();
            com.google.android.gms.internal.cast.s.d(M0, zVar);
            yVar.Q0(M0, 2);
        } catch (RemoteException e6) {
            c.a(e6, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z4) {
        u5.b bVar = c;
        b6.m.e("Must be called from the main thread.");
        try {
            Log.i(bVar.a, bVar.d("End session for %s", this.b.getPackageName()));
            y yVar = this.a;
            Parcel M0 = yVar.M0();
            int i10 = com.google.android.gms.internal.cast.s.a;
            M0.writeInt(1);
            M0.writeInt(z4 ? 1 : 0);
            yVar.Q0(M0, 6);
        } catch (RemoteException e6) {
            bVar.a(e6, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        b6.m.e("Must be called from the main thread.");
        f d = d();
        if (d == null || !(d instanceof c)) {
            return null;
        }
        return (c) d;
    }

    public final f d() {
        b6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.a;
            Parcel O0 = yVar.O0(yVar.M0(), 1);
            l6.a J0 = l6.b.J0(O0.readStrongBinder());
            O0.recycle();
            return (f) l6.b.K0(J0);
        } catch (RemoteException e6) {
            c.a(e6, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
