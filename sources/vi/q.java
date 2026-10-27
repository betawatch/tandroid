package vi;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((s) this.b).b(false);
                return;
            case 1:
                ((s) this.b).b(true);
                return;
            default:
                w0 w0Var = (w0) this.b;
                synchronized (w0Var.b) {
                    w0Var.m = true;
                    w0Var.b.notifyAll();
                }
                return;
        }
    }
}
