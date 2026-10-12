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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class vf1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ lg1 b;

    public vf1(lg1 lg1Var, Context context) {
        this.b = lg1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        ig1 ig1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        lg1 lg1Var = this.b;
        TopicsController topicsController = lg1Var.s;
        ArrayList arrayList = lg1Var.b;
        HashSet hashSet = lg1Var.a0;
        long j10 = lg1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                lg1Var.finishFragment();
                return;
            }
            lg1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                lg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                lg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                fo foVar = new fo(bundle);
                foVar.ja = true;
                lg1Var.presentFragment(foVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = lg1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = lg1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
                    tf1 tf1Var = new tf1(this, this.a, i11, hVar, chatFull.id, lg1Var, j11);
                    tf1Var.l0 = new bi.p1(this, j11, 11);
                    tf1Var.show();
                    break;
                }
                break;
            case 3:
                hf1 a02 = hf1.a0(j10, 0L);
                lg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new cf1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    lg1Var.C0 = true;
                    lg1Var.N0 = true;
                    lg1Var.s.pinTopic(lg1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, lg1Var);
                }
                lg1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    lg1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), lg1Var.B0);
                }
                lg1Var.C0();
                break;
            case 7:
                lg1Var.D0(hashSet, new uz0(this, 20));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        lg1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = lg1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        lg1Var.getMessagesStorage().updateRepliesMaxReadId(lg1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                lg1Var.C0();
                break;
            case 9:
            case 10:
                lg1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                lg1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = lg1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.g5.r(lg1Var, false, chat, null, false, true, false, false, new cs0(20, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < lg1Var.N.getChildCount()) {
                        View childAt = lg1Var.N.getChildAt(i16);
                        if ((childAt instanceof ig1) && (tL_forumTopic = (ig1Var = (ig1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        ig1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((cg1) arrayList.get(i12)).c == null || ((cg1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((cg1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (lg1Var.x <= 0) {
                        lg1Var.E = true;
                        lg1Var.y = 2;
                    }
                    lg1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (ig1Var != null) {
                        lg1Var.b1 = ig1Var;
                    }
                    lg1Var.N.A1(!tL_forumTopic2.hidden, ig1Var);
                    lg1Var.U0(true, true);
                    if (ig1Var != null) {
                        ig1Var.setTopicIcon(ig1Var.c5);
                    }
                }
                lg1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(lg1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    z5 z5Var = new z5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lg1Var.X;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new q5(z5Var, 0));
                    }
                    lg1Var.presentFragment(z5Var);
                    break;
                } else {
                    lg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                i41.M(-j10, lg1Var);
                break;
        }
    }
}
