package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s10 implements View.OnClickListener {
    public final m4 a = new m4(this, 6);
    public final /* synthetic */ f40 b;

    public s10(f40 f40Var) {
        this.b = f40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.y20 y20Var;
        int i7;
        f40 f40Var = this.b;
        q10 q10Var = f40Var.w1;
        ArrayList arrayList = f40Var.k2;
        org.telegram.ui.Components.voip.n2 n2Var = f40Var.v1;
        org.telegram.ui.Components.zg0 zg0Var = f40Var.E2;
        org.telegram.messenger.c cVar = f40Var.n1;
        if (f40Var.U2 == null || f40Var.z3 == 3) {
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (f40Var.u1() && !f40Var.U2.j()) {
            c20 c20Var = f40Var.U3;
            if (c20Var != null && c20Var.b && (org.telegram.messenger.g0.Q1() || f40.z5 == f40Var.t1())) {
                f40Var.h1(null);
                if (f40.z5) {
                    org.telegram.messenger.g0.i3(new kz(this, 5), 200L);
                }
                f40Var.c2.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
            if (org.telegram.messenger.g0.Q1()) {
                f40Var.h1(s3Var);
                return;
            }
            if (f40.z5 == f40Var.t1()) {
                f40Var.h1(s3Var);
            }
            if (f40Var.t1()) {
                f40Var.c2.setRequestedOrientation(6);
                return;
            } else {
                f40Var.c2.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = f40Var.z3;
        if (i12 == 5) {
            if (f40Var.B3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            f40Var.B3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            org.telegram.messenger.r3 r3Var = f40Var.U2;
            startscheduledgroupcall.call = r3Var.g(r3Var.a);
            ConnectionsManager.getInstance(cVar.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.r10
                public final /* synthetic */ s10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            s10 s10Var = this.b;
                            if (tLObject == null) {
                                s10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(s10Var.b.n1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            s10 s10Var2 = this.b;
                            if (tLObject == null) {
                                s10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(s10Var2.b.n1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (y20Var = f40Var.h2) != null) {
                y20Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            org.telegram.messenger.r3 r3Var2 = f40Var.U2;
            togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.a);
            TLRPC.GroupCall groupCall = f40Var.U2.b;
            boolean z9 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z9;
            togglegroupcallstartsubscription.subscribed = z9;
            ConnectionsManager.getInstance(cVar.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.r10
                public final /* synthetic */ s10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            s10 s10Var = this.b;
                            if (tLObject == null) {
                                s10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(s10Var.b.n1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            s10 s10Var2 = this.b;
                            if (tLObject == null) {
                                s10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(s10Var2.b.n1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            f40Var.P1(f40Var.U2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i7 = f40Var.N3) == 1 || i7 == 2 || i7 == 6 || i7 == 5) {
            return;
        }
        int i13 = f40Var.z3;
        if (i13 != 2 && i13 != 4) {
            try {
                if (i13 != 0) {
                    f40Var.P1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    n2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = f40Var.c2;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    c8.ia.c(R.raw.permission_request_microphone, 2131743283, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(17));
                    return;
                }
                f40Var.P1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                n2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (f40Var.r1() || f40Var.F2) {
            return;
        }
        f40Var.F2 = true;
        org.telegram.messenger.g0.F3(n2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.b.nextInt(100);
        int i14 = 120;
        if (nextInt >= 32) {
            i10 = org.telegram.messenger.qs.P3;
            if (nextInt >= 64) {
                i14 = 420;
                if (nextInt >= 97) {
                    i10 = 540;
                    if (nextInt != 98) {
                        i14 = 720;
                    }
                }
            }
            int i15 = i10;
            i10 = i14;
            i14 = i15;
        }
        zg0Var.P(i14);
        zg0Var.S(i14 - 1, this.a);
        q10Var.setAnimation(zg0Var);
        zg0Var.M(i10);
        q10Var.d();
        if (f40Var.z3 == 2) {
            long B1 = org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) f40Var.U2.d.f(org.telegram.messenger.ij.B1(f40Var.u2))).peer);
            VoIPService.getSharedInstance().editCallMember(org.telegram.messenger.m5.E(B1) ? org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(B1)) : org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(-B1)), null, null, null, Boolean.TRUE, null);
            f40Var.P1(4, true);
        }
    }
}
