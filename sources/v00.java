// default package

import android.media.AudioRecord;
import android.os.SystemClock;
import org.telegram.utils.recorder.audio.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class v00 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ v00(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                try {
                    if (dVar.n) {
                        dVar.f(null);
                        return;
                    }
                    byte b = 2;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize << 1, 7680);
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
                    m30 m30Var = dVar.g;
                    ((h40) m30Var.c).i.post(new fu(m30Var, m30Var.a, (byte) 1));
                    dVar.i.post(new v00(dVar, b));
                    return;
                } catch (Throwable th) {
                    dVar.f(d.a(th));
                    return;
                }
            case 1:
                this.b.f(null);
                return;
            case 2:
            default:
                this.b.c();
                return;
        }
    }
}
