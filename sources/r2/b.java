package r2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
