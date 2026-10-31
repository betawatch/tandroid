package vh;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.jo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t4 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ v4 a;

    public /* synthetic */ t4(v4 v4Var) {
        this.a = v4Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        v4 v4Var = this.a;
        u4 u4Var = v4Var.a;
        if (v4Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(u4Var.getCameraSessionObject(), v4Var.b, false, new t4(v4Var), new s4(v4Var, 1), u4Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        v4 v4Var = this.a;
        v4Var.d = currentTimeMillis;
        org.telegram.messenger.i0.r(v4Var.h);
        if (v4Var.y) {
            return;
        }
        if (j10 <= 1000) {
            v4Var.a(false);
            return;
        }
        v4Var.a.destroy(true, null);
        jo joVar = v4Var.n;
        if (joVar != null) {
            joVar.a(v4Var.b, str, Long.valueOf(j10));
        }
    }
}
