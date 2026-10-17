package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class z20 implements View.OnClickListener {
    public final a6 a = new a6(this, 5);
    public final /* synthetic */ s50 b;

    public z20(s50 s50Var) {
        this.b = s50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.r40 r40Var;
        int i10;
        s50 s50Var = this.b;
        x20 x20Var = s50Var.x;
        ArrayList arrayList = s50Var.q0;
        org.telegram.ui.Components.voip.t2 t2Var = s50Var.w;
        org.telegram.ui.Components.uj0 uj0Var = s50Var.K0;
        AccountInstance accountInstance = s50Var.d;
        if (s50Var.a1 == null || s50Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (s50Var.s1() && !s50Var.a1.isScheduled()) {
            j30 j30Var = s50Var.a2;
            if (j30Var != null && j30Var.b && (AndroidUtilities.isTablet() || s50.F3 == s50Var.r1())) {
                s50Var.f1(null);
                if (s50.F3) {
                    AndroidUtilities.runOnUIThread(new fz(this, 6), 200L);
                }
                s50Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                s50Var.f1(videoParticipant);
                return;
            }
            if (s50.F3 == s50Var.r1()) {
                s50Var.f1(videoParticipant);
            }
            if (s50Var.r1()) {
                s50Var.i0.setRequestedOrientation(6);
                return;
            } else {
                s50Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = s50Var.F1;
        if (i12 == 5) {
            if (s50Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            s50Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = s50Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.y20
                public final /* synthetic */ z20 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            z20 z20Var = this.b;
                            if (tLObject == null) {
                                z20Var.getClass();
                                break;
                            } else {
                                z20Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            z20 z20Var2 = this.b;
                            if (tLObject == null) {
                                z20Var2.getClass();
                                break;
                            } else {
                                z20Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (r40Var = s50Var.n0) != null) {
                r40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = s50Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = s50Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.y20
                public final /* synthetic */ z20 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            z20 z20Var = this.b;
                            if (tLObject == null) {
                                z20Var.getClass();
                                break;
                            } else {
                                z20Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            z20 z20Var2 = this.b;
                            if (tLObject == null) {
                                z20Var2.getClass();
                                break;
                            } else {
                                z20Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            s50Var.K1(s50Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = s50Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = s50Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    s50Var.K1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    t2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = s50Var.i0;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    org.telegram.ui.Components.we0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ci.e(16));
                    return;
                }
                s50Var.K1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                t2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (s50Var.p1() || s50Var.L0) {
            return;
        }
        s50Var.L0 = true;
        AndroidUtilities.shakeView(t2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.random.nextInt(100);
        int i16 = 120;
        if (nextInt >= 32) {
            i11 = 240;
            if (nextInt >= 64) {
                i16 = 420;
                if (nextInt >= 97) {
                    i11 = 540;
                    if (nextInt != 98) {
                        i16 = 720;
                    }
                }
            }
            int i17 = i11;
            i11 = i16;
            i16 = i17;
        }
        uj0Var.P(i16);
        uj0Var.S(i16 - 1, this.a);
        x20Var.setAnimation(uj0Var);
        uj0Var.M(i11);
        x20Var.d();
        if (s50Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) s50Var.a1.participants.f(MessageObject.getPeerId(s50Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            s50Var.K1(4, true);
        }
    }
}
