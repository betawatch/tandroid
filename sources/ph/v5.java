package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ y5 a;

    public /* synthetic */ v5(y5 y5Var) {
        this.a = y5Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        y5 y5Var = this.a;
        x5 x5Var = y5Var.a;
        if (y5Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(x5Var.getCameraSessionObject(), y5Var.b, false, new v5(y5Var), new u5(y5Var, 1), x5Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        y5 y5Var = this.a;
        y5Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(y5Var.h);
        if (y5Var.x) {
            return;
        }
        if (j10 <= 1000) {
            y5Var.a(false);
            return;
        }
        y5Var.a.destroy(true, null);
        nh.a0 a0Var = y5Var.n;
        if (a0Var != null) {
            a0Var.run(y5Var.b, str, Long.valueOf(j10));
        }
    }
}
