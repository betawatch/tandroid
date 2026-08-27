package r5;

import c2.t0;
import com.google.android.gms.common.api.internal.q1;
import java.util.concurrent.atomic.AtomicReference;
import y5.a0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v extends g {
    public final AtomicReference b;
    public final t0 c;

    public v(w wVar) {
        this.b = new AtomicReference(wVar);
        this.c = new t0(wVar.r, 1);
    }

    @Override // r5.h
    public final void A0(String str, byte[] bArr) {
        if (((w) this.b.get()) == null) {
            return;
        }
        w.j0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // r5.h
    public final void D(d dVar) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.j0.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new o0.m(4, wVar, dVar));
    }

    @Override // r5.h
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

    @Override // r5.h
    public final void M(int i10) {
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
        w.j0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
        if (i10 != 0) {
            int i11 = wVar.N.get();
            a0 a0Var = wVar.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
        }
    }

    @Override // r5.h
    public final void P(String str, String str2) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.j0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new q1(wVar, str, str2, false, 13));
    }

    @Override // r5.h
    public final void T(int i10) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.k0) {
        }
    }

    @Override // r5.h
    public final void V(long j10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, 0);
    }

    @Override // r5.h
    public final void c(int i10) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.l0) {
        }
    }

    @Override // r5.h
    public final void y(c cVar) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.j0.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new o0.m(5, wVar, cVar));
    }

    @Override // r5.h
    public final void zzd(int i10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        wVar.f0 = null;
        wVar.g0 = null;
        synchronized (w.l0) {
        }
        if (wVar.S != null) {
            this.c.post(new androidx.emoji2.text.j(wVar, i10, 4));
        }
    }

    @Override // r5.h
    public final void zzg(int i10) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.l0) {
        }
    }

    @Override // r5.h
    public final void zzm(int i10, long j10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, i10);
    }

    @Override // r5.h
    public final void zzn() {
        w.j0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // r5.h
    public final void d(int i10) {
    }

    @Override // r5.h
    public final void w0(int i10) {
    }
}
