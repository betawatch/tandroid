// default package

import android.os.HandlerThread;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class qx implements mfb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ qx(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // mfb
    public final Object get() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(sx.o(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(sx.o(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
