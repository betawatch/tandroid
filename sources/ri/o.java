package ri;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ci.o4;
import e2.l0;
import e2.z;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.go;
import ri.h;
import ri.i;
import ri.o;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class o {
    public static final pb.a H = new pb.a(22);
    public static final AtomicLong I = new AtomicLong(1);
    public volatile i A;
    public h0 B;
    public byte[] C;
    public l D;
    public final d E;
    public final d F;
    public final Context a;
    public final File b;
    public final long c;
    public final h d;
    public final boolean e;
    public final f f;
    public final k g;
    public final b h;
    public org.telegram.utils.recorder.audio.d o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new l0(6));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new l0(7));
    public final Object l = new Object();
    public final ArrayList m = new ArrayList();
    public m n = m.a;
    public long u = 1;
    public final z G = new z(this, 2);

    /* JADX WARN: Type inference failed for: r4v3, types: [ri.d] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ri.d] */
    public o(o4 o4Var) {
        p();
        Context context = (Context) o4Var.b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) o4Var.c;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = 700L;
        h hVar = (h) o4Var.d;
        this.d = hVar;
        this.e = o4Var.a;
        this.f = (f) o4Var.e;
        this.g = (k) o4Var.f;
        b bVar = new b((g) o4Var.g);
        this.h = bVar;
        final int i10 = 0;
        this.E = new Runnable(this) { // from class: ri.d
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h0 h0Var;
                switch (i10) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.n == m.c && !oVar.x) {
                            oVar.x = true;
                            oVar.h.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f.onMaximumDurationReached();
                            oVar.m();
                            break;
                        }
                        break;
                    default:
                        o oVar2 = this.b;
                        if (oVar2.n == m.e && (h0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = h0Var.M0();
                            long j10 = oVar2.s;
                            if (M0 < j10 || M0 >= oVar2.t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.s;
                            }
                            oVar2.f.onPreviewProgress(M0, oVar2.j());
                            oVar2.i.postDelayed(oVar2.F, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.F = new Runnable(this) { // from class: ri.d
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h0 h0Var;
                switch (i11) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.n == m.c && !oVar.x) {
                            oVar.x = true;
                            oVar.h.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f.onMaximumDurationReached();
                            oVar.m();
                            break;
                        }
                        break;
                    default:
                        o oVar2 = this.b;
                        if (oVar2.n == m.e && (h0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = h0Var.M0();
                            long j10 = oVar2.s;
                            if (M0 < j10 || M0 >= oVar2.t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.s;
                            }
                            oVar2.f.onPreviewProgress(M0, oVar2.j());
                            oVar2.i.postDelayed(oVar2.F, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + hVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
        }
    }

    public static long q(long j10) {
        return (j10 * 1000) / 48000;
    }

    public final void a(i iVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.l) {
            try {
                if (iVar.d && !iVar.e) {
                    long j11 = iVar.c;
                    if (j10 > j11) {
                        iVar.c = j10;
                        this.k.execute(new c(this, iVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        m mVar = this.n;
        m mVar2 = m.s;
        if (mVar == mVar2 || mVar == m.n) {
            return;
        }
        this.h.b("cancel requested: state=" + this.n);
        d dVar = this.E;
        Handler handler = this.i;
        handler.removeCallbacks(dVar);
        handler.removeCallbacks(this.F);
        o();
        k(j.b);
        r(mVar2);
        org.telegram.utils.recorder.audio.d dVar2 = this.o;
        if (dVar2 != null) {
            dVar2.d();
        } else {
            c();
            s();
        }
    }

    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        l lVar = this.D;
        p2.b bVar = new p2.b(16, this, lVar == null ? null : lVar.a);
        try {
            this.j.execute(bVar);
        } catch (RejectedExecutionException unused) {
            bVar.run();
        }
    }

    public final i d() {
        File f7 = f();
        long j10 = this.u;
        this.u = 1 + j10;
        i iVar = new i(j10, f7);
        synchronized (this.l) {
            this.A = iVar;
            this.k.execute(new fy0(this, iVar, f7, 17));
        }
        b bVar = this.h;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return iVar;
    }

    public final n e() {
        return new n(this.n);
    }

    public final File f() {
        File file = new File(this.b, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.m) {
            this.m.add(file);
        }
        return file;
    }

    public final void g(Exception exc) {
        m mVar = this.n;
        m mVar2 = m.r;
        if (mVar == mVar2 || mVar == m.s || mVar == m.n) {
            return;
        }
        this.h.a("fatal error in state=" + this.n, exc);
        Handler handler = this.i;
        handler.removeCallbacks(this.E);
        handler.removeCallbacks(this.F);
        o();
        k(j.c);
        r(mVar2);
        i iVar = this.A;
        if (iVar != null) {
            this.k.execute(new fy0(this, iVar, exc, 18));
        }
        this.f.onError(exc);
        org.telegram.utils.recorder.audio.d dVar = this.o;
        if (dVar != null) {
            dVar.d();
        } else {
            c();
            s();
        }
        l("error");
    }

    public final void h() {
        m mVar = m.h;
        p();
        m mVar2 = this.n;
        m mVar3 = m.c;
        if (mVar2 == mVar3 || mVar2 == m.e) {
            this.h.b("finish requested: state=" + this.n + ", durationMs=" + j() + ", trim=" + this.s + ".." + this.t);
            if (this.n == mVar3) {
                this.w = true;
                this.i.removeCallbacks(this.E);
                r(mVar);
                this.o.d();
                return;
            }
            o();
            r(mVar);
            final i iVar = this.A;
            if (iVar == null) {
                g(new IllegalStateException("Output generation is missing"));
                return;
            }
            long q6 = q(this.q);
            final long j10 = this.s;
            if (j10 == 0 && this.t == q6) {
                i();
                return;
            }
            final long j11 = this.t;
            k(j.a);
            final i d = d();
            this.j.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar;
                    i iVar2 = iVar;
                    i iVar3 = d;
                    long j12 = j10;
                    long j13 = j11;
                    o oVar2 = o.this;
                    Handler handler = oVar2.i;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        String absolutePath = iVar2.b.getAbsolutePath();
                        File file = iVar3.b;
                        String absolutePath2 = file.getAbsolutePath();
                        try {
                            if (!AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                                throw new IllegalStateException("Unable to trim final Opus output");
                            }
                            oVar2.h.b("final trim completed: source=" + iVar2.b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            oVar2.a(iVar3, file.length());
                            handler.post(new go(oVar2, j13, j12, 2));
                        } catch (Throwable th2) {
                            th = th2;
                            oVar = absolutePath2;
                            handler.post(new p2.b(15, oVar, th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        oVar = oVar2;
                    }
                }
            });
        }
    }

    public final void i() {
        if (this.n != m.h) {
            return;
        }
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 >= this.c) {
            this.j.execute(new org.telegram.utils.recorder.audio.b(j10, iVar, this));
            return;
        }
        this.h.b("recording rejected as too short: durationMs=" + j10);
        this.f.onRecordingTooShort(j10);
        k(j.b);
        r(m.s);
        c();
        s();
        l("too_short");
    }

    public final long j() {
        p();
        return q(this.q + this.r);
    }

    public final void k(j jVar) {
        synchronized (this.l) {
            i iVar = this.A;
            if (iVar != null && iVar.d && !iVar.e) {
                iVar.d = false;
                this.k.execute(new fy0(this, iVar, jVar, 19));
                this.h.b("output generation invalidated: id=" + iVar.a + ", reason=" + jVar);
            }
        }
    }

    public final void l(String str) {
        if (this.z) {
            return;
        }
        this.z = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.q + this.r));
        v.append(", generations=");
        v.append(this.u - 1);
        this.h.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.n != m.c || this.o == null) {
            return false;
        }
        this.h.b("pause requested: durationMs=" + j());
        this.i.removeCallbacks(this.E);
        r(m.d);
        this.o.d();
        return true;
    }

    public final void n() {
        p();
        m mVar = this.n;
        m mVar2 = m.s;
        if (mVar == mVar2) {
            return;
        }
        if (mVar != m.n) {
            b();
            return;
        }
        o();
        c();
        r(mVar2);
        l("released");
    }

    public final void o() {
        this.i.removeCallbacks(this.F);
        this.v = false;
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.C(this.G);
            this.B.X0();
            this.B = null;
        }
    }

    public final void r(m mVar) {
        m mVar2 = this.n;
        if (mVar2 == mVar) {
            return;
        }
        this.n = mVar;
        this.h.b("state: " + mVar2 + " -> " + mVar + ", durationMs=" + q(this.q + this.r));
        this.f.onStateChanged(e());
    }

    public final void s() {
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void t(long j10, long j11, File file) {
        long j12 = this.p + 1;
        this.p = j12;
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.b, file, j10, j11, this.d, this.h, new cc.e(j12, iVar, this));
        this.o = dVar;
        this.r = 0L;
        dVar.k.post(new Runnable() { // from class: org.telegram.utils.recorder.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.b;
                ri.b bVar = dVar2.f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(dVar2.a, dVar2.c, dVar2.d, dVar2.b);
                    dVar2.t = a2;
                    if (a2 == null) {
                        throw new IllegalStateException("Unable to initialize native Opus recorder");
                    }
                    if (dVar2.e == h.b) {
                        AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                        dVar2.u = a10;
                        if (a10 == null) {
                            bVar.b("RNNoise unavailable; recording unprocessed PCM");
                        } else {
                            bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                        }
                    }
                    long d = dVar2.t.d();
                    StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                    if (file2 == null) {
                        str = "none";
                    } else {
                        str = file2.getName() + " " + dVar2.c + ".." + dVar2.d;
                    }
                    sb2.append(str);
                    sb2.append(", initialBytes=");
                    sb2.append(d);
                    sb2.append(", queuedChunks=");
                    sb2.append(dVar2.m.get());
                    sb2.append(", elapsedMs=");
                    sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    bVar.b(sb2.toString());
                    dVar2.x = SystemClock.elapsedRealtime();
                    if (d > 0) {
                        cc.e eVar = dVar2.g;
                        ((o) eVar.c).a((i) eVar.b, d);
                    }
                } catch (Throwable th2) {
                    if (dVar2.v != null) {
                        return;
                    }
                    dVar2.f.a("encoding failed", th2);
                    dVar2.v = d.a(th2);
                    dVar2.n = true;
                }
            }
        });
        dVar.i.post(new a(dVar, 0));
    }
}
