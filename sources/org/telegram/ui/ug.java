package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ ug(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci.e4 e4Var;
        int i10 = this.a;
        int i11 = 3;
        yn ynVar = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ynVar.s6;
                ynVar.Eb = System.currentTimeMillis();
                if (ynVar.v0 != null && ynVar.y0 != null) {
                    int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i13 = TLObject.FLAG_31;
                    for (int i14 = 0; i14 < ynVar.v0.getChildCount(); i14++) {
                        View childAt = ynVar.v0.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var.getCurrentMessagesGroup() != null) {
                                for (int i15 = 0; i15 < u1Var.getCurrentMessagesGroup().messages.size(); i15++) {
                                    int id2 = u1Var.getCurrentMessagesGroup().messages.get(i15).getId();
                                    i12 = Math.min(i12, id2);
                                    i13 = Math.max(i13, id2);
                                }
                            } else if (u1Var.getMessageObject() != null) {
                                int id3 = u1Var.getMessageObject().getId();
                                i12 = Math.min(i12, id3);
                                i13 = Math.max(i13, id3);
                            }
                        }
                    }
                    if (i12 <= i13) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i16);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) ynVar.v6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                ynVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i12 + (-7) && id4 <= i13 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i17 = 0; i17 < groupedMessages.messages.size(); i17++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i17);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        ynVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i12 + (-7) && id5 <= i13 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (ynVar.J4 > 0 && ynVar.H4 != null) {
                    ynVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) ynVar.H4.get(Integer.valueOf(ynVar.J4)), true);
                }
                ynVar.Tc();
                break;
            case 1:
                jk jkVar = ynVar.W;
                if (jkVar != null && ynVar.zc != null) {
                    if (jkVar.t0()) {
                        ynVar.W.m0(false);
                        AndroidUtilities.showKeyboard(ynVar.zc.a);
                        ynVar.zc.b.a.a(false, true);
                        break;
                    } else {
                        ynVar.W.U0(false, false, false);
                        ynVar.W.r1();
                        ynVar.zc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 2:
                ynVar.sa();
                break;
            case 3:
                ynVar.g8(false, true, 0.0f);
                break;
            case 4:
                AndroidUtilities.removeFromParent(ynVar.J0);
                break;
            case 5:
                ynVar.R9();
                break;
            case 6:
                ynVar.d9();
                ynVar.xc(0, true);
                break;
            case 7:
                ynVar.g8(false, true, 0.0f);
                break;
            case 8:
                ynVar.g8(false, true, 0.0f);
                break;
            case 9:
                yn.X(ynVar);
                break;
            case 10:
                ynVar.g8(false, true, 0.0f);
                break;
            case 11:
                ynVar.g8(false, true, 0.0f);
                break;
            case 12:
                ynVar.N6();
                break;
            case 13:
                ynVar.a = (ynVar.a + 1) % 3;
                break;
            case 14:
                ynVar.b = !ynVar.b;
                break;
            case 15:
                ynVar.A7(true);
                org.telegram.messenger.f0.p(R.string.TranscriptionReportSent, org.telegram.ui.Components.yc.a0(ynVar), R.raw.chats_infotip, 36);
                break;
            case 16:
                ynVar.y0.M.clear();
                jm jmVar = ynVar.y0;
                jmVar.L = false;
                jmVar.O(true);
                ynVar.Ob(false);
                break;
            case 17:
                ynVar.fc = 0;
                ynVar.gc = false;
                ynVar.v0.h1();
                break;
            case 18:
                ynVar.o9();
                ynVar.q9();
                ynVar.r7();
                ynVar.t7();
                break;
            case 19:
                ynVar.xc(0, ynVar.N5 != 0 && SystemClock.elapsedRealtime() >= ynVar.N5 + 150);
                break;
            case 20:
                nk nkVar = ynVar.P2;
                if ((nkVar == null || nkVar.getVisibility() != 0) && (e4Var = ynVar.u1) != null) {
                    e4Var.u();
                    break;
                }
                break;
            case 21:
                ynVar.k7();
                break;
            case 22:
                ynVar.a7(false);
                break;
            case 23:
                FrameLayout.LayoutParams e7 = w7.z5.e(-1, -2, 87);
                e7.bottomMargin = ynVar.W.getMeasuredHeight();
                ynVar.V0.addView(ynVar.w1, e7);
                ynVar.w1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                ynVar.w1.m(0.0f, ynVar.W.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                ynVar.w1.u();
                break;
            case 24:
                ynVar.J5 = null;
                if (ynVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.ca);
                    boolean isChannel = ChatObject.isChannel(ynVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (!isChannel || ynVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new re(ynVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new re(ynVar, i11));
                    ynVar.showDialog(b2Var);
                    break;
                }
                break;
            case 25:
                int i18 = yn.Bc;
                ynVar.Z6();
                break;
            case 26:
                int i19 = yn.Bc;
                ynVar.Z6();
                break;
            case 27:
                yn.i2(ynVar);
                break;
            case 28:
                yn.i2(ynVar);
                break;
            default:
                int i20 = yn.Bc;
                ynVar.La();
                break;
        }
    }
}
