package r2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements e9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // e9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.b(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.b(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
