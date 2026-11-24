// default package

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb1 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CameraView.CameraGLThread) obj).updTex(surfaceTexture);
                return;
            case 1:
                ((uf4) obj).b(false, true, true);
                return;
            case 2:
                yn9 yn9Var = (yn9) obj;
                synchronized (yn9Var.b) {
                    yn9Var.m = true;
                    yn9Var.b.notifyAll();
                }
                return;
            default:
                ((SurfaceTextureHelper) obj).lambda$new$0(surfaceTexture);
                return;
        }
    }
}
