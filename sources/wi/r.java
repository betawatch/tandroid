package wi;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((t) this.b).b(false);
                return;
            case 1:
                ((t) this.b).b(true);
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
