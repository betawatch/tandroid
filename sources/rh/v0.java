package rh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ v0(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02ec, code lost:
    
        if (r1 != null) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        long j10;
        boolean z10;
        boolean z11;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean L1;
        TLRPC.Message message;
        int i10;
        TLRPC.Message message2;
        TLRPC.Message message3;
        int i11 = this.a;
        int i12 = 15;
        int i13 = 2;
        int i14 = 0;
        final e4 e4Var = this.b;
        switch (i11) {
            case 0:
                org.telegram.ui.Wallet.j5 j5Var = e4Var.Z2;
                if (j5Var != null) {
                    e4Var.dismiss();
                    org.telegram.messenger.i0.h3(new ph.x1(j5Var, i12), 250L);
                    break;
                }
                break;
            case 1:
                e4Var.b2();
                break;
            case 2:
                e4Var.R1();
                break;
            case 3:
                if (e4Var.H1() != null && e4Var.H1().host_id != null) {
                    e4Var.S1();
                    break;
                } else {
                    org.telegram.messenger.m5.n(null, 2131749841, e4Var.k(), R.raw.info, 36);
                    break;
                }
                break;
            case 4:
                e4Var.Q2 = true;
                e4Var.t2(false);
                break;
            case 5:
                e4Var.onBackPressed();
                break;
            case 6:
                e4Var.t1();
                break;
            case 7:
                e4Var.onBackPressed();
                break;
            case 8:
                e4Var.Z1();
                break;
            case 9:
                e4Var.dismiss();
                break;
            case 10:
                e4Var.Z1();
                break;
            case 11:
                e4Var.onBackPressed();
                break;
            case 12:
                e4Var.N1();
                break;
            case 13:
                e4Var.Z1();
                break;
            case 14:
                e4Var.onBackPressed();
                break;
            case 15:
                e4Var.T1(true);
                break;
            case 16:
                e4Var.Z1();
                break;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    vh.d dVar = e4Var.c2;
                    dVar.i(cd.L0(2131749796, null), true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new v0(e4Var, 28));
                    e4Var.X1.i(3, cd.L0(2131749788, null), cd.L0(2131749789, null), null);
                    e4Var.s2(3, true, null);
                    break;
                }
                break;
            case 18:
                if (!e4Var.c2.Q) {
                    e4Var.o2.a(!r1.a.q, true);
                    break;
                }
                break;
            case 19:
                final TL_stars.TL_starGiftUnique H1 = e4Var.H1();
                if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                    r6 = H1.host_id == null;
                    if (e4Var.o3 == null) {
                        e4Var.o3 = Boolean.valueOf(!r6);
                    }
                    e4Var.m2(H1, r6);
                    final int i15 = e4Var.n3 + 1;
                    e4Var.n3 = i15;
                    TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
                    displaystargift.peer = r6 ? vp.r1(e4Var.a).i1(d20.i(e4Var.a).e()) : null;
                    displaystargift.slug = H1.slug;
                    ConnectionsManager.getInstance(e4Var.a).sendRequestTyped(displaystargift, new a3.b(1), new j20() { // from class: rh.y0
                        @Override // org.telegram.messenger.j20
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean z12 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            e4 e4Var2 = e4.this;
                            if (z12) {
                                e4Var2.o3 = Boolean.valueOf(r2);
                                return;
                            }
                            if (i15 != e4Var2.n3) {
                                return;
                            }
                            e4Var2.m2(H1, e4Var2.o3.booleanValue());
                            e4Var2.k().e0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
                        }
                    });
                    break;
                }
                break;
            case 20:
                String C1 = e4Var.C1();
                TL_stars.TL_starGiftUnique H12 = e4Var.H1();
                jg.b1 b1Var = e4Var.Q1;
                b1Var.getLocationInWindow(new int[2]);
                z60 F = z60.F(b1Var, e4Var.I0, view);
                boolean z12 = (e4Var.H1() == null || !e4.L1(e4Var.a, org.telegram.messenger.o5.o(e4Var.H1().owner_id)) || !(e4Var.y2 instanceof v5) || e4Var.x2 == null || e4Var.B1() == null) ? false : true;
                TL_stars.SavedStarGift savedStarGift = e4Var.x2;
                F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, cd.L0((savedStarGift == null || !savedStarGift.pinned_to_top) ? 2131750087 : 2131749893, null), new w0(e4Var, 13), z12);
                F.l(R.drawable.outline_craft, cd.L0(2131749810, null), new w0(e4Var, 16), e4Var.o1());
                F.l(R.drawable.menu_edit_price, cd.L0(2131750273, null), new w0(e4Var, 17), (e4Var.H1() == null || !e4.L1(e4Var.a, org.telegram.messenger.o5.o(e4Var.H1().owner_id)) || e4Var.H1().resell_amount == null) ? false : true);
                F.l(R.drawable.msg_link, cd.L0(2131751762, null), new x1(e4Var, C1, 7), C1 != null);
                F.l(R.drawable.msg_share, cd.L0(2131745477, null), new w0(e4Var, 18), C1 != null);
                F.l(R.drawable.input_suggest_paid_24, cd.L0(2131749696, null), new w0(e4Var, 19), H12 != null && H12.offer_min_stars > 0);
                TL_stars.TL_starGiftUnique H13 = e4Var.H1();
                if (H13 == null || !H13.theme_available) {
                    j10 = 0;
                } else {
                    long o10 = org.telegram.messenger.o5.o(H13.owner_id);
                    j10 = 0;
                    long o11 = org.telegram.messenger.o5.o(H13.host_id);
                    if ((o10 > 0 && e4.L1(e4Var.a, o10)) || (o11 > 0 && e4.L1(e4Var.a, o11))) {
                        z10 = true;
                        F.l(R.drawable.msg_colors, cd.L0(2131749605, null), new w0(e4Var, 20), z10);
                        boolean z13 = e4Var.X2 != null && e4Var.w2 && e4Var.x2 != null && e4.K1(e4Var.a, e4Var.P1);
                        TL_stars.SavedStarGift savedStarGift2 = e4Var.x2;
                        F.l((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, cd.L0((savedStarGift2 != null || savedStarGift2.unsaved) ? 2131749989 : 2131750197, null), new w0(e4Var, 6), z13);
                        if (e4Var.X2 == null) {
                            if (e4Var.B1() != null) {
                                jj jjVar = e4Var.z2;
                                if (jjVar != null && (message = jjVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                        if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                                L1 = e4.L1(e4Var.a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id));
                                                if (L1) {
                                                    z11 = true;
                                                    F.l(R.drawable.menu_transfer, cd.L0(2131749927, null), new w0(e4Var, 21), z11);
                                                    F.l(R.drawable.menu_transfer, cd.L0(2131749927, null), new w0(e4Var, 22), e4Var.X2 != null);
                                                    F.l(R.drawable.msg_view_file, cd.L0(2131749855, null), new w0(e4Var, 14), (e4Var.x2 == null || e4Var.x1() == j10) ? false : true);
                                                    F.m(R.drawable.msg_delete, new w0(e4Var, i12), cd.L0(2131750227, null), e4Var.p1(), true);
                                                    F.t = false;
                                                    F.Y = true;
                                                    F.s = 0;
                                                    F.a0(r4[0] + e4Var.t0, -org.telegram.messenger.i0.L(2.0f));
                                                    F.Z();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                TL_stars.SavedStarGift savedStarGift3 = e4Var.x2;
                                if (savedStarGift3 != null) {
                                    TL_stars.StarGift starGift2 = savedStarGift3.gift;
                                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                        L1 = e4.L1(e4Var.a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id));
                                        if (L1) {
                                        }
                                    }
                                }
                                tL_starGiftUnique = e4Var.B2;
                                break;
                            }
                            L1 = false;
                            if (L1) {
                            }
                        }
                        z11 = false;
                        F.l(R.drawable.menu_transfer, cd.L0(2131749927, null), new w0(e4Var, 21), z11);
                        F.l(R.drawable.menu_transfer, cd.L0(2131749927, null), new w0(e4Var, 22), e4Var.X2 != null);
                        F.l(R.drawable.msg_view_file, cd.L0(2131749855, null), new w0(e4Var, 14), (e4Var.x2 == null || e4Var.x1() == j10) ? false : true);
                        F.m(R.drawable.msg_delete, new w0(e4Var, i12), cd.L0(2131750227, null), e4Var.p1(), true);
                        F.t = false;
                        F.Y = true;
                        F.s = 0;
                        F.a0(r4[0] + e4Var.t0, -org.telegram.messenger.i0.L(2.0f));
                        F.Z();
                    }
                }
                z10 = false;
                F.l(R.drawable.msg_colors, cd.L0(2131749605, null), new w0(e4Var, 20), z10);
                if (e4Var.X2 != null) {
                }
                TL_stars.SavedStarGift savedStarGift22 = e4Var.x2;
                F.l((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, cd.L0((savedStarGift22 != null || savedStarGift22.unsaved) ? 2131749989 : 2131750197, null), new w0(e4Var, 6), z13);
                if (e4Var.X2 == null) {
                }
                z11 = false;
                F.l(R.drawable.menu_transfer, cd.L0(2131749927, null), new w0(e4Var, 21), z11);
                F.l(R.drawable.menu_transfer, cd.L0(2131749927, null), new w0(e4Var, 22), e4Var.X2 != null);
                F.l(R.drawable.msg_view_file, cd.L0(2131749855, null), new w0(e4Var, 14), (e4Var.x2 == null || e4Var.x1() == j10) ? false : true);
                F.m(R.drawable.msg_delete, new w0(e4Var, i12), cd.L0(2131750227, null), e4Var.p1(), true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(r4[0] + e4Var.t0, -org.telegram.messenger.i0.L(2.0f));
                F.Z();
                break;
            case 21:
                e4Var.T1(true);
                break;
            case 22:
                if (view.getAlpha() >= 0.99f) {
                    e4Var.W1();
                    break;
                } else {
                    e4Var.q1();
                    break;
                }
            case 23:
                e4Var.S1();
                break;
            case 24:
                e4Var.O1();
                break;
            case 25:
                if (view.getAlpha() < 0.99f) {
                    e4Var.q1();
                    break;
                } else {
                    TL_stars.TL_starGiftUnique H14 = e4Var.H1();
                    if (H14 != null) {
                        if (H14.resell_amount != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                            String a02 = cd.a0(null, null, 2131749895, e4Var.z1());
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = a02;
                            x1Var.T = cd.L0(2131749896, null);
                            alertDialog$Builder.k(cd.L0(2131750441, null), new c2(e4Var, H14, r6 ? 1 : 0));
                            alertDialog$Builder.h(cd.L0(2131752589, null), new org.telegram.utils.twidget.t(26));
                            alertDialog$Builder.p();
                            break;
                        } else {
                            jj jjVar2 = e4Var.z2;
                            if (jjVar2 != null && (message3 = jjVar2.k) != null) {
                                TLRPC.MessageAction messageAction2 = message3.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                                    if (i10 > ConnectionsManager.getInstance(e4Var.a).getCurrentTime()) {
                                        h8.h1(e4Var.getContext(), e4Var.a, null, new d2(e4Var, H14, r6 ? 1 : 0), e4Var.I0);
                                        break;
                                    } else {
                                        Context context = e4Var.getContext();
                                        jj jjVar3 = e4Var.z2;
                                        if (jjVar3 != null && (message2 = jjVar3.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message2.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                i14 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).can_resell_at;
                                                e4Var.q2(i14 - ConnectionsManager.getInstance(e4Var.a).getCurrentTime(), context, true);
                                                break;
                                            }
                                        }
                                        TL_stars.SavedStarGift savedStarGift4 = e4Var.x2;
                                        if (savedStarGift4 != null) {
                                            i14 = savedStarGift4.can_resell_at;
                                        }
                                        e4Var.q2(i14 - ConnectionsManager.getInstance(e4Var.a).getCurrentTime(), context, true);
                                    }
                                }
                            }
                            TL_stars.SavedStarGift savedStarGift5 = e4Var.x2;
                            i10 = savedStarGift5 != null ? savedStarGift5.can_resell_at : 0;
                            if (i10 > ConnectionsManager.getInstance(e4Var.a).getCurrentTime()) {
                            }
                        }
                    }
                }
                break;
            case 26:
                TL_stars.TL_starGiftUnique H15 = e4Var.H1();
                if (H15 != null) {
                    h8.h1(e4Var.getContext(), e4Var.a, H15, new d2(e4Var, H15, i13), e4Var.I0);
                    break;
                }
                break;
            case 27:
                e4Var.Q2 = true;
                e4Var.t2(false);
                break;
            case 28:
                e4Var.T1(false);
                break;
            default:
                e4Var.b2();
                break;
        }
    }
}
