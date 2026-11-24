// default package

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u45 implements View.OnClickListener {
    public final ez3 a = new ez3(this, (byte) 11);
    public final /* synthetic */ h75 b;

    public u45(h75 h75Var) {
        this.b = h75Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b;
        ke5 ke5Var;
        int i;
        h75 h75Var = this.b;
        s45 s45Var = h75Var.w1;
        dic dicVar = h75Var.v1;
        j5 j5Var = h75Var.n1;
        oy8 oy8Var = h75Var.E2;
        if (h75Var.T2 == null || (b = h75Var.z3) == 3) {
            return;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (b == 5) {
            if (h75Var.A3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            h75Var.A3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            fc2 fc2Var = h75Var.T2;
            startscheduledgroupcall.call = fc2Var.h(fc2Var.a);
            ConnectionsManager.getInstance(j5Var.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: t45
                public final /* synthetic */ u45 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b4 = b2;
                    u45 u45Var = this.b;
                    switch (b4) {
                        case 0:
                            if (tLObject != null) {
                                na7.q1(u45Var.b.n1.a).R3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                        default:
                            if (tLObject != null) {
                                na7.q1(u45Var.b.n1.a).R3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (b == 7 || b == 6) {
            if (b == 6 && (ke5Var = h75Var.g2) != null) {
                ke5Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            fc2 fc2Var2 = h75Var.T2;
            togglegroupcallstartsubscription.call = fc2Var2.h(fc2Var2.a);
            TLRPC.GroupCall groupCall = h75Var.T2.b;
            boolean z = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z;
            togglegroupcallstartsubscription.subscribed = z;
            ConnectionsManager.getInstance(j5Var.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: t45
                public final /* synthetic */ u45 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b4 = b3;
                    u45 u45Var = this.b;
                    switch (b4) {
                        case 0:
                            if (tLObject != null) {
                                na7.q1(u45Var.b.n1.a).R3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                        default:
                            if (tLObject != null) {
                                na7.q1(u45Var.b.n1.a).R3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                    }
                }
            });
            h75Var.H1(h75Var.T2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i = h75Var.M3) == 1 || i == 2 || i == 6 || i == 5) {
            return;
        }
        byte b4 = h75Var.z3;
        if (b4 != 2 && b4 != 4) {
            try {
                if (b4 != 0) {
                    h75Var.H1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    dicVar.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = h75Var.b2;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    rqe.c(R.raw.permission_request_microphone, 2131743041, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bm0((byte) 15));
                    return;
                }
                h75Var.H1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                dicVar.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (h75Var.g1() || h75Var.F2) {
            return;
        }
        h75Var.F2 = true;
        gl.z3(dicVar.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.b.nextInt(100);
        byte b5 = 120;
        if (nextInt >= 32) {
            b2 = 240;
            if (nextInt >= 64) {
                b5 = 420;
                if (nextInt >= 97) {
                    b2 = 540;
                    if (nextInt != 98) {
                        b5 = 720;
                    }
                }
            }
            byte b6 = b2;
            b2 = b5;
            b5 = b6;
        }
        oy8Var.K(b5);
        oy8Var.N(b5 - 1, this.a);
        s45Var.setAnimation(oy8Var);
        oy8Var.H(b2);
        s45Var.d();
        if (h75Var.z3 == 2) {
            long B1 = k27.B1(((TLRPC.GroupCallParticipant) h75Var.T2.d.f(k27.B1(h75Var.u2))).peer);
            VoIPService.getSharedInstance().editCallMember(cf3.D(B1) ? na7.q1(j5Var.a).V1(Long.valueOf(B1)) : na7.q1(j5Var.a).K0(Long.valueOf(-B1)), null, null, null, Boolean.TRUE, null);
            h75Var.H1(4, true);
        }
    }
}
