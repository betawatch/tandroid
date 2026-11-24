// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sf1 implements p8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ sf1(int i, long j, fx0 fx0Var, wjb wjbVar, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.d = i;
        this.f = connectedbotstarref;
        this.g = fx0Var;
        this.c = context;
        this.b = j;
        this.e = wjbVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        int i;
        SpannableStringBuilder S2;
        byte b = this.a;
        long j = this.b;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                fx0 fx0Var = (fx0) obj4;
                Context context = (Context) obj3;
                wjb wjbVar = (wjb) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i2 = this.d;
                long j2 = this.b;
                if (connectedbotstarref2 != null) {
                    fx0Var.dismiss();
                    eg1.J0(context, i2, connectedbotstarref2, j2, wjbVar);
                    break;
                } else {
                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(connectedbotstarref.bot_id));
                    if (V1 != null) {
                        na7.q1(i2).Z2(V1, 0, true, new qf1(fx0Var, context, i2, j2, wjbVar, (byte) 1));
                        break;
                    }
                }
                break;
            case 1:
                pc7 pc7Var = (pc7) obj5;
                Context context2 = (Context) obj3;
                wjb wjbVar2 = (wjb) obj2;
                u21 u21Var = (u21) obj4;
                String str = (String) obj;
                if (str != null) {
                    vp7.g(j);
                    pc7Var.run();
                    cq7.q(context2, this.d, wjbVar2, u21Var, str, null);
                    break;
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                qvb qvbVar = ((bvb) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i3 = iArr[0] + 1;
                iArr[0] = i3;
                if (i3 == this.d) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        TLRPC.Chat K0 = qvbVar.getMessagesController().K0(Long.valueOf(j));
                        i = ((d) qvbVar).currentAccount;
                        ij.f(i, K0, tL_messages_invitedUsers);
                        break;
                    } else {
                        u21 b0 = u21.b0(qvbVar);
                        TLRPC.Chat K02 = qvbVar.getMessagesController().K0(Long.valueOf(j));
                        b0.getClass();
                        if (arrayList.size() == 0) {
                            S2 = null;
                        } else if (arrayList.size() != 1) {
                            S2 = hc2.V(K02) ? gl.S2(k96.G(arrayList.size(), "AddedMembersToChannel", new Object[0])) : gl.S2(k96.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        } else if (hc2.V(K02)) {
                            S2 = gl.S2(k96.a0("HasBeenAddedToChannel", null, 2131749172, "**" + l7c.k((TLRPC.User) arrayList.get(0), true) + "**"));
                        } else {
                            S2 = gl.S2(k96.a0("HasBeenAddedToGroup", null, 2131749171, "**" + l7c.k((TLRPC.User) arrayList.get(0), true) + "**"));
                        }
                        b0.V(arrayList, S2, null, null).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ sf1(long j, pc7 pc7Var, Context context, int i, wjb wjbVar, u21 u21Var) {
        this.b = j;
        this.f = pc7Var;
        this.c = context;
        this.d = i;
        this.e = wjbVar;
        this.g = u21Var;
    }

    public /* synthetic */ sf1(bvb bvbVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, ArrayList arrayList, long j) {
        this.f = bvbVar;
        this.g = tL_messages_invitedUsers;
        this.c = iArr;
        this.d = i;
        this.e = arrayList;
        this.b = j;
    }
}
