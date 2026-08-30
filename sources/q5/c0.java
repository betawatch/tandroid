package q5;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c0(d0 d0Var, int i10, int i11) {
        this.a = i11;
        this.b = d0Var;
        this.c = i10;
    }

    private final void a() {
        d0 d0Var = this.b;
        e0 e0Var = d0Var.b;
        e0Var.x = -1;
        e0Var.y = -1;
        e0Var.t = null;
        e0Var.u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.w = false;
        e0Var.z = null;
        e0 e0Var2 = d0Var.b;
        e0Var2.F = 1;
        int i10 = this.c;
        synchronized (e0Var2.E) {
            try {
                Iterator it = d0Var.b.E.iterator();
                while (it.hasNext()) {
                    r5.q qVar = ((r5.i) it.next()).a.e;
                    if (qVar != null) {
                        try {
                            y5.a aVar = new y5.a(i10);
                            r5.o oVar = (r5.o) qVar;
                            Parcel M0 = oVar.M0();
                            com.google.android.gms.internal.cast.t.c(M0, aVar);
                            oVar.Q0(M0, 3);
                        } catch (RemoteException e) {
                            r5.c.m.a(e, "Unable to call %s on %s.", "onDisconnected", r5.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.b.h();
        e0 e0Var3 = d0Var.b;
        com.google.android.gms.common.api.internal.n nVar = androidx.biometric.f0.f(e0Var3.f, e0Var3.k, "castDeviceControllerListenerKey").c;
        b6.m.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        Iterator it;
        d0 d0Var = this.b;
        int i10 = this.c;
        if (i10 == 0) {
            e0 e0Var = d0Var.b;
            e0Var.F = 2;
            e0Var.m = true;
            e0Var.n = true;
            synchronized (e0Var.E) {
                try {
                    Iterator it2 = d0Var.b.E.iterator();
                    while (it2.hasNext()) {
                        ((r5.i) it2.next()).a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
                it = d0Var.b.E.iterator();
            } catch (RemoteException e) {
                r5.c.m.a(e, "Unable to call %s on %s.", "onConnectionFailed", r5.q.class.getSimpleName());
            } finally {
            }
            while (it.hasNext()) {
                r5.q qVar = ((r5.i) it.next()).a.e;
                if (qVar != null) {
                    y5.a aVar = new y5.a(i10);
                    r5.o oVar = (r5.o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.t.c(M0, aVar);
                    oVar.Q0(M0, 3);
                }
            }
        }
        d0Var.b.h();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.b.b.D.b(this.c);
                return;
            default:
                d0 d0Var = this.b;
                e0 e0Var = d0Var.b;
                e0Var.F = 3;
                int i10 = this.c;
                synchronized (e0Var.E) {
                    try {
                        Iterator it = d0Var.b.E.iterator();
                        while (it.hasNext()) {
                            r5.q qVar = ((r5.i) it.next()).a.e;
                            if (qVar != null) {
                                try {
                                    r5.o oVar = (r5.o) qVar;
                                    Parcel M0 = oVar.M0();
                                    M0.writeInt(i10);
                                    oVar.Q0(M0, 2);
                                } catch (RemoteException e) {
                                    r5.c.m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", r5.q.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
