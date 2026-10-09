package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ tg(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci.d4 d4Var;
        int i10 = this.a;
        zn znVar = this.b;
        switch (i10) {
            case 0:
                ok okVar = znVar.Y;
                if (okVar != null && znVar.Cc != null) {
                    if (okVar.r0()) {
                        znVar.Y.k0(false);
                        AndroidUtilities.showKeyboard(znVar.Cc.a);
                        znVar.Cc.b.a.a(false, true);
                        break;
                    } else {
                        znVar.Y.T0(false, false, false);
                        znVar.Y.q1();
                        znVar.Cc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 1:
                ArrayList arrayList = znVar.u6;
                znVar.Hb = System.currentTimeMillis();
                if (znVar.x0 != null && znVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < znVar.x0.getChildCount(); i13++) {
                        View childAt = znVar.x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < u1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = u1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (u1Var.getMessageObject() != null) {
                                int id3 = u1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) znVar.x6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                znVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        znVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (znVar.L4 > 0 && znVar.J4 != null) {
                    znVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4)), true);
                }
                znVar.Yc();
                break;
            case 2:
                znVar.xa();
                break;
            case 3:
                AndroidUtilities.removeFromParent(znVar.J0);
                break;
            case 4:
                znVar.h9();
                znVar.Cc(0, true);
                break;
            case 5:
                znVar.j8(false, true, 0.0f);
                break;
            case 6:
                znVar.X9();
                break;
            case 7:
                znVar.lc(false);
                break;
            case 8:
                znVar.v9(2);
                break;
            case 9:
                znVar.j8(false, true, 0.0f);
                break;
            case 10:
                zn.x0(znVar);
                break;
            case 11:
                znVar.j8(false, true, 0.0f);
                break;
            case 12:
                AndroidUtilities.removeFromParent(znVar.L0);
                break;
            case 13:
                znVar.j8(false, true, 0.0f);
                break;
            case 14:
                znVar.Q6();
                break;
            case 15:
                znVar.a = (znVar.a + 1) % 3;
                break;
            case 16:
                znVar.b = !znVar.b;
                break;
            case 17:
                znVar.D7(true);
                org.telegram.messenger.q.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.ad.a0(znVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                znVar.A0.M.clear();
                mm mmVar = znVar.A0;
                mmVar.L = false;
                mmVar.O(true);
                znVar.Tb(false);
                break;
            case 19:
                znVar.t9();
                znVar.w9();
                znVar.u7();
                znVar.w7();
                break;
            case 20:
                znVar.ya = false;
                znVar.yc();
                break;
            case 21:
                znVar.ic = 0;
                znVar.jc = false;
                znVar.x0.f1();
                break;
            case 22:
                znVar.v9(5);
                break;
            case 23:
                znVar.Cc(0, znVar.P5 != 0 && SystemClock.elapsedRealtime() >= znVar.P5 + 150);
                break;
            case 24:
                rk rkVar = znVar.R2;
                if ((rkVar == null || rkVar.getVisibility() != 0) && (d4Var = znVar.w1) != null) {
                    d4Var.u();
                    break;
                }
                break;
            case 25:
                znVar.n7();
                break;
            case 26:
                znVar.v9(5);
                break;
            case 27:
                znVar.d7(false);
                break;
            case 28:
                FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 87);
                e7.bottomMargin = znVar.Y.getMeasuredHeight();
                znVar.X0.addView(znVar.y1, e7);
                znVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                znVar.y1.m(0.0f, znVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                znVar.y1.u();
                break;
            default:
                int i17 = zn.Hc;
                znVar.c7();
                break;
        }
    }
}
