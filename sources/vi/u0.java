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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.bh1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u0 {
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
    public volatile q0 S;
    public volatile w T;
    public volatile File U;
    public i2.j0 V;
    public final e2.z Y;
    public final Context a;
    public final TextureView b;
    public final File c;
    public final e3 d;
    public final r0 e;
    public final tv f;
    public final j l;
    public final n m;
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
    public final ExecutorService j = Executors.newSingleThreadExecutor(new e2.l0(9));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new e2.l0(10));
    public int Z = 1;
    public int a0 = 1;
    public float v = 1.0f;
    public long L = 1;
    public final i0 W = new i0(this, 0);
    public final dy0 X = new dy0(this, 18);

    public u0(l0 l0Var) {
        e3 e3Var = new e3(this, 22);
        this.Y = new e2.z(this, 3);
        u();
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
        int i10 = l0Var.h;
        this.o = i10;
        o0 o0Var = l0Var.f;
        p0 p0Var = l0Var.g;
        this.p = p0Var;
        this.q = 60000L;
        boolean z10 = l0Var.i;
        this.d = l0Var.j;
        this.e = l0Var.k;
        this.f = l0Var.l;
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
        c3.h0.q(sb2, s0Var.a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.r);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.l = new j(context2, textureView, s0Var, i10, o0Var, p0Var, z10, nVar, e3Var);
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
        int i10 = this.Z;
        if (i10 == 10 || i10 == 8) {
            return false;
        }
        this.m.b("cancel requested: state=".concat(b10.x(i10)));
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

    public final boolean b(int i10, boolean z10) {
        synchronized (this.g) {
            try {
                q0 q0Var = this.S;
                if (q0Var != null && q0Var.e && !z10) {
                    return false;
                }
                this.G = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    this.m.b("output generation invalidated: id=" + q0Var.a + ", reason=" + b10.w(i10) + ", availableSize=" + q0Var.c);
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
            long j10 = this.L;
            this.L = 1 + j10;
            q0 q0Var = new q0(j10, d);
            this.S = q0Var;
            this.T = new w(d, this.n.a, z10, this.m, new bh1(24, this, q0Var));
            this.m.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.k.execute(new oy0(this, q0Var, d, 26));
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
        int i10 = this.Z;
        if (i10 == 9 || i10 == 10) {
            return;
        }
        this.m.a("fatal error in state=".concat(b10.x(i10)), exc);
        if (b(4, false)) {
            e();
            s();
            this.i.removeCallbacks(this.W);
            q0 q0Var = this.S;
            if (q0Var != null) {
                this.k.execute(new h0(this, q0Var, exc));
            }
            w(9);
            m("error");
            o60 o60Var = (o60) this.d.b;
            o60Var.A();
            FileLog.e(exc);
            m11 m11Var = o60Var.S;
            if (m11Var != null) {
                m11Var.d(true);
            }
            o60Var.S = null;
            MediaController.getInstance().requestRecordAudioFocus(false);
            if (o60Var.f0) {
                o60Var.x(6);
            } else {
                NotificationCenter.getInstance(o60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(o60Var.h));
            }
            o60Var.z(false, false);
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

    public final void k(q0 q0Var, int i10) {
        synchronized (this.g) {
            try {
                if (!q0Var.d && !q0Var.e) {
                    q0Var.d = true;
                    this.m.b("output generation invalidated: id=" + q0Var.a + ", reason=" + b10.w(i10) + ", availableSize=" + q0Var.c);
                    this.k.execute(new h0(this, q0Var, i10, 0));
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
        q0 q0Var = this.S;
        n nVar = this.m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(b10.x(this.Z));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.O);
        v.append(", resumes=");
        v.append(this.P);
        v.append(", cameraSwitches=");
        v.append(this.Q);
        v.append(", facing=");
        v.append(this.s);
        v.append(", cameraMode=");
        v.append(this.t);
        v.append(", generation=");
        v.append(q0Var == null ? 0L : q0Var.a);
        v.append(", availableSize=");
        v.append(q0Var != null ? q0Var.c : 0L);
        nVar.b(v.toString());
    }

    public final void n() {
        n0 n0Var = this.r;
        n0 n0Var2 = this.s;
        m0 m0Var = new m0(n0Var, n0Var2, this.a0, this.v);
        o60 o60Var = (o60) this.d.b;
        o60Var.R = m0Var;
        if (n0Var2 != null) {
            wi.e.j.b(n0Var2);
        }
        o60Var.B();
    }

    public final void o() {
        int i10 = this.Z;
        long j10 = this.H;
        long j11 = this.I;
        boolean z10 = this.z;
        boolean z11 = this.y;
        boolean z12 = this.w;
        long j12 = this.q;
        t0 t0Var = new t0(i10, j10, j11, j12, z10, z11, z12);
        o60 o60Var = (o60) this.d.b;
        t0 t0Var2 = o60Var.Q;
        int i11 = o60Var.f;
        int i12 = t0Var2 == null ? 0 : t0Var2.a;
        o60Var.Q = t0Var;
        if (i12 == 3 && i10 != 3) {
            o60Var.y(true);
        }
        o60Var.u0 = Math.max(o60Var.u0, j10);
        if (i10 == 3) {
            if (!o60Var.C0) {
                o60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            o60.n(o60Var);
            o60Var.setRecordingUiFrameClockActive(true);
            o60Var.D();
            if (!o60Var.f0) {
                o60Var.f0 = true;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(o60Var.h), Boolean.FALSE);
            } else if (o60Var.g0) {
                o60Var.g0 = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            o60Var.setRecordingUiFrameClockActive(false);
            o60Var.v.setProgress(j10 / j12);
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            o60Var.r();
            o60Var.A();
        }
        if (i12 == 3 && i10 == 4) {
            o60Var.x(2);
        }
        o60Var.B();
        if (o60Var.U != null && !o60Var.V) {
            AndroidUtilities.runOnUIThread(new j60(o60Var, 1));
        }
        if (!z10 || o60Var.getWindowVisibility() == 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new j60(o60Var, 2));
    }

    public final void p() {
        i2.j0 j0Var;
        u();
        if (this.Z != 5 || (j0Var = this.V) == null) {
            return;
        }
        j0Var.e();
        y(false);
        this.V.M0();
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
        i2.j0 j0Var;
        u();
        if (this.Z != 5 || (j0Var = this.V) == null) {
            return;
        }
        long M0 = j0Var.M0();
        long j10 = this.J;
        if (M0 < j10 || M0 >= this.K) {
            this.V.Z0(5, j10);
        }
        this.V.i();
        y(true);
    }

    public final void s() {
        this.i.removeCallbacks(this.X);
        this.z = false;
        i2.j0 j0Var = this.V;
        if (j0Var == null) {
            return;
        }
        j0Var.C(this.Y);
        i2.j0 j0Var2 = this.V;
        j0Var2.F1();
        TextureView textureView = this.b;
        if (textureView != null && textureView == j0Var2.X) {
            j0Var2.F1();
            j0Var2.s1();
            j0Var2.x1(null);
            j0Var2.q1(0, 0);
        }
        this.V.X0();
        this.V = null;
    }

    public final void t(File file, int i10, long j10, long j11, boolean z10, int i11) {
        long nanoTime = System.nanoTime();
        n nVar = this.m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(b10.w(i11));
        nVar.b(t10.toString());
        g();
        k(this.S, i11);
        c(z10);
        g();
        w wVar = this.T;
        int i12 = i10;
        int i13 = this.n.a;
        int i14 = this.o;
        if (i12 <= 0) {
            i12 = this.p.a;
        }
        k2.t0 a2 = w7.x.a(file, wVar, j10, j11, z10, new a3.l(i13, i14, i12));
        this.T.g();
        long h = this.T.h();
        n nVar2 = this.m;
        StringBuilder t11 = a1.g.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(j11 - j10);
        t11.append(", actualStartMs=");
        t11.append(a2.a);
        t11.append(", mode=");
        t11.append((String) a2.c);
        t11.append(", size=");
        t11.append(this.T.a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        nVar2.b(t11.toString());
        g();
        this.k.execute(new g0(this, this.S, this.T.a, h, z10));
    }

    public final void v(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        tv tvVar = this.f;
        if (tvVar != null) {
            ((o60) tvVar.b).setScreenFlashEnabled(z10);
        }
    }

    public final void w(int i10) {
        int i11 = this.Z;
        this.Z = i10;
        this.m.b("state: " + b10.x(i11) + " -> " + b10.x(i10) + ", durationMs=" + j());
        o();
    }

    public final void x(float f7) {
        u();
        if (this.Z != 3 || this.y) {
            return;
        }
        this.l.U(Math.max(0.0f, Math.min(1.0f, f7)));
    }

    public final void y(boolean z10) {
        if (this.z == z10) {
            return;
        }
        this.z = z10;
        Handler handler = this.i;
        dy0 dy0Var = this.X;
        handler.removeCallbacks(dy0Var);
        if (z10) {
            handler.post(dy0Var);
        }
        this.d.getClass();
        o();
    }
}
