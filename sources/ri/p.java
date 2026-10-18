package ri;

import ai.b3;
import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import e2.l0;
import e2.z;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.go;
import org.telegram.ui.lh0;
import ri.i;
import ri.j;
import ri.p;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class p {
    public static final pb.a G = new pb.a(22);
    public static final AtomicLong H = new AtomicLong(1);
    public h0 A;
    public byte[] B;
    public m C;
    public final e D;
    public final e E;
    public final Context a;
    public final File b;
    public final long c;
    public final i d;
    public final g e;
    public final l f;
    public final b g;
    public org.telegram.utils.recorder.audio.b n;
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
    public volatile j z;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService i = Executors.newSingleThreadExecutor(new l0(6));
    public final ExecutorService j = Executors.newSingleThreadExecutor(new l0(7));
    public final Object k = new Object();
    public final ArrayList l = new ArrayList();
    public n m = n.a;
    public long t = 1;
    public final z F = new z(this, 2);

    /* JADX WARN: Type inference failed for: r4v3, types: [ri.e] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ri.e] */
    public p(com.google.firebase.messaging.l lVar) {
        p();
        Context context = (Context) lVar.a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) lVar.b;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = 700L;
        i iVar = (i) lVar.c;
        this.d = iVar;
        this.e = (g) lVar.d;
        this.f = (l) lVar.e;
        b bVar = new b((h) lVar.f);
        this.g = bVar;
        final int i10 = 0;
        this.D = new Runnable(this) { // from class: ri.e
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h0 h0Var;
                switch (i10) {
                    case 0:
                        p pVar = this.b;
                        if (pVar.m == n.c && !pVar.w) {
                            pVar.w = true;
                            pVar.g.b("maximum duration reached: durationMs=" + pVar.j());
                            pVar.e.onMaximumDurationReached();
                            pVar.m();
                            break;
                        }
                        break;
                    default:
                        p pVar2 = this.b;
                        if (pVar2.m == n.e && (h0Var = pVar2.A) != null && pVar2.u) {
                            long M0 = h0Var.M0();
                            long j10 = pVar2.r;
                            if (M0 < j10 || M0 >= pVar2.s) {
                                pVar2.A.Z0(5, j10);
                                M0 = pVar2.r;
                            }
                            pVar2.e.onPreviewProgress(M0, pVar2.j());
                            pVar2.h.postDelayed(pVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.E = new Runnable(this) { // from class: ri.e
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h0 h0Var;
                switch (i11) {
                    case 0:
                        p pVar = this.b;
                        if (pVar.m == n.c && !pVar.w) {
                            pVar.w = true;
                            pVar.g.b("maximum duration reached: durationMs=" + pVar.j());
                            pVar.e.onMaximumDurationReached();
                            pVar.m();
                            break;
                        }
                        break;
                    default:
                        p pVar2 = this.b;
                        if (pVar2.m == n.e && (h0Var = pVar2.A) != null && pVar2.u) {
                            long M0 = h0Var.M0();
                            long j10 = pVar2.r;
                            if (M0 < j10 || M0 >= pVar2.s) {
                                pVar2.A.Z0(5, j10);
                                M0 = pVar2.r;
                            }
                            pVar2.e.onPreviewProgress(M0, pVar2.j());
                            pVar2.h.postDelayed(pVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + iVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
        }
    }

    public static long q(long j10) {
        return (j10 * 1000) / 48000;
    }

    public final void a(j jVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.k) {
            try {
                if (jVar.d && !jVar.e) {
                    long j11 = jVar.c;
                    if (j10 > j11) {
                        jVar.c = j10;
                        this.j.execute(new c(this, jVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        n nVar = this.m;
        n nVar2 = n.s;
        if (nVar == nVar2 || nVar == n.n) {
            return;
        }
        this.g.b("cancel requested: state=" + this.m);
        this.h.removeCallbacksAndMessages(null);
        o();
        k(k.b);
        r(nVar2);
        org.telegram.utils.recorder.audio.b bVar = this.n;
        if (bVar != null) {
            bVar.f();
        } else {
            c();
            s();
        }
    }

    public final void c() {
        int i10;
        if (this.x) {
            return;
        }
        this.x = true;
        m mVar = this.C;
        File file = mVar == null ? null : mVar.a;
        synchronized (this.l) {
            while (i10 < this.l.size()) {
                try {
                    File file2 = (File) this.l.get(i10);
                    i10 = (file != null && file.equals(file2)) ? i10 + 1 : 0;
                    if (file2.exists() && !file2.delete()) {
                        this.g.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.l.clear();
        }
    }

    public final j d() {
        File f7 = f("voice");
        long j10 = this.t;
        this.t = 1 + j10;
        j jVar = new j(j10, f7);
        synchronized (this.k) {
            this.z = jVar;
            this.j.execute(new ay0(this, jVar, f7, 17));
        }
        b bVar = this.g;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return jVar;
    }

    public final o e() {
        return new o(this.m);
    }

    public final File f(String str) {
        File file = this.b;
        StringBuilder v = a1.g.v("audio_recording_", str, "_");
        v.append(System.currentTimeMillis());
        v.append("_");
        v.append(H.getAndIncrement());
        v.append(".ogg");
        File file2 = new File(file, v.toString());
        synchronized (this.l) {
            this.l.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        n nVar = this.m;
        n nVar2 = n.r;
        if (nVar == nVar2 || nVar == n.s || nVar == n.n) {
            return;
        }
        this.g.a("fatal error in state=" + this.m, exc);
        this.h.removeCallbacksAndMessages(null);
        o();
        k(k.c);
        r(nVar2);
        j jVar = this.z;
        if (jVar != null) {
            this.j.execute(new ay0(this, jVar, exc, 18));
        }
        this.e.onError(exc);
        org.telegram.utils.recorder.audio.b bVar = this.n;
        if (bVar != null) {
            bVar.f();
        } else {
            c();
            s();
        }
        l("error");
    }

    public final void h() {
        n nVar = n.h;
        p();
        n nVar2 = this.m;
        n nVar3 = n.c;
        if (nVar2 == nVar3 || nVar2 == n.e) {
            this.g.b("finish requested: state=" + this.m + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
            if (this.m == nVar3) {
                this.v = true;
                this.h.removeCallbacks(this.D);
                r(nVar);
                this.n.f();
                return;
            }
            o();
            r(nVar);
            final j jVar = this.z;
            if (jVar == null) {
                g(new IllegalStateException("Output generation is missing"));
                return;
            }
            long q6 = q(this.p);
            final long j10 = this.r;
            if (j10 == 0 && this.s == q6) {
                i();
                return;
            }
            final long j11 = this.s;
            k(k.a);
            final j d = d();
            this.i.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    p pVar;
                    j jVar2 = jVar;
                    j jVar3 = d;
                    long j12 = j10;
                    long j13 = j11;
                    p pVar2 = p.this;
                    Handler handler = pVar2.h;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        String absolutePath = jVar2.b.getAbsolutePath();
                        File file = jVar3.b;
                        String absolutePath2 = file.getAbsolutePath();
                        try {
                            if (!AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                                throw new IllegalStateException("Unable to trim final Opus output");
                            }
                            pVar2.g.b("final trim completed: source=" + jVar2.b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            pVar2.a(jVar3, file.length());
                            handler.post(new go(pVar2, j13, j12, 2));
                        } catch (Throwable th2) {
                            th = th2;
                            pVar = absolutePath2;
                            handler.post(new ri.d(pVar, th, 0));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        pVar = pVar2;
                    }
                }
            });
        }
    }

    public final void i() {
        if (this.m != n.h) {
            return;
        }
        final j jVar = this.z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final long j10 = j();
        if (j10 >= this.c) {
            this.i.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.c
                @Override // java.lang.Runnable
                public final void run() {
                    byte[] bArr;
                    p pVar = p.this;
                    j jVar2 = jVar;
                    try {
                        bArr = AudioRecorderNative.e(jVar2.b.getAbsolutePath());
                    } catch (Throwable th2) {
                        pVar.g.a("final waveform extraction failed", th2);
                        bArr = null;
                    }
                    byte[] bArr2 = bArr;
                    pVar.h.post(new b3(pVar, jVar2, j10, bArr2, 27));
                }
            });
            return;
        }
        this.g.b("recording rejected as too short: durationMs=" + j10);
        this.e.onRecordingTooShort(j10);
        k(k.b);
        r(n.s);
        c();
        s();
        l("too_short");
    }

    public final long j() {
        p();
        return q(this.p + this.q);
    }

    public final void k(k kVar) {
        synchronized (this.k) {
            j jVar = this.z;
            if (jVar != null && jVar.d && !jVar.e) {
                jVar.d = false;
                this.j.execute(new ay0(this, jVar, kVar, 19));
                this.g.b("output generation invalidated: id=" + jVar.a + ", reason=" + kVar);
            }
        }
    }

    public final void l(String str) {
        if (this.y) {
            return;
        }
        this.y = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.p + this.q));
        v.append(", generations=");
        v.append(this.t - 1);
        this.g.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.m != n.c || this.n == null) {
            return false;
        }
        this.g.b("pause requested: durationMs=" + j());
        this.h.removeCallbacks(this.D);
        r(n.d);
        this.n.f();
        return true;
    }

    public final void n() {
        p();
        n nVar = this.m;
        n nVar2 = n.s;
        if (nVar == nVar2) {
            return;
        }
        if (nVar != n.n) {
            b();
            return;
        }
        o();
        c();
        r(nVar2);
        l("released");
    }

    public final void o() {
        this.h.removeCallbacks(this.E);
        this.u = false;
        h0 h0Var = this.A;
        if (h0Var != null) {
            h0Var.C(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void r(n nVar) {
        n nVar2 = this.m;
        if (nVar2 == nVar) {
            return;
        }
        this.m = nVar;
        this.g.b("state: " + nVar2 + " -> " + nVar + ", durationMs=" + q(this.p + this.q));
        this.e.onStateChanged(e());
    }

    public final void s() {
        this.i.shutdown();
        this.j.shutdown();
    }

    public final void t(File file) {
        long j10 = this.o + 1;
        this.o = j10;
        j jVar = this.z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.b bVar = new org.telegram.utils.recorder.audio.b(jVar.b, file, this.d, this.g, new cc.e(this, jVar, j10));
        this.n = bVar;
        this.q = 0L;
        bVar.g.post(new Runnable() { // from class: org.telegram.utils.recorder.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = b.this;
                try {
                    if (bVar2.j) {
                        bVar2.e();
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(bVar2.a, bVar2.b);
                    bVar2.l = a2;
                    if (a2 == null) {
                        throw new IllegalStateException("Unable to initialize native Opus recorder");
                    }
                    if (bVar2.c == i.b) {
                        AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                        bVar2.m = a10;
                        if (a10 == null) {
                            bVar2.d.b("RNNoise unavailable; recording unprocessed PCM");
                        } else {
                            bVar2.d.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                        }
                    }
                    long d = bVar2.l.d();
                    ri.b bVar3 = bVar2.d;
                    StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                    File file2 = bVar2.b;
                    sb2.append(file2 == null ? "none" : file2.getName());
                    sb2.append(", initialBytes=");
                    sb2.append(d);
                    sb2.append(", elapsedMs=");
                    sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    bVar3.b(sb2.toString());
                    if (bVar2.j) {
                        bVar2.e();
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    bVar2.k = audioRecord;
                    if (audioRecord.getState() != 1) {
                        throw new IllegalStateException("Unable to initialize AudioRecord");
                    }
                    bVar2.k.startRecording();
                    if (bVar2.k.getRecordingState() != 3) {
                        throw new IllegalStateException("Unable to start AudioRecord");
                    }
                    bVar2.d.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + bVar2.k.getAudioSessionId());
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    bVar2.r = elapsedRealtime2;
                    bVar2.q = elapsedRealtime2;
                    cc.e eVar = bVar2.e;
                    long max2 = Math.max(0L, d);
                    p pVar = (p) eVar.c;
                    pVar.a((j) eVar.b, max2);
                    pVar.h.post(new lh0(eVar, eVar.a, 3));
                    bVar2.g.post(new ri.a(bVar2, 1));
                } catch (Throwable th2) {
                    bVar2.d.a("capture failed", th2);
                    bVar2.j = true;
                    bVar2.o = b.b(th2);
                    try {
                        bVar2.e();
                    } catch (Throwable th3) {
                        bVar2.o.addSuppressed(th3);
                    }
                }
            }
        });
    }
}
