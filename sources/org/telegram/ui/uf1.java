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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class uf1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ kg1 b;

    public uf1(kg1 kg1Var, Context context) {
        this.b = kg1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        hg1 hg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        kg1 kg1Var = this.b;
        TopicsController topicsController = kg1Var.s;
        ArrayList arrayList = kg1Var.b;
        HashSet hashSet = kg1Var.a0;
        long j10 = kg1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                kg1Var.finishFragment();
                return;
            }
            kg1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                kg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                kg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                fo foVar = new fo(bundle);
                foVar.ja = true;
                kg1Var.presentFragment(foVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = kg1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = kg1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
                    sf1 sf1Var = new sf1(this, this.a, i11, hVar, chatFull.id, kg1Var, j11);
                    sf1Var.l0 = new bi.p1(this, j11, 11);
                    sf1Var.show();
                    break;
                }
                break;
            case 3:
                gf1 a02 = gf1.a0(j10, 0L);
                kg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new bf1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    kg1Var.C0 = true;
                    kg1Var.N0 = true;
                    kg1Var.s.pinTopic(kg1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, kg1Var);
                }
                kg1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    kg1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), kg1Var.B0);
                }
                kg1Var.C0();
                break;
            case 7:
                kg1Var.D0(hashSet, new tz0(this, 20));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        kg1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = kg1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        kg1Var.getMessagesStorage().updateRepliesMaxReadId(kg1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                kg1Var.C0();
                break;
            case 9:
            case 10:
                kg1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                kg1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = kg1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.g5.r(kg1Var, false, chat, null, false, true, false, false, new bs0(19, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < kg1Var.N.getChildCount()) {
                        View childAt = kg1Var.N.getChildAt(i16);
                        if ((childAt instanceof hg1) && (tL_forumTopic = (hg1Var = (hg1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        hg1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((bg1) arrayList.get(i12)).c == null || ((bg1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((bg1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (kg1Var.x <= 0) {
                        kg1Var.E = true;
                        kg1Var.y = 2;
                    }
                    kg1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (hg1Var != null) {
                        kg1Var.b1 = hg1Var;
                    }
                    kg1Var.N.A1(!tL_forumTopic2.hidden, hg1Var);
                    kg1Var.U0(true, true);
                    if (hg1Var != null) {
                        hg1Var.setTopicIcon(hg1Var.c5);
                    }
                }
                kg1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(kg1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    z5 z5Var = new z5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = kg1Var.X;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new q5(z5Var, 0));
                    }
                    kg1Var.presentFragment(z5Var);
                    break;
                } else {
                    kg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                i41.M(-j10, kg1Var);
                break;
        }
    }
}
