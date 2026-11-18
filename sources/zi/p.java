package zi;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                w0 w0Var = (w0) this.b;
                synchronized (w0Var.b) {
                    w0Var.m = true;
                    w0Var.b.notifyAll();
                }
                return;
        }
    }
}
