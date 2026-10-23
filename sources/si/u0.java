package si;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k2.w0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.Wallet.m4;
import w7.m7;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class u0 {
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
    public volatile q0 P;
    public volatile w Q;
    public volatile File R;
    public i2.h0 S;
    public final e2.z V;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final l2.f d;
    public final r0 e;
    public final tv f;
    public final j l;
    public final n m;
    public final s0 n;
    public final long o;
    public m0 p;
    public m0 q;
    public n0 r;
    public p0 s;
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
    public final m4 U = new m4(this, 9);

    public u0(k0 k0Var) {
        w0 w0Var = new w0(this, 23);
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
        s0 s0Var = k0Var.e;
        this.n = s0Var;
        int i10 = k0Var.h;
        n0 n0Var = k0Var.f;
        p0 p0Var = k0Var.g;
        this.o = 60000L;
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
        sb2.append(s0Var.a);
        sb2.append("x");
        k3.r(sb2, s0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.p);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.l = new j(context2, textureView, s0Var, i10, n0Var, p0Var, z10, nVar, w0Var);
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
        this.m.b("cancel requested: state=".concat(o0.w(i10)));
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
                q0 q0Var = this.P;
                if (q0Var != null && q0Var.e) {
                    return false;
                }
                this.D = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    this.m.b("output generation invalidated: id=" + q0Var.a + ", reason=" + o0.v(i10) + ", availableSize=" + q0Var.c);
                    this.k.execute(new h0(this, q0Var, i10, 2));
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
            q0 q0Var = new q0(j10, d);
            this.P = q0Var;
            this.Q = new w(d, this.n.a, z10, this.m, new e8(12, this, q0Var));
            this.m.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new fy0(this, q0Var, d, 22));
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
        j jVar = this.l;
        jVar.U(0.0f);
        jVar.T(false);
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
        this.m.a("fatal error in state=".concat(o0.w(i10)), exc);
        if (b(4)) {
            e();
            r();
            this.i.removeCallbacks(this.T);
            q0 q0Var = this.P;
            if (q0Var != null) {
                this.k.execute(new h0(this, q0Var, exc));
            }
            v(9);
            m("error");
            m60 m60Var = (m60) this.d.b;
            m60Var.x();
            FileLog.e(exc);
            d11 d11Var = m60Var.T;
            if (d11Var != null) {
                d11Var.d(true);
            }
            m60Var.T = null;
            MediaController.getInstance().requestRecordAudioFocus(false);
            if (m60Var.f0) {
                m60Var.u(6);
            } else {
                NotificationCenter.getInstance(m60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(m60Var.n));
            }
            m60Var.w(false, false);
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

    public final void k(q0 q0Var, int i10) {
        synchronized (this.g) {
            try {
                if (!q0Var.d && !q0Var.e) {
                    q0Var.d = true;
                    this.m.b("output generation invalidated: id=" + q0Var.a + ", reason=" + o0.v(i10) + ", availableSize=" + q0Var.c);
                    this.k.execute(new h0(this, q0Var, i10, 0));
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
        q0 q0Var = this.P;
        n nVar = this.m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(o0.w(this.W));
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
        v.append(q0Var == null ? 0L : q0Var.a);
        v.append(", availableSize=");
        v.append(q0Var != null ? q0Var.c : 0L);
        nVar.b(v.toString());
    }

    public final void n() {
        m0 m0Var = this.p;
        m0 m0Var2 = this.q;
        l0 l0Var = new l0(m0Var, m0Var2, this.X, this.t);
        m60 m60Var = (m60) this.d.b;
        m60Var.S = l0Var;
        if (m0Var2 != null) {
            ti.e.j.b(m0Var2);
        }
        m60Var.y();
    }

    public final void o() {
        int i10 = this.W;
        long j10 = this.E;
        long j11 = this.F;
        boolean z10 = this.w;
        boolean z11 = this.u;
        long j12 = this.o;
        t0 t0Var = new t0(i10, j10, j11, j12, z10, z11);
        m60 m60Var = (m60) this.d.b;
        t0 t0Var2 = m60Var.R;
        int i11 = m60Var.h;
        int i12 = t0Var2 == null ? 0 : t0Var2.a;
        m60Var.R = t0Var;
        if (i12 == 3 && i10 != 3) {
            m60Var.v(true);
        }
        m60Var.u0 = Math.max(m60Var.u0, j10);
        if (i10 == 3) {
            if (!m60Var.C0) {
                m60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            m60.m(m60Var);
            m60Var.setRecordingUiFrameClockActive(true);
            m60Var.A();
            if (!m60Var.f0) {
                m60Var.f0 = true;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(m60Var.n), Boolean.FALSE);
            } else if (m60Var.g0) {
                m60Var.g0 = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            m60Var.setRecordingUiFrameClockActive(false);
            m60Var.w.setProgress(j10 / j12);
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            m60Var.q();
            m60Var.x();
        }
        if (i12 == 3 && i10 == 4) {
            m60Var.u(2);
        }
        m60Var.y();
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
        i2.h0 h0Var;
        t();
        if (this.W != 5 || (h0Var = this.S) == null) {
            return;
        }
        long M0 = h0Var.M0();
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
        i2.h0 h0Var = this.S;
        if (h0Var == null) {
            return;
        }
        h0Var.C(this.V);
        i2.h0 h0Var2 = this.S;
        h0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == h0Var2.X) {
            h0Var2.F1();
            h0Var2.s1();
            h0Var2.x1(null);
            h0Var2.q1(0, 0);
        }
        this.S.X0();
        this.S = null;
    }

    public final void s(File file, long j10, long j11, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        n nVar = this.m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(o0.v(i10));
        nVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = m7.a(file, this.Q, j10, j11, z10);
        this.Q.g();
        long e = m7.e(this.Q.a) / 1000;
        n nVar2 = this.m;
        StringBuilder t11 = a1.g.t(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.b);
        t11.append(", actualStartMs=");
        t11.append(a2.a);
        t11.append(", size=");
        t11.append(this.Q.a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        nVar2.b(t11.toString());
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
            ((m60) tvVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.m.b("state: " + o0.w(i11) + " -> " + o0.w(i10) + ", durationMs=" + j());
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
        m4 m4Var = this.U;
        handler.removeCallbacks(m4Var);
        if (z10) {
            handler.post(m4Var);
        }
        this.d.getClass();
        o();
    }
}
