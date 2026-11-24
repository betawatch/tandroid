// default package

import android.os.HandlerThread;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class qy implements sdb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ qy(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // sdb
    public final Object get() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(sy.o(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(sy.o(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
