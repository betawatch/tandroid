package wi;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i3) {
        this.a = i3;
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
                v0 v0Var = (v0) this.b;
                synchronized (v0Var.b) {
                    v0Var.m = true;
                    v0Var.b.notifyAll();
                }
                return;
        }
    }
}
