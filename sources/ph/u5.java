package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ x5 a;

    public /* synthetic */ u5(x5 x5Var) {
        this.a = x5Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        x5 x5Var = this.a;
        w5 w5Var = x5Var.a;
        if (x5Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(w5Var.getCameraSessionObject(), x5Var.b, false, new u5(x5Var), new t5(x5Var, 1), w5Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        x5 x5Var = this.a;
        x5Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(x5Var.h);
        if (x5Var.x) {
            return;
        }
        if (j10 <= 1000) {
            x5Var.a(false);
            return;
        }
        x5Var.a.destroy(true, null);
        nh.a0 a0Var = x5Var.n;
        if (a0Var != null) {
            a0Var.run(x5Var.b, str, Long.valueOf(j10));
        }
    }
}
