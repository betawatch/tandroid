package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ v5 a;

    public /* synthetic */ s5(v5 v5Var) {
        this.a = v5Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        v5 v5Var = this.a;
        u5 u5Var = v5Var.a;
        if (v5Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(u5Var.getCameraSessionObject(), v5Var.b, false, new s5(v5Var), new r5(v5Var, 1), u5Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        v5 v5Var = this.a;
        v5Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(v5Var.h);
        if (v5Var.x) {
            return;
        }
        if (j10 <= 1000) {
            v5Var.a(false);
            return;
        }
        v5Var.a.destroy(true, null);
        oh.z zVar = v5Var.n;
        if (zVar != null) {
            zVar.run(v5Var.b, str, Long.valueOf(j10));
        }
    }
}
