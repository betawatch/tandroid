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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class w65 implements View.OnClickListener {
    public final zz3 a = new zz3(this, (byte) 11);
    public final /* synthetic */ j95 b;

    public w65(j95 j95Var) {
        this.b = j95Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b;
        lg5 lg5Var;
        int i;
        j95 j95Var = this.b;
        u65 u65Var = j95Var.w1;
        kmc kmcVar = j95Var.v1;
        k5 k5Var = j95Var.n1;
        b29 b29Var = j95Var.E2;
        if (j95Var.T2 == null || (b = j95Var.z3) == 3) {
            return;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (b == 5) {
            if (j95Var.A3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            j95Var.A3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            vc2 vc2Var = j95Var.T2;
            startscheduledgroupcall.call = vc2Var.h(vc2Var.a);
            ConnectionsManager.getInstance(k5Var.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: v65
                public final /* synthetic */ w65 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b4 = b2;
                    w65 w65Var = this.b;
                    switch (b4) {
                        case 0:
                            if (tLObject != null) {
                                uc7.s1(w65Var.b.n1.a).Y3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                        default:
                            if (tLObject != null) {
                                uc7.s1(w65Var.b.n1.a).Y3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (b == 7 || b == 6) {
            if (b == 6 && (lg5Var = j95Var.g2) != null) {
                lg5Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            vc2 vc2Var2 = j95Var.T2;
            togglegroupcallstartsubscription.call = vc2Var2.h(vc2Var2.a);
            TLRPC.GroupCall groupCall = j95Var.T2.b;
            boolean z = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z;
            togglegroupcallstartsubscription.subscribed = z;
            ConnectionsManager.getInstance(k5Var.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: v65
                public final /* synthetic */ w65 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b4 = b3;
                    w65 w65Var = this.b;
                    switch (b4) {
                        case 0:
                            if (tLObject != null) {
                                uc7.s1(w65Var.b.n1.a).Y3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                        default:
                            if (tLObject != null) {
                                uc7.s1(w65Var.b.n1.a).Y3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                            break;
                    }
                }
            });
            j95Var.I1(j95Var.T2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i = j95Var.M3) == 1 || i == 2 || i == 6 || i == 5) {
            return;
        }
        byte b4 = j95Var.z3;
        if (b4 != 2 && b4 != 4) {
            try {
                if (b4 != 0) {
                    j95Var.I1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    kmcVar.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = j95Var.b2;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    jve.c(R.raw.permission_request_microphone, 2131742935, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bm0((byte) 15));
                    return;
                }
                j95Var.I1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                kmcVar.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (j95Var.h1() || j95Var.F2) {
            return;
        }
        j95Var.F2 = true;
        hl.z3(kmcVar.getTextView());
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
        b29Var.K(b5);
        b29Var.N(b5 - 1, this.a);
        u65Var.setAnimation(b29Var);
        b29Var.H(b2);
        u65Var.d();
        if (j95Var.z3 == 2) {
            long B1 = r47.B1(((TLRPC.GroupCallParticipant) j95Var.T2.d.f(r47.B1(j95Var.u2))).peer);
            VoIPService.getSharedInstance().editCallMember(wf3.D(B1) ? uc7.s1(k5Var.a).X1(Long.valueOf(B1)) : uc7.s1(k5Var.a).M0(Long.valueOf(-B1)), null, null, null, Boolean.TRUE, null);
            j95Var.I1(4, true);
        }
    }
}
