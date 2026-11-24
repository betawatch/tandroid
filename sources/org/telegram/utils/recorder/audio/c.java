package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                ByteBuffer byteBuffer = (ByteBuffer) this.c;
                int andDecrement = dVar.m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.w) {
                        dVar.y = Math.max(dVar.y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.s;
                        byteBuffer.position(0);
                        while (byteBuffer.hasRemaining()) {
                            int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
                            int limit = byteBuffer.limit();
                            byteBuffer.limit(byteBuffer.position() + min);
                            byteBuffer2.put(byteBuffer);
                            byteBuffer.limit(limit);
                            if (!byteBuffer2.hasRemaining()) {
                                dVar.b(1920);
                                byteBuffer2.clear();
                            }
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - dVar.x >= 100) {
                            long d = dVar.t.d();
                            dVar.x = elapsedRealtime;
                            if (d >= 0) {
                                m30 m30Var = dVar.g;
                                ((h40) m30Var.c).a((f40) m30Var.b, d);
                            }
                        }
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            default:
                h40 h40Var = (h40) this.b;
                f40 f40Var = (f40) this.c;
                try {
                    bArr = AudioRecorderNative.e(f40Var.b.getAbsolutePath());
                } catch (Throwable th) {
                    h40Var.h.a("waveform extraction failed", th);
                    bArr = null;
                }
                h40Var.i.post(new op6(h40Var, f40Var, bArr, (byte) 11));
                return;
        }
    }
}
