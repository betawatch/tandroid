package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.w41;
import r0.j1;
import r0.m1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback5, r0.o, Utilities.Callback5Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ s(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        j1 j1Var = m1Var.a;
        i0.b f9 = j1Var.f(527);
        i0 i0Var = this.b;
        i0Var.P = f9;
        i0Var.Q = j1Var.f(519);
        i0Var.B.j(AndroidUtilities.dp(56.0f) + i0Var.P.b, i0Var.P.d, false);
        i0Var.D.invalidate();
        return m1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean canRemoveBotFromCommunity;
        long j10;
        boolean z10;
        boolean z11;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = i0.R;
        Object obj6 = ((w41) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        i0 i0Var = this.b;
        boolean z13 = false;
        if (!z12) {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, i0Var.f);
                j10 = j11;
                z10 = false;
                z11 = isBot;
            }
            return Boolean.valueOf(z13);
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj6;
        long j12 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, i0Var.f);
        j10 = j12;
        z11 = false;
        z10 = isChannelAndNotMegaGroup;
        if (canRemoveBotFromCommunity) {
            j70 F = j70.F(i0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new dd(i0Var, z11, z10, j10, 3), true);
            F.W(i0Var.v.d.V0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.a;
        i0 i0Var = this.b;
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                i0Var.W(w41Var);
                break;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = i0.R;
                i0Var.T(w41Var);
                break;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = i0.R;
                i0Var.W(w41Var);
                break;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                i0.y(i0Var, w41Var, view);
                break;
        }
    }
}
