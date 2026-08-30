package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ue1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ kf1 b;

    public ue1(kf1 kf1Var, Context context) {
        this.b = kf1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        hf1 hf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        kf1 kf1Var = this.b;
        TopicsController topicsController = kf1Var.s;
        ArrayList arrayList = kf1Var.b;
        HashSet hashSet = kf1Var.X;
        long j10 = kf1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                kf1Var.finishFragment();
                return;
            }
            kf1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                kf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                kf1Var.F = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                xn xnVar = new xn(bundle);
                xnVar.ga = true;
                kf1Var.presentFragment(xnVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = kf1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = kf1Var.G;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.h hVar = new a0.h();
                    if (chatFull.participants != null) {
                        while (i12 < chatFull.participants.participants.size()) {
                            hVar.k(null, chatFull.participants.participants.get(i12).user_id);
                            i12++;
                        }
                    }
                    long j11 = chatFull.id;
                    i11 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
                    se1 se1Var = new se1(this, this.a, i11, hVar, chatFull.id, kf1Var, j11);
                    se1Var.i0 = new f3.e(this, j11, 10);
                    se1Var.show();
                    break;
                }
                break;
            case 3:
                fe1 a02 = fe1.a0(j10, 0L);
                kf1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ae1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    kf1Var.z0 = true;
                    kf1Var.K0 = true;
                    kf1Var.s.pinTopic(kf1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, kf1Var);
                }
                kf1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    kf1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), kf1Var.y0);
                }
                kf1Var.C0();
                break;
            case 7:
                kf1Var.D0(hashSet, new vy0(this, 21));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        kf1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = kf1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        kf1Var.getMessagesStorage().updateRepliesMaxReadId(kf1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                kf1Var.C0();
                break;
            case 9:
            case 10:
                kf1Var.K0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                kf1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = kf1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.z4.s(kf1Var, false, chat, null, false, true, false, false, new tl0(24, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < kf1Var.K.getChildCount()) {
                        View childAt = kf1Var.K.getChildAt(i16);
                        if ((childAt instanceof hf1) && (tL_forumTopic = (hf1Var = (hf1) childAt).K) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        hf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((bf1) arrayList.get(i12)).c == null || ((bf1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((bf1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (kf1Var.x <= 0) {
                        kf1Var.B = true;
                        kf1Var.y = 2;
                    }
                    kf1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (hf1Var != null) {
                        kf1Var.Y0 = hf1Var;
                    }
                    kf1Var.K.z1(!tL_forumTopic2.hidden, hf1Var);
                    kf1Var.U0(true, true);
                    if (hf1Var != null) {
                        hf1Var.setTopicIcon(hf1Var.V4);
                    }
                }
                kf1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(kf1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    y5 y5Var = new y5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = kf1Var.U;
                    y5Var.O = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.M, y5Var.O, new p5(y5Var, 0));
                    }
                    kf1Var.presentFragment(y5Var);
                    break;
                } else {
                    kf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                k31.K(-j10, kf1Var);
                break;
        }
    }
}
