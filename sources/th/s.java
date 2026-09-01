package th;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ed;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.q70;
import r0.j1;
import r0.m1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback5, r0.o, Utilities.Callback5Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ s(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // r0.o
    public m1 M0(View view, m1 m1Var) {
        j1 j1Var = m1Var.a;
        i0.b f10 = j1Var.f(527);
        i0 i0Var = this.b;
        i0Var.Q = f10;
        i0Var.R = j1Var.f(519);
        i0Var.C.j(AndroidUtilities.dp(56.0f) + i0Var.Q.b, i0Var.Q.d, false);
        i0Var.E.invalidate();
        return m1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean canRemoveBotFromCommunity;
        long j10;
        boolean z4;
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = i0.S;
        Object obj6 = ((j51) obj).G;
        boolean z11 = obj6 instanceof TLRPC.Chat;
        i0 i0Var = this.b;
        boolean z12 = false;
        if (!z11) {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, i0Var.f);
                j10 = j11;
                z4 = false;
                z10 = isBot;
            }
            return Boolean.valueOf(z12);
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj6;
        long j12 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, i0Var.f);
        j10 = j12;
        z10 = false;
        z4 = isChannelAndNotMegaGroup;
        if (canRemoveBotFromCommunity) {
            q70 F = q70.F(i0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new ed(i0Var, z10, z4, j10, 3), true);
            F.W(i0Var.v.d.V0(view, true));
            F.Z();
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.a;
        i0 i0Var = this.b;
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                i0Var.W(j51Var);
                break;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = i0.S;
                i0Var.T(j51Var);
                break;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = i0.S;
                i0Var.W(j51Var);
                break;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                i0.y(i0Var, j51Var, view);
                break;
        }
    }
}
