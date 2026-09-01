package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ w5 a;

    public /* synthetic */ t5(w5 w5Var) {
        this.a = w5Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        w5 w5Var = this.a;
        v5 v5Var = w5Var.a;
        if (w5Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(v5Var.getCameraSessionObject(), w5Var.b, false, new t5(w5Var), new s5(w5Var, 1), v5Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        w5 w5Var = this.a;
        w5Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(w5Var.h);
        if (w5Var.x) {
            return;
        }
        if (j10 <= 1000) {
            w5Var.a(false);
            return;
        }
        w5Var.a.destroy(true, null);
        oh.z zVar = w5Var.n;
        if (zVar != null) {
            zVar.run(w5Var.b, str, Long.valueOf(j10));
        }
    }
}
