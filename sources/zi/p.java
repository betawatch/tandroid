package zi;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
