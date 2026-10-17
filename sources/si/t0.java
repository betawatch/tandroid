package si;

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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.y01;
import w7.p7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class t0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long J;
    public long K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public volatile p0 P;
    public volatile x Q;
    public volatile File R;
    public i2.g0 S;
    public final e2.z V;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final l2.f d;
    public final q0 e;
    public final tv f;
    public final k l;
    public final o m;
    public final r0 n;
    public final long o;
    public m0 p;
    public m0 q;
    public n0 r;
    public o0 s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new e2.l0(8));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new e2.l0(9));
    public int W = 1;
    public int X = 1;
    public float t = 1.0f;
    public long I = 1;
    public final j0 T = new j0(this, 0);
    public final p4.s0 U = new p4.s0(this, 6);

    public t0(k0 k0Var) {
        l2.f fVar = new l2.f(this, 20);
        this.V = new e2.z(this, 3);
        t();
        Context context = k0Var.a;
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext == null ? context : applicationContext;
        this.a = context2;
        TextureView textureView = k0Var.b;
        this.b = textureView;
        File file = k0Var.c;
        this.c = file == null ? context2.getCacheDir() : file;
        this.p = k0Var.d;
        r0 r0Var = k0Var.e;
        this.n = r0Var;
        int i10 = k0Var.h;
        n0 n0Var = k0Var.f;
        o0 o0Var = k0Var.g;
        this.o = 60000L;
        boolean z10 = k0Var.i;
        this.d = k0Var.j;
        this.e = k0Var.k;
        this.f = k0Var.l;
        o oVar = new o();
        this.m = oVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(r0Var.a);
        sb2.append("x");
        i0.a.w(sb2, r0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(o0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.p);
        sb2.append(", maxDurationMs=60000");
        oVar.b(sb2.toString());
        this.l = new k(context2, textureView, r0Var, i10, n0Var, o0Var, z10, oVar, fVar);
    }

    public static long f(long j10) {
        return (System.nanoTime() - j10) / 1000000;
    }

    public static void t() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("RoundVideoSession must be used from the main thread");
        }
    }

    public final void a() {
        t();
        int i10 = this.W;
        if (i10 == 10 || i10 == 8) {
            return;
        }
        this.m.b("cancel requested: state=".concat(r.c.w(i10)));
        if (b(3)) {
            e();
            r();
            v(10);
            if (!this.B && !this.l.Y()) {
                i();
            } else {
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.g) {
            try {
                p0 p0Var = this.P;
                if (p0Var != null && p0Var.e) {
                    return false;
                }
                this.D = true;
                if (p0Var != null && !p0Var.d) {
                    p0Var.d = true;
                    this.m.b("output generation invalidated: id=" + p0Var.a + ", reason=" + r.c.v(i10) + ", availableSize=" + p0Var.c);
                    this.k.execute(new h0(this, p0Var, i10, 2));
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
            long j10 = this.I;
            this.I = 1 + j10;
            p0 p0Var = new p0(j10, d);
            this.P = p0Var;
            this.Q = new x(d, this.n.a, z10, this.m, new org.telegram.ui.web.c0(9, this, p0Var));
            this.m.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new ay0(this, p0Var, d, 22));
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
        this.u = false;
        k kVar = this.l;
        kVar.U(0.0f);
        kVar.T(false);
        u(false);
    }

    public final void g() {
        if (this.D) {
            throw new IOException("Round-video operation was cancelled");
        }
    }

    public final void h(Exception exc) {
        int i10 = this.W;
        if (i10 == 9 || i10 == 10) {
            return;
        }
        this.m.a("fatal error in state=".concat(r.c.w(i10)), exc);
        if (b(4)) {
            e();
            r();
            this.i.removeCallbacks(this.T);
            p0 p0Var = this.P;
            if (p0Var != null) {
                this.k.execute(new h0(this, p0Var, exc));
            }
            v(9);
            m("error");
            l60 l60Var = (l60) this.d.b;
            l60Var.x();
            FileLog.e(exc);
            y01 y01Var = l60Var.T;
            if (y01Var != null) {
                y01Var.d(true);
            }
            l60Var.T = null;
            MediaController.getInstance().requestRecordAudioFocus(false);
            if (l60Var.f0) {
                l60Var.u(6);
            } else {
                NotificationCenter.getInstance(l60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(l60Var.n));
            }
            l60Var.w(false, false);
            if (!this.B && !this.l.Y()) {
                i();
            } else {
                this.B = true;
                this.A = true;
            }
        }
    }

    public final void i() {
        if (this.C) {
            return;
        }
        this.C = true;
        m("cancelled");
        j0 j0Var = new j0(this, 1);
        ExecutorService executorService = this.j;
        executorService.execute(j0Var);
        this.l.M();
        this.i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(p0 p0Var, int i10) {
        synchronized (this.g) {
            try {
                if (!p0Var.d && !p0Var.e) {
                    p0Var.d = true;
                    this.m.b("output generation invalidated: id=" + p0Var.a + ", reason=" + r.c.v(i10) + ", availableSize=" + p0Var.c);
                    this.k.execute(new h0(this, p0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j10 = this.K;
        if (j10 <= 0) {
            j10 = this.E;
        }
        return j10 > this.o || this.G > 0 || this.H + 10 < j10;
    }

    public final void m(String str) {
        if (this.O) {
            return;
        }
        this.O = true;
        p0 p0Var = this.P;
        o oVar = this.m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(r.c.w(this.W));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.L);
        v.append(", resumes=");
        v.append(this.M);
        v.append(", cameraSwitches=");
        v.append(this.N);
        v.append(", facing=");
        v.append(this.q);
        v.append(", cameraMode=");
        v.append(this.r);
        v.append(", generation=");
        v.append(p0Var == null ? 0L : p0Var.a);
        v.append(", availableSize=");
        v.append(p0Var != null ? p0Var.c : 0L);
        oVar.b(v.toString());
    }

    public final void n() {
        m0 m0Var = this.p;
        m0 m0Var2 = this.q;
        l0 l0Var = new l0(m0Var, m0Var2, this.X, this.t);
        l60 l60Var = (l60) this.d.b;
        l60Var.S = l0Var;
        if (m0Var2 != null) {
            ti.e.j.b(m0Var2);
        }
        l60Var.y();
    }

    public final void o() {
        int i10 = this.W;
        long j10 = this.E;
        long j11 = this.F;
        boolean z10 = this.w;
        boolean z11 = this.u;
        long j12 = this.o;
        s0 s0Var = new s0(i10, j10, j11, j12, z10, z11);
        l60 l60Var = (l60) this.d.b;
        s0 s0Var2 = l60Var.R;
        int i11 = l60Var.h;
        int i12 = s0Var2 == null ? 0 : s0Var2.a;
        l60Var.R = s0Var;
        if (i12 == 3 && i10 != 3) {
            l60Var.v(true);
        }
        l60Var.u0 = Math.max(l60Var.u0, j10);
        if (i10 == 3) {
            if (!l60Var.C0) {
                l60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            l60.m(l60Var);
            l60Var.setRecordingUiFrameClockActive(true);
            l60Var.A();
            if (!l60Var.f0) {
                l60Var.f0 = true;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(l60Var.n), Boolean.FALSE);
            } else if (l60Var.g0) {
                l60Var.g0 = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            l60Var.setRecordingUiFrameClockActive(false);
            l60Var.w.setProgress(j10 / j12);
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            l60Var.q();
            l60Var.x();
        }
        if (i12 == 3 && i10 == 4) {
            l60Var.u(2);
        }
        l60Var.y();
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.m.b("pause requested: durationMs=" + this.E);
        e();
        this.i.removeCallbacks(this.T);
        v(4);
        boolean Y = this.l.Y();
        this.B = Y;
        if (Y) {
            return;
        }
        h(new IllegalStateException("Unable to stop the camera segment"));
    }

    public final void q() {
        i2.g0 g0Var;
        t();
        if (this.W != 5 || (g0Var = this.S) == null) {
            return;
        }
        long M0 = g0Var.M0();
        long j10 = this.G;
        if (M0 < j10 || M0 >= this.H) {
            this.S.Z0(5, j10);
        }
        this.S.i();
        x(true);
    }

    public final void r() {
        this.i.removeCallbacks(this.U);
        this.x = false;
        i2.g0 g0Var = this.S;
        if (g0Var == null) {
            return;
        }
        g0Var.C(this.V);
        i2.g0 g0Var2 = this.S;
        g0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == g0Var2.X) {
            g0Var2.F1();
            g0Var2.s1();
            g0Var2.x1(null);
            g0Var2.q1(0, 0);
        }
        this.S.X0();
        this.S = null;
    }

    public final void s(File file, long j10, long j11, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        o oVar = this.m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(r.c.v(i10));
        oVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = p7.a(file, this.Q, j10, j11, z10);
        this.Q.g();
        long e = p7.e(this.Q.a) / 1000;
        o oVar2 = this.m;
        StringBuilder t11 = a1.g.t(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.b);
        t11.append(", actualStartMs=");
        t11.append(a2.a);
        t11.append(", size=");
        t11.append(this.Q.a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        oVar2.b(t11.toString());
        g();
        this.k.execute(new g0(this, this.P, this.Q.a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        tv tvVar = this.f;
        if (tvVar != null) {
            ((l60) tvVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.m.b("state: " + r.c.w(i11) + " -> " + r.c.w(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W != 3 || this.w) {
            return;
        }
        this.l.U(Math.max(0.0f, Math.min(1.0f, f7)));
    }

    public final void x(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        Handler handler = this.i;
        p4.s0 s0Var = this.U;
        handler.removeCallbacks(s0Var);
        if (z10) {
            handler.post(s0Var);
        }
        this.d.getClass();
        o();
    }
}
