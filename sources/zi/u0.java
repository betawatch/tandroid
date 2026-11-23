package zi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import c8.pe;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.uc1;
import y7.h7;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public l2.g0 W;
    public final h2.z Z;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final aa d;
    public final r0 e;
    public final hy f;
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
    public final ExecutorService j = Executors.newSingleThreadExecutor(new ai.v0(11));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new ai.v0(12));
    public int a0 = 1;
    public int b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final i0 X = new i0(this, 0);
    public final o5 Y = new o5(this, 14);

    public u0(l0 l0Var) {
        h7 h7Var = new h7(this);
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
        this.l = new k(context2, textureView, s0Var, i7, o0Var, p0Var, z10, oVar, h7Var);
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
            this.U = new x(d, this.n.a, z10, this.m, new uc1(29, this, q0Var));
            this.m.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new wg.p(this, q0Var, d, 10));
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
            y40 y40Var = (y40) this.d.b;
            y40Var.C();
            a8.g(exc, true);
            ry0 ry0Var = y40Var.T;
            if (ry0Var != null) {
                ry0Var.d(true);
            }
            y40Var.T = null;
            if (y40Var.a0) {
                y40Var.a0 = false;
                y40Var.P = null;
            } else {
                MediaController.B().Y(false);
                if (y40Var.h0) {
                    y40Var.z(6);
                } else {
                    ks.f(y40Var.f).k(ks.m2, Integer.valueOf(y40Var.h));
                }
                y40Var.B(false, false);
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
        y40 y40Var = (y40) this.d.b;
        y40Var.S = m0Var;
        if (n0Var2 != null) {
            aj.e.j.b(n0Var2);
        }
        y40Var.D();
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
        y40 y40Var = (y40) this.d.b;
        t0 t0Var2 = y40Var.R;
        int i10 = y40Var.f;
        int i11 = t0Var2 == null ? 0 : t0Var2.a;
        y40Var.R = t0Var;
        if (i11 == 3 && i7 != 3) {
            y40Var.A(true);
        }
        y40Var.w0 = Math.max(y40Var.w0, j3);
        if (i7 == 3) {
            if (!y40Var.E0) {
                y40Var.E0 = true;
                ks.e().k(ks.j1, 512);
            }
            y40.o(y40Var);
            y40Var.setRecordingUiFrameClockActive(true);
            y40Var.F();
            if (!y40Var.h0) {
                y40Var.h0 = true;
                ks.f(i10).k(ks.l2, Integer.valueOf(y40Var.h), Boolean.FALSE);
            } else if (y40Var.i0) {
                y40Var.i0 = false;
                ks.f(i10).k(ks.p2, new Object[0]);
            }
        } else {
            y40Var.setRecordingUiFrameClockActive(false);
            y40Var.w.setProgress(j3 / j11);
        }
        if (i7 == 8 || i7 == 9 || i7 == 10) {
            y40Var.s();
            y40Var.C();
        }
        if (i11 == 3 && i7 == 4) {
            y40Var.z(2);
        }
        y40Var.D();
        if (y40Var.V != null && !y40Var.W) {
            org.telegram.messenger.g0.g3(new t40(y40Var, 1));
        }
        if (!z10 || y40Var.getWindowVisibility() == 0) {
            return;
        }
        org.telegram.messenger.g0.g3(new t40(y40Var, 2));
    }

    public final void p() {
        l2.g0 g0Var;
        v();
        if (this.a0 != 5 || (g0Var = this.W) == null) {
            return;
        }
        g0Var.b();
        z(false);
        this.W.n();
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
        l2.g0 g0Var;
        v();
        if (this.a0 != 5 || (g0Var = this.W) == null) {
            return;
        }
        long n10 = g0Var.n();
        long j3 = this.K;
        if (n10 < j3 || n10 >= this.L) {
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
        l2.g0 g0Var = this.W;
        if (g0Var == null) {
            return;
        }
        g0Var.i0(this.Z);
        l2.g0 g0Var2 = this.W;
        g0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == g0Var2.X) {
            g0Var2.F1();
            g0Var2.s1();
            g0Var2.x1(null);
            g0Var2.q1(0, 0);
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
        n2.r0 a10 = pe.a(file, xVar, j3, j10, z10, new b7.d(i12, i13, i11));
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
        hy hyVar = this.f;
        if (hyVar != null) {
            ((y40) hyVar.b).setScreenFlashEnabled(z10);
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
        o5 o5Var = this.Y;
        handler.removeCallbacks(o5Var);
        if (z10) {
            handler.post(o5Var);
        }
        this.d.getClass();
        o();
    }
}
