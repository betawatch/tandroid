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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ rg(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View sendButton;
        ci.e4 e4Var;
        int i10 = this.a;
        wn wnVar = this.b;
        switch (i10) {
            case 0:
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && wnVar.Y != null && wnVar.Ea == null && wnVar.getMessagesController().getSendPaidMessagesStars(wnVar.a()) <= 0 && (sendButton = wnVar.Y.getSendButton()) != null && wnVar.Y.getEditField() != null && wnVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (wnVar.i2 == null) {
                        org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(4, wnVar.getParentActivity(), wnVar.ea, false);
                        wnVar.i2 = j40Var;
                        j40Var.a();
                        wnVar.i2.setAlpha(0.0f);
                        wnVar.i2.setVisibility(4);
                        wnVar.i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        wnVar.X0.addView(wnVar.i2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    wnVar.i2.f(sendButton, true);
                    wnVar.j2 = true;
                    break;
                }
                break;
            case 1:
                jk jkVar = wnVar.Y;
                if (jkVar != null && wnVar.Bc != null) {
                    if (jkVar.t0()) {
                        wnVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(wnVar.Bc.a);
                        wnVar.Bc.b.a.a(false, true);
                        break;
                    } else {
                        wnVar.Y.V0(false, false, false);
                        wnVar.Y.s1();
                        wnVar.Bc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 2:
                ArrayList arrayList = wnVar.u6;
                wnVar.Gb = System.currentTimeMillis();
                if (wnVar.x0 != null && wnVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < wnVar.x0.getChildCount(); i13++) {
                        View childAt = wnVar.x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) wnVar.x6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                wnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        wnVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (wnVar.L4 > 0 && wnVar.J4 != null) {
                    wnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) wnVar.J4.get(Integer.valueOf(wnVar.L4)), true);
                }
                wnVar.Uc();
                break;
            case 3:
                wnVar.ta();
                break;
            case 4:
                wnVar.S9();
                break;
            case 5:
                wnVar.c9();
                wnVar.yc(0, true);
                break;
            case 6:
                wnVar.g8(false, true, 0.0f);
                break;
            case 7:
                wnVar.g8(false, true, 0.0f);
                break;
            case 8:
                wnVar.q9(2);
                break;
            case 9:
                wnVar.g8(false, true, 0.0f);
                break;
            case 10:
                wn.k0(wnVar);
                break;
            case 11:
                wnVar.g8(false, true, 0.0f);
                break;
            case 12:
                wnVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wnVar.getParentActivity(), 3, wnVar.ea);
                wnVar.ob = a2Var;
                a2Var.setOnShowListener(new mf(wnVar, 1));
                wnVar.ob.setOnCancelListener(wnVar.ma);
                wnVar.ob.q(500L);
                break;
            case 14:
                wnVar.N6();
                break;
            case 15:
                wnVar.a = (wnVar.a + 1) % 3;
                break;
            case 16:
                wnVar.b = !wnVar.b;
                break;
            case 17:
                wnVar.A7(true);
                org.telegram.messenger.f0.p(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(wnVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                wnVar.A0.M.clear();
                jm jmVar = wnVar.A0;
                jmVar.L = false;
                jmVar.O(true);
                wnVar.Pb(false);
                break;
            case 19:
                wnVar.o9();
                wnVar.r9();
                wnVar.r7();
                wnVar.t7();
                break;
            case 20:
                wnVar.hc = 0;
                wnVar.ic = false;
                wnVar.x0.f1();
                break;
            case 21:
                wnVar.q9(5);
                break;
            case 22:
                wnVar.yc(0, wnVar.P5 != 0 && SystemClock.elapsedRealtime() >= wnVar.P5 + 150);
                break;
            case 23:
                nk nkVar = wnVar.R2;
                if ((nkVar == null || nkVar.getVisibility() != 0) && (e4Var = wnVar.w1) != null) {
                    e4Var.u();
                    break;
                }
                break;
            case 24:
                wnVar.k7();
                break;
            case 25:
                wnVar.q9(5);
                break;
            case 26:
                wnVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 87);
                e.bottomMargin = wnVar.Y.getMeasuredHeight();
                wnVar.X0.addView(wnVar.y1, e);
                wnVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                wnVar.y1.m(0.0f, wnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                wnVar.y1.u();
                break;
            case 28:
                int i17 = wn.Gc;
                wnVar.Z6();
                break;
            default:
                int i18 = wn.Gc;
                wnVar.Z6();
                break;
        }
    }
}
