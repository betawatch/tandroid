package wi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import c8.id;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.l31;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class t0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public volatile boolean G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long M;
    public long N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public volatile p0 S;
    public volatile x T;
    public volatile File U;
    public l2.i0 V;
    public final h2.z Y;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final qt d;
    public final q0 e;
    public final ax f;
    public final j l;
    public final n m;
    public final r0 n;
    public final int o;
    public final o0 p;
    public final long q;
    public m0 r;
    public m0 s;
    public n0 t;
    public o0 u;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new h2.l0(9));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new h2.l0(10));
    public int Z = 1;
    public int a0 = 1;
    public float v = 1.0f;
    public long L = 1;
    public final i0 W = new i0(this, 0);
    public final tg.y X = new tg.y(this, 7);

    public t0(k0 k0Var) {
        qt qtVar = new qt(this, 25);
        this.Y = new h2.z(this, 3);
        u();
        Context context = k0Var.a;
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext == null ? context : applicationContext;
        this.a = context2;
        TextureView textureView = k0Var.b;
        this.b = textureView;
        File file = k0Var.c;
        this.c = file == null ? context2.getCacheDir() : file;
        this.r = k0Var.d;
        r0 r0Var = k0Var.e;
        this.n = r0Var;
        int i7 = k0Var.h;
        this.o = i7;
        n0 n0Var = k0Var.f;
        o0 o0Var = k0Var.g;
        this.p = o0Var;
        this.q = 60000L;
        boolean z9 = k0Var.i;
        this.d = k0Var.j;
        this.e = k0Var.k;
        this.f = k0Var.l;
        n nVar = new n();
        this.m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(r0Var.a);
        sb2.append("x");
        jg.g.x(sb2, r0Var.a, ", bitrate=", i7, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(o0Var.a);
        sb2.append(", composition=");
        sb2.append(z9);
        sb2.append(", facing=");
        sb2.append(this.r);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.l = new j(context2, textureView, r0Var, i7, n0Var, o0Var, z9, nVar, qtVar);
    }

    public static long f(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void u() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("RoundVideoSession must be used from the main thread");
        }
    }

    public final boolean a() {
        u();
        int i7 = this.Z;
        if (i7 == 10 || i7 == 8) {
            return false;
        }
        this.m.b("cancel requested: state=".concat(rf.b.t(i7)));
        b(3, true);
        e();
        s();
        w(10);
        if (!this.E && !this.l.Y()) {
            i();
            return true;
        }
        this.E = true;
        this.C = true;
        return true;
    }

    public final boolean b(int i7, boolean z9) {
        synchronized (this.g) {
            try {
                p0 p0Var = this.S;
                if (p0Var != null && p0Var.e && !z9) {
                    return false;
                }
                this.G = true;
                if (p0Var != null && !p0Var.d) {
                    p0Var.d = true;
                    this.m.b("output generation invalidated: id=" + p0Var.a + ", reason=" + rf.b.s(i7) + ", availableSize=" + p0Var.c);
                    this.k.execute(new h0(this, p0Var, i7, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z9) {
        synchronized (this.g) {
            g();
            File d = d("round_video_");
            long j3 = this.L;
            this.L = 1 + j3;
            p0 p0Var = new p0(j3, d);
            this.S = p0Var;
            this.T = new x(d, this.n.a, z9, this.m, new org.telegram.ui.web.a0(23, this, p0Var));
            this.m.b("output generation started: id=" + j3 + ", includeAudio=" + z9 + ", file=" + d.getName());
            this.k.execute(new l31(this, p0Var, d, 26));
        }
    }

    public final File d(String str) {
        File file = this.c;
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("Round-video output path is not a directory: " + file);
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create round-video output directory: " + file);
        }
        return File.createTempFile(str, ".mp4", file);
    }

    public final void e() {
        this.w = false;
        j jVar = this.l;
        jVar.U(0.0f);
        jVar.T(false);
        v(false);
    }

    public final void g() {
        if (this.G) {
            throw new IOException("Round-video operation was cancelled");
        }
    }

    public final void h(Exception exc) {
        int i7 = this.Z;
        if (i7 == 9 || i7 == 10) {
            return;
        }
        this.m.a("fatal error in state=".concat(rf.b.t(i7)), exc);
        if (b(4, false)) {
            e();
            s();
            this.i.removeCallbacks(this.W);
            p0 p0Var = this.S;
            if (p0Var != null) {
                this.k.execute(new h0(this, p0Var, exc));
            }
            w(9);
            m("error");
            n40 n40Var = (n40) this.d.b;
            n40Var.A();
            a8.g(exc, true);
            gy0 gy0Var = n40Var.S;
            if (gy0Var != null) {
                gy0Var.d(true);
            }
            n40Var.S = null;
            MediaController.B().Y(false);
            if (n40Var.f0) {
                n40Var.x(6);
            } else {
                qs.f(n40Var.f).k(qs.m2, Integer.valueOf(n40Var.h));
            }
            n40Var.z(false, false);
            if (!this.E && !this.l.Y()) {
                i();
            } else {
                this.E = true;
                this.C = true;
            }
        }
    }

    public final void i() {
        if (this.F) {
            return;
        }
        this.F = true;
        m("cancelled");
        i0 i0Var = new i0(this, 1);
        ExecutorService executorService = this.j;
        executorService.execute(i0Var);
        this.l.M();
        this.i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.k.shutdown();
    }

    public final long j() {
        u();
        if (this.Z != 3) {
            return this.H;
        }
        return Math.min(this.q, (SystemClock.elapsedRealtime() + this.H) - this.I);
    }

    public final void k(p0 p0Var, int i7) {
        synchronized (this.g) {
            try {
                if (!p0Var.d && !p0Var.e) {
                    p0Var.d = true;
                    this.m.b("output generation invalidated: id=" + p0Var.a + ", reason=" + rf.b.s(i7) + ", availableSize=" + p0Var.c);
                    this.k.execute(new h0(this, p0Var, i7, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j3 = this.N;
        if (j3 <= 0) {
            j3 = this.H;
        }
        return j3 > this.q || this.J > 0 || this.K + 10 < j3;
    }

    public final void m(String str) {
        if (this.R) {
            return;
        }
        this.R = true;
        p0 p0Var = this.S;
        n nVar = this.m;
        StringBuilder u10 = a8.p0.u("session summary: terminal=", str, ", state=");
        u10.append(rf.b.t(this.Z));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.O);
        u10.append(", resumes=");
        u10.append(this.P);
        u10.append(", cameraSwitches=");
        u10.append(this.Q);
        u10.append(", facing=");
        u10.append(this.s);
        u10.append(", cameraMode=");
        u10.append(this.t);
        u10.append(", generation=");
        u10.append(p0Var == null ? 0L : p0Var.a);
        u10.append(", availableSize=");
        u10.append(p0Var != null ? p0Var.c : 0L);
        nVar.b(u10.toString());
    }

    public final void n() {
        m0 m0Var = this.r;
        m0 m0Var2 = this.s;
        l0 l0Var = new l0(m0Var, m0Var2, this.a0, this.v);
        n40 n40Var = (n40) this.d.b;
        n40Var.R = l0Var;
        if (m0Var2 != null) {
            xi.e.j.b(m0Var2);
        }
        n40Var.B();
    }

    public final void o() {
        int i7 = this.Z;
        long j3 = this.H;
        long j10 = this.I;
        boolean z9 = this.z;
        boolean z10 = this.y;
        boolean z11 = this.w;
        long j11 = this.q;
        s0 s0Var = new s0(i7, j3, j10, j11, z9, z10, z11);
        n40 n40Var = (n40) this.d.b;
        s0 s0Var2 = n40Var.Q;
        int i10 = n40Var.f;
        int i11 = s0Var2 == null ? 0 : s0Var2.a;
        n40Var.Q = s0Var;
        if (i11 == 3 && i7 != 3) {
            n40Var.y(true);
        }
        n40Var.u0 = Math.max(n40Var.u0, j3);
        if (i7 == 3) {
            if (!n40Var.C0) {
                n40Var.C0 = true;
                qs.e().k(qs.j1, 512);
            }
            n40.n(n40Var);
            n40Var.setRecordingUiFrameClockActive(true);
            n40Var.D();
            if (!n40Var.f0) {
                n40Var.f0 = true;
                qs.f(i10).k(qs.l2, Integer.valueOf(n40Var.h), Boolean.FALSE);
            } else if (n40Var.g0) {
                n40Var.g0 = false;
                qs.f(i10).k(qs.p2, new Object[0]);
            }
        } else {
            n40Var.setRecordingUiFrameClockActive(false);
            n40Var.w.setProgress(j3 / j11);
        }
        if (i7 == 8 || i7 == 9 || i7 == 10) {
            n40Var.r();
            n40Var.A();
        }
        if (i11 == 3 && i7 == 4) {
            n40Var.x(2);
        }
        n40Var.B();
        if (n40Var.U != null && !n40Var.V) {
            org.telegram.messenger.g0.h3(new i40(n40Var, 1));
        }
        if (!z9 || n40Var.getWindowVisibility() == 0) {
            return;
        }
        org.telegram.messenger.g0.h3(new i40(n40Var, 2));
    }

    public final void p() {
        l2.i0 i0Var;
        u();
        if (this.Z != 5 || (i0Var = this.V) == null) {
            return;
        }
        i0Var.b();
        y(false);
        this.V.l();
        this.d.getClass();
    }

    public final void q() {
        u();
        if (this.Z != 3) {
            return;
        }
        this.H = j();
        this.O++;
        this.m.b("pause requested: durationMs=" + this.H);
        e();
        this.i.removeCallbacks(this.W);
        w(4);
        boolean Y = this.l.Y();
        this.E = Y;
        if (Y) {
            return;
        }
        h(new IllegalStateException("Unable to stop the camera segment"));
    }

    public final void r() {
        l2.i0 i0Var;
        u();
        if (this.Z != 5 || (i0Var = this.V) == null) {
            return;
        }
        long l10 = i0Var.l();
        long j3 = this.J;
        if (l10 < j3 || l10 >= this.K) {
            this.V.Z0(5, j3);
        }
        this.V.f();
        y(true);
    }

    public final void s() {
        this.i.removeCallbacks(this.X);
        this.z = false;
        l2.i0 i0Var = this.V;
        if (i0Var == null) {
            return;
        }
        i0Var.h0(this.Y);
        l2.i0 i0Var2 = this.V;
        i0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == i0Var2.X) {
            i0Var2.F1();
            i0Var2.s1();
            i0Var2.x1(null);
            i0Var2.q1(0, 0);
        }
        this.V.X0();
        this.V = null;
    }

    public final void t(File file, int i7, long j3, long j10, boolean z9, int i10) {
        long nanoTime = System.nanoTime();
        n nVar = this.m;
        StringBuilder t6 = a8.p0.t(j3, "final range remux started: range=", "..");
        t6.append(j10);
        t6.append(", includeAudio=");
        t6.append(z9);
        t6.append(", reason=");
        t6.append(rf.b.s(i10));
        nVar.b(t6.toString());
        g();
        k(this.S, i10);
        c(z9);
        g();
        x xVar = this.T;
        int i11 = i7;
        int i12 = this.n.a;
        int i13 = this.o;
        if (i11 <= 0) {
            i11 = this.p.a;
        }
        n2.p0 a10 = id.a(file, xVar, j3, j10, z9, new b7.d(i12, i13, i11));
        this.T.g();
        long h = this.T.h();
        n nVar2 = this.m;
        StringBuilder t10 = a8.p0.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t10.append(j10 - j3);
        t10.append(", actualStartMs=");
        t10.append(a10.a);
        t10.append(", mode=");
        t10.append((String) a10.c);
        t10.append(", size=");
        t10.append(this.T.a.length());
        t10.append(", elapsedMs=");
        t10.append(f(nanoTime));
        nVar2.b(t10.toString());
        g();
        this.k.execute(new g0(this, this.S, this.T.a, h, z9));
    }

    public final void v(boolean z9) {
        if (this.x == z9) {
            return;
        }
        this.x = z9;
        ax axVar = this.f;
        if (axVar != null) {
            ((n40) axVar.b).setScreenFlashEnabled(z9);
        }
    }

    public final void w(int i7) {
        int i10 = this.Z;
        this.Z = i7;
        this.m.b("state: " + rf.b.t(i10) + " -> " + rf.b.t(i7) + ", durationMs=" + j());
        o();
    }

    public final void x(float f10) {
        u();
        if (this.Z != 3 || this.y) {
            return;
        }
        this.l.U(Math.max(0.0f, Math.min(1.0f, f10)));
    }

    public final void y(boolean z9) {
        if (this.z == z9) {
            return;
        }
        this.z = z9;
        Handler handler = this.i;
        tg.y yVar = this.X;
        handler.removeCallbacks(yVar);
        if (z9) {
            handler.post(yVar);
        }
        this.d.getClass();
        o();
    }
}
