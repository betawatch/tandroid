package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya1 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ya1(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.b = i10;
        this.d = connectedbotstarref;
        this.e = z2Var;
        this.f = context;
        this.c = j10;
        this.g = p6Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10;
        SpannableStringBuilder W2;
        int i11 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                pb1 pb1Var = ((bb1) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.c;
                    if (!isEmpty) {
                        TLRPC.Chat L0 = pb1Var.getMessagesController().L0(Long.valueOf(j10));
                        i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
                        org.telegram.ui.Components.s4.f(i10, L0, tL_messages_invitedUsers);
                        break;
                    } else {
                        org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(pb1Var);
                        TLRPC.Chat L02 = pb1Var.getMessagesController().L0(Long.valueOf(j10));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            W2 = null;
                        } else if (arrayList.size() != 1) {
                            W2 = org.telegram.messenger.w3.V(L02) ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "AddedMembersToChannel", new Object[0])) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        } else if (org.telegram.messenger.w3.V(L02)) {
                            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("HasBeenAddedToChannel", null, 2131749373, "**" + org.telegram.messenger.h20.j((TLRPC.User) arrayList.get(0), true) + "**"));
                        } else {
                            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("HasBeenAddedToGroup", null, 2131749372, "**" + org.telegram.messenger.h20.j((TLRPC.User) arrayList.get(0), true) + "**"));
                        }
                        a02.V(arrayList, W2, null, null).j();
                        break;
                    }
                }
                break;
            default:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i13 = this.b;
                long j11 = this.c;
                if (connectedbotstarref2 != null) {
                    z2Var.dismiss();
                    xh.z2.J0(context, i13, connectedbotstarref2, j11, p6Var);
                    break;
                } else {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(connectedbotstarref.bot_id));
                    if (Z1 != null) {
                        org.telegram.messenger.vp.r1(i13).U2(Z1, 0, true, new xh.q2(z2Var, context, i13, j11, p6Var, 1));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ya1(bb1 bb1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j10) {
        this.d = bb1Var;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.b = i10;
        this.g = arrayList;
        this.c = j10;
    }
}
