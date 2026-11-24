// default package

import android.os.HandlerThread;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class px implements qbb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ px(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // qbb
    public final Object get() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(rx.o(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(rx.o(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
