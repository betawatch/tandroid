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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ ug(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci.f4 f4Var;
        int i10 = this.a;
        bo boVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(boVar.J0);
                break;
            case 1:
                ArrayList arrayList = boVar.u6;
                boVar.Gb = System.currentTimeMillis();
                if (boVar.x0 != null && boVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < boVar.x0.getChildCount(); i13++) {
                        View childAt = boVar.x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < t1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = t1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (t1Var.getMessageObject() != null) {
                                int id3 = t1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) boVar.x6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                boVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        boVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (boVar.L4 > 0 && boVar.J4 != null) {
                    boVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) boVar.J4.get(Integer.valueOf(boVar.L4)), true);
                }
                boVar.Uc();
                break;
            case 2:
                mk mkVar = boVar.Y;
                if (mkVar != null && boVar.Bc != null) {
                    if (mkVar.u0()) {
                        boVar.Y.n0(false);
                        AndroidUtilities.showKeyboard(boVar.Bc.a);
                        boVar.Bc.b.a.a(false, true);
                        break;
                    } else {
                        boVar.Y.W0(false, false, false);
                        boVar.Y.t1();
                        boVar.Bc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 3:
                boVar.ta();
                break;
            case 4:
                boVar.g8(false, true, 0.0f);
                break;
            case 5:
                boVar.S9();
                break;
            case 6:
                boVar.c9();
                boVar.yc(0, true);
                break;
            case 7:
                boVar.g8(false, true, 0.0f);
                break;
            case 8:
                boVar.q9(2);
                break;
            case 9:
                boVar.g8(false, true, 0.0f);
                break;
            case 10:
                bo.X(boVar);
                break;
            case 11:
                boVar.g8(false, true, 0.0f);
                break;
            case 12:
                boVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(boVar.getParentActivity(), 3, boVar.ea);
                boVar.ob = b2Var;
                b2Var.setOnShowListener(new of(boVar, 1));
                boVar.ob.setOnCancelListener(boVar.ma);
                boVar.ob.q(500L);
                break;
            case 14:
                boVar.N6();
                break;
            case 15:
                boVar.a = (boVar.a + 1) % 3;
                break;
            case 16:
                boVar.b = !boVar.b;
                break;
            case 17:
                boVar.A7(true);
                org.telegram.messenger.y0.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.vc.a0(boVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                boVar.A0.M.clear();
                nm nmVar = boVar.A0;
                nmVar.L = false;
                nmVar.O(true);
                boVar.Pb(false);
                break;
            case 19:
                boVar.o9();
                boVar.r9();
                boVar.r7();
                boVar.t7();
                break;
            case 20:
                boVar.hc = 0;
                boVar.ic = false;
                boVar.x0.f1();
                break;
            case 21:
                boVar.q9(5);
                break;
            case 22:
                boVar.yc(0, boVar.P5 != 0 && SystemClock.elapsedRealtime() >= boVar.P5 + 150);
                break;
            case 23:
                qk qkVar = boVar.R2;
                if ((qkVar == null || qkVar.getVisibility() != 0) && (f4Var = boVar.w1) != null) {
                    f4Var.u();
                    break;
                }
                break;
            case 24:
                boVar.k7();
                break;
            case 25:
                boVar.q9(5);
                break;
            case 26:
                boVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e = w7.x5.e(-1, -2, 87);
                e.bottomMargin = boVar.Y.getMeasuredHeight();
                boVar.X0.addView(boVar.y1, e);
                boVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                boVar.y1.m(0.0f, boVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                boVar.y1.u();
                break;
            case 28:
                int i17 = bo.Gc;
                boVar.Z6();
                break;
            default:
                int i18 = bo.Gc;
                boVar.Z6();
                break;
        }
    }
}
