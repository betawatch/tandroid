package u2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
