package ph;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n extends x5 {
    public final /* synthetic */ p C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Context context) {
        super(context);
        this.C = pVar;
    }

    @Override // ph.x5
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
