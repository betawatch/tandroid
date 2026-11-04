package vi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ge;
import org.telegram.messenger.hs;
import org.telegram.ui.f31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.utils.recorder.audio.d b;

    public /* synthetic */ a(org.telegram.utils.recorder.audio.d dVar, int i3) {
        this.a = i3;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
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
                    f fVar = dVar.g;
                    ((j) fVar.c).i.post(new f31(fVar, fVar.a, 2));
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
                try {
                    int read = dVar2.p.read(byteBuffer, byteBuffer.capacity());
                    if (read <= 0) {
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    }
                    byteBuffer.limit(read);
                    int i3 = read / 2;
                    long j10 = 0;
                    for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                        long j11 = byteBuffer.getShort(i10);
                        j10 += j11 * j11;
                    }
                    dVar2.q += i3;
                    dVar2.m.incrementAndGet();
                    dVar2.k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - dVar2.r >= 32) {
                        final double sqrt = i3 == 0 ? 0.0d : Math.sqrt(j10 / i3);
                        final f fVar2 = dVar2.g;
                        final long j12 = dVar2.q;
                        Handler handler = ((j) fVar2.c).i;
                        final long j13 = fVar2.a;
                        handler.post(new Runnable() { // from class: vi.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                j jVar = (j) f.this.c;
                                if (j13 == jVar.o && jVar.G == 3) {
                                    jVar.q = j12;
                                    long j14 = jVar.j();
                                    double d = sqrt;
                                    if (d >= 0.0d) {
                                        MediaController mediaController = ((ge) jVar.f.b).a;
                                        mediaController.l1 = j14;
                                        hs.f(mediaController.i1).k(hs.k2, Integer.valueOf(mediaController.h1), Double.valueOf(d / 2.0d));
                                    }
                                }
                            }
                        });
                        dVar2.r = elapsedRealtime;
                    }
                    dVar2.i.post(new a(dVar2, 2));
                    return;
                } catch (Throwable th3) {
                    if (0 == 0) {
                        dVar2.c(byteBuffer);
                    }
                    dVar2.e(dVar2.n ? null : org.telegram.utils.recorder.audio.d.a(th3));
                    return;
                }
        }
    }
}
