package zi;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((u) this.b).b(true);
                return;
            case 1:
                ((u) this.b).b(false);
                return;
            default:
                x0 x0Var = (x0) this.b;
                synchronized (x0Var.b) {
                    x0Var.m = true;
                    x0Var.b.notifyAll();
                }
                return;
        }
    }
}
