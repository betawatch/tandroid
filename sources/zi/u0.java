package zi;

import ai.z0;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import c8.oe;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.w40;
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class u0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public volatile boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public volatile q0 T;
    public volatile x U;
    public volatile File V;
    public l2.f0 W;
    public final h2.z Z;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final qf d;
    public final r0 e;
    public final ky f;
    public final k l;
    public final o m;
    public final s0 n;
    public final int o;
    public final p0 p;
    public final long q;
    public n0 r;
    public n0 s;
    public o0 t;
    public p0 u;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new z0(11));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new z0(12));
    public int a0 = 1;
    public int b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final i0 X = new i0(this, 0);
    public final s4.s0 Y = new s4.s0(this, 10);

    public u0(l0 l0Var) {
        k0 k0Var = new k0(this);
        this.Z = new h2.z(this, 3);
        v();
        Context context = l0Var.a;
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext == null ? context : applicationContext;
        this.a = context2;
        TextureView textureView = l0Var.b;
        this.b = textureView;
        File file = l0Var.c;
        this.c = file == null ? context2.getCacheDir() : file;
        this.r = l0Var.d;
        s0 s0Var = l0Var.e;
        this.n = s0Var;
        int i7 = l0Var.h;
        this.o = i7;
        o0 o0Var = l0Var.f;
        p0 p0Var = l0Var.g;
        this.p = p0Var;
        this.q = 60000L;
        boolean z10 = l0Var.i;
        this.d = l0Var.j;
        this.e = l0Var.k;
        this.f = l0Var.l;
        o oVar = new o();
        this.m = oVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(s0Var.a);
        sb2.append("x");
        i5.c.z(sb2, s0Var.a, ", bitrate=", i7, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.r);
        sb2.append(", maxDurationMs=60000");
        oVar.b(sb2.toString());
        this.l = new k(context2, textureView, s0Var, i7, o0Var, p0Var, z10, oVar, k0Var);
    }

    public static long f(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void v() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("RoundVideoSession must be used from the main thread");
        }
    }

    public final boolean a() {
        v();
        int i7 = this.a0;
        if (i7 == 10 || i7 == 8) {
            return false;
        }
        this.m.b("cancel requested: state=".concat(yi.i.e(i7)));
        b(3, true);
        e();
        t();
        x(10);
        if (!this.E && !this.l.W()) {
            i();
            return true;
        }
        this.E = true;
        this.C = true;
        return true;
    }

    public final boolean b(int i7, boolean z10) {
        synchronized (this.g) {
            try {
                q0 q0Var = this.T;
                if (q0Var != null && q0Var.e && !z10) {
                    return false;
                }
                this.H = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    this.m.b("output generation invalidated: id=" + q0Var.a + ", reason=" + yi.i.d(i7) + ", availableSize=" + q0Var.c);
                    this.k.execute(new h0(this, q0Var, i7, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.g) {
            g();
            File d = d("round_video_");
            long j3 = this.M;
            this.M = 1 + j3;
            q0 q0Var = new q0(j3, d);
            this.T = q0Var;
            this.U = new x(d, this.n.a, z10, this.m, new wc1(29, this, q0Var));
            this.m.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new wg.p(this, q0Var, d, 9));
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
        k kVar = this.l;
        kVar.T(0.0f);
        kVar.S(false);
        w(false);
    }

    public final void g() {
        if (this.H) {
            throw new IOException("Round-video operation was cancelled");
        }
    }

    public final void h(Exception exc) {
        int i7 = this.a0;
        if (i7 == 9 || i7 == 10) {
            return;
        }
        this.m.a("fatal error in state=".concat(yi.i.e(i7)), exc);
        if (b(4, false)) {
            e();
            t();
            this.i.removeCallbacks(this.X);
            q0 q0Var = this.T;
            if (q0Var != null) {
                this.k.execute(new h0(this, q0Var, exc));
            }
            x(9);
            m("error");
            b50 b50Var = (b50) this.d.b;
            b50Var.C();
            a8.g(exc, true);
            sy0 sy0Var = b50Var.T;
            if (sy0Var != null) {
                sy0Var.d(true);
            }
            b50Var.T = null;
            if (b50Var.a0) {
                b50Var.a0 = false;
                b50Var.P = null;
            } else {
                MediaController.B().Y(false);
                if (b50Var.h0) {
                    b50Var.z(6);
                } else {
                    ls.f(b50Var.f).k(ls.m2, Integer.valueOf(b50Var.h));
                }
                b50Var.B(false, false);
            }
            if (!this.E && !this.l.W()) {
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
        this.l.K();
        this.i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.k.shutdown();
    }

    public final long j() {
        v();
        if (this.a0 != 3) {
            return this.I;
        }
        return Math.min(this.q, (SystemClock.elapsedRealtime() + this.I) - this.J);
    }

    public final void k(q0 q0Var, int i7) {
        synchronized (this.g) {
            try {
                if (!q0Var.d && !q0Var.e) {
                    q0Var.d = true;
                    this.m.b("output generation invalidated: id=" + q0Var.a + ", reason=" + yi.i.d(i7) + ", availableSize=" + q0Var.c);
                    this.k.execute(new h0(this, q0Var, i7, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j3 = this.O;
        if (j3 <= 0) {
            j3 = this.I;
        }
        return j3 > this.q || this.K > 0 || this.L + 10 < j3;
    }

    public final void m(String str) {
        if (this.S) {
            return;
        }
        this.S = true;
        q0 q0Var = this.T;
        o oVar = this.m;
        StringBuilder u10 = a8.p0.u("session summary: terminal=", str, ", state=");
        u10.append(yi.i.e(this.a0));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.P);
        u10.append(", resumes=");
        u10.append(this.Q);
        u10.append(", cameraSwitches=");
        u10.append(this.R);
        u10.append(", facing=");
        u10.append(this.s);
        u10.append(", cameraMode=");
        u10.append(this.t);
        u10.append(", generation=");
        u10.append(q0Var == null ? 0L : q0Var.a);
        u10.append(", availableSize=");
        u10.append(q0Var != null ? q0Var.c : 0L);
        oVar.b(u10.toString());
    }

    public final void n() {
        n0 n0Var = this.r;
        n0 n0Var2 = this.s;
        m0 m0Var = new m0(n0Var, n0Var2, this.b0, this.v);
        b50 b50Var = (b50) this.d.b;
        b50Var.S = m0Var;
        if (n0Var2 != null) {
            aj.e.j.b(n0Var2);
        }
        b50Var.D();
    }

    public final void o() {
        int i7 = this.a0;
        long j3 = this.I;
        long j10 = this.J;
        boolean z10 = this.z;
        boolean z11 = this.y;
        boolean z12 = this.w;
        long j11 = this.q;
        t0 t0Var = new t0(i7, j3, j10, j11, z10, z11, z12);
        b50 b50Var = (b50) this.d.b;
        t0 t0Var2 = b50Var.R;
        int i10 = b50Var.f;
        int i11 = t0Var2 == null ? 0 : t0Var2.a;
        b50Var.R = t0Var;
        if (i11 == 3 && i7 != 3) {
            b50Var.A(true);
        }
        b50Var.w0 = Math.max(b50Var.w0, j3);
        if (i7 == 3) {
            if (!b50Var.E0) {
                b50Var.E0 = true;
                ls.e().k(ls.j1, 512);
            }
            b50.o(b50Var);
            b50Var.setRecordingUiFrameClockActive(true);
            b50Var.F();
            if (!b50Var.h0) {
                b50Var.h0 = true;
                ls.f(i10).k(ls.l2, Integer.valueOf(b50Var.h), Boolean.FALSE);
            } else if (b50Var.i0) {
                b50Var.i0 = false;
                ls.f(i10).k(ls.p2, new Object[0]);
            }
        } else {
            b50Var.setRecordingUiFrameClockActive(false);
            b50Var.w.setProgress(j3 / j11);
        }
        if (i7 == 8 || i7 == 9 || i7 == 10) {
            b50Var.s();
            b50Var.C();
        }
        if (i11 == 3 && i7 == 4) {
            b50Var.z(2);
        }
        b50Var.D();
        if (b50Var.V != null && !b50Var.W) {
            org.telegram.messenger.g0.g3(new w40(b50Var, 1));
        }
        if (!z10 || b50Var.getWindowVisibility() == 0) {
            return;
        }
        org.telegram.messenger.g0.g3(new w40(b50Var, 2));
    }

    public final void p() {
        l2.f0 f0Var;
        v();
        if (this.a0 != 5 || (f0Var = this.W) == null) {
            return;
        }
        f0Var.b();
        z(false);
        this.W.l();
        this.d.getClass();
    }

    public final void q() {
        v();
        if (this.a0 != 3) {
            return;
        }
        this.I = j();
        this.P++;
        this.m.b("pause requested: durationMs=" + this.I);
        e();
        this.i.removeCallbacks(this.X);
        x(4);
        boolean W = this.l.W();
        this.E = W;
        if (W) {
            return;
        }
        h(new IllegalStateException("Unable to stop the camera segment"));
    }

    public final void r() {
        l2.f0 f0Var;
        v();
        if (this.a0 != 5 || (f0Var = this.W) == null) {
            return;
        }
        long l10 = f0Var.l();
        long j3 = this.K;
        if (l10 < j3 || l10 >= this.L) {
            this.W.Z0(5, j3);
        }
        this.W.f();
        z(true);
    }

    public final void s() {
        v();
        int i7 = this.a0;
        if (i7 == 10) {
            if (this.F) {
                return;
            }
            i();
            return;
        }
        if (i7 == 7) {
            if (this.G) {
                return;
            }
            this.G = true;
            this.m.b("release deferred: output is still finishing");
            e();
            t();
            return;
        }
        if (i7 != 8) {
            a();
            return;
        }
        e();
        t();
        this.l.K();
        this.F = true;
        x(10);
        m("released");
        this.i.removeCallbacksAndMessages(null);
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void t() {
        this.i.removeCallbacks(this.Y);
        this.z = false;
        l2.f0 f0Var = this.W;
        if (f0Var == null) {
            return;
        }
        f0Var.h0(this.Z);
        l2.f0 f0Var2 = this.W;
        f0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == f0Var2.X) {
            f0Var2.F1();
            f0Var2.s1();
            f0Var2.x1(null);
            f0Var2.q1(0, 0);
        }
        this.W.X0();
        this.W = null;
    }

    public final void u(File file, int i7, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        o oVar = this.m;
        StringBuilder t6 = a8.p0.t(j3, "final range remux started: range=", "..");
        t6.append(j10);
        t6.append(", includeAudio=");
        t6.append(z10);
        t6.append(", reason=");
        t6.append(yi.i.d(i10));
        oVar.b(t6.toString());
        g();
        k(this.T, i10);
        c(z10);
        g();
        x xVar = this.U;
        int i11 = i7;
        int i12 = this.n.a;
        int i13 = this.o;
        if (i11 <= 0) {
            i11 = this.p.a;
        }
        n2.q0 a10 = oe.a(file, xVar, j3, j10, z10, new b7.d(i12, i13, i11));
        this.U.g();
        long h = this.U.h();
        o oVar2 = this.m;
        StringBuilder t10 = a8.p0.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t10.append(j10 - j3);
        t10.append(", actualStartMs=");
        t10.append(a10.a);
        t10.append(", mode=");
        t10.append((String) a10.c);
        t10.append(", size=");
        t10.append(this.U.a.length());
        t10.append(", elapsedMs=");
        t10.append(f(nanoTime));
        oVar2.b(t10.toString());
        g();
        this.k.execute(new g0(this, this.T, this.U.a, h, z10));
    }

    public final void w(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        ky kyVar = this.f;
        if (kyVar != null) {
            ((b50) kyVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void x(int i7) {
        int i10 = this.a0;
        this.a0 = i7;
        this.m.b("state: " + yi.i.e(i10) + " -> " + yi.i.e(i7) + ", durationMs=" + j());
        o();
    }

    public final void y(float f10) {
        v();
        if (this.a0 != 3 || this.y) {
            return;
        }
        this.l.T(Math.max(0.0f, Math.min(1.0f, f10)));
    }

    public final void z(boolean z10) {
        if (this.z == z10) {
            return;
        }
        this.z = z10;
        Handler handler = this.i;
        s4.s0 s0Var = this.Y;
        handler.removeCallbacks(s0Var);
        if (z10) {
            handler.post(s0Var);
        }
        this.d.getClass();
        o();
    }
}
