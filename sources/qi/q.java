package qi;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bi.b8;
import e2.l0;
import e2.z;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.uo;
import org.telegram.ui.web.e0;
import qi.j;
import qi.k;
import qi.q;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class q {
    public static final pb.a G = new pb.a(20);
    public static final AtomicLong H = new AtomicLong(1);
    public h0 A;
    public byte[] B;
    public n C;
    public final f D;
    public final f E;
    public final Context a;
    public final File b;
    public final long c;
    public final j d;
    public final h e;
    public final m f;
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
    public volatile k z;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService i = Executors.newSingleThreadExecutor(new l0(6));
    public final ExecutorService j = Executors.newSingleThreadExecutor(new l0(7));
    public final Object k = new Object();
    public final ArrayList l = new ArrayList();
    public o m = o.a;
    public long t = 1;
    public final z F = new z(this, 2);

    /* JADX WARN: Type inference failed for: r4v3, types: [qi.f] */
    /* JADX WARN: Type inference failed for: r4v4, types: [qi.f] */
    public q(com.google.firebase.messaging.m mVar) {
        p();
        Context context = (Context) mVar.a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) mVar.b;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = 700L;
        j jVar = (j) mVar.c;
        this.d = jVar;
        this.e = (h) mVar.d;
        this.f = (m) mVar.e;
        b bVar = new b((i) mVar.f);
        this.g = bVar;
        final int i10 = 0;
        this.D = new Runnable(this) { // from class: qi.f
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h0 h0Var;
                switch (i10) {
                    case 0:
                        q qVar = this.b;
                        if (qVar.m == o.c && !qVar.w) {
                            qVar.w = true;
                            qVar.g.b("maximum duration reached: durationMs=" + qVar.j());
                            qVar.e.onMaximumDurationReached();
                            qVar.m();
                            break;
                        }
                        break;
                    default:
                        q qVar2 = this.b;
                        if (qVar2.m == o.e && (h0Var = qVar2.A) != null && qVar2.u) {
                            long M0 = h0Var.M0();
                            long j10 = qVar2.r;
                            if (M0 < j10 || M0 >= qVar2.s) {
                                qVar2.A.Z0(5, j10);
                                M0 = qVar2.r;
                            }
                            qVar2.e.onPreviewProgress(M0, qVar2.j());
                            qVar2.h.postDelayed(qVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.E = new Runnable(this) { // from class: qi.f
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h0 h0Var;
                switch (i11) {
                    case 0:
                        q qVar = this.b;
                        if (qVar.m == o.c && !qVar.w) {
                            qVar.w = true;
                            qVar.g.b("maximum duration reached: durationMs=" + qVar.j());
                            qVar.e.onMaximumDurationReached();
                            qVar.m();
                            break;
                        }
                        break;
                    default:
                        q qVar2 = this.b;
                        if (qVar2.m == o.e && (h0Var = qVar2.A) != null && qVar2.u) {
                            long M0 = h0Var.M0();
                            long j10 = qVar2.r;
                            if (M0 < j10 || M0 >= qVar2.s) {
                                qVar2.A.Z0(5, j10);
                                M0 = qVar2.r;
                            }
                            qVar2.e.onPreviewProgress(M0, qVar2.j());
                            qVar2.h.postDelayed(qVar2.E, 32L);
                            break;
                        }
                        break;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + jVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
        }
    }

    public static long q(long j10) {
        return (j10 * 1000) / 48000;
    }

    public final void a(k kVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.k) {
            try {
                if (kVar.d && !kVar.e) {
                    long j11 = kVar.c;
                    if (j10 > j11) {
                        kVar.c = j10;
                        this.j.execute(new c(this, kVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        o oVar = this.m;
        o oVar2 = o.s;
        if (oVar == oVar2 || oVar == o.n) {
            return;
        }
        this.g.b("cancel requested: state=" + this.m);
        this.h.removeCallbacksAndMessages(null);
        o();
        k(l.b);
        r(oVar2);
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
        n nVar = this.C;
        File file = nVar == null ? null : nVar.a;
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

    public final k d() {
        File f7 = f("voice");
        long j10 = this.t;
        this.t = 1 + j10;
        k kVar = new k(j10, f7);
        synchronized (this.k) {
            this.z = kVar;
            this.j.execute(new pi.g(this, kVar, f7, 2));
        }
        b bVar = this.g;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return kVar;
    }

    public final p e() {
        return new p(this.m);
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
        o oVar = this.m;
        o oVar2 = o.r;
        if (oVar == oVar2 || oVar == o.s || oVar == o.n) {
            return;
        }
        this.g.a("fatal error in state=" + this.m, exc);
        this.h.removeCallbacksAndMessages(null);
        o();
        k(l.c);
        r(oVar2);
        k kVar = this.z;
        if (kVar != null) {
            this.j.execute(new pi.g(this, kVar, exc, 3));
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
        o oVar = o.h;
        p();
        o oVar2 = this.m;
        o oVar3 = o.c;
        if (oVar2 == oVar3 || oVar2 == o.e) {
            this.g.b("finish requested: state=" + this.m + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
            if (this.m == oVar3) {
                this.v = true;
                this.h.removeCallbacks(this.D);
                r(oVar);
                this.n.f();
                return;
            }
            o();
            r(oVar);
            final k kVar = this.z;
            if (kVar == null) {
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
            k(l.a);
            final k d = d();
            this.i.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    q qVar;
                    k kVar2 = kVar;
                    k kVar3 = d;
                    long j12 = j10;
                    long j13 = j11;
                    q qVar2 = q.this;
                    Handler handler = qVar2.h;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        String absolutePath = kVar2.b.getAbsolutePath();
                        File file = kVar3.b;
                        String absolutePath2 = file.getAbsolutePath();
                        try {
                            if (!AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                                throw new IllegalStateException("Unable to trim final Opus output");
                            }
                            qVar2.g.b("final trim completed: source=" + kVar2.b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            qVar2.a(kVar3, file.length());
                            handler.post(new uo(qVar2, j13, j12, 2));
                        } catch (Throwable th2) {
                            th = th2;
                            qVar = absolutePath2;
                            handler.post(new qi.d(qVar, th, 0));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        qVar = qVar2;
                    }
                }
            });
        }
    }

    public final void i() {
        if (this.m != o.h) {
            return;
        }
        final k kVar = this.z;
        if (kVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final long j10 = j();
        if (j10 >= this.c) {
            this.i.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.c
                @Override // java.lang.Runnable
                public final void run() {
                    byte[] bArr;
                    q qVar = q.this;
                    k kVar2 = kVar;
                    try {
                        bArr = AudioRecorderNative.e(kVar2.b.getAbsolutePath());
                    } catch (Throwable th2) {
                        qVar.g.a("final waveform extraction failed", th2);
                        bArr = null;
                    }
                    byte[] bArr2 = bArr;
                    qVar.h.post(new b8(qVar, kVar2, j10, bArr2, 19));
                }
            });
            return;
        }
        this.g.b("recording rejected as too short: durationMs=" + j10);
        this.e.onRecordingTooShort(j10);
        k(l.b);
        r(o.s);
        c();
        s();
        l("too_short");
    }

    public final long j() {
        p();
        return q(this.p + this.q);
    }

    public final void k(l lVar) {
        synchronized (this.k) {
            k kVar = this.z;
            if (kVar != null && kVar.d && !kVar.e) {
                kVar.d = false;
                this.j.execute(new pi.g(this, kVar, lVar, 4));
                this.g.b("output generation invalidated: id=" + kVar.a + ", reason=" + lVar);
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
        if (this.m != o.c || this.n == null) {
            return false;
        }
        this.g.b("pause requested: durationMs=" + j());
        this.h.removeCallbacks(this.D);
        r(o.d);
        this.n.f();
        return true;
    }

    public final void n() {
        p();
        o oVar = this.m;
        o oVar2 = o.s;
        if (oVar == oVar2) {
            return;
        }
        if (oVar != o.n) {
            b();
            return;
        }
        o();
        c();
        r(oVar2);
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

    public final void r(o oVar) {
        o oVar2 = this.m;
        if (oVar2 == oVar) {
            return;
        }
        this.m = oVar;
        this.g.b("state: " + oVar2 + " -> " + oVar + ", durationMs=" + q(this.p + this.q));
        this.e.onStateChanged(e());
    }

    public final void s() {
        this.i.shutdown();
        this.j.shutdown();
    }

    public final void t(File file) {
        long j10 = this.o + 1;
        this.o = j10;
        k kVar = this.z;
        if (kVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.b bVar = new org.telegram.utils.recorder.audio.b(kVar.b, file, this.d, this.g, new cc.e(this, kVar, j10));
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
                    if (bVar2.c == j.b) {
                        AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                        bVar2.m = a10;
                        if (a10 == null) {
                            bVar2.d.b("RNNoise unavailable; recording unprocessed PCM");
                        } else {
                            bVar2.d.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                        }
                    }
                    long d = bVar2.l.d();
                    qi.b bVar3 = bVar2.d;
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
                    q qVar = (q) eVar.c;
                    qVar.a((k) eVar.b, max2);
                    qVar.h.post(new e0(eVar, eVar.a, 1));
                    bVar2.g.post(new qi.a(bVar2, 1));
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
