package ri;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.kh0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.utils.recorder.audio.d b;

    public /* synthetic */ a(org.telegram.utils.recorder.audio.d dVar, int i10) {
        this.a = i10;
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
                    cc.e eVar = dVar.g;
                    ((o) eVar.c).i.post(new kh0(eVar, eVar.a, 3));
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
                    int i10 = read / 2;
                    long j10 = 0;
                    for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                        long j11 = byteBuffer.getShort(i11);
                        j10 += j11 * j11;
                    }
                    dVar2.q += i10;
                    dVar2.m.incrementAndGet();
                    dVar2.k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - dVar2.r >= 32) {
                        final double sqrt = i10 == 0 ? 0.0d : Math.sqrt(j10 / i10);
                        final cc.e eVar2 = dVar2.g;
                        final long j12 = dVar2.q;
                        Handler handler = ((o) eVar2.c).i;
                        final long j13 = eVar2.a;
                        handler.post(new Runnable() { // from class: ri.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                o oVar = (o) cc.e.this.c;
                                if (j13 == oVar.p && oVar.n == m.c) {
                                    oVar.r = j12;
                                    long j14 = oVar.j();
                                    double d = sqrt;
                                    if (d >= 0.0d) {
                                        oVar.f.onRecordingProgress(j14, d);
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
