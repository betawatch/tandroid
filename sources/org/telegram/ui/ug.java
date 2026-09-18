package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ ug(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View sendButton;
        ci.f4 f4Var;
        int i10 = this.a;
        zn znVar = this.b;
        switch (i10) {
            case 0:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && znVar.Y != null && znVar.Ea == null && znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) <= 0 && (sendButton = znVar.Y.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (znVar.i2 == null) {
                        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(4, znVar.getParentActivity(), znVar.ea, false);
                        znVar.i2 = i40Var;
                        i40Var.a();
                        znVar.i2.setAlpha(0.0f);
                        znVar.i2.setVisibility(4);
                        znVar.i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        znVar.X0.addView(znVar.i2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    znVar.i2.f(sendButton, true);
                    znVar.j2 = true;
                    break;
                }
                break;
            case 1:
                lk lkVar = znVar.Y;
                if (lkVar != null && znVar.Bc != null) {
                    if (lkVar.t0()) {
                        znVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(znVar.Bc.a);
                        znVar.Bc.b.a.a(false, true);
                        break;
                    } else {
                        znVar.Y.U0(false, false, false);
                        znVar.Y.r1();
                        znVar.Bc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 2:
                ArrayList arrayList = znVar.u6;
                znVar.Gb = System.currentTimeMillis();
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
                znVar.Uc();
                break;
            case 3:
                znVar.ta();
                break;
            case 4:
                znVar.S9();
                break;
            case 5:
                znVar.c9();
                znVar.yc(0, true);
                break;
            case 6:
                znVar.g8(false, true, 0.0f);
                break;
            case 7:
                znVar.g8(false, true, 0.0f);
                break;
            case 8:
                znVar.q9(2);
                break;
            case 9:
                znVar.g8(false, true, 0.0f);
                break;
            case 10:
                zn.l0(znVar);
                break;
            case 11:
                znVar.g8(false, true, 0.0f);
                break;
            case 12:
                znVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, znVar.ea);
                znVar.ob = b2Var;
                b2Var.setOnShowListener(new pf(znVar, 1));
                znVar.ob.setOnCancelListener(znVar.ma);
                znVar.ob.q(500L);
                break;
            case 14:
                znVar.N6();
                break;
            case 15:
                znVar.a = (znVar.a + 1) % 3;
                break;
            case 16:
                znVar.b = !znVar.b;
                break;
            case 17:
                znVar.A7(true);
                org.telegram.messenger.q.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(znVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                znVar.A0.M.clear();
                lm lmVar = znVar.A0;
                lmVar.L = false;
                lmVar.O(true);
                znVar.Pb(false);
                break;
            case 19:
                znVar.o9();
                znVar.r9();
                znVar.r7();
                znVar.t7();
                break;
            case 20:
                znVar.hc = 0;
                znVar.ic = false;
                znVar.x0.g1();
                break;
            case 21:
                znVar.q9(5);
                break;
            case 22:
                znVar.yc(0, znVar.P5 != 0 && SystemClock.elapsedRealtime() >= znVar.P5 + 150);
                break;
            case 23:
                pk pkVar = znVar.R2;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (f4Var = znVar.w1) != null) {
                    f4Var.u();
                    break;
                }
                break;
            case 24:
                znVar.k7();
                break;
            case 25:
                znVar.q9(5);
                break;
            case 26:
                znVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 87);
                e.bottomMargin = znVar.Y.getMeasuredHeight();
                znVar.X0.addView(znVar.y1, e);
                znVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                znVar.y1.m(0.0f, znVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                znVar.y1.u();
                break;
            case 28:
                int i17 = zn.Gc;
                znVar.Z6();
                break;
            default:
                int i18 = zn.Gc;
                znVar.Z6();
                break;
        }
    }
}
