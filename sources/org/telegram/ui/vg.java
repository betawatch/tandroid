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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ vg(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bi.x4 x4Var;
        int i10 = this.a;
        eo eoVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(eoVar.J0);
                break;
            case 1:
                ArrayList arrayList = eoVar.u6;
                eoVar.Hb = System.currentTimeMillis();
                if (eoVar.x0 != null && eoVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < eoVar.x0.getChildCount(); i13++) {
                        View childAt = eoVar.x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) eoVar.x6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                eoVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        eoVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (eoVar.L4 > 0 && eoVar.J4 != null) {
                    eoVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) eoVar.J4.get(Integer.valueOf(eoVar.L4)), true);
                }
                eoVar.Uc();
                break;
            case 2:
                ok okVar = eoVar.Y;
                if (okVar != null && eoVar.Cc != null) {
                    if (okVar.t0()) {
                        eoVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(eoVar.Cc.a);
                        eoVar.Cc.b.a.a(false, true);
                        break;
                    } else {
                        eoVar.Y.V0(false, false, false);
                        eoVar.Y.s1();
                        eoVar.Cc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 3:
                eoVar.ta();
                break;
            case 4:
                eoVar.g8(false, true, 0.0f);
                break;
            case 5:
                eoVar.S9();
                break;
            case 6:
                eoVar.c9();
                eoVar.yc(0, true);
                break;
            case 7:
                eoVar.g8(false, true, 0.0f);
                break;
            case 8:
                eoVar.q9(2);
                break;
            case 9:
                eoVar.g8(false, true, 0.0f);
                break;
            case 10:
                eo.X(eoVar);
                break;
            case 11:
                eoVar.g8(false, true, 0.0f);
                break;
            case 12:
                eoVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(eoVar.getParentActivity(), 3, eoVar.ea);
                eoVar.pb = d2Var;
                d2Var.setOnShowListener(new qf(eoVar, 1));
                eoVar.pb.setOnCancelListener(eoVar.ma);
                eoVar.pb.q(500L);
                break;
            case 14:
                eoVar.N6();
                break;
            case 15:
                eoVar.a = (eoVar.a + 1) % 3;
                break;
            case 16:
                eoVar.b = !eoVar.b;
                break;
            case 17:
                eoVar.A7(true);
                org.telegram.messenger.a2.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.wc.a0(eoVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                eoVar.A0.M.clear();
                pm pmVar = eoVar.A0;
                pmVar.L = false;
                pmVar.O(true);
                eoVar.Pb(false);
                break;
            case 19:
                eoVar.o9();
                eoVar.r9();
                eoVar.r7();
                eoVar.t7();
                break;
            case 20:
                eoVar.ic = 0;
                eoVar.jc = false;
                eoVar.x0.e1();
                break;
            case 21:
                eoVar.q9(5);
                break;
            case 22:
                eoVar.yc(0, eoVar.P5 != 0 && SystemClock.elapsedRealtime() >= eoVar.P5 + 150);
                break;
            case 23:
                sk skVar = eoVar.R2;
                if ((skVar == null || skVar.getVisibility() != 0) && (x4Var = eoVar.w1) != null) {
                    x4Var.u();
                    break;
                }
                break;
            case 24:
                eoVar.k7();
                break;
            case 25:
                eoVar.q9(5);
                break;
            case 26:
                eoVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e = w7.a6.e(-1, -2, 87);
                e.bottomMargin = eoVar.Y.getMeasuredHeight();
                eoVar.X0.addView(eoVar.y1, e);
                eoVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                eoVar.y1.m(0.0f, eoVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                eoVar.y1.u();
                break;
            case 28:
                int i17 = eo.Hc;
                eoVar.Z6();
                break;
            default:
                int i18 = eo.Hc;
                eoVar.Z6();
                break;
        }
    }
}
