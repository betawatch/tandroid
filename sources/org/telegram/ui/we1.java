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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class we1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ mf1 b;

    public we1(mf1 mf1Var, Context context) {
        this.b = mf1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        jf1 jf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        mf1 mf1Var = this.b;
        TopicsController topicsController = mf1Var.s;
        ArrayList arrayList = mf1Var.b;
        HashSet hashSet = mf1Var.X;
        long j10 = mf1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                mf1Var.finishFragment();
                return;
            }
            mf1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                mf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                mf1Var.F = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                xn xnVar = new xn(bundle);
                xnVar.ga = true;
                mf1Var.presentFragment(xnVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = mf1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = mf1Var.G;
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
                    i11 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
                    ue1 ue1Var = new ue1(this, this.a, i11, hVar, chatFull.id, mf1Var, j11);
                    ue1Var.i0 = new f3.e(this, j11, 10);
                    ue1Var.show();
                    break;
                }
                break;
            case 3:
                ie1 a02 = ie1.a0(j10, 0L);
                mf1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new de1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    mf1Var.z0 = true;
                    mf1Var.K0 = true;
                    mf1Var.s.pinTopic(mf1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, mf1Var);
                }
                mf1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    mf1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), mf1Var.y0);
                }
                mf1Var.C0();
                break;
            case 7:
                mf1Var.D0(hashSet, new xy0(this, 20));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        mf1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = mf1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        mf1Var.getMessagesStorage().updateRepliesMaxReadId(mf1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                mf1Var.C0();
                break;
            case 9:
            case 10:
                mf1Var.K0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                mf1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = mf1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.z4.s(mf1Var, false, chat, null, false, true, false, false, new vl0(24, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < mf1Var.K.getChildCount()) {
                        View childAt = mf1Var.K.getChildAt(i16);
                        if ((childAt instanceof jf1) && (tL_forumTopic = (jf1Var = (jf1) childAt).K) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        jf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((df1) arrayList.get(i12)).c == null || ((df1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((df1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (mf1Var.x <= 0) {
                        mf1Var.B = true;
                        mf1Var.y = 2;
                    }
                    mf1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (jf1Var != null) {
                        mf1Var.Y0 = jf1Var;
                    }
                    mf1Var.K.z1(!tL_forumTopic2.hidden, jf1Var);
                    mf1Var.U0(true, true);
                    if (jf1Var != null) {
                        jf1Var.setTopicIcon(jf1Var.V4);
                    }
                }
                mf1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(mf1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    y5 y5Var = new y5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = mf1Var.U;
                    y5Var.O = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.M, y5Var.O, new p5(y5Var, 0));
                    }
                    mf1Var.presentFragment(y5Var);
                    break;
                } else {
                    mf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                m31.K(-j10, mf1Var);
                break;
        }
    }
}
