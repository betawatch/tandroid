// default package

import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q42 implements xga {
    public File a;
    public boolean b;
    public final /* synthetic */ wjb c;
    public final /* synthetic */ ww0 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public q42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, wjb wjbVar, ww0 ww0Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = wjbVar;
        this.d = ww0Var;
    }

    public final void a() {
        b52 b52Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (chatAttachAlertPhotoLayout.t0 || (b52Var = chatAttachAlertPhotoLayout.Q) == null || b52Var.getCameraSession() == null) {
            return;
        }
        byte b = 0;
        if (shutterButton.getState() == yga.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
            shutterButton.a(yga.a);
        } else {
            if (!chatAttachAlertPhotoLayout.y0) {
                yjb.x(null, 2131749367, new u21(chatAttachAlertPhotoLayout.Q, this.c), null);
                return;
            }
            d dVar = x02Var.Z1;
            File q0 = gl.q0(null, (dVar instanceof mu1) && ((mu1) dVar).y());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.Q.getCameraSession().setFlipFront((x02Var.Z1 instanceof mu1) || x02Var.N2 == 2);
            chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q0, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new o42(this, q0, isSameTakePictureOrientation, b));
            chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
        }
    }
}
