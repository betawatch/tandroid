package r2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
