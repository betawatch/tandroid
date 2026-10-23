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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class x20 implements View.OnClickListener {
    public final a6 a = new a6(this, 5);
    public final /* synthetic */ q50 b;

    public x20(q50 q50Var) {
        this.b = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.r40 r40Var;
        int i10;
        q50 q50Var = this.b;
        v20 v20Var = q50Var.x;
        ArrayList arrayList = q50Var.q0;
        org.telegram.ui.Components.voip.t2 t2Var = q50Var.w;
        org.telegram.ui.Components.vj0 vj0Var = q50Var.K0;
        AccountInstance accountInstance = q50Var.d;
        if (q50Var.a1 == null || q50Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (q50Var.s1() && !q50Var.a1.isScheduled()) {
            h30 h30Var = q50Var.a2;
            if (h30Var != null && h30Var.b && (AndroidUtilities.isTablet() || q50.F3 == q50Var.r1())) {
                q50Var.f1(null);
                if (q50.F3) {
                    AndroidUtilities.runOnUIThread(new dz(this, 6), 200L);
                }
                q50Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                q50Var.f1(videoParticipant);
                return;
            }
            if (q50.F3 == q50Var.r1()) {
                q50Var.f1(videoParticipant);
            }
            if (q50Var.r1()) {
                q50Var.i0.setRequestedOrientation(6);
                return;
            } else {
                q50Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = q50Var.F1;
        if (i12 == 5) {
            if (q50Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            q50Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = q50Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.w20
                public final /* synthetic */ x20 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            x20 x20Var = this.b;
                            if (tLObject == null) {
                                x20Var.getClass();
                                break;
                            } else {
                                x20Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            x20 x20Var2 = this.b;
                            if (tLObject == null) {
                                x20Var2.getClass();
                                break;
                            } else {
                                x20Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (r40Var = q50Var.n0) != null) {
                r40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = q50Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = q50Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.w20
                public final /* synthetic */ x20 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            x20 x20Var = this.b;
                            if (tLObject == null) {
                                x20Var.getClass();
                                break;
                            } else {
                                x20Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            x20 x20Var2 = this.b;
                            if (tLObject == null) {
                                x20Var2.getClass();
                                break;
                            } else {
                                x20Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            q50Var.K1(q50Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = q50Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = q50Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    q50Var.K1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    t2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = q50Var.i0;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    org.telegram.ui.Components.xe0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ci.e(16));
                    return;
                }
                q50Var.K1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                t2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (q50Var.p1() || q50Var.L0) {
            return;
        }
        q50Var.L0 = true;
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
        vj0Var.P(i16);
        vj0Var.S(i16 - 1, this.a);
        v20Var.setAnimation(vj0Var);
        vj0Var.M(i11);
        v20Var.d();
        if (q50Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) q50Var.a1.participants.f(MessageObject.getPeerId(q50Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            q50Var.K1(4, true);
        }
    }
}
