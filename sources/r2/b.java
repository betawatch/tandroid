package r2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements d9.u {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // d9.u
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.p(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
