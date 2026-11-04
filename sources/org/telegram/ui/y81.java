package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y81 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ m91 b;

    public y81(m91 m91Var, Context context) {
        this.b = m91Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        j91 j91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        m91 m91Var = this.b;
        org.telegram.messenger.c00 c00Var = m91Var.s;
        ArrayList arrayList = m91Var.b;
        HashSet hashSet = m91Var.b0;
        long j10 = m91Var.a;
        if (i3 == -1) {
            if (hashSet.size() <= 0) {
                m91Var.finishFragment();
                return;
            }
            m91Var.G0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i11 = 0;
        switch (i3) {
            case 1:
                org.telegram.messenger.c00 c00Var2 = m91Var.getMessagesController().q7;
                c00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = c00Var2.getMessagesController().h1(j10);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                c00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(c00Var2, 7));
                m91Var.J = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                wm wmVar = new wm(bundle);
                wmVar.Da = true;
                m91Var.presentFragment(wmVar);
                break;
            case 2:
                TLRPC.ChatFull N0 = m91Var.getMessagesController().N0(j10);
                TLRPC.ChatFull chatFull = m91Var.K;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    N0.participants = chatParticipants;
                }
                if (N0 != null) {
                    a0.h hVar = new a0.h();
                    if (N0.participants != null) {
                        while (i11 < N0.participants.participants.size()) {
                            hVar.k(null, N0.participants.participants.get(i11).user_id);
                            i11++;
                        }
                    }
                    long j11 = N0.id;
                    i10 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
                    w81 w81Var = new w81(this, this.a, i10, hVar, N0.id, m91Var, j11);
                    w81Var.d2 = new ei.c1(this, j11, 11);
                    w81Var.show();
                    break;
                }
                break;
            case 3:
                l81 f02 = l81.f0(j10, 0L);
                m91Var.presentFragment(f02);
                org.telegram.messenger.g0.i3(new f81(f02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    m91Var.D0 = true;
                    m91Var.O0 = true;
                    m91Var.s.t(m91Var.a, ((Integer) hashSet.iterator().next()).intValue(), i3 == 4, m91Var);
                }
                m91Var.G0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m91Var.getNotificationsController().G(-j10, ((Integer) it.next()).intValue(), m91Var.C0);
                }
                m91Var.G0();
                break;
            case 7:
                m91Var.H0(hashSet, new pu0(this, 21));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TLRPC.TL_forumTopic f10 = c00Var.f(j10, ((Integer) arrayList2.get(i12)).intValue());
                    if (f10 != null) {
                        m91Var.getMessagesController().o3(-j10, f10.id);
                        org.telegram.messenger.hp messagesController = m91Var.getMessagesController();
                        long j12 = -j10;
                        int i13 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        messagesController.j3(j12, i13, 0, message != null ? message.date : 0, false, f10.id, 0, true, 0);
                        m91Var.getMessagesStorage().d2(m91Var.a, f10.id, f10.top_message, 0);
                    }
                }
                m91Var.G0();
                break;
            case 9:
            case 10:
                m91Var.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    c00Var.z(((Integer) arrayList3.get(i14)).intValue(), j10, i3 == 9);
                }
                m91Var.G0();
                break;
            case 11:
                TLRPC.Chat M0 = m91Var.getMessagesController().M0(Long.valueOf(j10));
                org.telegram.ui.Components.t4.r(m91Var, false, M0, null, false, true, false, false, new rb0(28, this, M0));
                break;
            case 12:
            case 13:
                int i15 = 0;
                while (true) {
                    if (i15 < m91Var.O.getChildCount()) {
                        View childAt = m91Var.O.getChildAt(i15);
                        if ((childAt instanceof j91) && (tL_forumTopic = (j91Var = (j91) childAt).O) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i15++;
                        }
                    } else {
                        j91Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (arrayList.get(i11) == null || ((e91) arrayList.get(i11)).c == null || ((e91) arrayList.get(i11)).c.id != 1) {
                                i11++;
                            } else {
                                tL_forumTopic2 = ((e91) arrayList.get(i11)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (m91Var.y <= 0) {
                        m91Var.F = true;
                        m91Var.E = 2;
                    }
                    m91Var.getMessagesController().q7.A(1, j10, tL_forumTopic2.hidden);
                    if (j91Var != null) {
                        m91Var.d1 = j91Var;
                    }
                    m91Var.O.B1(!tL_forumTopic2.hidden, j91Var);
                    m91Var.Z0(true, true);
                    if (j91Var != null) {
                        j91Var.setTopicIcon(j91Var.d5);
                    }
                }
                m91Var.G0();
                break;
            case 14:
                if (org.telegram.messenger.t3.N(m91Var.getMessagesController().M0(Long.valueOf(j10)))) {
                    v5 v5Var = new v5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = m91Var.Y;
                    v5Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().G0().b(v5Var.S, v5Var.U, new n5(v5Var, 0));
                    }
                    m91Var.presentFragment(v5Var);
                    break;
                } else {
                    m91Var.getNotificationCenter().k(org.telegram.messenger.hs.n3, Long.valueOf(-j10));
                    break;
                }
            case 15:
                ey0.K0(-j10, m91Var);
                break;
        }
    }
}
