package q5;

import c2.u0;
import com.google.android.gms.common.api.internal.q1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.fm;
import x5.a0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v extends g {
    public final AtomicReference b;
    public final u0 c;

    public v(w wVar) {
        this.b = new AtomicReference(wVar);
        this.c = new u0(wVar.r, 1);
    }

    @Override // q5.h
    public final void A0(String str, byte[] bArr) {
        if (((w) this.b.get()) == null) {
            return;
        }
        w.j0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // q5.h
    public final void L(m5.d dVar, String str, String str2, boolean z10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        wVar.Q = dVar;
        wVar.f0 = dVar.a;
        wVar.g0 = str2;
        wVar.X = str;
        synchronized (w.k0) {
        }
    }

    @Override // q5.h
    public final void M(int i9) {
        w wVar = null;
        w wVar2 = (w) this.b.getAndSet(null);
        if (wVar2 != null) {
            wVar2.d0 = -1;
            wVar2.e0 = -1;
            wVar2.Q = null;
            wVar2.X = null;
            wVar2.b0 = 0.0d;
            wVar2.I();
            wVar2.Y = false;
            wVar2.c0 = null;
            wVar = wVar2;
        }
        if (wVar == null) {
            return;
        }
        w.j0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i9));
        if (i9 != 0) {
            int i10 = wVar.N.get();
            a0 a0Var = wVar.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i10, 2));
        }
    }

    @Override // q5.h
    public final void P(String str, String str2) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.j0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new q1(wVar, str, str2, false, 13));
    }

    @Override // q5.h
    public final void T(int i9) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.k0) {
        }
    }

    @Override // q5.h
    public final void V(long j10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, 0);
    }

    @Override // q5.h
    public final void c(int i9) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.l0) {
        }
    }

    @Override // q5.h
    public final void v(d dVar) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.j0.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new fm(wVar, dVar, false, 3));
    }

    @Override // q5.h
    public final void v0(c cVar) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.j0.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new fm(wVar, cVar, false, 4));
    }

    @Override // q5.h
    public final void zzd(int i9) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        wVar.f0 = null;
        wVar.g0 = null;
        synchronized (w.l0) {
        }
        if (wVar.S != null) {
            this.c.post(new androidx.emoji2.text.i(wVar, i9, 4));
        }
    }

    @Override // q5.h
    public final void zzg(int i9) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.l0) {
        }
    }

    @Override // q5.h
    public final void zzm(int i9, long j10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, i9);
    }

    @Override // q5.h
    public final void zzn() {
        w.j0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // q5.h
    public final void d(int i9) {
    }

    @Override // q5.h
    public final void u0(int i9) {
    }
}
