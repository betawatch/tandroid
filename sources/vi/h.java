package vi;

import a8.p0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b7.l;
import di.h4;
import h2.l0;
import h2.z;
import j2.n;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import l2.i0;
import m4.d0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.me;
import org.telegram.messenger.qs;
import org.telegram.messenger.xk;
import org.telegram.ui.Components.r31;
import u9.f;
import vi.g;
import vi.h;
import w7.s;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class h {
    public static final s H = new s(26, false);
    public static final AtomicLong I = new AtomicLong(1);
    public i0 A;
    public byte[] B;
    public ac.e C;
    public final d D;
    public final d E;
    public final Context a;
    public final File b;
    public final long c;
    public final f d;
    public final boolean e;
    public final n f;
    public final d0 g;
    public final b h;
    public org.telegram.utils.recorder.audio.d n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public volatile g z;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new l0(8));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new l0(9));
    public final Object l = new Object();
    public final ArrayList m = new ArrayList();
    public int G = 1;
    public long t = 1;
    public final z F = new z(this, 2);

    /* JADX WARN: Type inference failed for: r4v3, types: [vi.d] */
    /* JADX WARN: Type inference failed for: r4v4, types: [vi.d] */
    public h(h4 h4Var) {
        q();
        Context context = (Context) h4Var.b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) h4Var.c;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = 700L;
        f fVar = (f) h4Var.d;
        this.d = fVar;
        this.e = h4Var.a;
        this.f = (n) h4Var.e;
        this.g = (d0) h4Var.f;
        b bVar = new b((s) h4Var.g);
        this.h = bVar;
        final int i7 = 0;
        this.D = new Runnable(this) { // from class: vi.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                switch (i7) {
                    case 0:
                        h hVar = this.b;
                        if (hVar.G == 3 && !hVar.w) {
                            hVar.w = true;
                            hVar.h.b("maximum duration reached: durationMs=" + hVar.j());
                            hVar.f.getClass();
                            hVar.n();
                            break;
                        }
                        break;
                    default:
                        h hVar2 = this.b;
                        if (hVar2.G == 5 && (i0Var = hVar2.A) != null && hVar2.u) {
                            long l10 = i0Var.l();
                            long j3 = hVar2.r;
                            if (l10 < j3 || l10 >= hVar2.s) {
                                hVar2.A.Z0(5, j3);
                            }
                            n nVar = hVar2.f;
                            hVar2.j();
                            nVar.getClass();
                            hVar2.i.postDelayed(hVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.E = new Runnable(this) { // from class: vi.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                switch (i10) {
                    case 0:
                        h hVar = this.b;
                        if (hVar.G == 3 && !hVar.w) {
                            hVar.w = true;
                            hVar.h.b("maximum duration reached: durationMs=" + hVar.j());
                            hVar.f.getClass();
                            hVar.n();
                            break;
                        }
                        break;
                    default:
                        h hVar2 = this.b;
                        if (hVar2.G == 5 && (i0Var = hVar2.A) != null && hVar2.u) {
                            long l10 = i0Var.l();
                            long j3 = hVar2.r;
                            if (l10 < j3 || l10 >= hVar2.s) {
                                hVar2.A.Z0(5, j3);
                            }
                            n nVar = hVar2.f;
                            hVar2.j();
                            nVar.getClass();
                            hVar2.i.postDelayed(hVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + fVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
        }
    }

    public static long r(long j3) {
        return (j3 * 1000) / 48000;
    }

    public final void a(g gVar, long j3) {
        if (j3 <= 0) {
            return;
        }
        synchronized (this.l) {
            try {
                if (gVar.d && !gVar.e) {
                    long j10 = gVar.c;
                    if (j3 > j10) {
                        gVar.c = j3;
                        this.k.execute(new c(this, gVar, j10, j3 - j10, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        q();
        int i7 = this.G;
        if (i7 == 10 || i7 == 8) {
            return;
        }
        this.h.b("cancel requested: state=".concat(rf.b.s(i7)));
        d dVar = this.D;
        Handler handler = this.i;
        handler.removeCallbacks(dVar);
        handler.removeCallbacks(this.E);
        p();
        k(2);
        s(10);
        org.telegram.utils.recorder.audio.d dVar2 = this.n;
        if (dVar2 != null) {
            dVar2.d();
        } else {
            c();
            t();
        }
    }

    public final void c() {
        if (this.x) {
            return;
        }
        this.x = true;
        ac.e eVar = this.C;
        u9.f fVar = new u9.f(14, this, eVar == null ? null : (File) eVar.b);
        try {
            this.j.execute(fVar);
        } catch (RejectedExecutionException unused) {
            fVar.run();
        }
    }

    public final g d() {
        File f10 = f();
        long j3 = this.t;
        this.t = 1 + j3;
        g gVar = new g(j3, f10);
        synchronized (this.l) {
            this.z = gVar;
            this.k.execute(new r31(this, gVar, f10, 19));
        }
        b bVar = this.h;
        StringBuilder t6 = p0.t(j3, "output generation started: id=", ", file=");
        t6.append(f10.getName());
        bVar.b(t6.toString());
        return gVar;
    }

    public final l e() {
        return new l(this.G);
    }

    public final File f() {
        File file = new File(this.b, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.m) {
            this.m.add(file);
        }
        return file;
    }

    public final void g(Exception exc) {
        int i7 = this.G;
        if (i7 == 9 || i7 == 10 || i7 == 8) {
            return;
        }
        this.h.a("fatal error in state=".concat(rf.b.s(i7)), exc);
        Handler handler = this.i;
        handler.removeCallbacks(this.D);
        handler.removeCallbacks(this.E);
        p();
        k(3);
        s(9);
        g gVar = this.z;
        if (gVar != null) {
            this.k.execute(new c(this, gVar, exc));
        }
        MediaController mediaController = ((me) this.f.b).a;
        String[] strArr = MediaController.V1;
        a8.e("AudioRecorderV2 failed", exc);
        qs.f(mediaController.h1).k(qs.m2, Integer.valueOf(mediaController.g1));
        mediaController.x(false);
        org.telegram.utils.recorder.audio.d dVar = this.n;
        if (dVar != null) {
            dVar.d();
        } else {
            c();
            t();
        }
        l("error");
    }

    public final void h() {
        q();
        int i7 = this.G;
        if (i7 == 3 || i7 == 5) {
            this.h.b("finish requested: state=" + rf.b.s(this.G) + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
            if (this.G == 3) {
                this.v = true;
                this.i.removeCallbacks(this.D);
                s(7);
                this.n.d();
                return;
            }
            p();
            s(7);
            final g gVar = this.z;
            if (gVar == null) {
                g(new IllegalStateException("Output generation is missing"));
                return;
            }
            long r10 = r(this.p);
            final long j3 = this.r;
            if (j3 == 0 && this.s == r10) {
                i();
                return;
            }
            final long j10 = this.s;
            k(1);
            final g d = d();
            this.j.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    h hVar;
                    g gVar2 = gVar;
                    g gVar3 = d;
                    long j11 = j3;
                    long j12 = j10;
                    h hVar2 = h.this;
                    Handler handler = hVar2.i;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        String absolutePath = gVar2.b.getAbsolutePath();
                        File file = gVar3.b;
                        String absolutePath2 = file.getAbsolutePath();
                        try {
                            if (!AudioRecorderNative.b(absolutePath, absolutePath2, j11, j12)) {
                                throw new IllegalStateException("Unable to trim final Opus output");
                            }
                            hVar2.h.b("final trim completed: source=" + gVar2.b.getName() + ", output=" + file.getName() + ", trim=" + j11 + ".." + j12 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            hVar2.a(gVar3, file.length());
                            handler.post(new xk(hVar2, j12, j11, 3));
                        } catch (Throwable th2) {
                            th = th2;
                            hVar = absolutePath2;
                            handler.post(new f(13, hVar, th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        hVar = hVar2;
                    }
                }
            });
        }
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        g gVar = this.z;
        if (gVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j3 = j();
        if (j3 >= this.c) {
            this.j.execute(new org.telegram.utils.recorder.audio.b(j3, gVar, this));
            return;
        }
        this.h.b("recording rejected as too short: durationMs=" + j3);
        MediaController mediaController = ((me) this.f.b).a;
        qs.f(mediaController.h1).k(qs.t2, Integer.valueOf(mediaController.g1), Boolean.FALSE, Integer.valueOf((int) j3));
        mediaController.x(false);
        k(2);
        s(10);
        c();
        t();
        l("too_short");
    }

    public final long j() {
        q();
        return r(this.p + this.q);
    }

    public final void k(int i7) {
        synchronized (this.l) {
            g gVar = this.z;
            if (gVar != null && gVar.d && !gVar.e) {
                gVar.d = false;
                this.k.execute(new c(this, gVar, i7));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(gVar.a);
                sb2.append(", reason=");
                sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "ERROR" : "CANCELLED" : "REBUILT");
                bVar.b(sb2.toString());
            }
        }
    }

    public final void l(String str) {
        if (this.y) {
            return;
        }
        this.y = true;
        StringBuilder u10 = p0.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.p + this.q));
        u10.append(", generations=");
        u10.append(this.t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        l e10 = e();
        n nVar = this.f;
        MediaController mediaController = ((me) nVar.b).a;
        int i7 = e10.a;
        e0.g gVar = (e0.g) nVar.c;
        int i10 = gVar.a;
        gVar.a = i7;
        if (i7 == 3) {
            boolean z9 = gVar.b;
            if (!z9 && i10 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.V1;
                if (!mediaController.I1) {
                    qs.f(mediaController.h1).k(qs.l2, Integer.valueOf(mediaController.g1), Boolean.TRUE);
                }
            } else if (!z9 && i10 == 6) {
                mediaController.Y(true);
                qs.f(mediaController.h1).k(qs.p2, new Object[0]);
            }
            if (gVar.b) {
                if (i7 == 3 || i7 == 5) {
                    gVar.b = false;
                    ((h) gVar.e).h();
                }
            }
        }
    }

    public final boolean n() {
        q();
        if (this.G != 3 || this.n == null) {
            return false;
        }
        this.h.b("pause requested: durationMs=" + j());
        this.i.removeCallbacks(this.D);
        s(4);
        this.n.d();
        return true;
    }

    public final void o() {
        q();
        int i7 = this.G;
        if (i7 == 10) {
            return;
        }
        if (i7 != 8) {
            b();
            return;
        }
        p();
        c();
        s(10);
        l("released");
    }

    public final void p() {
        this.i.removeCallbacks(this.E);
        this.u = false;
        i0 i0Var = this.A;
        if (i0Var != null) {
            i0Var.h0(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void s(int i7) {
        int i10 = this.G;
        if (i10 == i7) {
            return;
        }
        this.G = i7;
        this.h.b("state: " + rf.b.s(i10) + " -> " + rf.b.s(i7) + ", durationMs=" + r(this.p + this.q));
        m();
    }

    public final void t() {
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void u(long j3, long j10, File file) {
        long j11 = this.o + 1;
        this.o = j11;
        g gVar = this.z;
        if (gVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(gVar.b, file, j3, j10, this.d, this.h, new ac.e(j11, gVar, this));
        this.n = dVar;
        this.q = 0L;
        dVar.k.post(new Runnable() { // from class: org.telegram.utils.recorder.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.b;
                vi.b bVar = dVar2.f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a10 = AudioRecorderNative.a(dVar2.c, dVar2.d, dVar2.a, dVar2.b);
                    dVar2.t = a10;
                    if (a10 == null) {
                        throw new IllegalStateException("Unable to initialize native Opus recorder");
                    }
                    if (dVar2.e == vi.f.b) {
                        AudioNoiseSuppressor a11 = AudioNoiseSuppressor.a();
                        dVar2.u = a11;
                        if (a11 == null) {
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
                        ac.e eVar = dVar2.g;
                        ((h) eVar.c).a((g) eVar.b, d);
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
