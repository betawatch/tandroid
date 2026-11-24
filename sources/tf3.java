// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tf3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tf3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x069c  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        u69 T;
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList arrayList2;
        byte b = 3;
        byte b2 = 5;
        ArrayList arrayList3 = null;
        final byte b3 = 0;
        switch (this.a) {
            case 0:
                wf3 wf3Var = (wf3) this.b;
                c81 c81Var = (c81) this.c;
                vf3 vf3Var = wf3Var.S1;
                f35[] f35VarArr = wf3Var.W1;
                for (f35 f35Var : f35VarArr) {
                    if (f35Var != null) {
                        boolean z = f35Var.b;
                    }
                }
                oh2 oh2Var = (oh2) view;
                int intValue = ((Integer) oh2Var.getTag()).intValue();
                f35 f35Var2 = f35VarArr[intValue];
                boolean z2 = f35Var2.b;
                boolean z3 = !z2;
                if (z2 != z3) {
                    f35Var2.b = z3;
                    f35Var2.c = true;
                    z2 = z3;
                }
                oh2Var.c(z2, true);
                boolean z4 = f35VarArr[intValue].b;
                ArrayList arrayList4 = c81Var.d;
                HashSet hashSet = c81Var.j;
                if (intValue == 0) {
                    c81Var.m = z4;
                } else if (intValue != 1) {
                    if (intValue == 2) {
                        arrayList3 = c81Var.e;
                        c81Var.o = z4;
                    } else if (intValue == 3) {
                        arrayList3 = c81Var.f;
                        c81Var.p = z4;
                    } else if (intValue == 4) {
                        arrayList3 = c81Var.g;
                        c81Var.q = z4;
                    } else if (intValue == 7) {
                        arrayList3 = c81Var.h;
                    }
                    if (arrayList3 != null) {
                        for (int i = 0; i < arrayList3.size(); i++) {
                            if (((b81) arrayList3.get(i)).d == intValue) {
                                if (z4) {
                                    if (!hashSet.contains(arrayList3.get(i))) {
                                        hashSet.add((b81) arrayList3.get(i));
                                        c81Var.g((b81) arrayList3.get(i), true);
                                    }
                                } else if (hashSet.contains(arrayList3.get(i))) {
                                    hashSet.remove(arrayList3.get(i));
                                    c81Var.g((b81) arrayList3.get(i), false);
                                }
                            }
                        }
                    }
                    wf3Var.Z1.d();
                    wf3Var.V1.a(vf3Var.d(), true);
                    vf3Var.c(true);
                    break;
                } else {
                    c81Var.n = z4;
                }
                arrayList3 = arrayList4;
                if (arrayList3 != null) {
                }
                wf3Var.Z1.d();
                wf3Var.V1.a(vf3Var.d(), true);
                vf3Var.c(true);
            case 1:
                nk3 nk3Var = (nk3) this.b;
                ((bu5) this.c).u();
                nk3Var.presentFragment(new ProxyListActivity());
                break;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 3:
                nk3 nk3Var2 = (nk3) this.b;
                nk3Var2.K4((ArrayList) this.c, nm7.m1, false, false, null);
                nk3Var2.finishPreviewFragment();
                break;
            case 4:
                ((nk3) this.b).R3((he[]) this.c);
                break;
            case 5:
                ((nk3) this.b).n4((mk0) this.c);
                break;
            case 6:
                nl3 nl3Var = (nl3) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                if (nl3Var.getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 7:
                p71 p71Var = (p71) this.b;
                d dVar = (d) this.c;
                p71Var.dismiss();
                dVar.presentFragment(new y71());
                break;
            case 8:
                az3 az3Var = (az3) this.b;
                gn gnVar = (gn) this.c;
                m8 m8Var = az3Var.A1;
                if (m8Var != null) {
                    m8Var.d(true);
                    az3Var.A1 = null;
                    SpannableString spannableString = new SpannableString(k47.U(vm.e(az3Var.a, gnVar.getDocumentId())));
                    spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
                    if (gm.g(spannableString)) {
                        new c41((FrameLayout) az3Var.b, az3Var.J0).i(jb6.M0(2131751121, null)).j();
                        break;
                    }
                }
                break;
            case 9:
                w24 w24Var = (w24) this.b;
                w1b w1bVar = (w1b) this.c;
                e34 e34Var = w24Var.w;
                l04 l04Var = e34Var.E0;
                if (l04Var.indexOfChild(w1bVar) != -1 && (T = l04Var.T(w1bVar)) != null) {
                    if (T.b() == e34Var.g1) {
                        if (e34Var.i1 != null) {
                            f24 f24Var = e34Var.u1;
                            if (f24Var != null) {
                                f24Var.y(e34Var.K1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = oc7.r1(e34Var.d1).Y3.edit();
                            String str = "group_hide_stickers_" + e34Var.K1.id;
                            TLRPC.StickerSet stickerSet = e34Var.K1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            e34Var.Y(false);
                            w24 w24Var2 = e34Var.z0;
                            if (w24Var2 != null) {
                                w24Var2.f();
                                break;
                            }
                        }
                    } else if (w24Var.h.get(T.b()) == e34Var.k1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w24Var.c);
                        alertDialog$Builder.a.S = jb6.M0(2131752000, null);
                        alertDialog$Builder.a.U = jb6.M0(2131752001, null);
                        alertDialog$Builder.j(jb6.M0(2131752036, null), new yu3(w24Var, b2));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        he heVar = alertDialog$Builder.a;
                        heVar.show();
                        TextView textView = (TextView) heVar.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                lh4 lh4Var = (lh4) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((mh4) this.c).getSuggestedFilter();
                ub7 ub7Var = new ub7();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                ub7Var.b = tL_textWithEntities.text;
                ub7Var.c = tL_textWithEntities.entities;
                ub7Var.a = 2;
                while (lh4Var.e.getMessagesController().J0.get(ub7Var.a) != null) {
                    ub7Var.a++;
                }
                ub7Var.f = lh4Var.e.getMessagesController().S0().size();
                ub7Var.d = -1;
                ub7Var.e = -1;
                int i2 = 0;
                while (true) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    if (i2 >= 2) {
                        if (dialogFilter.groups) {
                            int i3 = ub7Var.g;
                            int i4 = oc7.s5;
                            ub7Var.g = i3 | 4;
                        }
                        if (dialogFilter.bots) {
                            int i5 = ub7Var.g;
                            int i6 = oc7.s5;
                            ub7Var.g = i5 | 16;
                        }
                        if (dialogFilter.contacts) {
                            int i7 = ub7Var.g;
                            int i8 = oc7.s5;
                            ub7Var.g = i7 | 1;
                        }
                        if (dialogFilter.non_contacts) {
                            int i9 = ub7Var.g;
                            int i10 = oc7.s5;
                            ub7Var.g = i9 | 2;
                        }
                        byte b4 = 8;
                        if (dialogFilter.broadcasts) {
                            int i11 = ub7Var.g;
                            int i12 = oc7.s5;
                            ub7Var.g = i11 | 8;
                        }
                        if (dialogFilter.exclude_archived) {
                            int i13 = ub7Var.g;
                            int i14 = oc7.s5;
                            ub7Var.g = i13 | 128;
                        }
                        if (dialogFilter.exclude_read) {
                            int i15 = ub7Var.g;
                            int i16 = oc7.s5;
                            ub7Var.g = i15 | 64;
                        }
                        if (dialogFilter.exclude_muted) {
                            int i17 = ub7Var.g;
                            int i18 = oc7.s5;
                            ub7Var.g = i17 | 32;
                        }
                        qf4.z0(ub7Var, ub7Var.g, ub7Var.b, ub7Var.c, ub7Var.n, ub7Var.m, ub7Var.h, ub7Var.i, ub7Var.j, true, true, true, true, true, lh4Var.e, new ve4(lh4Var, suggestedFilter, b4));
                        break;
                    } else {
                        if (i2 == 0) {
                            arrayList = dialogFilter.include_peers;
                            arrayList2 = ub7Var.h;
                        } else {
                            arrayList = dialogFilter.exclude_peers;
                            arrayList2 = ub7Var.i;
                        }
                        int size = arrayList.size();
                        int i19 = 0;
                        while (i19 < size) {
                            TLRPC.InputPeer inputPeer = arrayList.get(i19);
                            long j = inputPeer.user_id;
                            if (j == 0) {
                                long j2 = inputPeer.chat_id;
                                if (j2 == 0) {
                                    j2 = inputPeer.channel_id;
                                }
                                j = -j2;
                            }
                            i19 = mle.c(i19, 1, j, arrayList2);
                        }
                        i2++;
                    }
                }
            case 11:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.W0;
                float x = MediaController.w().x(fragmentContextView.W);
                int i20 = 0;
                while (true) {
                    if (i20 >= 3) {
                        i20 = -1;
                    } else if (x - 0.1f > fArr[i20]) {
                        i20++;
                    }
                }
                int i21 = i20 + 1;
                if (i21 >= 3) {
                    i21 = 0;
                }
                float f = fArr[i21];
                MediaController.w().l0(fragmentContextView.W, f);
                fragmentContextView.l(x, f, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    jg5 jg5Var = jg5.w;
                    if (jg5Var.c()) {
                        jg5Var.b();
                        d dVar2 = fragmentContextView.h;
                        if (dVar2 != null && fragmentContextView.C0 != null) {
                            hg5 hg5Var = new hg5(fragmentContextView.getContext(), 1);
                            hg5Var.p(true);
                            hg5Var.d = 2300L;
                            hg5Var.U = true;
                            hg5Var.e = true;
                            hg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                            hg5Var.v0 = -gm.L(6.0f);
                            fragmentContextView.B0 = hg5Var;
                            hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            if (dVar2 instanceof yv1) {
                                hg5Var.k(((yv1) dVar2).L);
                            }
                            hg5Var.t(jb6.M0(2131744958, null));
                            hg5Var.r0 = new hi(hg5Var, b);
                            fragmentContextView.C0.addView(hg5Var, qoe.e(-1, nm7.f2, 55));
                            hg5Var.x(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                break;
            case 12:
                oq4 oq4Var = (oq4) this.b;
                q7 q7Var = (q7) this.c;
                int indexOf = oq4Var.G.indexOf(q7Var.getFilter());
                if (oq4Var.J != indexOf) {
                    oq4Var.J = indexOf;
                    oq4Var.e();
                    break;
                } else if (q7Var.getFilter().h) {
                    if (q7Var.a.f) {
                        sh4 filter = q7Var.getFilter();
                        oq4Var.f(filter);
                        nq4 nq4Var = oq4Var.I;
                        if (nq4Var != null) {
                            ((pj3) nq4Var).a(filter);
                            break;
                        }
                    } else {
                        q7Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 13:
                l11.u((Activity) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 14:
                rh rhVar = (rh) this.b;
                my0 my0Var = (my0) this.c;
                rhVar.run();
                my0Var.dismiss();
                break;
            case 15:
                ((mf2) this.c).a(Long.valueOf(((gt4) this.b).d));
                break;
            case 16:
                tt4 tt4Var = (tt4) this.b;
                tt4Var.e((yn6) this.c, false);
                tt4Var.G.p();
                break;
            case 17:
                final pv4 pv4Var = (pv4) this.b;
                final n8 n8Var = (n8) this.c;
                if (pv4Var.d) {
                    if (!n8Var.a.R) {
                        n8Var.b(true);
                        String str2 = pv4Var.h;
                        qac qacVar = new qac() { // from class: ov4
                            @Override // qac
                            public final void a(Object obj) {
                                byte b5 = b3;
                                n8 n8Var2 = n8Var;
                                pv4 pv4Var2 = pv4Var;
                                switch (b5) {
                                    case 0:
                                        n8Var2.b(false);
                                        qv4 qv4Var = (qv4) pv4Var2;
                                        gm.d3(new qn4(qv4Var, (byte) 5), 200L);
                                        qv4Var.r.dismiss();
                                        break;
                                    default:
                                        n8Var2.b(false);
                                        yn0.c((TLRPC.TL_error) obj, pv4Var2.n, pv4Var2.c, new mv4(pv4Var2, (byte) 1));
                                        break;
                                }
                            }
                        };
                        final char c = 1 == true ? 1 : 0;
                        qac qacVar2 = new qac() { // from class: ov4
                            @Override // qac
                            public final void a(Object obj) {
                                byte b5 = c;
                                n8 n8Var2 = n8Var;
                                pv4 pv4Var2 = pv4Var;
                                switch (b5) {
                                    case 0:
                                        n8Var2.b(false);
                                        qv4 qv4Var = (qv4) pv4Var2;
                                        gm.d3(new qn4(qv4Var, (byte) 5), 200L);
                                        qv4Var.r.dismiss();
                                        break;
                                    default:
                                        n8Var2.b(false);
                                        yn0.c((TLRPC.TL_error) obj, pv4Var2.n, pv4Var2.c, new mv4(pv4Var2, (byte) 1));
                                        break;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new ho0(qacVar2, qacVar, b3), 2);
                        break;
                    }
                } else {
                    ((qv4) pv4Var).r.dismiss();
                    break;
                }
                break;
            case 18:
                final yw4 yw4Var = (yw4) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                bu5 G = bu5.G(yw4Var.c, yw4Var.J0, (View) view.getParent());
                G.b(R.drawable.profile_discuss, jb6.M0(2131745335, null), new Runnable() { // from class: qw4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b3;
                        TLRPC.User user2 = user;
                        yw4 yw4Var2 = yw4Var;
                        switch (b5) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                yv1 yv1Var = new yv1(bundle);
                                d dVar3 = yw4Var2.r1;
                                if (dVar3 == null) {
                                    d S = LaunchActivity.S();
                                    if (S != null) {
                                        bh0 bh0Var = new bh0();
                                        bh0Var.a = true;
                                        S.showAsSheet(yv1Var, bh0Var);
                                        break;
                                    }
                                } else {
                                    dVar3.presentFragment(yv1Var);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user2.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                d dVar4 = yw4Var2.r1;
                                if (dVar4 == null) {
                                    d S2 = LaunchActivity.S();
                                    if (S2 != null) {
                                        bh0 bh0Var2 = new bh0();
                                        bh0Var2.a = true;
                                        S2.showAsSheet(profileActivity, bh0Var2);
                                        break;
                                    }
                                } else {
                                    dVar4.presentFragment(profileActivity);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                String M0 = jb6.M0(2131747519, null);
                final char c2 = 1 == true ? 1 : 0;
                G.b(R.drawable.msg_openprofile, M0, new Runnable() { // from class: qw4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = c2;
                        TLRPC.User user2 = user;
                        yw4 yw4Var2 = yw4Var;
                        switch (b5) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                yv1 yv1Var = new yv1(bundle);
                                d dVar3 = yw4Var2.r1;
                                if (dVar3 == null) {
                                    d S = LaunchActivity.S();
                                    if (S != null) {
                                        bh0 bh0Var = new bh0();
                                        bh0Var.a = true;
                                        S.showAsSheet(yv1Var, bh0Var);
                                        break;
                                    }
                                } else {
                                    dVar3.presentFragment(yv1Var);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user2.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                d dVar4 = yw4Var2.r1;
                                if (dVar4 == null) {
                                    d S2 = LaunchActivity.S();
                                    if (S2 != null) {
                                        bh0 bh0Var2 = new bh0();
                                        bh0Var2.a = true;
                                        S2.showAsSheet(profileActivity, bh0Var2);
                                        break;
                                    }
                                } else {
                                    dVar4.presentFragment(profileActivity);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                G.a0();
                break;
            case 19:
                s45 s45Var = (s45) this.b;
                mk7 mk7Var = (mk7) this.c;
                if (!s45Var.m) {
                    mk7Var.dismiss();
                    break;
                }
                break;
            case 20:
                b61 b61Var = (b61) this.b;
                el7 el7Var = (el7) this.c;
                if (!b61Var.R) {
                    el7Var.dismiss();
                    break;
                }
                break;
            case 21:
                t65 t65Var = (t65) this.b;
                TextView textView2 = (TextView) this.c;
                g95 g95Var = t65Var.F;
                qd2 qd2Var = g95Var.T2;
                if (qd2Var != null && qd2Var.w) {
                    g95Var.B1(textView2);
                    break;
                }
                break;
            case 22:
                new t85((LaunchActivity) this.c, (sb) this.b).show();
                break;
            case 23:
                c75 c75Var = (c75) this.b;
                g95 g95Var2 = (g95) this.c;
                qd2 qd2Var2 = c75Var.j0;
                if (qd2Var2 == null || !qd2Var2.b.rtmp_stream) {
                    oa5.g0 = false;
                    g95Var2.dismiss();
                    break;
                } else {
                    tp9.f(g95Var2.b2);
                    break;
                }
                break;
            case 24:
                ud5 ud5Var = (ud5) this.b;
                ((ce2) this.c).run();
                ud5Var.dismiss();
                break;
            case 25:
                vr5 vr5Var = (vr5) this.b;
                s09 s09Var = (s09) this.c;
                if (!nk3.E4) {
                    nk3.E4 = true;
                    boolean o = cmb.I.o();
                    boolean z5 = !o;
                    bmb O0 = !o ? cmb.O0("Night") : cmb.O0("Blue");
                    cmb.o = 0;
                    cmb.u1();
                    cmb.A();
                    p09 p09Var = vr5Var.w;
                    p09Var.K(!o ? p09Var.e[0] - 1 : 0);
                    s09Var.d();
                    int[] iArr = {(s09Var.getMeasuredWidth() / 2) + r14, (s09Var.getMeasuredHeight() / 2) + r14};
                    s09Var.getLocationInWindow(iArr);
                    int i22 = iArr[0];
                    int i23 = iArr[1];
                    nm7.e().k(nm7.x4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z5), s09Var);
                    s09Var.setContentDescription(jb6.M0(!o ? 2131754750 : 2131754749, null));
                    break;
                }
                break;
            case 26:
                bu5 bu5Var = (bu5) this.b;
                hq6 hq6Var = (hq6) this.c;
                bu5Var.u();
                hq6Var.run();
                break;
            case 27:
                bu5 bu5Var2 = (bu5) this.b;
                ((jh3) this.c).run();
                if (bu5Var2.J) {
                    bu5Var2.u();
                    break;
                }
                break;
            case 28:
                wv5 wv5Var = (wv5) this.b;
                uv5 uv5Var = (uv5) this.c;
                TLRPC.InputPeer i1 = oc7.r1(wv5Var.a).i1(k47.B1(wv5Var.w1));
                if (wv5Var.v1 != 2) {
                    wv5Var.y1 = i1;
                } else if (wv5Var.w1 != wv5Var.x1) {
                    uv5Var.a(i1, wv5Var.s1.size() > 1, false, false);
                }
                wv5Var.dismiss();
                break;
            default:
                jx5 jx5Var = (jx5) this.b;
                d dVar3 = (d) this.c;
                jx5Var.R.dismiss();
                if (jx5Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i24 = jx5Var.d0;
                    if (i24 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i24 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    nk3 nk3Var3 = new nk3(bundle);
                    nk3Var3.E2 = new nv4(jx5Var, nk3Var3, b2);
                    dVar3.presentFragment(nk3Var3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, jx5Var.d0);
                    c71 c71Var = new c71(bundle2);
                    c71Var.d = jx5Var.g0;
                    c71Var.Z();
                    dVar3.presentFragment(c71Var);
                    break;
                }
        }
    }
}
