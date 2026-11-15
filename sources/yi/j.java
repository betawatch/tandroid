package yi;

import a8.p0;
import ai.e0;
import ai.x0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b7.l;
import fi.a4;
import h2.z;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import l2.f0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.le;
import org.telegram.messenger.ns;
import ug.t1;
import yi.h;
import yi.i;
import yi.j;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class j {
    public static final sa.d H = new sa.d(29);
    public static final AtomicLong I = new AtomicLong(1);
    public f0 A;
    public byte[] B;
    public ac.e C;
    public final e D;
    public final e E;
    public final Context a;
    public final File b;
    public final long c;
    public final h d;
    public final boolean e;
    public final ji.j f;
    public final k8.a g;
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
    public volatile i z;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new x0(9));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new x0(10));
    public final Object l = new Object();
    public final ArrayList m = new ArrayList();
    public int G = 1;
    public long t = 1;
    public final z F = new z(this, 2);

    /* JADX WARN: Type inference failed for: r4v3, types: [yi.e] */
    /* JADX WARN: Type inference failed for: r4v4, types: [yi.e] */
    public j(a4 a4Var) {
        q();
        Context context = (Context) a4Var.b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) a4Var.c;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = 700L;
        h hVar = (h) a4Var.d;
        this.d = hVar;
        this.e = a4Var.a;
        this.f = (ji.j) a4Var.e;
        this.g = (k8.a) a4Var.f;
        b bVar = new b((g) a4Var.g);
        this.h = bVar;
        final int i7 = 0;
        this.D = new Runnable(this) { // from class: yi.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f0 f0Var;
                switch (i7) {
                    case 0:
                        j jVar = this.b;
                        if (jVar.G == 3 && !jVar.w) {
                            jVar.w = true;
                            jVar.h.b("maximum duration reached: durationMs=" + jVar.j());
                            jVar.f.getClass();
                            jVar.n();
                            break;
                        }
                        break;
                    default:
                        j jVar2 = this.b;
                        if (jVar2.G == 5 && (f0Var = jVar2.A) != null && jVar2.u) {
                            long l10 = f0Var.l();
                            long j3 = jVar2.r;
                            if (l10 < j3 || l10 >= jVar2.s) {
                                jVar2.A.Z0(5, j3);
                            }
                            ji.j jVar3 = jVar2.f;
                            jVar2.j();
                            jVar3.getClass();
                            jVar2.i.postDelayed(jVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.E = new Runnable(this) { // from class: yi.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f0 f0Var;
                switch (i10) {
                    case 0:
                        j jVar = this.b;
                        if (jVar.G == 3 && !jVar.w) {
                            jVar.w = true;
                            jVar.h.b("maximum duration reached: durationMs=" + jVar.j());
                            jVar.f.getClass();
                            jVar.n();
                            break;
                        }
                        break;
                    default:
                        j jVar2 = this.b;
                        if (jVar2.G == 5 && (f0Var = jVar2.A) != null && jVar2.u) {
                            long l10 = f0Var.l();
                            long j3 = jVar2.r;
                            if (l10 < j3 || l10 >= jVar2.s) {
                                jVar2.A.Z0(5, j3);
                            }
                            ji.j jVar3 = jVar2.f;
                            jVar2.j();
                            jVar3.getClass();
                            jVar2.i.postDelayed(jVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + hVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
        }
    }

    public static long r(long j3) {
        return (j3 * 1000) / 48000;
    }

    public final void a(i iVar, long j3) {
        if (j3 <= 0) {
            return;
        }
        synchronized (this.l) {
            try {
                if (iVar.d && !iVar.e) {
                    long j10 = iVar.c;
                    if (j3 > j10) {
                        iVar.c = j3;
                        this.k.execute(new c(this, iVar, j10, j3 - j10, 1));
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
        this.h.b("cancel requested: state=".concat(r.b.x(i7)));
        e eVar = this.D;
        Handler handler = this.i;
        handler.removeCallbacks(eVar);
        handler.removeCallbacks(this.E);
        p();
        k(2);
        s(10);
        org.telegram.utils.recorder.audio.d dVar = this.n;
        if (dVar != null) {
            dVar.d();
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
        t1 t1Var = new t1(27, this, eVar == null ? null : (File) eVar.b);
        try {
            this.j.execute(t1Var);
        } catch (RejectedExecutionException unused) {
            t1Var.run();
        }
    }

    public final i d() {
        File f10 = f();
        long j3 = this.t;
        this.t = 1 + j3;
        i iVar = new i(j3, f10);
        synchronized (this.l) {
            this.z = iVar;
            this.k.execute(new d(this, iVar, f10, 1));
        }
        b bVar = this.h;
        StringBuilder t6 = p0.t(j3, "output generation started: id=", ", file=");
        t6.append(f10.getName());
        bVar.b(t6.toString());
        return iVar;
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
        this.h.a("fatal error in state=".concat(r.b.x(i7)), exc);
        Handler handler = this.i;
        handler.removeCallbacks(this.D);
        handler.removeCallbacks(this.E);
        p();
        k(3);
        s(9);
        i iVar = this.z;
        if (iVar != null) {
            this.k.execute(new c(this, iVar, exc));
        }
        MediaController mediaController = ((le) this.f.b).a;
        String[] strArr = MediaController.W1;
        a8.e("AudioRecorderV2 failed", exc);
        ns.f(mediaController.i1).k(ns.m2, Integer.valueOf(mediaController.h1));
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
            this.h.b("finish requested: state=" + r.b.x(this.G) + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
            if (this.G == 3) {
                this.v = true;
                this.i.removeCallbacks(this.D);
                s(7);
                this.n.d();
                return;
            }
            p();
            s(7);
            final i iVar = this.z;
            if (iVar == null) {
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
            final i d = d();
            this.j.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar;
                    i iVar2 = iVar;
                    i iVar3 = d;
                    long j11 = j3;
                    long j12 = j10;
                    j jVar2 = j.this;
                    Handler handler = jVar2.i;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        String absolutePath = iVar2.b.getAbsolutePath();
                        File file = iVar3.b;
                        String absolutePath2 = file.getAbsolutePath();
                        try {
                            if (!AudioRecorderNative.b(absolutePath, absolutePath2, j11, j12)) {
                                throw new IllegalStateException("Unable to trim final Opus output");
                            }
                            jVar2.h.b("final trim completed: source=" + iVar2.b.getName() + ", output=" + file.getName() + ", trim=" + j11 + ".." + j12 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            jVar2.a(iVar3, file.length());
                            handler.post(new e0(jVar2, j12, j11, 4));
                        } catch (Throwable th2) {
                            th = th2;
                            jVar = absolutePath2;
                            handler.post(new t1(26, jVar, th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jVar = jVar2;
                    }
                }
            });
        }
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        i iVar = this.z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j3 = j();
        if (j3 >= this.c) {
            this.j.execute(new org.telegram.utils.recorder.audio.b(j3, iVar, this));
            return;
        }
        this.h.b("recording rejected as too short: durationMs=" + j3);
        MediaController mediaController = ((le) this.f.b).a;
        ns.f(mediaController.i1).k(ns.t2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j3));
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
            i iVar = this.z;
            if (iVar != null && iVar.d && !iVar.e) {
                iVar.d = false;
                this.k.execute(new c(this, iVar, i7));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(iVar.a);
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
        ji.j jVar = this.f;
        MediaController mediaController = ((le) jVar.b).a;
        int i7 = e10.a;
        e0.g gVar = (e0.g) jVar.c;
        int i10 = gVar.a;
        gVar.a = i7;
        if (i7 == 3) {
            boolean z10 = gVar.b;
            if (!z10 && i10 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.W1;
                if (!mediaController.J1) {
                    ns.f(mediaController.i1).k(ns.l2, Integer.valueOf(mediaController.h1), Boolean.TRUE);
                }
            } else if (!z10 && i10 == 6) {
                mediaController.Y(true);
                ns.f(mediaController.i1).k(ns.p2, new Object[0]);
            }
            if (gVar.b) {
                if (i7 == 3 || i7 == 5) {
                    gVar.b = false;
                    ((j) gVar.e).h();
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
        f0 f0Var = this.A;
        if (f0Var != null) {
            f0Var.h0(this.F);
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
        this.h.b("state: " + r.b.x(i10) + " -> " + r.b.x(i7) + ", durationMs=" + r(this.p + this.q));
        m();
    }

    public final void t() {
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void u(long j3, long j10, File file) {
        long j11 = this.o + 1;
        this.o = j11;
        i iVar = this.z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.b, file, j3, j10, this.d, this.h, new ac.e(j11, iVar, this));
        this.n = dVar;
        this.q = 0L;
        dVar.k.post(new Runnable() { // from class: org.telegram.utils.recorder.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.b;
                yi.b bVar = dVar2.f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a10 = AudioRecorderNative.a(dVar2.c, dVar2.d, dVar2.a, dVar2.b);
                    dVar2.t = a10;
                    if (a10 == null) {
                        throw new IllegalStateException("Unable to initialize native Opus recorder");
                    }
                    if (dVar2.e == h.b) {
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
                        ((j) eVar.c).a((i) eVar.b, d);
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
