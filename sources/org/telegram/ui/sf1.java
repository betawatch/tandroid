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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sf1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ig1 b;

    public sf1(ig1 ig1Var, Context context) {
        this.b = ig1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        fg1 fg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        ig1 ig1Var = this.b;
        TopicsController topicsController = ig1Var.s;
        ArrayList arrayList = ig1Var.b;
        HashSet hashSet = ig1Var.a0;
        long j3 = ig1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                ig1Var.finishFragment();
                return;
            }
            ig1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                ig1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                ig1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                eo eoVar = new eo(bundle);
                eoVar.ja = true;
                ig1Var.presentFragment(eoVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = ig1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = ig1Var.J;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.i iVar = new a0.i();
                    if (chatFull.participants != null) {
                        while (i12 < chatFull.participants.participants.size()) {
                            iVar.k(null, chatFull.participants.participants.get(i12).user_id);
                            i12++;
                        }
                    }
                    long j10 = chatFull.id;
                    i11 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
                    qf1 qf1Var = new qf1(this, this.a, i11, iVar, chatFull.id, ig1Var, j10);
                    qf1Var.l0 = new bi.za(this, j10, 10);
                    qf1Var.show();
                    break;
                }
                break;
            case 3:
                ef1 a02 = ef1.a0(j3, 0L);
                ig1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ze1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    ig1Var.C0 = true;
                    ig1Var.N0 = true;
                    ig1Var.s.pinTopic(ig1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, ig1Var);
                }
                ig1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ig1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), ig1Var.B0);
                }
                ig1Var.C0();
                break;
            case 7:
                ig1Var.D0(hashSet, new k01(this, 19));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        ig1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.id);
                        MessagesController messagesController = ig1Var.getMessagesController();
                        long j11 = -j3;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j11, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        ig1Var.getMessagesStorage().updateRepliesMaxReadId(ig1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                ig1Var.C0();
                break;
            case 9:
            case 10:
                ig1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j3, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                ig1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = ig1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.d5.s(ig1Var, false, chat, null, false, true, false, false, new fz0(11, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < ig1Var.N.getChildCount()) {
                        View childAt = ig1Var.N.getChildAt(i16);
                        if ((childAt instanceof fg1) && (tL_forumTopic = (fg1Var = (fg1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        fg1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((zf1) arrayList.get(i12)).c == null || ((zf1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((zf1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (ig1Var.x <= 0) {
                        ig1Var.E = true;
                        ig1Var.y = 2;
                    }
                    ig1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (fg1Var != null) {
                        ig1Var.b1 = fg1Var;
                    }
                    ig1Var.N.y1(!tL_forumTopic2.hidden, fg1Var);
                    ig1Var.U0(true, true);
                    if (fg1Var != null) {
                        fg1Var.setTopicIcon(fg1Var.Y4);
                    }
                }
                ig1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(ig1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    w5 w5Var = new w5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ig1Var.X;
                    w5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new m5(w5Var, 0));
                    }
                    ig1Var.presentFragment(w5Var);
                    break;
                } else {
                    ig1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                    break;
                }
            case 15:
                h41.L(-j3, ig1Var);
                break;
        }
    }
}
