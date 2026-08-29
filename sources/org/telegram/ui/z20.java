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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z20 implements View.OnClickListener {
    public final w5 a = new w5(this, 5);
    public final /* synthetic */ r50 b;

    public z20(r50 r50Var) {
        this.b = r50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.g40 g40Var;
        int i10;
        LaunchActivity launchActivity;
        r50 r50Var = this.b;
        x20 x20Var = r50Var.x;
        ArrayList arrayList = r50Var.m0;
        org.telegram.ui.Components.voip.x2 x2Var = r50Var.w;
        org.telegram.ui.Components.xi0 xi0Var = r50Var.G0;
        AccountInstance accountInstance = r50Var.d;
        if (r50Var.W0 == null || r50Var.B1 == 3) {
            return;
        }
        int i11 = 0;
        if (r50Var.r1() && !r50Var.W0.isScheduled()) {
            j30 j30Var = r50Var.W1;
            if (j30Var != null && j30Var.b && (AndroidUtilities.isTablet() || r50.B3 == r50Var.q1())) {
                r50Var.e1(null);
                if (r50.B3) {
                    AndroidUtilities.runOnUIThread(new q00(this, 5), 200L);
                }
                r50Var.e0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                r50Var.e1(videoParticipant);
                return;
            }
            if (r50.B3 == r50Var.q1()) {
                r50Var.e1(videoParticipant);
            }
            if (r50Var.q1()) {
                r50Var.e0.setRequestedOrientation(6);
                return;
            } else {
                r50Var.e0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = r50Var.B1;
        if (i12 == 5) {
            if (r50Var.D1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            r50Var.D1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = r50Var.W0.getInputGroupCall();
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
                                z20Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            z20 z20Var2 = this.b;
                            if (tLObject == null) {
                                z20Var2.getClass();
                                break;
                            } else {
                                z20Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (g40Var = r50Var.j0) != null) {
                g40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = r50Var.W0.getInputGroupCall();
            TLRPC.GroupCall groupCall = r50Var.W0.call;
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
                                z20Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            z20 z20Var2 = this.b;
                            if (tLObject == null) {
                                z20Var2.getClass();
                                break;
                            } else {
                                z20Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            r50Var.J1(r50Var.W0.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = r50Var.P1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = r50Var.B1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    r50Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    x2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = r50Var.e0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.yd0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new eg.h(4));
                        return;
                    }
                    r50Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    x2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (r50Var.o1() || r50Var.H0) {
            return;
        }
        r50Var.H0 = true;
        AndroidUtilities.shakeView(x2Var.getTextView());
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
        xi0Var.N(i16);
        xi0Var.P(i16 - 1, this.a);
        x20Var.setAnimation(xi0Var);
        xi0Var.K(i11);
        x20Var.d();
        if (r50Var.B1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) r50Var.W0.participants.f(MessageObject.getPeerId(r50Var.w0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            r50Var.J1(4, true);
        }
    }
}
