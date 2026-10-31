package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.n20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h2 extends op0 {
    public final /* synthetic */ e4 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(e4 e4Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, p6Var);
        this.R2 = e4Var;
        this.S1 = true;
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            cc k10 = k();
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == d20.i(this.a).n) {
                    wb G = k10.G(R.raw.saved_messages, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131748896, new Object[0])));
                    G.r = false;
                    G.t = true;
                    G.j();
                } else if (j10 < 0) {
                    wb G2 = k10.G(R.raw.forward, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131748900, tL_forumTopic != null ? tL_forumTopic.title : vp.r1(this.a).L0(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.t = true;
                    G2.j();
                } else {
                    wb G3 = k10.G(R.raw.forward, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131748900, vp.r1(this.a).Z1(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.t = true;
                    G3.j();
                }
            } else {
                wb Q = k10.Q(R.raw.forward, 36, org.telegram.messenger.i0.W2(cd.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
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

    @Override // org.telegram.ui.Components.op0
    public final void S0(final View view) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        vh.h8 b10 = view instanceof org.telegram.ui.Cells.h7 ? vh.j8.b((org.telegram.ui.Cells.h7) view) : null;
        ArrayList arrayList = new ArrayList();
        final e4 e4Var = this.R2;
        jj jjVar = e4Var.z2;
        if (jjVar != null) {
            arrayList.add(jjVar);
        } else {
            if (!(e4Var.y1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long e = d20.i(e4Var.a).e();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) e4Var.y1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = vp.r1(e4Var.a).y1(e);
            tL_messageService.from_id = vp.r1(e4Var.a).y1(e);
            tL_messageService.date = ConnectionsManager.getInstance(e4Var.a).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            jj jjVar2 = new jj(e4Var.a, tL_messageService, false, false);
            jjVar2.K5();
            arrayList.add(jjVar2);
        }
        final vh.o8 D = vh.o8.D(launchActivity, e4Var.a);
        D.R = new n20() { // from class: rh.z0
            @Override // org.telegram.messenger.n20
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                vh.o8 o8Var = D;
                vh.h8 h8Var = null;
                if (booleanValue) {
                    e4 e4Var2 = e4.this;
                    org.telegram.messenger.i0.g3(new o(3, e4Var2, l4));
                    o8Var.X(null);
                    h2 h2Var = e4Var2.R2;
                    if (h2Var != null) {
                        h2Var.dismiss();
                        e4Var2.R2 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                        h8Var = vh.j8.b((org.telegram.ui.Cells.h7) view2);
                    }
                    o8Var.X(h8Var);
                }
                org.telegram.messenger.i0.g3(runnable);
            }
        };
        D.T(b10, vh.n5.y(arrayList));
    }
}
