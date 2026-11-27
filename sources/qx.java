// default package

import android.os.HandlerThread;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
