package wi;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((t) this.b).b(true);
                return;
            case 1:
                ((t) this.b).b(false);
                return;
            default:
                v0 v0Var = (v0) this.b;
                synchronized (v0Var.b) {
                    v0Var.m = true;
                    v0Var.b.notifyAll();
                }
                return;
        }
    }
}
