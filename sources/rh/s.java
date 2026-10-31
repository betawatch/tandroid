package rh;

import android.view.View;
import org.telegram.messenger.ml;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m10;
import org.telegram.ui.mf;
import org.telegram.ui.px0;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k2 Q;
        q20 q20Var;
        switch (this.a) {
            case 0:
                ((e30) this.b).dismiss();
                break;
            case 1:
                ((e0) this.b).dismiss();
                break;
            case 2:
                i0 i0Var = (i0) this.b;
                sf.b bVar = i0Var.v1.a;
                sf.b bVar2 = sf.b.b;
                if (bVar == bVar2) {
                    bVar2 = sf.b.a;
                }
                i0Var.J0(sf.a.i(0L, bVar2), true, false, true);
                i0Var.j1.setText("");
                break;
            case 3:
                ((t0) this.b).dismiss();
                break;
            case 4:
                ((t1) this.b).run();
                break;
            case 5:
                ((t1) this.b).run();
                break;
            case 6:
                g3 g3Var = (g3) this.b;
                g3Var.getClass();
                new y7(g3Var.b, g3Var.g).show();
                break;
            case 7:
                ((a4) this.b).dismiss();
                break;
            case 8:
                ((l6) this.b).run();
                break;
            case 9:
                if (((w7) ((m10) this.b).d).f > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    Q.showAsSheet(new h8(), i2Var);
                    break;
                }
                break;
            case 10:
                sg.b0 b0Var = (sg.b0) this.b;
                if (b0Var.k) {
                    b0Var.d();
                    break;
                }
                break;
            case 11:
                ((th.p1) this.b).q(!r7.f0, true);
                break;
            case 12:
                ((th.o7) this.b).b0();
                break;
            case 13:
                ((th.h4) this.b).dismiss();
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new kg.i1(Q2, 14, false));
                    break;
                }
                break;
            case 14:
                th.s6 s6Var = (th.s6) this.b;
                s6Var.onClick(s6Var.b);
                break;
            case 15:
                th.x6 x6Var = (th.x6) this.b;
                x6Var.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new th.h7(x6Var, 0)).start();
                break;
            case 16:
                ((sg.v) this.b).run();
                break;
            case 17:
                vh.k kVar = (vh.k) this.b;
                vh.f fVar = kVar.f;
                fVar.d();
                fVar.k(true);
                vh.e eVar = kVar.c0;
                org.telegram.messenger.i0.r(eVar);
                eVar.run();
                break;
            case 18:
                ((vh.e8) this.b).B();
                break;
            case 19:
                vh.n0.a((vh.n0) this.b);
                break;
            case 20:
                ((org.telegram.ui.Wallet.x0) this.b).run();
                break;
            case 21:
                vh.f4 f4Var = ((vh.e4) this.b).y;
                if (f4Var.r && (q20Var = f4Var.f) != null) {
                    q20Var.a(5);
                    break;
                }
                break;
            case 22:
                vh.i6 i6Var = (vh.i6) ((uc0) this.b).h;
                if (i6Var != null) {
                    i6Var.run();
                    break;
                }
                break;
            case 23:
                ((mf) this.b).run();
                break;
            case 24:
                ((mf) this.b).run();
                break;
            case 25:
                ChatActivityEnterView.e(((dd) ((xh.j0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 26:
                ((px0) this.b).run();
                break;
            case 27:
                yh.l lVar = (yh.l) this.b;
                TLRPC.Chat chat = lVar.I;
                if (chat != null && !chat.title.equals(((zd) lVar.r.b).getText().toString())) {
                    lVar.getMessagesController().C(lVar.I.id, ((zd) lVar.r.b).getText().toString(), new yh.g(lVar, 1));
                }
                TLRPC.Chat chat2 = lVar.I;
                if (chat2 != null && lVar.n != lVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    lVar.I.default_banned_rights.manage_linked_peers = !lVar.n;
                    lVar.getMessagesController().E4(lVar.c, lVar.I.default_banned_rights, false, lVar);
                }
                lVar.finishFragment();
                break;
            case 28:
                ((yh.v) this.b).n.k1.E(0);
                break;
            default:
                yh.a0 a0Var = ((yh.w) this.b).r;
                if (!org.telegram.messenger.w3.w(27, a0Var.m1)) {
                    a0Var.dismiss();
                    break;
                } else {
                    vh.d dVar = a0Var.o1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        vp r12 = vp.r1(a0Var.a);
                        yh.r rVar = new yh.r(a0Var, 2);
                        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                        tL_channels_getAdminedPublicChannels.for_community_peer = true;
                        r12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new a3.b(1), new ml(r12, rVar, 0));
                        break;
                    }
                }
                break;
        }
    }
}
