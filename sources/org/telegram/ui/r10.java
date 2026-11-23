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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class r10 implements View.OnClickListener {
    public final m4 a = new m4(this, 6);
    public final /* synthetic */ f40 b;

    public r10(f40 f40Var) {
        this.b = f40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.m30 m30Var;
        int i7;
        f40 f40Var = this.b;
        p10 p10Var = f40Var.x1;
        ArrayList arrayList = f40Var.l2;
        org.telegram.ui.Components.voip.q2 q2Var = f40Var.w1;
        org.telegram.ui.Components.oh0 oh0Var = f40Var.F2;
        org.telegram.messenger.c cVar = f40Var.o1;
        if (f40Var.V2 == null || f40Var.E3 == 3) {
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (f40Var.v1() && !f40Var.V2.j()) {
            b20 b20Var = f40Var.Z3;
            if (b20Var != null && b20Var.b && (org.telegram.messenger.g0.Q1() || f40.E5 == f40Var.u1())) {
                f40Var.i1(null);
                if (f40.E5) {
                    org.telegram.messenger.g0.h3(new lz(this, 5), 200L);
                }
                f40Var.d2.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList.get(0);
            if (org.telegram.messenger.g0.Q1()) {
                f40Var.i1(u3Var);
                return;
            }
            if (f40.E5 == f40Var.u1()) {
                f40Var.i1(u3Var);
            }
            if (f40Var.u1()) {
                f40Var.d2.setRequestedOrientation(6);
                return;
            } else {
                f40Var.d2.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = f40Var.E3;
        if (i12 == 5) {
            if (f40Var.G3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            f40Var.G3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            org.telegram.messenger.t3 t3Var = f40Var.V2;
            startscheduledgroupcall.call = t3Var.g(t3Var.a);
            ConnectionsManager.getInstance(cVar.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.q10
                public final /* synthetic */ r10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            r10 r10Var = this.b;
                            if (tLObject == null) {
                                r10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.np.u1(r10Var.b.o1.a).V3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            r10 r10Var2 = this.b;
                            if (tLObject == null) {
                                r10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.np.u1(r10Var2.b.o1.a).V3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (m30Var = f40Var.i2) != null) {
                m30Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            org.telegram.messenger.t3 t3Var2 = f40Var.V2;
            togglegroupcallstartsubscription.call = t3Var2.g(t3Var2.a);
            TLRPC.GroupCall groupCall = f40Var.V2.b;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            ConnectionsManager.getInstance(cVar.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.q10
                public final /* synthetic */ r10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            r10 r10Var = this.b;
                            if (tLObject == null) {
                                r10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.np.u1(r10Var.b.o1.a).V3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            r10 r10Var2 = this.b;
                            if (tLObject == null) {
                                r10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.np.u1(r10Var2.b.o1.a).V3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            f40Var.S1(f40Var.V2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i7 = f40Var.S3) == 1 || i7 == 2 || i7 == 6 || i7 == 5) {
            return;
        }
        int i13 = f40Var.E3;
        if (i13 != 2 && i13 != 4) {
            try {
                if (i13 != 0) {
                    f40Var.S1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    q2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = f40Var.d2;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    c8.na.c(R.raw.permission_request_microphone, 2131743038, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new fi.e(18));
                    return;
                }
                f40Var.S1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                q2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (f40Var.s1() || f40Var.G2) {
            return;
        }
        f40Var.G2 = true;
        org.telegram.messenger.g0.D3(q2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.b.nextInt(100);
        int i14 = 120;
        if (nextInt >= 32) {
            i10 = org.telegram.messenger.ls.P3;
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
        oh0Var.P(i14);
        oh0Var.S(i14 - 1, this.a);
        p10Var.setAnimation(oh0Var);
        oh0Var.M(i10);
        p10Var.d();
        if (f40Var.E3 == 2) {
            long B1 = org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) f40Var.V2.d.f(org.telegram.messenger.gj.B1(f40Var.v2))).peer);
            VoIPService.getSharedInstance().editCallMember(org.telegram.messenger.n5.E(B1) ? org.telegram.messenger.np.u1(cVar.a).c2(Long.valueOf(B1)) : org.telegram.messenger.np.u1(cVar.a).O0(Long.valueOf(-B1)), null, null, null, Boolean.TRUE, null);
            f40Var.S1(4, true);
        }
    }
}
