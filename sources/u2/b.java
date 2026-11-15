package u2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                return new HandlerThread(c.b(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.b(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
