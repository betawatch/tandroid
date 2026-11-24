package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(h30 h30Var, f30 f30Var, long j) {
        this.c = h30Var;
        this.d = f30Var;
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
                q20 q20Var = dVar.f;
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
                    q20Var.b("RNNoise summary: frames=" + dVar.z + ", averageMs=" + ((dVar.A / dVar.z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                }
                long j = this.b;
                StringBuilder o = ug8.o(j, "capture stopped: samples=", ", durationMs=");
                o.append((1000 * j) / 48000);
                o.append(", bytes=");
                o.append(length);
                o.append(", maxQueuedChunks=");
                o.append(dVar.y);
                q20Var.b(o.toString());
                m20 m20Var = dVar.g;
                h30 h30Var = (h30) m20Var.c;
                if (exc3 == null) {
                    h30Var.a((f30) m20Var.b, length);
                    h30Var.i.post(new w20(m20Var, m20Var.a, j, (byte) 1));
                } else {
                    h30Var.i.post(new de2(m20Var, m20Var.a, exc3, (byte) 11));
                }
                dVar.j.quitSafely();
                dVar.l.clear();
                return;
            default:
                h30 h30Var2 = (h30) obj2;
                f30 f30Var = (f30) obj;
                try {
                    bArr = AudioRecorderNative.e(f30Var.b.getAbsolutePath());
                } catch (Throwable th3) {
                    h30Var2.h.a("final waveform extraction failed", th3);
                }
                h30Var2.i.post(new m77((Object) h30Var2, (Object) f30Var, this.b, (Object) bArr, (byte) 2));
                return;
        }
    }

    public /* synthetic */ b(d dVar, long j, Exception exc) {
        this.c = dVar;
        this.b = j;
        this.d = exc;
    }
}
