package org.telegram.utils.recorder.audio;

import a8.p0;
import ai.g0;
import di.j2;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.ui.g80;
import yi.h;
import yi.j;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(long j3, h hVar, j jVar) {
        this.c = jVar;
        this.d = hVar;
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
                yi.b bVar = dVar.f;
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
                    j jVar = (j) eVar.c;
                    jVar.a((h) eVar.b, length);
                    jVar.i.post(new g0(eVar, eVar.a, j3, 5));
                } else {
                    ((j) eVar.c).i.post(new g80(eVar, eVar.a, exc3, 4));
                }
                dVar.j.quitSafely();
                dVar.l.clear();
                return;
            default:
                j jVar2 = (j) this.c;
                h hVar = (h) this.d;
                try {
                    bArr = AudioRecorderNative.e(hVar.b.getAbsolutePath());
                } catch (Throwable th4) {
                    jVar2.h.a("final waveform extraction failed", th4);
                    bArr = null;
                }
                jVar2.i.post(new j2(jVar2, hVar, this.b, bArr, 26));
                return;
        }
    }

    public /* synthetic */ b(d dVar, long j3, Exception exc) {
        this.c = dVar;
        this.b = j3;
        this.d = exc;
    }
}
