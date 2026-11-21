package yi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ji.o;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.vr;
import org.telegram.ui.qx0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.utils.recorder.audio.d b;

    public /* synthetic */ a(org.telegram.utils.recorder.audio.d dVar, int i7) {
        this.a = i7;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.b;
                try {
                    if (dVar.n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.p = audioRecord;
                    if (audioRecord.getState() != 1) {
                        throw new IllegalStateException("Unable to initialize AudioRecord");
                    }
                    dVar.p.startRecording();
                    if (dVar.p.getRecordingState() != 3) {
                        throw new IllegalStateException("Unable to start AudioRecord");
                    }
                    dVar.f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.p.getAudioSessionId());
                    dVar.r = SystemClock.elapsedRealtime();
                    ac.e eVar = dVar.g;
                    ((j) eVar.c).i.post(new qx0(eVar, eVar.a, 5));
                    dVar.i.post(new a(dVar, 2));
                    return;
                } catch (Throwable th2) {
                    dVar.e(org.telegram.utils.recorder.audio.d.a(th2));
                    return;
                }
            case 1:
                this.b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.b;
                if (dVar2.o) {
                    return;
                }
                if (dVar2.n) {
                    dVar2.e(null);
                    return;
                }
                ByteBuffer byteBuffer = (ByteBuffer) dVar2.l.poll();
                if (byteBuffer == null) {
                    byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                }
                byteBuffer.clear();
                boolean z10 = false;
                try {
                    int read = dVar2.p.read(byteBuffer, byteBuffer.capacity());
                    if (read <= 0) {
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    }
                    byteBuffer.limit(read);
                    o oVar = vr.k;
                    if (oVar != null && read > 0) {
                        try {
                            oVar.n(byteBuffer, read, 48000, 2);
                        } catch (Throwable th3) {
                            a8.g(th3, true);
                        }
                    }
                    int i7 = read / 2;
                    long j3 = 0;
                    for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                        long j10 = byteBuffer.getShort(i10);
                        j3 += j10 * j10;
                    }
                    dVar2.q += i7;
                    dVar2.m.incrementAndGet();
                    dVar2.k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - dVar2.r >= 32) {
                            final double sqrt = i7 == 0 ? 0.0d : Math.sqrt(j3 / i7);
                            final ac.e eVar2 = dVar2.g;
                            final long j11 = dVar2.q;
                            Handler handler = ((j) eVar2.c).i;
                            final long j12 = eVar2.a;
                            handler.post(new Runnable() { // from class: yi.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    j jVar = (j) ac.e.this.c;
                                    if (j12 == jVar.o && jVar.G == 3) {
                                        jVar.q = j11;
                                        long j13 = jVar.j();
                                        double d = sqrt;
                                        if (d >= 0.0d) {
                                            MediaController mediaController = ((ke) jVar.f.b).a;
                                            mediaController.l1 = j13;
                                            ks.f(mediaController.i1).k(ks.k2, Integer.valueOf(mediaController.h1), Double.valueOf(d / 2.0d));
                                        }
                                    }
                                }
                            });
                            dVar2.r = elapsedRealtime;
                        }
                        dVar2.i.post(new a(dVar2, 2));
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = true;
                        if (!z10) {
                            dVar2.c(byteBuffer);
                        }
                        dVar2.e(dVar2.n ? null : org.telegram.utils.recorder.audio.d.a(th));
                        return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (!z10) {
                    }
                    dVar2.e(dVar2.n ? null : org.telegram.utils.recorder.audio.d.a(th));
                    return;
                }
        }
    }
}
