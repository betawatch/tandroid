// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zsa extends kea {
    public final /* synthetic */ wua U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsa(wua wuaVar, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, vnbVar);
        this.U2 = wuaVar;
        this.V1 = true;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            d31 j = j();
            if (zh6Var.m() == 1) {
                long j2 = zh6Var.j(0);
                if (j2 == yac.h(this.a).n) {
                    v21 G = j.G(R.raw.saved_messages, 5000, hl.S2(ob6.a0(null, null, 2131748640, new Object[0])));
                    G.s = false;
                    G.u = true;
                    G.j();
                } else {
                    int i2 = this.a;
                    if (j2 < 0) {
                        v21 G2 = j.G(R.raw.forward, 5000, hl.S2(ob6.a0(null, null, 2131748644, tL_forumTopic != null ? tL_forumTopic.title : uc7.s1(i2).M0(Long.valueOf(-j2)).title)));
                        G2.s = false;
                        G2.u = true;
                        G2.j();
                    } else {
                        v21 G3 = j.G(R.raw.forward, 5000, hl.S2(ob6.a0(null, null, 2131748644, uc7.s1(i2).X1(Long.valueOf(j2)).first_name)));
                        G3.s = false;
                        G3.u = true;
                        G3.j();
                    }
                }
            } else {
                v21 Q = j.Q(R.raw.forward, 36, hl.S2(ob6.G(zh6Var.m(), "LinkSharedToManyChats", Integer.valueOf(zh6Var.m()))));
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

    @Override // kea
    public final void N0(View view) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            lbb b = view instanceof nea ? nbb.b((nea) view) : null;
            ArrayList arrayList = new ArrayList();
            wua wuaVar = this.U2;
            r47 r47Var = wuaVar.C2;
            byte b2 = 1;
            if (r47Var != null) {
                arrayList.add(r47Var);
            } else {
                if (!(wuaVar.s1() instanceof TL_stars.TL_starGiftUnique)) {
                    return;
                }
                long e = yac.h(wuaVar.a).e();
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) wuaVar.s1();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = uc7.s1(wuaVar.a).y1(e);
                tL_messageService.from_id = uc7.s1(wuaVar.a).y1(e);
                tL_messageService.date = ConnectionsManager.getInstance(wuaVar.a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                r47 r47Var2 = new r47(wuaVar.a, tL_messageService, false, false);
                r47Var2.K5();
                arrayList.add(r47Var2);
            }
            sbb C = sbb.C(launchActivity, wuaVar.a);
            C.S = new yt1(wuaVar, C, view, b2);
            C.T(b, c8b.x(arrayList));
        }
    }
}
