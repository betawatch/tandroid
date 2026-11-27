// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rha extends c79 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ eja f;

    public rha(eja ejaVar, Context context) {
        this.f = ejaVar;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 1;
        }
        TLRPC.ChatFull chatFull2 = this.d;
        if (chatFull2 != null) {
            return chatFull2.participants.participants.size();
        }
        return 0;
    }

    @Override // j79
    public final int d(int i) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        eja ejaVar = this.f;
        e eVar = ejaVar.y1;
        View view = f89Var.a;
        if (view instanceof vac) {
            vac vacVar = (vac) view;
            boolean isEmpty = this.e.isEmpty();
            TLRPC.ChatFull chatFull = this.d;
            TLRPC.ChatParticipant chatParticipant = !isEmpty ? chatFull.participants.participants.get(((Integer) this.e.get(i)).intValue()) : chatFull.participants.participants.get(i);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = ob6.M0(2131752397, "ChannelCreator");
                        }
                        z5 = true;
                        z6 = true;
                        z4 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = ob6.M0(2131752495, "ChannelAdmin");
                        }
                        z4 = channelParticipant.promoted_by == eVar.getUserConfig().e();
                        z5 = true;
                        z6 = false;
                    } else {
                        z4 = false;
                        z5 = false;
                        z6 = false;
                    }
                    boolean z7 = z6;
                    z3 = z4;
                    z = z5;
                    z2 = z7;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = ob6.M0(2131752397, "ChannelCreator");
                        }
                        str = str3;
                        z = true;
                        z2 = true;
                        z3 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = ob6.M0(2131752495, "ChannelAdmin");
                        }
                        z3 = chatParticipant.inviter_id == eVar.getUserConfig().e();
                        str = str3;
                        z = true;
                        z2 = false;
                    } else {
                        str = str3;
                        z = false;
                        z2 = false;
                        z3 = false;
                    }
                }
                TLRPC.User X1 = eVar.getMessagesController().X1(Long.valueOf(chatParticipant.user_id));
                vacVar.a(str, z, z2, lbc.D(X1) && xc2.h(eVar.getMessagesController().M0(Long.valueOf(-ejaVar.m1))), new rs5(this, X1, str, z, z2, z3, (byte) 2));
                vacVar.d(X1, null, null, i != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        eja ejaVar = this.f;
        if (i == 20) {
            ci G = eja.G(7, ejaVar.m1, ejaVar.I1, this.c);
            G.setLayoutParams(new r79(-1, -1));
            return new n69(G);
        }
        vac vacVar = new vac(9, 0, ejaVar.I1, this.c, true, false);
        vacVar.setLayoutParams(new r79(-1, -2));
        return new n69(vacVar);
    }
}
