// default package

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk9 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ bl9 a;

    public /* synthetic */ yk9(bl9 bl9Var) {
        this.a = bl9Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        bl9 bl9Var = this.a;
        al9 al9Var = bl9Var.a;
        if (bl9Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(al9Var.getCameraSessionObject(), bl9Var.b, false, new yk9(bl9Var), new xk9(bl9Var, (byte) 1), al9Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public final void onFinishVideoRecording(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        bl9 bl9Var = this.a;
        bl9Var.d = currentTimeMillis;
        gl.r(bl9Var.h);
        if (bl9Var.y) {
            return;
        }
        if (j <= 1000) {
            bl9Var.a(false);
            return;
        }
        bl9Var.a.destroy(true, null);
        qo0 qo0Var = bl9Var.n;
        if (qo0Var != null) {
            qo0Var.a(bl9Var.b, str, Long.valueOf(j));
        }
    }
}
