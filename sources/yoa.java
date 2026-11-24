// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yoa extends taa {
    public final /* synthetic */ vqa U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoa(vqa vqaVar, Context context, String str, String str2, wjb wjbVar) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, wjbVar);
        this.U2 = vqaVar;
        this.V1 = true;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            u21 j = j();
            if (vf6Var.m() == 1) {
                long j2 = vf6Var.j(0);
                if (j2 == y6c.h(this.a).n) {
                    m21 G = j.G(R.raw.saved_messages, 5000, gl.T2(k96.a0(null, null, 2131748694, new Object[0])));
                    G.r = false;
                    G.t = true;
                    G.j();
                } else {
                    int i2 = this.a;
                    if (j2 < 0) {
                        m21 G2 = j.G(R.raw.forward, 5000, gl.T2(k96.a0(null, null, 2131748698, tL_forumTopic != null ? tL_forumTopic.title : na7.q1(i2).K0(Long.valueOf(-j2)).title)));
                        G2.r = false;
                        G2.t = true;
                        G2.j();
                    } else {
                        m21 G3 = j.G(R.raw.forward, 5000, gl.T2(k96.a0(null, null, 2131748698, na7.q1(i2).V1(Long.valueOf(j2)).first_name)));
                        G3.r = false;
                        G3.t = true;
                        G3.j();
                    }
                }
            } else {
                m21 Q = j.Q(R.raw.forward, 36, gl.T2(k96.G(vf6Var.m(), "LinkSharedToManyChats", Integer.valueOf(vf6Var.m()))));
                Q.r = false;
                Q.t = true;
                Q.j();
            }
            try {
                this.c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // taa
    public final void M0(View view) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            m7b b = view instanceof waa ? o7b.b((waa) view) : null;
            ArrayList arrayList = new ArrayList();
            vqa vqaVar = this.U2;
            k27 k27Var = vqaVar.C2;
            byte b2 = 1;
            if (k27Var != null) {
                arrayList.add(k27Var);
            } else {
                if (!(vqaVar.r1() instanceof TL_stars.TL_starGiftUnique)) {
                    return;
                }
                long e = y6c.h(vqaVar.a).e();
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) vqaVar.r1();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = na7.q1(vqaVar.a).w1(e);
                tL_messageService.from_id = na7.q1(vqaVar.a).w1(e);
                tL_messageService.date = ConnectionsManager.getInstance(vqaVar.a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                k27 k27Var2 = new k27(vqaVar.a, tL_messageService, false, false);
                k27Var2.K5();
                arrayList.add(k27Var2);
            }
            t7b C = t7b.C(launchActivity, vqaVar.a);
            C.S = new lt1(vqaVar, C, view, b2);
            C.T(b, f4b.x(arrayList));
        }
    }
}
