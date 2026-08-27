package y3;

import android.os.HandlerThread;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements o8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // o8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.j(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
