package r2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
