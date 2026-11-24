package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(h40 h40Var, f40 f40Var, long j) {
        this.c = h40Var;
        this.d = f40Var;
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
                q30 q30Var = dVar.f;
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
                    q30Var.b("RNNoise summary: frames=" + dVar.z + ", averageMs=" + ((dVar.A / dVar.z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                }
                long j = this.b;
                StringBuilder o = wi8.o(j, "capture stopped: samples=", ", durationMs=");
                o.append((1000 * j) / 48000);
                o.append(", bytes=");
                o.append(length);
                o.append(", maxQueuedChunks=");
                o.append(dVar.y);
                q30Var.b(o.toString());
                m30 m30Var = dVar.g;
                h40 h40Var = (h40) m30Var.c;
                if (exc3 == null) {
                    h40Var.a((f40) m30Var.b, length);
                    h40Var.i.post(new w30(m30Var, m30Var.a, j, (byte) 1));
                } else {
                    h40Var.i.post(new of2(m30Var, m30Var.a, exc3, (byte) 11));
                }
                dVar.j.quitSafely();
                dVar.l.clear();
                return;
            default:
                h40 h40Var2 = (h40) obj2;
                f40 f40Var = (f40) obj;
                try {
                    bArr = AudioRecorderNative.e(f40Var.b.getAbsolutePath());
                } catch (Throwable th3) {
                    h40Var2.h.a("final waveform extraction failed", th3);
                }
                h40Var2.i.post(new p97((Object) h40Var2, (Object) f40Var, this.b, (Object) bArr, (byte) 2));
                return;
        }
    }

    public /* synthetic */ b(d dVar, long j, Exception exc) {
        this.c = dVar;
        this.b = j;
        this.d = exc;
    }
}
