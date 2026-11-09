package org.telegram.utils.recorder.audio;

import a8.p0;
import bi.w2;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.messenger.xk;
import org.telegram.ui.ga0;
import vi.g;
import vi.h;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(long j3, g gVar, h hVar) {
        this.c = hVar;
        this.d = gVar;
        this.b = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                Exception exc = (Exception) this.d;
                ac.e eVar = dVar.g;
                vi.b bVar = dVar.f;
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
                long j3 = this.b;
                StringBuilder t6 = p0.t(j3, "capture stopped: samples=", ", durationMs=");
                t6.append((1000 * j3) / 48000);
                t6.append(", bytes=");
                t6.append(length);
                t6.append(", maxQueuedChunks=");
                t6.append(dVar.y);
                bVar.b(t6.toString());
                if (exc3 == null) {
                    h hVar = (h) eVar.c;
                    hVar.a((g) eVar.b, length);
                    hVar.i.post(new xk(eVar, eVar.a, j3, 4));
                } else {
                    ((h) eVar.c).i.post(new ga0(eVar, eVar.a, exc3, 3));
                }
                dVar.j.quitSafely();
                dVar.l.clear();
                return;
            default:
                h hVar2 = (h) this.c;
                g gVar = (g) this.d;
                try {
                    bArr = AudioRecorderNative.e(gVar.b.getAbsolutePath());
                } catch (Throwable th4) {
                    hVar2.h.a("final waveform extraction failed", th4);
                    bArr = null;
                }
                hVar2.i.post(new w2(hVar2, gVar, this.b, bArr, 27));
                return;
        }
    }

    public /* synthetic */ b(d dVar, long j3, Exception exc) {
        this.c = dVar;
        this.b = j3;
        this.d = exc;
    }
}
