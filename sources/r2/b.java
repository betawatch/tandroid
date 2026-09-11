package r2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements d9.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // d9.j
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.m(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
