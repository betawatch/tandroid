package wi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.zw;
import org.telegram.ui.na1;
import x7.u5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public volatile w T;
    public volatile File U;
    public k2.i0 V;
    public final h0 W;
    public final i0 X;
    public final g2.a0 Y;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final y00 d;
    public final q0 e;
    public final zw f;
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
    public final ExecutorService j = Executors.newSingleThreadExecutor(new g2.m0(9));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new g2.m0(10));
    public int Z = 1;
    public int a0 = 1;
    public float v = 1.0f;
    public long L = 1;

    public t0(k0 k0Var) {
        int i3 = 0;
        this.W = new h0(this, i3);
        this.X = new i0(this, i3);
        nh nhVar = new nh(this, 28);
        this.Y = new g2.a0(this, 3);
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
        int i10 = k0Var.h;
        this.o = i10;
        n0 n0Var = k0Var.f;
        o0 o0Var = k0Var.g;
        this.p = o0Var;
        this.q = 60000L;
        boolean z10 = k0Var.i;
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
        com.google.android.recaptcha.internal.a.r(sb2, r0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(o0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.r);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.l = new j(context2, textureView, r0Var, i10, n0Var, o0Var, z10, nVar, nhVar);
    }

    public static long f(long j10) {
        return (System.nanoTime() - j10) / 1000000;
    }

    public static void u() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("RoundVideoSession must be used from the main thread");
        }
    }

    public final boolean a() {
        u();
        int i3 = this.Z;
        if (i3 == 10 || i3 == 8) {
            return false;
        }
        this.m.b("cancel requested: state=".concat(t4.c.t(i3)));
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

    public final boolean b(int i3, boolean z10) {
        synchronized (this.g) {
            try {
                p0 p0Var = this.S;
                if (p0Var != null && p0Var.e && !z10) {
                    return false;
                }
                this.G = true;
                if (p0Var != null && !p0Var.d) {
                    p0Var.d = true;
                    this.m.b("output generation invalidated: id=" + p0Var.a + ", reason=" + t4.c.s(i3) + ", availableSize=" + p0Var.c);
                    this.k.execute(new g0(this, p0Var, i3, 2));
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
            long j10 = this.L;
            this.L = 1 + j10;
            p0 p0Var = new p0(j10, d);
            this.S = p0Var;
            this.T = new w(d, this.n.a, z10, this.m, new na1(21, this, p0Var));
            this.m.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new iv0(this, p0Var, d, 24));
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
        int i3 = this.Z;
        if (i3 == 9 || i3 == 10) {
            return;
        }
        this.m.a("fatal error in state=".concat(t4.c.t(i3)), exc);
        if (b(4, false)) {
            e();
            s();
            this.i.removeCallbacks(this.W);
            p0 p0Var = this.S;
            if (p0Var != null) {
                this.k.execute(new g0(this, p0Var, exc));
            }
            w(9);
            m("error");
            j40 j40Var = (j40) this.d.a;
            j40Var.A();
            a8.g(exc, true);
            gy0 gy0Var = j40Var.T;
            if (gy0Var != null) {
                gy0Var.d(true);
            }
            j40Var.T = null;
            MediaController.B().Y(false);
            if (j40Var.g0) {
                j40Var.x(6);
            } else {
                hs.f(j40Var.f).k(hs.m2, Integer.valueOf(j40Var.h));
            }
            j40Var.z(false, false);
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
        h0 h0Var = new h0(this, 1);
        ExecutorService executorService = this.j;
        executorService.execute(h0Var);
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

    public final void k(p0 p0Var, int i3) {
        synchronized (this.g) {
            try {
                if (!p0Var.d && !p0Var.e) {
                    p0Var.d = true;
                    this.m.b("output generation invalidated: id=" + p0Var.a + ", reason=" + t4.c.s(i3) + ", availableSize=" + p0Var.c);
                    this.k.execute(new g0(this, p0Var, i3, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j10 = this.N;
        if (j10 <= 0) {
            j10 = this.H;
        }
        return j10 > this.q || this.J > 0 || this.K + 10 < j10;
    }

    public final void m(String str) {
        if (this.R) {
            return;
        }
        this.R = true;
        p0 p0Var = this.S;
        n nVar = this.m;
        StringBuilder u10 = a1.g.u("session summary: terminal=", str, ", state=");
        u10.append(t4.c.t(this.Z));
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
        j40 j40Var = (j40) this.d.a;
        j40Var.S = l0Var;
        if (m0Var2 != null) {
            xi.e.j.b(m0Var2);
        }
        j40Var.B();
    }

    public final void o() {
        int i3 = this.Z;
        long j10 = this.H;
        long j11 = this.I;
        boolean z10 = this.z;
        boolean z11 = this.y;
        boolean z12 = this.w;
        long j12 = this.q;
        s0 s0Var = new s0(i3, j10, j11, j12, z10, z11, z12);
        j40 j40Var = (j40) this.d.a;
        s0 s0Var2 = j40Var.R;
        int i10 = j40Var.f;
        int i11 = s0Var2 == null ? 0 : s0Var2.a;
        j40Var.R = s0Var;
        if (i11 == 3 && i3 != 3) {
            j40Var.y(true);
        }
        j40Var.v0 = Math.max(j40Var.v0, j10);
        if (i3 == 3) {
            if (!j40Var.D0) {
                j40Var.D0 = true;
                hs.e().k(hs.j1, 512);
            }
            j40.n(j40Var);
            j40Var.setRecordingUiFrameClockActive(true);
            j40Var.D();
            if (!j40Var.g0) {
                j40Var.g0 = true;
                hs.f(i10).k(hs.l2, Integer.valueOf(j40Var.h), Boolean.FALSE);
            } else if (j40Var.h0) {
                j40Var.h0 = false;
                hs.f(i10).k(hs.p2, new Object[0]);
            }
        } else {
            j40Var.setRecordingUiFrameClockActive(false);
            j40Var.w.setProgress(j10 / j12);
        }
        if (i3 == 8 || i3 == 9 || i3 == 10) {
            j40Var.r();
            j40Var.A();
        }
        if (i11 == 3 && i3 == 4) {
            j40Var.x(2);
        }
        j40Var.B();
        if (j40Var.V != null && !j40Var.W) {
            org.telegram.messenger.g0.h3(new e40(j40Var, 1));
        }
        if (!z10 || j40Var.getWindowVisibility() == 0) {
            return;
        }
        org.telegram.messenger.g0.h3(new e40(j40Var, 2));
    }

    public final void p() {
        k2.i0 i0Var;
        u();
        if (this.Z != 5 || (i0Var = this.V) == null) {
            return;
        }
        i0Var.e();
        y(false);
        this.V.N0();
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
        k2.i0 i0Var;
        u();
        if (this.Z != 5 || (i0Var = this.V) == null) {
            return;
        }
        long N0 = i0Var.N0();
        long j10 = this.J;
        if (N0 < j10 || N0 >= this.K) {
            this.V.Z0(5, j10);
        }
        this.V.j();
        y(true);
    }

    public final void s() {
        this.i.removeCallbacks(this.X);
        this.z = false;
        k2.i0 i0Var = this.V;
        if (i0Var == null) {
            return;
        }
        i0Var.s(this.Y);
        k2.i0 i0Var2 = this.V;
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

    public final void t(File file, int i3, long j10, long j11, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        n nVar = this.m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(t4.c.s(i10));
        nVar.b(t10.toString());
        g();
        k(this.S, i10);
        c(z10);
        g();
        w wVar = this.T;
        int i11 = i3;
        int i12 = this.n.a;
        int i13 = this.o;
        if (i11 <= 0) {
            i11 = this.p.a;
        }
        m2.r0 a10 = u5.a(file, wVar, j10, j11, z10, new a7.d(i12, i13, i11));
        this.T.g();
        long h = this.T.h();
        n nVar2 = this.m;
        StringBuilder t11 = a1.g.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(j11 - j10);
        t11.append(", actualStartMs=");
        t11.append(a10.a);
        t11.append(", mode=");
        t11.append((String) a10.c);
        t11.append(", size=");
        t11.append(this.T.a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        nVar2.b(t11.toString());
        g();
        this.k.execute(new f0(this, this.S, this.T.a, h, z10));
    }

    public final void v(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        zw zwVar = this.f;
        if (zwVar != null) {
            ((j40) zwVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void w(int i3) {
        int i10 = this.Z;
        this.Z = i3;
        this.m.b("state: " + t4.c.t(i10) + " -> " + t4.c.t(i3) + ", durationMs=" + j());
        o();
    }

    public final void x(float f10) {
        u();
        if (this.Z != 3 || this.y) {
            return;
        }
        this.l.U(Math.max(0.0f, Math.min(1.0f, f10)));
    }

    public final void y(boolean z10) {
        if (this.z == z10) {
            return;
        }
        this.z = z10;
        Handler handler = this.i;
        i0 i0Var = this.X;
        handler.removeCallbacks(i0Var);
        if (z10) {
            handler.post(i0Var);
        }
        this.d.getClass();
        o();
    }
}
