package r2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements d9.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // d9.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.m(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
