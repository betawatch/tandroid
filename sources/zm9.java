// default package

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm9 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final /* synthetic */ bn9 a;

    public /* synthetic */ zm9(bn9 bn9Var) {
        this.a = bn9Var;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        bn9 bn9Var = this.a;
        an9 an9Var = bn9Var.a;
        if (bn9Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(an9Var.getCameraSessionObject(), bn9Var.b, false, new zm9(bn9Var), new ym9(bn9Var, (byte) 1), an9Var, true);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public final void onFinishVideoRecording(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        bn9 bn9Var = this.a;
        bn9Var.d = currentTimeMillis;
        gm.r(bn9Var.h);
        if (bn9Var.y) {
            return;
        }
        if (j <= 1000) {
            bn9Var.a(false);
            return;
        }
        bn9Var.a.destroy(true, null);
        qp0 qp0Var = bn9Var.n;
        if (qp0Var != null) {
            qp0Var.a(bn9Var.b, str, Long.valueOf(j));
        }
    }
}
