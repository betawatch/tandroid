// default package

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vp4 {
    public up4[] a;
    public up4 b;
    public up4 c;
    public up4 d;
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
        up4 up4Var = this.b;
        if (up4Var == null || up4Var.i != i) {
            if (VoIPService.getSharedInstance() == null && this.b == null) {
                this.b = this.d;
                return;
            }
            up4 up4Var2 = z ? this.b : null;
            this.c = up4Var2;
            this.b = this.a[i];
            if (up4Var2 != null) {
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
            qd2 qd2Var = sharedInstance.groupCall;
            if (qd2Var == null) {
                b(sharedInstance.isMicMute() ? 1 : 0, z);
                return;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || sd2.w(14, sharedInstance.getChat())) && !sharedInstance.groupCall.b.rtmp_stream) {
                b(sharedInstance.isMicMute() ? 1 : 0, z);
            } else {
                sharedInstance.setMicMute(true, false, false);
                b(3, z);
            }
        }
    }
}
