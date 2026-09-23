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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ sg(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci.e4 e4Var;
        int i10 = this.a;
        xn xnVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(xnVar.J0);
                break;
            case 1:
                ArrayList arrayList = xnVar.u6;
                xnVar.Gb = System.currentTimeMillis();
                if (xnVar.x0 != null && xnVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < xnVar.x0.getChildCount(); i13++) {
                        View childAt = xnVar.x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) xnVar.x6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                xnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        xnVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (xnVar.L4 > 0 && xnVar.J4 != null) {
                    xnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) xnVar.J4.get(Integer.valueOf(xnVar.L4)), true);
                }
                xnVar.Uc();
                break;
            case 2:
                jk jkVar = xnVar.Y;
                if (jkVar != null && xnVar.Bc != null) {
                    if (jkVar.u0()) {
                        xnVar.Y.n0(false);
                        AndroidUtilities.showKeyboard(xnVar.Bc.a);
                        xnVar.Bc.b.a.a(false, true);
                        break;
                    } else {
                        xnVar.Y.W0(false, false, false);
                        xnVar.Y.t1();
                        xnVar.Bc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 3:
                xnVar.ta();
                break;
            case 4:
                xnVar.g8(false, true, 0.0f);
                break;
            case 5:
                xnVar.S9();
                break;
            case 6:
                xnVar.c9();
                xnVar.yc(0, true);
                break;
            case 7:
                xnVar.g8(false, true, 0.0f);
                break;
            case 8:
                xnVar.q9(2);
                break;
            case 9:
                xnVar.g8(false, true, 0.0f);
                break;
            case 10:
                xn.X(xnVar);
                break;
            case 11:
                xnVar.g8(false, true, 0.0f);
                break;
            case 12:
                xnVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(xnVar.getParentActivity(), 3, xnVar.ea);
                xnVar.ob = b2Var;
                b2Var.setOnShowListener(new nf(xnVar, 1));
                xnVar.ob.setOnCancelListener(xnVar.ma);
                xnVar.ob.q(500L);
                break;
            case 14:
                xnVar.N6();
                break;
            case 15:
                xnVar.a = (xnVar.a + 1) % 3;
                break;
            case 16:
                xnVar.b = !xnVar.b;
                break;
            case 17:
                xnVar.A7(true);
                org.telegram.messenger.z0.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(xnVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                xnVar.A0.M.clear();
                km kmVar = xnVar.A0;
                kmVar.L = false;
                kmVar.O(true);
                xnVar.Pb(false);
                break;
            case 19:
                xnVar.o9();
                xnVar.r9();
                xnVar.r7();
                xnVar.t7();
                break;
            case 20:
                xnVar.hc = 0;
                xnVar.ic = false;
                xnVar.x0.f1();
                break;
            case 21:
                xnVar.q9(5);
                break;
            case 22:
                xnVar.yc(0, xnVar.P5 != 0 && SystemClock.elapsedRealtime() >= xnVar.P5 + 150);
                break;
            case 23:
                nk nkVar = xnVar.R2;
                if ((nkVar == null || nkVar.getVisibility() != 0) && (e4Var = xnVar.w1) != null) {
                    e4Var.u();
                    break;
                }
                break;
            case 24:
                xnVar.k7();
                break;
            case 25:
                xnVar.q9(5);
                break;
            case 26:
                xnVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e = w7.x5.e(-1, -2, 87);
                e.bottomMargin = xnVar.Y.getMeasuredHeight();
                xnVar.X0.addView(xnVar.y1, e);
                xnVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                xnVar.y1.m(0.0f, xnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                xnVar.y1.u();
                break;
            case 28:
                int i17 = xn.Gc;
                xnVar.Z6();
                break;
            default:
                int i18 = xn.Gc;
                xnVar.Z6();
                break;
        }
    }
}
