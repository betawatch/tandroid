package u2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g9.u {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // g9.u
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.p(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
