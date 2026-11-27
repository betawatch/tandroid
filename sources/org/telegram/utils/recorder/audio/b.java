package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(i30 i30Var, g30 g30Var, long j) {
        this.c = i30Var;
        this.d = g30Var;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Exception a;
        byte b = this.a;
        AudioRecorderNative audioRecorderNative = null;
        byte[] bArr = null;
        Object[] objArr = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                d dVar = (d) obj2;
                Exception exc = (Exception) obj;
                r20 r20Var = dVar.f;
                File file = dVar.a;
                ByteBuffer byteBuffer = dVar.s;
                if (dVar.w) {
                    return;
                }
                dVar.w = true;
                Exception exc2 = dVar.v;
                if (exc2 != null) {
                    exc = exc2;
                }
                if (exc == null) {
                    try {
                        if (dVar.t != null && byteBuffer.position() > 0) {
                            dVar.b(byteBuffer.position());
                            byteBuffer.clear();
                        }
                    } catch (Throwable th) {
                        try {
                            exc = d.a(th);
                            AudioNoiseSuppressor audioNoiseSuppressor = dVar.u;
                            if (audioNoiseSuppressor != null) {
                                audioNoiseSuppressor.c();
                                dVar.u = null;
                            }
                            AudioRecorderNative audioRecorderNative2 = dVar.t;
                            if (audioRecorderNative2 != null) {
                                try {
                                    audioRecorderNative2.c();
                                } catch (Throwable unused) {
                                }
                            }
                        } finally {
                        }
                    }
                }
                AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.u;
                if (audioNoiseSuppressor2 != null) {
                    audioNoiseSuppressor2.c();
                    dVar.u = null;
                }
                AudioRecorderNative audioRecorderNative3 = dVar.t;
                if (audioRecorderNative3 != null) {
                    try {
                    } catch (Throwable th2) {
                        if (exc == null) {
                            a = d.a(th2);
                        }
                    }
                    if (!audioRecorderNative3.c() && exc == null) {
                        a = new IllegalStateException("Unable to finalize native Opus recorder");
                        exc = a;
                    }
                    dVar.t.f();
                    dVar.t = null;
                }
                Exception exc3 = exc;
                long length = file.isFile() ? file.length() : 0L;
                if (dVar.z > 0) {
                    r20Var.b("RNNoise summary: frames=" + dVar.z + ", averageMs=" + ((dVar.A / dVar.z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                }
                long j = this.b;
                StringBuilder o = ik8.o(j, "capture stopped: samples=", ", durationMs=");
                o.append((1000 * j) / 48000);
                o.append(", bytes=");
                o.append(length);
                o.append(", maxQueuedChunks=");
                o.append(dVar.y);
                r20Var.b(o.toString());
                n20 n20Var = dVar.g;
                i30 i30Var = (i30) n20Var.c;
                if (exc3 == null) {
                    i30Var.a((g30) n20Var.b, length);
                    i30Var.i.post(new x20(n20Var, n20Var.a, j, (byte) 1));
                } else {
                    i30Var.i.post(new ue2(n20Var, n20Var.a, exc3, (byte) 11));
                }
                dVar.j.quitSafely();
                dVar.l.clear();
                return;
            default:
                i30 i30Var2 = (i30) obj2;
                g30 g30Var = (g30) obj;
                try {
                    bArr = AudioRecorderNative.e(g30Var.b.getAbsolutePath());
                } catch (Throwable th3) {
                    i30Var2.h.a("final waveform extraction failed", th3);
                }
                i30Var2.i.post(new ba7((Object) i30Var2, (Object) g30Var, this.b, (Object) bArr, (byte) 2));
                return;
        }
    }

    public /* synthetic */ b(d dVar, long j, Exception exc) {
        this.c = dVar;
        this.b = j;
        this.d = exc;
    }
}
