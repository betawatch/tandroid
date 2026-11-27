// default package

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa1 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa1(Object obj, byte b) {
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
                ((rf4) obj).b(false, true, true);
                return;
            case 2:
                np9 np9Var = (np9) obj;
                synchronized (np9Var.b) {
                    np9Var.m = true;
                    np9Var.b.notifyAll();
                }
                return;
            default:
                ((SurfaceTextureHelper) obj).lambda$new$0(surfaceTexture);
                return;
        }
    }
}
