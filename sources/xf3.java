// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xf3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xf3(cs5 cs5Var, Runnable runnable, byte b) {
        this.a = b;
        this.c = cs5Var;
        this.b = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s49 T;
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList arrayList2;
        byte b = 3;
        byte b2 = 4;
        byte b3 = 2;
        final byte b4 = 0;
        switch (this.a) {
            case 0:
                cj3 cj3Var = (cj3) this.b;
                ((cs5) this.c).u();
                cj3Var.presentFragment(new ProxyListActivity());
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 2:
                cj3 cj3Var2 = (cj3) this.b;
                cj3Var2.G4((ArrayList) this.c, kk7.m1, false, false, null);
                cj3Var2.finishPreviewFragment();
                break;
            case 3:
                ((cj3) this.b).O3((hd[]) this.c);
                break;
            case 4:
                ((cj3) this.b).k4((mj0) this.c);
                break;
            case 5:
                dk3 dk3Var = (dk3) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                if (dk3Var.getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 6:
                i61 i61Var = (i61) this.b;
                d dVar = (d) this.c;
                i61Var.dismiss();
                dVar.presentFragment(new r61());
                break;
            case 7:
                qx3 qx3Var = (qx3) this.b;
                gm gmVar = (gm) this.c;
                m8 m8Var = qx3Var.A1;
                if (m8Var != null) {
                    m8Var.d(true);
                    qx3Var.A1 = null;
                    SpannableString spannableString = new SpannableString(k27.U(vl.e(qx3Var.a, gmVar.getDocumentId())));
                    spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
                    if (gl.g(spannableString)) {
                        new u21((FrameLayout) qx3Var.b, qx3Var.J0).i(k96.M0(2131751172, null)).j();
                        break;
                    }
                }
                break;
            case 8:
                l14 l14Var = (l14) this.b;
                vza vzaVar = (vza) this.c;
                t14 t14Var = l14Var.w;
                bz3 bz3Var = t14Var.E0;
                if (bz3Var.indexOfChild(vzaVar) != -1 && (T = bz3Var.T(vzaVar)) != null) {
                    if (T.b() != t14Var.g1) {
                        if (l14Var.h.get(T.b()) == t14Var.k1) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l14Var.c);
                            alertDialog$Builder.a.S = k96.M0(2131752051, null);
                            alertDialog$Builder.a.U = k96.M0(2131752052, null);
                            alertDialog$Builder.j(k96.M0(2131752087, null), new kx3(l14Var, b3));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.show();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                break;
                            }
                        }
                    } else if (t14Var.i1 == null) {
                        SharedPreferences.Editor edit = na7.q1(t14Var.d1).Y3.edit();
                        String str = "group_hide_stickers_" + t14Var.K1.id;
                        TLRPC.StickerSet stickerSet = t14Var.K1.stickerset;
                        edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                        t14Var.Y(false);
                        l14 l14Var2 = t14Var.z0;
                        if (l14Var2 != null) {
                            l14Var2.f();
                            break;
                        }
                    } else {
                        u04 u04Var = t14Var.u1;
                        if (u04Var != null) {
                            u04Var.y(t14Var.K1.id);
                            break;
                        }
                    }
                }
                break;
            case 9:
                kf4 kf4Var = (kf4) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((lf4) this.c).getSuggestedFilter();
                t97 t97Var = new t97();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                t97Var.b = tL_textWithEntities.text;
                t97Var.c = tL_textWithEntities.entities;
                t97Var.a = 2;
                while (kf4Var.e.getMessagesController().J0.get(t97Var.a) != null) {
                    t97Var.a++;
                }
                t97Var.f = kf4Var.e.getMessagesController().R0().size();
                t97Var.d = -1;
                t97Var.e = -1;
                int i = 0;
                while (true) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    if (i >= 2) {
                        if (dialogFilter.groups) {
                            int i2 = t97Var.g;
                            int i3 = na7.q5;
                            t97Var.g = i2 | 4;
                        }
                        if (dialogFilter.bots) {
                            int i4 = t97Var.g;
                            int i5 = na7.q5;
                            t97Var.g = i4 | 16;
                        }
                        if (dialogFilter.contacts) {
                            int i6 = t97Var.g;
                            int i7 = na7.q5;
                            t97Var.g = i6 | 1;
                        }
                        if (dialogFilter.non_contacts) {
                            int i8 = t97Var.g;
                            int i9 = na7.q5;
                            t97Var.g = i8 | 2;
                        }
                        if (dialogFilter.broadcasts) {
                            int i10 = t97Var.g;
                            int i11 = na7.q5;
                            t97Var.g = i10 | 8;
                        }
                        if (dialogFilter.exclude_archived) {
                            int i12 = t97Var.g;
                            int i13 = na7.q5;
                            t97Var.g = i12 | 128;
                        }
                        if (dialogFilter.exclude_read) {
                            int i14 = t97Var.g;
                            int i15 = na7.q5;
                            t97Var.g = i14 | 64;
                        }
                        if (dialogFilter.exclude_muted) {
                            int i16 = t97Var.g;
                            int i17 = na7.q5;
                            t97Var.g = i16 | 32;
                        }
                        pd4.y0(t97Var, t97Var.g, t97Var.b, t97Var.c, t97Var.n, t97Var.m, t97Var.h, t97Var.i, t97Var.j, true, true, true, true, true, kf4Var.e, new vc4(kf4Var, suggestedFilter, (byte) 7));
                        break;
                    } else {
                        if (i == 0) {
                            arrayList = dialogFilter.include_peers;
                            arrayList2 = t97Var.h;
                        } else {
                            arrayList = dialogFilter.exclude_peers;
                            arrayList2 = t97Var.i;
                        }
                        int size = arrayList.size();
                        int i18 = 0;
                        while (i18 < size) {
                            TLRPC.InputPeer inputPeer = arrayList.get(i18);
                            long j = inputPeer.user_id;
                            if (j == 0) {
                                long j2 = inputPeer.chat_id;
                                if (j2 == 0) {
                                    j2 = inputPeer.channel_id;
                                }
                                j = -j2;
                            }
                            i18 = mue.c(i18, 1, j, arrayList2);
                        }
                        i++;
                    }
                }
            case 10:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.W0;
                float x = MediaController.w().x(fragmentContextView.W);
                int i19 = 0;
                while (true) {
                    if (i19 >= 3) {
                        i19 = -1;
                    } else if (x - 0.1f > fArr[i19]) {
                        i19++;
                    }
                }
                int i20 = i19 + 1;
                if (i20 >= 3) {
                    i20 = 0;
                }
                float f = fArr[i20];
                MediaController.w().l0(fragmentContextView.W, f);
                fragmentContextView.l(x, f, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    le5 le5Var = le5.w;
                    if (le5Var.c()) {
                        le5Var.b();
                        d dVar2 = fragmentContextView.h;
                        if (dVar2 != null && fragmentContextView.C0 != null) {
                            je5 je5Var = new je5(fragmentContextView.getContext(), 1);
                            je5Var.p(true);
                            je5Var.d = 2300L;
                            je5Var.U = true;
                            je5Var.e = true;
                            je5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                            je5Var.v0 = -gl.L(6.0f);
                            fragmentContextView.B0 = je5Var;
                            je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            if (dVar2 instanceof mu1) {
                                je5Var.k(((mu1) dVar2).L);
                            }
                            je5Var.t(k96.M0(2131745032, null));
                            je5Var.r0 = new hh(je5Var, b);
                            fragmentContextView.C0.addView(je5Var, nme.e(-1, kk7.f2, 55));
                            je5Var.x(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                break;
            case 11:
                no4 no4Var = (no4) this.b;
                q7 q7Var = (q7) this.c;
                int indexOf = no4Var.G.indexOf(q7Var.getFilter());
                if (no4Var.J == indexOf) {
                    if (q7Var.getFilter().h) {
                        if (!q7Var.a.f) {
                            q7Var.setSelectedForDelete(true);
                            break;
                        } else {
                            rf4 filter = q7Var.getFilter();
                            no4Var.f(filter);
                            mo4 mo4Var = no4Var.I;
                            if (mo4Var != null) {
                                ((di3) mo4Var).a(filter);
                                break;
                            }
                        }
                    }
                } else {
                    no4Var.J = indexOf;
                    no4Var.e();
                    break;
                }
                break;
            case 12:
                d01.t((Activity) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 13:
                qg qgVar = (qg) this.b;
                fx0 fx0Var = (fx0) this.c;
                qgVar.run();
                fx0Var.dismiss();
                break;
            case 14:
                ((be2) this.c).a(Long.valueOf(((fr4) this.b).d));
                break;
            case 15:
                sr4 sr4Var = (sr4) this.b;
                sr4Var.e((xl6) this.c, false);
                sr4Var.G.p();
                break;
            case 16:
                final nt4 nt4Var = (nt4) this.b;
                final n8 n8Var = (n8) this.c;
                if (!nt4Var.d) {
                    ((ot4) nt4Var).r.dismiss();
                    break;
                } else if (!n8Var.a.R) {
                    n8Var.b(true);
                    String str2 = nt4Var.h;
                    p8c p8cVar = new p8c() { // from class: mt4
                        @Override // p8c
                        public final void a(Object obj) {
                            byte b5 = b4;
                            n8 n8Var2 = n8Var;
                            nt4 nt4Var2 = nt4Var;
                            switch (b5) {
                                case 0:
                                    n8Var2.b(false);
                                    ot4 ot4Var = (ot4) nt4Var2;
                                    gl.e3(new s54(ot4Var, (byte) 28), 200L);
                                    ot4Var.r.dismiss();
                                    break;
                                default:
                                    n8Var2.b(false);
                                    ym0.c((TLRPC.TL_error) obj, nt4Var2.n, nt4Var2.c, new lt4(nt4Var2, (byte) 1));
                                    break;
                            }
                        }
                    };
                    final char c = 1 == true ? 1 : 0;
                    p8c p8cVar2 = new p8c() { // from class: mt4
                        @Override // p8c
                        public final void a(Object obj) {
                            byte b5 = c;
                            n8 n8Var2 = n8Var;
                            nt4 nt4Var2 = nt4Var;
                            switch (b5) {
                                case 0:
                                    n8Var2.b(false);
                                    ot4 ot4Var = (ot4) nt4Var2;
                                    gl.e3(new s54(ot4Var, (byte) 28), 200L);
                                    ot4Var.r.dismiss();
                                    break;
                                default:
                                    n8Var2.b(false);
                                    ym0.c((TLRPC.TL_error) obj, nt4Var2.n, nt4Var2.c, new lt4(nt4Var2, (byte) 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str2;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new hn0(p8cVar2, p8cVar, b4), 2);
                    break;
                }
                break;
            case 17:
                final xu4 xu4Var = (xu4) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                cs5 G = cs5.G(xu4Var.c, xu4Var.J0, (View) view.getParent());
                G.b(R.drawable.profile_discuss, k96.M0(2131745409, null), new Runnable() { // from class: pu4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b4;
                        TLRPC.User user2 = user;
                        xu4 xu4Var2 = xu4Var;
                        switch (b5) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                mu1 mu1Var = new mu1(bundle);
                                d dVar3 = xu4Var2.r1;
                                if (dVar3 == null) {
                                    d S = LaunchActivity.S();
                                    if (S != null) {
                                        ag0 ag0Var = new ag0();
                                        ag0Var.a = true;
                                        S.showAsSheet(mu1Var, ag0Var);
                                        break;
                                    }
                                } else {
                                    dVar3.presentFragment(mu1Var);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user2.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                d dVar4 = xu4Var2.r1;
                                if (dVar4 == null) {
                                    d S2 = LaunchActivity.S();
                                    if (S2 != null) {
                                        ag0 ag0Var2 = new ag0();
                                        ag0Var2.a = true;
                                        S2.showAsSheet(profileActivity, ag0Var2);
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
                String M0 = k96.M0(2131747593, null);
                final char c2 = 1 == true ? 1 : 0;
                G.b(R.drawable.msg_openprofile, M0, new Runnable() { // from class: pu4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = c2;
                        TLRPC.User user2 = user;
                        xu4 xu4Var2 = xu4Var;
                        switch (b5) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                mu1 mu1Var = new mu1(bundle);
                                d dVar3 = xu4Var2.r1;
                                if (dVar3 == null) {
                                    d S = LaunchActivity.S();
                                    if (S != null) {
                                        ag0 ag0Var = new ag0();
                                        ag0Var.a = true;
                                        S.showAsSheet(mu1Var, ag0Var);
                                        break;
                                    }
                                } else {
                                    dVar3.presentFragment(mu1Var);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user2.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                d dVar4 = xu4Var2.r1;
                                if (dVar4 == null) {
                                    d S2 = LaunchActivity.S();
                                    if (S2 != null) {
                                        ag0 ag0Var2 = new ag0();
                                        ag0Var2.a = true;
                                        S2.showAsSheet(profileActivity, ag0Var2);
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
            case 18:
                s25 s25Var = (s25) this.b;
                ki7 ki7Var = (ki7) this.c;
                if (!s25Var.m) {
                    ki7Var.dismiss();
                    break;
                }
                break;
            case 19:
                u41 u41Var = (u41) this.b;
                cj7 cj7Var = (cj7) this.c;
                if (!u41Var.R) {
                    cj7Var.dismiss();
                    break;
                }
                break;
            case 20:
                v45 v45Var = (v45) this.b;
                TextView textView2 = (TextView) this.c;
                h75 h75Var = v45Var.F;
                fc2 fc2Var = h75Var.T2;
                if (fc2Var != null && fc2Var.w) {
                    h75Var.B1(textView2);
                    break;
                }
                break;
            case 21:
                new v65((LaunchActivity) this.c, (sb) this.b).show();
                break;
            case 22:
                e55 e55Var = (e55) this.b;
                h75 h75Var2 = (h75) this.c;
                fc2 fc2Var2 = e55Var.j0;
                if (fc2Var2 != null && fc2Var2.b.rtmp_stream) {
                    sn9.d(h75Var2.b2);
                    break;
                } else {
                    o85.g0 = false;
                    h75Var2.dismiss();
                    break;
                }
                break;
            case 23:
                wb5 wb5Var = (wb5) this.b;
                ((rc2) this.c).run();
                wb5Var.dismiss();
                break;
            case 24:
                wp5 wp5Var = (wp5) this.b;
                ry8 ry8Var = (ry8) this.c;
                if (!cj3.C4) {
                    cj3.C4 = true;
                    boolean o = bkb.I.o();
                    boolean z = !o;
                    akb O0 = !o ? bkb.O0("Night") : bkb.O0("Blue");
                    bkb.o = 0;
                    bkb.u1();
                    bkb.A();
                    oy8 oy8Var = wp5Var.w;
                    oy8Var.K(!o ? oy8Var.e[0] - 1 : 0);
                    ry8Var.d();
                    int[] iArr = {(ry8Var.getMeasuredWidth() / 2) + r14, (ry8Var.getMeasuredHeight() / 2) + r14};
                    ry8Var.getLocationInWindow(iArr);
                    int i21 = iArr[0];
                    int i22 = iArr[1];
                    kk7.e().k(kk7.v4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), ry8Var);
                    ry8Var.setContentDescription(k96.M0(!o ? 2131754750 : 2131754749, null));
                    break;
                }
                break;
            case 25:
                cs5 cs5Var = (cs5) this.c;
                go6 go6Var = (go6) this.b;
                cs5Var.u();
                go6Var.run();
                break;
            case 26:
                cs5 cs5Var2 = (cs5) this.c;
                ((og3) this.b).run();
                if (cs5Var2.J) {
                    cs5Var2.u();
                    break;
                }
                break;
            case 27:
                xt5 xt5Var = (xt5) this.b;
                vt5 vt5Var = (vt5) this.c;
                TLRPC.InputPeer h1 = na7.q1(xt5Var.a).h1(k27.B1(xt5Var.w1));
                if (xt5Var.v1 != 2) {
                    xt5Var.y1 = h1;
                } else if (xt5Var.w1 != xt5Var.x1) {
                    vt5Var.a(h1, xt5Var.s1.size() > 1, false, false);
                }
                xt5Var.dismiss();
                break;
            case 28:
                jv5 jv5Var = (jv5) this.b;
                d dVar3 = (d) this.c;
                jv5Var.R.dismiss();
                if (!jv5Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, jv5Var.d0);
                    v51 v51Var = new v51(bundle);
                    v51Var.d = jv5Var.g0;
                    v51Var.Y();
                    dVar3.presentFragment(v51Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i23 = jv5Var.d0;
                    if (i23 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i23 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    cj3 cj3Var3 = new cj3(bundle2);
                    cj3Var3.E2 = new h45(jv5Var, cj3Var3, b2);
                    dVar3.presentFragment(cj3Var3);
                    break;
                }
            default:
                i96[] i96VarArr = (i96[]) this.b;
                xw5[] xw5VarArr = (xw5[]) this.c;
                String str3 = LaunchActivity.C1;
                Integer num = (Integer) view.getTag();
                i96VarArr[0] = ((xw5) view).getCurrentLocale();
                int i24 = 0;
                while (i24 < 2) {
                    xw5VarArr[i24].a.a(i24 == num.intValue(), true);
                    i24++;
                }
                break;
        }
    }

    public /* synthetic */ xf3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
