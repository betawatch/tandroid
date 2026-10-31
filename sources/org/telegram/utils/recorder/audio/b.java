package org.telegram.utils.recorder.audio;

import a3.i0;
import ag.a3;
import java.io.File;
import java.nio.ByteBuffer;
import ki.g;
import ki.j;
import ki.k;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(long j10, j jVar, k kVar) {
        this.c = kVar;
        this.d = jVar;
        this.b = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                Exception exc = (Exception) this.d;
                g gVar = dVar.g;
                ki.b bVar = dVar.f;
                File file = dVar.a;
                ByteBuffer byteBuffer = dVar.s;
                if (dVar.w) {
                    return;
                }
                dVar.w = true;
                Exception exc2 = dVar.v;
                if (exc2 == null) {
                    exc2 = exc;
                }
                if (exc2 == null) {
                    try {
                        if (dVar.t != null && byteBuffer.position() > 0) {
                            dVar.b(byteBuffer.position());
                            byteBuffer.clear();
                        }
                    } catch (Throwable th2) {
                        try {
                            exc2 = d.a(th2);
                            AudioNoiseSuppressor audioNoiseSuppressor = dVar.u;
                            if (audioNoiseSuppressor != null) {
                                audioNoiseSuppressor.c();
                                dVar.u = null;
                            }
                            AudioRecorderNative audioRecorderNative = dVar.t;
                            if (audioRecorderNative != null) {
                                try {
                                    audioRecorderNative.c();
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
                AudioRecorderNative audioRecorderNative2 = dVar.t;
                if (audioRecorderNative2 != null) {
                    try {
                        if (!audioRecorderNative2.c() && exc2 == null) {
                            exc2 = new IllegalStateException("Unable to finalize native Opus recorder");
                        }
                    } catch (Throwable th3) {
                        if (exc2 == null) {
                            exc2 = d.a(th3);
                        }
                    }
                    dVar.t.f();
                    dVar.t = null;
                }
                long length = file.isFile() ? file.length() : 0L;
                if (dVar.z > 0) {
                    bVar.b("RNNoise summary: frames=" + dVar.z + ", averageMs=" + ((dVar.A / dVar.z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                }
                Exception exc3 = exc2;
                long j10 = this.b;
                StringBuilder s10 = a1.g.s(j10, "capture stopped: samples=", ", durationMs=");
                s10.append((1000 * j10) / 48000);
                s10.append(", bytes=");
                s10.append(length);
                s10.append(", maxQueuedChunks=");
                s10.append(dVar.y);
                bVar.b(s10.toString());
                if (exc3 == null) {
                    k kVar = (k) gVar.c;
                    kVar.a((j) gVar.b, length);
                    kVar.i.post(new ki.d(gVar, gVar.a, j10, 1));
                } else {
                    ((k) gVar.c).i.post(new i0(gVar, gVar.a, exc3, 2));
                }
                dVar.j.quitSafely();
                dVar.l.clear();
                return;
            default:
                k kVar2 = (k) this.c;
                j jVar = (j) this.d;
                try {
                    bArr = AudioRecorderNative.e(jVar.b.getAbsolutePath());
                } catch (Throwable th4) {
                    kVar2.h.a("final waveform extraction failed", th4);
                    bArr = null;
                }
                kVar2.i.post(new a3(kVar2, jVar, this.b, bArr, 2));
                return;
        }
    }

    public /* synthetic */ b(d dVar, long j10, Exception exc) {
        this.c = dVar;
        this.b = j10;
        this.d = exc;
    }
}
