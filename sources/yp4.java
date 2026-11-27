// default package

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yp4 {
    public xp4[] a;
    public xp4 b;
    public xp4 c;
    public xp4 d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public long j;
    public float k;
    public ArrayList l;
    public Paint m;
    public Path n;

    public final void a(float f) {
        this.g = f;
        float f2 = this.e;
        this.h = (f - f2) / 250.0f;
        this.i = (f - f2) / 120.0f;
    }

    public final void b(int i, boolean z) {
        xp4 xp4Var = this.b;
        if (xp4Var == null || xp4Var.i != i) {
            if (VoIPService.getSharedInstance() == null && this.b == null) {
                this.b = this.d;
                return;
            }
            xp4 xp4Var2 = z ? this.b : null;
            this.c = xp4Var2;
            this.b = this.a[i];
            if (xp4Var2 != null) {
                this.k = 0.0f;
            } else {
                this.k = 1.0f;
            }
        }
    }

    public final void c(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z);
                return;
            }
            vc2 vc2Var = sharedInstance.groupCall;
            if (vc2Var == null) {
                b(sharedInstance.isMicMute() ? 1 : 0, z);
                return;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || xc2.w(14, sharedInstance.getChat())) && !sharedInstance.groupCall.b.rtmp_stream) {
                b(sharedInstance.isMicMute() ? 1 : 0, z);
            } else {
                sharedInstance.setMicMute(true, false, false);
                b(3, z);
            }
        }
    }
}
