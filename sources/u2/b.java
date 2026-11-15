package u2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
