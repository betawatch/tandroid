// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yqa extends tca {
    public final /* synthetic */ wsa U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqa(wsa wsaVar, Context context, String str, String str2, ylb ylbVar) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, ylbVar);
        this.U2 = wsaVar;
        this.V1 = true;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            c41 j = j();
            if (vh6Var.m() == 1) {
                long j2 = vh6Var.j(0);
                if (j2 == z8c.h(this.a).n) {
                    u31 G = j.G(R.raw.saved_messages, 5000, gm.S2(jb6.a0(null, null, 2131748643, new Object[0])));
                    G.s = false;
                    G.u = true;
                    G.j();
                } else {
                    int i2 = this.a;
                    if (j2 < 0) {
                        u31 G2 = j.G(R.raw.forward, 5000, gm.S2(jb6.a0(null, null, 2131748647, tL_forumTopic != null ? tL_forumTopic.title : oc7.r1(i2).L0(Long.valueOf(-j2)).title)));
                        G2.s = false;
                        G2.u = true;
                        G2.j();
                    } else {
                        u31 G3 = j.G(R.raw.forward, 5000, gm.S2(jb6.a0(null, null, 2131748647, oc7.r1(i2).W1(Long.valueOf(j2)).first_name)));
                        G3.s = false;
                        G3.u = true;
                        G3.j();
                    }
                }
            } else {
                u31 Q = j.Q(R.raw.forward, 36, gm.S2(jb6.G(vh6Var.m(), "LinkSharedToManyChats", Integer.valueOf(vh6Var.m()))));
                Q.s = false;
                Q.u = true;
                Q.j();
            }
            try {
                this.c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // tca
    public final void M0(View view) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            o9b b = view instanceof wca ? q9b.b((wca) view) : null;
            ArrayList arrayList = new ArrayList();
            wsa wsaVar = this.U2;
            k47 k47Var = wsaVar.C2;
            byte b2 = 1;
            if (k47Var != null) {
                arrayList.add(k47Var);
            } else {
                if (!(wsaVar.r1() instanceof TL_stars.TL_starGiftUnique)) {
                    return;
                }
                long e = z8c.h(wsaVar.a).e();
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) wsaVar.r1();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = oc7.r1(wsaVar.a).x1(e);
                tL_messageService.from_id = oc7.r1(wsaVar.a).x1(e);
                tL_messageService.date = ConnectionsManager.getInstance(wsaVar.a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                k47 k47Var2 = new k47(wsaVar.a, tL_messageService, false, false);
                k47Var2.K5();
                arrayList.add(k47Var2);
            }
            v9b C = v9b.C(launchActivity, wsaVar.a);
            C.S = new xu1(wsaVar, C, view, b2);
            C.T(b, g6b.x(arrayList));
        }
    }
}
