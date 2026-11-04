package vi;

import a7.l;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ei.i4;
import g2.a0;
import g2.m0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import k2.i0;
import m2.t;
import mi.h0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ge;
import org.telegram.messenger.hs;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.iv0;
import vi.f;
import vi.h;
import vi.i;
import vi.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class j {
    public static final nb.a H = new nb.a(26);
    public static final AtomicLong I = new AtomicLong(1);
    public i0 A;
    public byte[] B;
    public f C;
    public final d D;
    public final d E;
    public final Context a;
    public final File b;
    public final long c;
    public final h d;
    public final boolean e;
    public final h0 f;
    public final t g;
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
    public final ExecutorService j = Executors.newSingleThreadExecutor(new m0(7));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new m0(8));
    public final Object l = new Object();
    public final ArrayList m = new ArrayList();
    public int G = 1;
    public long t = 1;
    public final a0 F = new a0(this, 2);

    /* JADX WARN: Type inference failed for: r4v3, types: [vi.d] */
    /* JADX WARN: Type inference failed for: r4v4, types: [vi.d] */
    public j(i4 i4Var) {
        q();
        Context context = (Context) i4Var.b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) i4Var.c;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = 700L;
        h hVar = (h) i4Var.d;
        this.d = hVar;
        this.e = i4Var.a;
        this.f = (h0) i4Var.e;
        this.g = (t) i4Var.f;
        b bVar = new b((g) i4Var.g);
        this.h = bVar;
        final int i3 = 0;
        this.D = new Runnable(this) { // from class: vi.d
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                switch (i3) {
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
                        if (jVar2.G == 5 && (i0Var = jVar2.A) != null && jVar2.u) {
                            long N0 = i0Var.N0();
                            long j10 = jVar2.r;
                            if (N0 < j10 || N0 >= jVar2.s) {
                                jVar2.A.Z0(5, j10);
                            }
                            h0 h0Var = jVar2.f;
                            jVar2.j();
                            h0Var.getClass();
                            jVar2.i.postDelayed(jVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.E = new Runnable(this) { // from class: vi.d
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
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
                        if (jVar2.G == 5 && (i0Var = jVar2.A) != null && jVar2.u) {
                            long N0 = i0Var.N0();
                            long j10 = jVar2.r;
                            if (N0 < j10 || N0 >= jVar2.s) {
                                jVar2.A.Z0(5, j10);
                            }
                            h0 h0Var = jVar2.f;
                            jVar2.j();
                            h0Var.getClass();
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

    public static long r(long j10) {
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
        q();
        int i3 = this.G;
        if (i3 == 10 || i3 == 8) {
            return;
        }
        this.h.b("cancel requested: state=".concat(t4.c.r(i3)));
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
        f fVar = this.C;
        u9.a aVar = new u9.a(13, this, fVar == null ? null : (File) fVar.b);
        try {
            this.j.execute(aVar);
        } catch (RejectedExecutionException unused) {
            aVar.run();
        }
    }

    public final i d() {
        File f10 = f();
        long j10 = this.t;
        this.t = 1 + j10;
        i iVar = new i(j10, f10);
        synchronized (this.l) {
            this.z = iVar;
            this.k.execute(new iv0(this, iVar, f10, 21));
        }
        b bVar = this.h;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f10.getName());
        bVar.b(t10.toString());
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
        int i3 = this.G;
        if (i3 == 9 || i3 == 10 || i3 == 8) {
            return;
        }
        this.h.a("fatal error in state=".concat(t4.c.r(i3)), exc);
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
        MediaController mediaController = ((ge) this.f.b).a;
        String[] strArr = MediaController.W1;
        a8.e("AudioRecorderV2 failed", exc);
        hs.f(mediaController.i1).k(hs.m2, Integer.valueOf(mediaController.h1));
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
        int i3 = this.G;
        if (i3 == 3 || i3 == 5) {
            this.h.b("finish requested: state=" + t4.c.r(this.G) + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
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
            long r5 = r(this.p);
            final long j10 = this.r;
            if (j10 == 0 && this.s == r5) {
                i();
                return;
            }
            final long j11 = this.s;
            k(1);
            final i d = d();
            this.j.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar;
                    i iVar2 = iVar;
                    i iVar3 = d;
                    long j12 = j10;
                    long j13 = j11;
                    j jVar2 = j.this;
                    Handler handler = jVar2.i;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        String absolutePath = iVar2.b.getAbsolutePath();
                        File file = iVar3.b;
                        String absolutePath2 = file.getAbsolutePath();
                        try {
                            if (!AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                                throw new IllegalStateException("Unable to trim final Opus output");
                            }
                            jVar2.h.b("final trim completed: source=" + iVar2.b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            jVar2.a(iVar3, file.length());
                            handler.post(new ok(jVar2, j13, j12, 3));
                        } catch (Throwable th2) {
                            th = th2;
                            jVar = absolutePath2;
                            handler.post(new u9.a(12, jVar, th));
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
        long j10 = j();
        if (j10 >= this.c) {
            this.j.execute(new org.telegram.utils.recorder.audio.b(j10, iVar, this));
            return;
        }
        this.h.b("recording rejected as too short: durationMs=" + j10);
        MediaController mediaController = ((ge) this.f.b).a;
        hs.f(mediaController.i1).k(hs.t2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j10));
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

    public final void k(int i3) {
        synchronized (this.l) {
            i iVar = this.z;
            if (iVar != null && iVar.d && !iVar.e) {
                iVar.d = false;
                this.k.execute(new c(this, iVar, i3));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(iVar.a);
                sb2.append(", reason=");
                sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "ERROR" : "CANCELLED" : "REBUILT");
                bVar.b(sb2.toString());
            }
        }
    }

    public final void l(String str) {
        if (this.y) {
            return;
        }
        this.y = true;
        StringBuilder u10 = a1.g.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.p + this.q));
        u10.append(", generations=");
        u10.append(this.t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        l e10 = e();
        h0 h0Var = this.f;
        MediaController mediaController = ((ge) h0Var.b).a;
        int i3 = e10.a;
        e0.g gVar = (e0.g) h0Var.c;
        int i10 = gVar.a;
        gVar.a = i3;
        if (i3 == 3) {
            boolean z10 = gVar.b;
            if (!z10 && i10 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.W1;
                if (!mediaController.J1) {
                    hs.f(mediaController.i1).k(hs.l2, Integer.valueOf(mediaController.h1), Boolean.TRUE);
                }
            } else if (!z10 && i10 == 6) {
                mediaController.Y(true);
                hs.f(mediaController.i1).k(hs.p2, new Object[0]);
            }
            if (gVar.b) {
                if (i3 == 3 || i3 == 5) {
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
        int i3 = this.G;
        if (i3 == 10) {
            return;
        }
        if (i3 != 8) {
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
            i0Var.s(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void s(int i3) {
        int i10 = this.G;
        if (i10 == i3) {
            return;
        }
        this.G = i3;
        this.h.b("state: " + t4.c.r(i10) + " -> " + t4.c.r(i3) + ", durationMs=" + r(this.p + this.q));
        m();
    }

    public final void t() {
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void u(long j10, long j11, File file) {
        long j12 = this.o + 1;
        this.o = j12;
        i iVar = this.z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.b, file, j10, j11, this.d, this.h, new f(j12, iVar, this));
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
                        f fVar = dVar2.g;
                        ((j) fVar.c).a((i) fVar.b, d);
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
