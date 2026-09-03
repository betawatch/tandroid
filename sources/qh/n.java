package qh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n extends v5 {
    public final /* synthetic */ p C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Context context) {
        super(context);
        this.C = pVar;
    }

    @Override // qh.v5
    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        p pVar = this.C;
        if (pVar.L1) {
            pVar.z(true, false);
        }
    }
}
