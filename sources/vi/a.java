package vi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.me;
import org.telegram.messenger.qs;
import org.telegram.ui.r31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.utils.recorder.audio.d b;

    public /* synthetic */ a(org.telegram.utils.recorder.audio.d dVar, int i7) {
        this.a = i7;
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
                    ac.e eVar = dVar.g;
                    ((h) eVar.c).i.post(new r31(eVar, eVar.a, 3));
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
                    int i7 = read / 2;
                    long j3 = 0;
                    for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                        long j10 = byteBuffer.getShort(i10);
                        j3 += j10 * j10;
                    }
                    dVar2.q += i7;
                    dVar2.m.incrementAndGet();
                    dVar2.k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - dVar2.r >= 32) {
                        final double sqrt = i7 == 0 ? 0.0d : Math.sqrt(j3 / i7);
                        final ac.e eVar2 = dVar2.g;
                        final long j11 = dVar2.q;
                        Handler handler = ((h) eVar2.c).i;
                        final long j12 = eVar2.a;
                        handler.post(new Runnable() { // from class: vi.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                h hVar = (h) ac.e.this.c;
                                if (j12 == hVar.o && hVar.G == 3) {
                                    hVar.q = j11;
                                    long j13 = hVar.j();
                                    double d = sqrt;
                                    if (d >= 0.0d) {
                                        MediaController mediaController = ((me) hVar.f.b).a;
                                        mediaController.k1 = j13;
                                        qs.f(mediaController.h1).k(qs.k2, Integer.valueOf(mediaController.g1), Double.valueOf(d / 2.0d));
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
