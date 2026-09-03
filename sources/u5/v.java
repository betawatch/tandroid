package u5;

import b6.b0;
import com.google.android.gms.common.api.internal.s1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class v extends g {
    public final AtomicReference b;
    public final a7.e c;

    public v(w wVar) {
        this.b = new AtomicReference(wVar);
        this.c = new a7.e(wVar.r, 2);
    }

    @Override // u5.h
    public final void I(int i10) {
        w wVar = null;
        w wVar2 = (w) this.b.getAndSet(null);
        if (wVar2 != null) {
            wVar2.e0 = -1;
            wVar2.f0 = -1;
            wVar2.R = null;
            wVar2.Y = null;
            wVar2.c0 = 0.0d;
            wVar2.I();
            wVar2.Z = false;
            wVar2.d0 = null;
            wVar = wVar2;
        }
        if (wVar == null) {
            return;
        }
        w.k0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
        if (i10 != 0) {
            int i11 = wVar.O.get();
            b0 b0Var = wVar.v;
            b0Var.sendMessage(b0Var.obtainMessage(6, i11, 2));
        }
    }

    @Override // u5.h
    public final void L(d dVar) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.k0.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new zy(wVar, dVar, false, 8));
    }

    @Override // u5.h
    public final void M(String str, String str2) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.k0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new s1(wVar, str, str2, false, 13));
    }

    @Override // u5.h
    public final void U(int i10) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.l0) {
        }
    }

    @Override // u5.h
    public final void W(long j10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, 0);
    }

    @Override // u5.h
    public final void c(int i10) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.m0) {
        }
    }

    @Override // u5.h
    public final void n0(c cVar) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.k0.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new zy(wVar, cVar, false, 9));
    }

    @Override // u5.h
    public final void t0(q5.d dVar, String str, String str2, boolean z4) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        wVar.R = dVar;
        wVar.g0 = dVar.a;
        wVar.h0 = str2;
        wVar.Y = str;
        synchronized (w.l0) {
        }
    }

    @Override // u5.h
    public final void z0(String str, byte[] bArr) {
        if (((w) this.b.get()) == null) {
            return;
        }
        w.k0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // u5.h
    public final void zzd(int i10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        wVar.g0 = null;
        wVar.h0 = null;
        synchronized (w.m0) {
        }
        if (wVar.T != null) {
            this.c.post(new androidx.emoji2.text.j(wVar, i10, 4));
        }
    }

    @Override // u5.h
    public final void zzg(int i10) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.m0) {
        }
    }

    @Override // u5.h
    public final void zzm(int i10, long j10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, i10);
    }

    @Override // u5.h
    public final void zzn() {
        w.k0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // u5.h
    public final void d(int i10) {
    }

    @Override // u5.h
    public final void u0(int i10) {
    }
}
