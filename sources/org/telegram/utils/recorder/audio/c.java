package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.r31;
import vi.g;
import vi.h;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.a = i7;
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
                                ac.e eVar = dVar.g;
                                ((h) eVar.c).a((g) eVar.b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                h hVar = (h) this.b;
                g gVar = (g) this.c;
                try {
                    bArr = AudioRecorderNative.e(gVar.b.getAbsolutePath());
                } catch (Throwable th3) {
                    hVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                hVar.i.post(new r31(hVar, gVar, bArr, 18));
                return;
        }
    }
}
