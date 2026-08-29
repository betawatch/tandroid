package p5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g {
    public static final s5.b c = new s5.b("SessionManager", null);
    public final y a;
    public final Context b;

    public g(y yVar, Context context) {
        this.a = yVar;
        this.b = context;
    }

    public final void a(h hVar) {
        z5.l.e("Must be called from the main thread.");
        try {
            y yVar = this.a;
            z zVar = new z(hVar);
            Parcel M0 = yVar.M0();
            com.google.android.gms.internal.cast.u.d(M0, zVar);
            yVar.Q0(M0, 2);
        } catch (RemoteException e10) {
            c.a(e10, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        s5.b bVar = c;
        z5.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.a, bVar.d("End session for %s", this.b.getPackageName()));
            y yVar = this.a;
            Parcel M0 = yVar.M0();
            int i10 = com.google.android.gms.internal.cast.u.a;
            M0.writeInt(1);
            M0.writeInt(z10 ? 1 : 0);
            yVar.Q0(M0, 6);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        z5.l.e("Must be called from the main thread.");
        f d = d();
        if (d == null || !(d instanceof c)) {
            return null;
        }
        return (c) d;
    }

    public final f d() {
        z5.l.e("Must be called from the main thread.");
        try {
            y yVar = this.a;
            Parcel O0 = yVar.O0(yVar.M0(), 1);
            j6.a J0 = j6.b.J0(O0.readStrongBinder());
            O0.recycle();
            return (f) j6.b.K0(J0);
        } catch (RemoteException e10) {
            c.a(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
