// default package

import android.os.HandlerThread;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
