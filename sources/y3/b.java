package y3;

import android.os.HandlerThread;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements n8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i9, int i10) {
        this.a = i10;
        this.b = i9;
    }

    @Override // n8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.j(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
