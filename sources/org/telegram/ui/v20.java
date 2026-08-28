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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v20 implements View.OnClickListener {
    public final v5 a = new v5(this, 5);
    public final /* synthetic */ o50 b;

    public v20(o50 o50Var) {
        this.b = o50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.s30 s30Var;
        int i9;
        LaunchActivity launchActivity;
        o50 o50Var = this.b;
        t20 t20Var = o50Var.x;
        ArrayList arrayList = o50Var.m0;
        org.telegram.ui.Components.voip.u2 u2Var = o50Var.w;
        org.telegram.ui.Components.mi0 mi0Var = o50Var.G0;
        AccountInstance accountInstance = o50Var.d;
        if (o50Var.W0 == null || o50Var.B1 == 3) {
            return;
        }
        int i10 = 0;
        if (o50Var.r1() && !o50Var.W0.isScheduled()) {
            g30 g30Var = o50Var.W1;
            if (g30Var != null && g30Var.b && (AndroidUtilities.isTablet() || o50.B3 == o50Var.q1())) {
                o50Var.e1(null);
                if (o50.B3) {
                    AndroidUtilities.runOnUIThread(new o00(this, 5), 200L);
                }
                o50Var.e0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                o50Var.e1(videoParticipant);
                return;
            }
            if (o50.B3 == o50Var.q1()) {
                o50Var.e1(videoParticipant);
            }
            if (o50Var.q1()) {
                o50Var.e0.setRequestedOrientation(6);
                return;
            } else {
                o50Var.e0.setRequestedOrientation(1);
                return;
            }
        }
        int i11 = o50Var.B1;
        if (i11 == 5) {
            if (o50Var.D1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            o50Var.D1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = o50Var.W0.getInputGroupCall();
            final int i12 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.u20
                public final /* synthetic */ v20 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            v20 v20Var = this.b;
                            if (tLObject == null) {
                                v20Var.getClass();
                                break;
                            } else {
                                v20Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            v20 v20Var2 = this.b;
                            if (tLObject == null) {
                                v20Var2.getClass();
                                break;
                            } else {
                                v20Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i11 == 7 || i11 == 6) {
            if (i11 == 6 && (s30Var = o50Var.j0) != null) {
                s30Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = o50Var.W0.getInputGroupCall();
            TLRPC.GroupCall groupCall = o50Var.W0.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i13 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.u20
                public final /* synthetic */ v20 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            v20 v20Var = this.b;
                            if (tLObject == null) {
                                v20Var.getClass();
                                break;
                            } else {
                                v20Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            v20 v20Var2 = this.b;
                            if (tLObject == null) {
                                v20Var2.getClass();
                                break;
                            } else {
                                v20Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            o50Var.J1(o50Var.W0.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i9 = o50Var.P1) == 1 || i9 == 2 || i9 == 6 || i9 == 5) {
            return;
        }
        int i14 = o50Var.B1;
        if (i14 != 2 && i14 != 4) {
            try {
                if (i14 != 0) {
                    o50Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    u2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = o50Var.e0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.kd0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bg.k(4));
                        return;
                    }
                    o50Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    u2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (o50Var.o1() || o50Var.H0) {
            return;
        }
        o50Var.H0 = true;
        AndroidUtilities.shakeView(u2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.random.nextInt(100);
        int i15 = 120;
        if (nextInt >= 32) {
            i10 = 240;
            if (nextInt < 64) {
                i15 = 240;
                i10 = 120;
            } else {
                i15 = 420;
                if (nextInt >= 97) {
                    i10 = 540;
                    if (nextInt == 98) {
                        i15 = 540;
                        i10 = 420;
                    } else {
                        i15 = 720;
                    }
                }
            }
        }
        mi0Var.N(i15);
        mi0Var.P(i15 - 1, this.a);
        t20Var.setAnimation(mi0Var);
        mi0Var.K(i10);
        t20Var.d();
        if (o50Var.B1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) o50Var.W0.participants.f(MessageObject.getPeerId(o50Var.w0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            o50Var.J1(4, true);
        }
    }
}
