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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ ug(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        di.f4 f4Var;
        int i10 = this.a;
        co coVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(coVar.J0);
                break;
            case 1:
                ArrayList arrayList = coVar.u6;
                coVar.Hb = System.currentTimeMillis();
                if (coVar.x0 != null && coVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < coVar.x0.getChildCount(); i13++) {
                        View childAt = coVar.x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) coVar.x6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                coVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        coVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (coVar.L4 > 0 && coVar.J4 != null) {
                    coVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) coVar.J4.get(Integer.valueOf(coVar.L4)), true);
                }
                coVar.Uc();
                break;
            case 2:
                mk mkVar = coVar.Y;
                if (mkVar != null && coVar.Cc != null) {
                    if (mkVar.t0()) {
                        coVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(coVar.Cc.a);
                        coVar.Cc.b.a.a(false, true);
                        break;
                    } else {
                        coVar.Y.V0(false, false, false);
                        coVar.Y.s1();
                        coVar.Cc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 3:
                coVar.ta();
                break;
            case 4:
                coVar.g8(false, true, 0.0f);
                break;
            case 5:
                coVar.S9();
                break;
            case 6:
                coVar.c9();
                coVar.yc(0, true);
                break;
            case 7:
                coVar.g8(false, true, 0.0f);
                break;
            case 8:
                coVar.q9(2);
                break;
            case 9:
                coVar.g8(false, true, 0.0f);
                break;
            case 10:
                co.X(coVar);
                break;
            case 11:
                coVar.g8(false, true, 0.0f);
                break;
            case 12:
                coVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(coVar.getParentActivity(), 3, coVar.ea);
                coVar.pb = b2Var;
                b2Var.setOnShowListener(new of(coVar, 1));
                coVar.pb.setOnCancelListener(coVar.ma);
                coVar.pb.q(500L);
                break;
            case 14:
                coVar.N6();
                break;
            case 15:
                coVar.a = (coVar.a + 1) % 3;
                break;
            case 16:
                coVar.b = !coVar.b;
                break;
            case 17:
                coVar.A7(true);
                org.telegram.messenger.w1.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.yc.a0(coVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                coVar.A0.M.clear();
                om omVar = coVar.A0;
                omVar.L = false;
                omVar.O(true);
                coVar.Pb(false);
                break;
            case 19:
                coVar.o9();
                coVar.r9();
                coVar.r7();
                coVar.t7();
                break;
            case 20:
                coVar.ic = 0;
                coVar.jc = false;
                coVar.x0.e1();
                break;
            case 21:
                coVar.q9(5);
                break;
            case 22:
                coVar.yc(0, coVar.P5 != 0 && SystemClock.elapsedRealtime() >= coVar.P5 + 150);
                break;
            case 23:
                qk qkVar = coVar.R2;
                if ((qkVar == null || qkVar.getVisibility() != 0) && (f4Var = coVar.w1) != null) {
                    f4Var.u();
                    break;
                }
                break;
            case 24:
                coVar.k7();
                break;
            case 25:
                coVar.q9(5);
                break;
            case 26:
                coVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 87);
                e7.bottomMargin = coVar.Y.getMeasuredHeight();
                coVar.X0.addView(coVar.y1, e7);
                coVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                coVar.y1.m(0.0f, coVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                coVar.y1.u();
                break;
            case 28:
                int i17 = co.Hc;
                coVar.Z6();
                break;
            default:
                int i18 = co.Hc;
                coVar.Z6();
                break;
        }
    }
}
