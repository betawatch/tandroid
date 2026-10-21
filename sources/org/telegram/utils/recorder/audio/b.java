package org.telegram.utils.recorder.audio;

import a1.g;
import ai.c3;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.ui.eo;
import org.telegram.ui.yb0;
import ri.i;
import ri.o;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(long j10, i iVar, o oVar) {
        this.c = oVar;
        this.d = iVar;
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
                cc.e eVar = dVar.g;
                ri.b bVar = dVar.f;
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
                StringBuilder t10 = g.t(j10, "capture stopped: samples=", ", durationMs=");
                t10.append((1000 * j10) / 48000);
                t10.append(", bytes=");
                t10.append(length);
                t10.append(", maxQueuedChunks=");
                t10.append(dVar.y);
                bVar.b(t10.toString());
                if (exc3 == null) {
                    o oVar = (o) eVar.c;
                    oVar.a((i) eVar.b, length);
                    oVar.i.post(new eo(eVar, eVar.a, j10, 3));
                } else {
                    ((o) eVar.c).i.post(new yb0(eVar, eVar.a, exc3, 3));
                }
                dVar.j.quitSafely();
                dVar.l.clear();
                return;
            default:
                o oVar2 = (o) this.c;
                i iVar = (i) this.d;
                try {
                    bArr = AudioRecorderNative.e(iVar.b.getAbsolutePath());
                } catch (Throwable th4) {
                    oVar2.h.a("final waveform extraction failed", th4);
                    bArr = null;
                }
                oVar2.i.post(new c3(oVar2, iVar, this.b, bArr, 27));
                return;
        }
    }

    public /* synthetic */ b(d dVar, long j10, Exception exc) {
        this.c = dVar;
        this.b = j10;
        this.d = exc;
    }
}
