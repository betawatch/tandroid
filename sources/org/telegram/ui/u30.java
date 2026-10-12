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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u30 implements View.OnClickListener {
    public final a6 a = new a6(this, 5);
    public final /* synthetic */ n60 b;

    public u30(n60 n60Var) {
        this.b = n60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.v40 v40Var;
        int i10;
        n60 n60Var = this.b;
        s30 s30Var = n60Var.x;
        ArrayList arrayList = n60Var.q0;
        org.telegram.ui.Components.voip.u2 u2Var = n60Var.w;
        org.telegram.ui.Components.yj0 yj0Var = n60Var.K0;
        AccountInstance accountInstance = n60Var.d;
        if (n60Var.a1 == null || n60Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (n60Var.s1() && !n60Var.a1.isScheduled()) {
            e40 e40Var = n60Var.a2;
            if (e40Var != null && e40Var.b && (AndroidUtilities.isTablet() || n60.F3 == n60Var.r1())) {
                n60Var.f1(null);
                if (n60.F3) {
                    AndroidUtilities.runOnUIThread(new zz(this, 6), 200L);
                }
                n60Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                n60Var.f1(videoParticipant);
                return;
            }
            if (n60.F3 == n60Var.r1()) {
                n60Var.f1(videoParticipant);
            }
            if (n60Var.r1()) {
                n60Var.i0.setRequestedOrientation(6);
                return;
            } else {
                n60Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = n60Var.F1;
        if (i12 == 5) {
            if (n60Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            n60Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = n60Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.t30
                public final /* synthetic */ u30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            u30 u30Var = this.b;
                            if (tLObject == null) {
                                u30Var.getClass();
                                break;
                            } else {
                                u30Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            u30 u30Var2 = this.b;
                            if (tLObject == null) {
                                u30Var2.getClass();
                                break;
                            } else {
                                u30Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (v40Var = n60Var.n0) != null) {
                v40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = n60Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = n60Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.t30
                public final /* synthetic */ u30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            u30 u30Var = this.b;
                            if (tLObject == null) {
                                u30Var.getClass();
                                break;
                            } else {
                                u30Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            u30 u30Var2 = this.b;
                            if (tLObject == null) {
                                u30Var2.getClass();
                                break;
                            } else {
                                u30Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            n60Var.K1(n60Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = n60Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = n60Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    n60Var.K1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    u2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = n60Var.i0;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    org.telegram.ui.Components.cf0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bi.f(16));
                    return;
                }
                n60Var.K1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                u2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (n60Var.p1() || n60Var.L0) {
            return;
        }
        n60Var.L0 = true;
        AndroidUtilities.shakeView(u2Var.getTextView());
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
        yj0Var.P(i16);
        yj0Var.S(i16 - 1, this.a);
        s30Var.setAnimation(yj0Var);
        yj0Var.M(i11);
        s30Var.d();
        if (n60Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) n60Var.a1.participants.f(MessageObject.getPeerId(n60Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            n60Var.K1(4, true);
        }
    }
}
