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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ xg(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        di.d4 d4Var;
        int i10 = this.a;
        fo foVar = this.b;
        switch (i10) {
            case 0:
                sk skVar = foVar.Y;
                if (skVar != null && foVar.Cc != null) {
                    if (skVar.r0()) {
                        foVar.Y.k0(false);
                        AndroidUtilities.showKeyboard(foVar.Cc.a);
                        foVar.Cc.b.a.a(false, true);
                        break;
                    } else {
                        foVar.Y.S0(false, false, false);
                        foVar.Y.p1();
                        foVar.Cc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 1:
                ArrayList arrayList = foVar.u6;
                foVar.Hb = System.currentTimeMillis();
                if (foVar.x0 != null && foVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < foVar.x0.getChildCount(); i13++) {
                        View childAt = foVar.x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) foVar.x6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                foVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        foVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (foVar.L4 > 0 && foVar.J4 != null) {
                    foVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) foVar.J4.get(Integer.valueOf(foVar.L4)), true);
                }
                foVar.Yc();
                break;
            case 2:
                foVar.xa();
                break;
            case 3:
                AndroidUtilities.removeFromParent(foVar.J0);
                break;
            case 4:
                foVar.h9();
                foVar.Cc(0, true);
                break;
            case 5:
                foVar.j8(false, true, 0.0f);
                break;
            case 6:
                foVar.X9();
                break;
            case 7:
                foVar.lc(false);
                break;
            case 8:
                foVar.v9(2);
                break;
            case 9:
                foVar.j8(false, true, 0.0f);
                break;
            case 10:
                fo.x0(foVar);
                break;
            case 11:
                foVar.j8(false, true, 0.0f);
                break;
            case 12:
                AndroidUtilities.removeFromParent(foVar.L0);
                break;
            case 13:
                foVar.j8(false, true, 0.0f);
                break;
            case 14:
                foVar.Q6();
                break;
            case 15:
                foVar.a = (foVar.a + 1) % 3;
                break;
            case 16:
                foVar.b = !foVar.b;
                break;
            case 17:
                foVar.D7(true);
                org.telegram.messenger.g0.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.zc.a0(foVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                foVar.A0.M.clear();
                rm rmVar = foVar.A0;
                rmVar.L = false;
                rmVar.O(true);
                foVar.Tb(false);
                break;
            case 19:
                foVar.t9();
                foVar.w9();
                foVar.u7();
                foVar.w7();
                break;
            case 20:
                foVar.ya = false;
                foVar.yc();
                break;
            case 21:
                foVar.ic = 0;
                foVar.jc = false;
                foVar.x0.f1();
                break;
            case 22:
                foVar.v9(5);
                break;
            case 23:
                foVar.Cc(0, foVar.P5 != 0 && SystemClock.elapsedRealtime() >= foVar.P5 + 150);
                break;
            case 24:
                vk vkVar = foVar.R2;
                if ((vkVar == null || vkVar.getVisibility() != 0) && (d4Var = foVar.w1) != null) {
                    d4Var.u();
                    break;
                }
                break;
            case 25:
                foVar.n7();
                break;
            case 26:
                foVar.v9(5);
                break;
            case 27:
                foVar.d7(false);
                break;
            case 28:
                FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 87);
                e.bottomMargin = foVar.Y.getMeasuredHeight();
                foVar.X0.addView(foVar.y1, e);
                foVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                foVar.y1.m(0.0f, foVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                foVar.y1.u();
                break;
            default:
                int i17 = fo.Hc;
                foVar.c7();
                break;
        }
    }
}
