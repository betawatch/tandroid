package org.telegram.ui;

import android.os.Build;
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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s30 implements View.OnClickListener {
    public final w5 a = new w5(this, 5);
    public final /* synthetic */ k60 b;

    public s30(k60 k60Var) {
        this.b = k60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.i40 i40Var;
        int i10;
        LaunchActivity launchActivity;
        k60 k60Var = this.b;
        q30 q30Var = k60Var.x;
        ArrayList arrayList = k60Var.q0;
        org.telegram.ui.Components.voip.v2 v2Var = k60Var.w;
        org.telegram.ui.Components.yi0 yi0Var = k60Var.K0;
        AccountInstance accountInstance = k60Var.d;
        if (k60Var.a1 == null || k60Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (k60Var.r1() && !k60Var.a1.isScheduled()) {
            c40 c40Var = k60Var.a2;
            if (c40Var != null && c40Var.b && (AndroidUtilities.isTablet() || k60.F3 == k60Var.q1())) {
                k60Var.e1(null);
                if (k60.F3) {
                    AndroidUtilities.runOnUIThread(new i10(this, 5), 200L);
                }
                k60Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                k60Var.e1(videoParticipant);
                return;
            }
            if (k60.F3 == k60Var.q1()) {
                k60Var.e1(videoParticipant);
            }
            if (k60Var.q1()) {
                k60Var.i0.setRequestedOrientation(6);
                return;
            } else {
                k60Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = k60Var.F1;
        if (i12 == 5) {
            if (k60Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            k60Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = k60Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.r30
                public final /* synthetic */ s30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            s30 s30Var = this.b;
                            if (tLObject == null) {
                                s30Var.getClass();
                                break;
                            } else {
                                s30Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            s30 s30Var2 = this.b;
                            if (tLObject == null) {
                                s30Var2.getClass();
                                break;
                            } else {
                                s30Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (i40Var = k60Var.n0) != null) {
                i40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = k60Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = k60Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.r30
                public final /* synthetic */ s30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            s30 s30Var = this.b;
                            if (tLObject == null) {
                                s30Var.getClass();
                                break;
                            } else {
                                s30Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            s30 s30Var2 = this.b;
                            if (tLObject == null) {
                                s30Var2.getClass();
                                break;
                            } else {
                                s30Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            k60Var.J1(k60Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = k60Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = k60Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    k60Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = k60Var.i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.de0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new org.telegram.ui.ActionBar.k3(3));
                        return;
                    }
                    k60Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (k60Var.o1() || k60Var.L0) {
            return;
        }
        k60Var.L0 = true;
        AndroidUtilities.shakeView(v2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.random.nextInt(100);
        int i16 = 120;
        if (nextInt >= 32) {
            i11 = 240;
            if (nextInt < 64) {
                i16 = 240;
                i11 = 120;
            } else {
                i16 = 420;
                if (nextInt >= 97) {
                    i11 = 540;
                    if (nextInt == 98) {
                        i16 = 540;
                        i11 = 420;
                    } else {
                        i16 = 720;
                    }
                }
            }
        }
        yi0Var.P(i16);
        yi0Var.S(i16 - 1, this.a);
        q30Var.setAnimation(yi0Var);
        yi0Var.M(i11);
        q30Var.d();
        if (k60Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) k60Var.a1.participants.f(MessageObject.getPeerId(k60Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            k60Var.J1(4, true);
        }
    }
}
