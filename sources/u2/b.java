package u2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // g9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.p(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
