package vi;

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
import li.e3;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class s0 {
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
    public volatile o0 P;
    public volatile v Q;
    public volatile File R;
    public i2.j0 S;
    public final e2.z V;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final e3 d;
    public final p0 e;
    public final tv f;
    public final j l;
    public final n m;
    public final q0 n;
    public final long o;
    public l0 p;
    public l0 q;
    public m0 r;
    public n0 s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new e2.l0(9));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new e2.l0(10));
    public int W = 1;
    public int X = 1;
    public float t = 1.0f;
    public long I = 1;
    public final h0 T = new h0(this, 0);
    public final cy0 U = new cy0(this, 18);

    public s0(j0 j0Var) {
        e3 e3Var = new e3(this, 22);
        this.V = new e2.z(this, 3);
        t();
        Context context = j0Var.a;
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext == null ? context : applicationContext;
        this.a = context2;
        TextureView textureView = j0Var.b;
        this.b = textureView;
        File file = j0Var.c;
        this.c = file == null ? context2.getCacheDir() : file;
        this.p = j0Var.d;
        q0 q0Var = j0Var.e;
        this.n = q0Var;
        int i10 = j0Var.h;
        m0 m0Var = j0Var.f;
        n0 n0Var = j0Var.g;
        this.o = 60000L;
        boolean z10 = j0Var.i;
        this.d = j0Var.j;
        this.e = j0Var.k;
        this.f = j0Var.l;
        n nVar = new n();
        this.m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(q0Var.a);
        sb2.append("x");
        c3.h0.q(sb2, q0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(m0Var);
        sb2.append(", fps=");
        sb2.append(n0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.p);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.l = new j(context2, textureView, q0Var, i10, m0Var, n0Var, z10, nVar, e3Var);
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
        this.m.b("cancel requested: state=".concat(b10.x(i10)));
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
                o0 o0Var = this.P;
                if (o0Var != null && o0Var.e) {
                    return false;
                }
                this.D = true;
                if (o0Var != null && !o0Var.d) {
                    o0Var.d = true;
                    this.m.b("output generation invalidated: id=" + o0Var.a + ", reason=" + b10.w(i10) + ", availableSize=" + o0Var.c);
                    this.k.execute(new g0(this, o0Var, i10, 2));
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
            o0 o0Var = new o0(j10, d);
            this.P = o0Var;
            this.Q = new v(d, this.n.a, z10, this.m, new zg1(24, this, o0Var));
            this.m.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new ny0(this, o0Var, d, 26));
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
        this.m.a("fatal error in state=".concat(b10.x(i10)), exc);
        if (b(4)) {
            e();
            r();
            this.i.removeCallbacks(this.T);
            o0 o0Var = this.P;
            if (o0Var != null) {
                this.k.execute(new g0(this, o0Var, exc));
            }
            v(9);
            m("error");
            n60 n60Var = (n60) this.d.b;
            n60Var.x();
            FileLog.e(exc);
            l11 l11Var = n60Var.T;
            if (l11Var != null) {
                l11Var.d(true);
            }
            n60Var.T = null;
            MediaController.getInstance().requestRecordAudioFocus(false);
            if (n60Var.f0) {
                n60Var.u(6);
            } else {
                NotificationCenter.getInstance(n60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(n60Var.n));
            }
            n60Var.w(false, false);
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
        h0 h0Var = new h0(this, 1);
        ExecutorService executorService = this.j;
        executorService.execute(h0Var);
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

    public final void k(o0 o0Var, int i10) {
        synchronized (this.g) {
            try {
                if (!o0Var.d && !o0Var.e) {
                    o0Var.d = true;
                    this.m.b("output generation invalidated: id=" + o0Var.a + ", reason=" + b10.w(i10) + ", availableSize=" + o0Var.c);
                    this.k.execute(new g0(this, o0Var, i10, 0));
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
        o0 o0Var = this.P;
        n nVar = this.m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(b10.x(this.W));
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
        v.append(o0Var == null ? 0L : o0Var.a);
        v.append(", availableSize=");
        v.append(o0Var != null ? o0Var.c : 0L);
        nVar.b(v.toString());
    }

    public final void n() {
        l0 l0Var = this.p;
        l0 l0Var2 = this.q;
        k0 k0Var = new k0(l0Var, l0Var2, this.X, this.t);
        n60 n60Var = (n60) this.d.b;
        n60Var.S = k0Var;
        if (l0Var2 != null) {
            wi.e.j.b(l0Var2);
        }
        n60Var.y();
    }

    public final void o() {
        int i10 = this.W;
        long j10 = this.E;
        long j11 = this.F;
        boolean z10 = this.w;
        boolean z11 = this.u;
        long j12 = this.o;
        r0 r0Var = new r0(i10, j10, j11, j12, z10, z11);
        n60 n60Var = (n60) this.d.b;
        r0 r0Var2 = n60Var.R;
        int i11 = n60Var.h;
        int i12 = r0Var2 == null ? 0 : r0Var2.a;
        n60Var.R = r0Var;
        if (i12 == 3 && i10 != 3) {
            n60Var.v(true);
        }
        n60Var.u0 = Math.max(n60Var.u0, j10);
        if (i10 == 3) {
            if (!n60Var.C0) {
                n60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            n60.m(n60Var);
            n60Var.setRecordingUiFrameClockActive(true);
            n60Var.A();
            if (!n60Var.f0) {
                n60Var.f0 = true;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(n60Var.n), Boolean.FALSE);
            } else if (n60Var.g0) {
                n60Var.g0 = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            n60Var.setRecordingUiFrameClockActive(false);
            n60Var.w.setProgress(j10 / j12);
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            n60Var.q();
            n60Var.x();
        }
        if (i12 == 3 && i10 == 4) {
            n60Var.u(2);
        }
        n60Var.y();
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
        i2.j0 j0Var;
        t();
        if (this.W != 5 || (j0Var = this.S) == null) {
            return;
        }
        long M0 = j0Var.M0();
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
        i2.j0 j0Var = this.S;
        if (j0Var == null) {
            return;
        }
        j0Var.C(this.V);
        i2.j0 j0Var2 = this.S;
        j0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == j0Var2.X) {
            j0Var2.F1();
            j0Var2.s1();
            j0Var2.x1(null);
            j0Var2.q1(0, 0);
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
        t10.append(b10.w(i10));
        nVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = w7.x.a(file, this.Q, j10, j11, z10);
        this.Q.g();
        long e = w7.x.e(this.Q.a) / 1000;
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
        this.k.execute(new f0(this, this.P, this.Q.a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        tv tvVar = this.f;
        if (tvVar != null) {
            ((n60) tvVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.m.b("state: " + b10.x(i11) + " -> " + b10.x(i10) + ", durationMs=" + j());
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
        cy0 cy0Var = this.U;
        handler.removeCallbacks(cy0Var);
        if (z10) {
            handler.post(cy0Var);
        }
        this.d.getClass();
        o();
    }
}
