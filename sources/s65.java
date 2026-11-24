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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s65 implements View.OnClickListener {
    public final o04 a = new o04(this, (byte) 11);
    public final /* synthetic */ g95 b;

    public s65(g95 g95Var) {
        this.b = g95Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b;
        ig5 ig5Var;
        int i;
        g95 g95Var = this.b;
        q65 q65Var = g95Var.w1;
        dkc dkcVar = g95Var.v1;
        j5 j5Var = g95Var.n1;
        p09 p09Var = g95Var.E2;
        if (g95Var.T2 == null || (b = g95Var.z3) == 3) {
            return;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (b == 5) {
            if (g95Var.A3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            g95Var.A3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            qd2 qd2Var = g95Var.T2;
            startscheduledgroupcall.call = qd2Var.h(qd2Var.a);
            ConnectionsManager.getInstance(j5Var.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: r65
                public final /* synthetic */ s65 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b4 = b2;
                    s65 s65Var = this.b;
                    switch (b4) {
                        case 0:
                            if (tLObject != null) {
                                oc7.r1(s65Var.b.n1.a).T3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                        default:
                            if (tLObject != null) {
                                oc7.r1(s65Var.b.n1.a).T3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (b == 7 || b == 6) {
            if (b == 6 && (ig5Var = g95Var.g2) != null) {
                ig5Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            qd2 qd2Var2 = g95Var.T2;
            togglegroupcallstartsubscription.call = qd2Var2.h(qd2Var2.a);
            TLRPC.GroupCall groupCall = g95Var.T2.b;
            boolean z = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z;
            togglegroupcallstartsubscription.subscribed = z;
            ConnectionsManager.getInstance(j5Var.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: r65
                public final /* synthetic */ s65 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b4 = b3;
                    s65 s65Var = this.b;
                    switch (b4) {
                        case 0:
                            if (tLObject != null) {
                                oc7.r1(s65Var.b.n1.a).T3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                        default:
                            if (tLObject != null) {
                                oc7.r1(s65Var.b.n1.a).T3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                    }
                }
            });
            g95Var.H1(g95Var.T2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i = g95Var.M3) == 1 || i == 2 || i == 6 || i == 5) {
            return;
        }
        byte b4 = g95Var.z3;
        if (b4 != 2 && b4 != 4) {
            try {
                if (b4 != 0) {
                    g95Var.H1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    dkcVar.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = g95Var.b2;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    use.c(R.raw.permission_request_microphone, 2131742967, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bn0((byte) 15));
                    return;
                }
                g95Var.H1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                dkcVar.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (g95Var.g1() || g95Var.F2) {
            return;
        }
        g95Var.F2 = true;
        gm.z3(dkcVar.getTextView());
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
        p09Var.K(b5);
        p09Var.N(b5 - 1, this.a);
        q65Var.setAnimation(p09Var);
        p09Var.H(b2);
        q65Var.d();
        if (g95Var.z3 == 2) {
            long B1 = k47.B1(((TLRPC.GroupCallParticipant) g95Var.T2.d.f(k47.B1(g95Var.u2))).peer);
            VoIPService.getSharedInstance().editCallMember(pg3.D(B1) ? oc7.r1(j5Var.a).W1(Long.valueOf(B1)) : oc7.r1(j5Var.a).L0(Long.valueOf(-B1)), null, null, null, Boolean.TRUE, null);
            g95Var.H1(4, true);
        }
    }
}
