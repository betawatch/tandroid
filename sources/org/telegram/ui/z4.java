package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z4 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i10;
        boolean z10;
        boolean z11;
        s31 s31Var = (s31) this.b;
        ArrayList arrayList = (ArrayList) obj;
        r31 r31Var = s31Var.Y1;
        r31 r31Var2 = s31Var.X1;
        TLRPC.User user = s31Var.Q1;
        r31 r31Var3 = s31Var.W1;
        if (r31Var3 != null) {
            ArrayList arrayList2 = r31Var3.d;
            if (r31Var2 == null) {
                return;
            }
            ArrayList arrayList3 = r31Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(org.telegram.messenger.d20.i(s31Var.a).e()));
            arrayList.add(org.telegram.ui.Components.a51.E(3, org.telegram.messenger.i0.L(64.0f)));
            if (r31Var != null && !TextUtils.isEmpty(r31Var.c.q)) {
                ArrayList arrayList4 = r31Var.d;
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(tLObject)))) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject)));
                        org.telegram.ui.Components.a51 w9 = org.telegram.ui.Components.a51.w(tLObject);
                        w9.L(org.telegram.messenger.o5.d(tLObject) == org.telegram.messenger.o5.d(s31Var.S1));
                        arrayList.add(w9);
                    }
                }
                if (r31Var.f) {
                    arrayList.add(org.telegram.ui.Components.a51.p(29));
                    arrayList.add(org.telegram.ui.Components.a51.p(29));
                    arrayList.add(org.telegram.ui.Components.a51.p(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.a51.k(s31Var.V1));
                    return;
                }
                return;
            }
            if (user != null) {
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    if (org.telegram.messenger.o5.d((TLObject) obj4) == org.telegram.messenger.o5.d(user)) {
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(user)))) {
                            arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(s31Var.P1) ? 2131752516 : 2131749508, null)));
                            hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(user)));
                            org.telegram.ui.Components.a51 w10 = org.telegram.ui.Components.a51.w(user);
                            i10 = 29;
                            w10.L(org.telegram.messenger.o5.d(user) == org.telegram.messenger.o5.d(s31Var.S1));
                            arrayList.add(w10);
                            z10 = false;
                        }
                    }
                }
            }
            i10 = 29;
            z10 = true;
            int size3 = arrayList2.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj5 = arrayList2.get(i13);
                i13++;
                TLObject tLObject2 = (TLObject) obj5;
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(s31Var.P1) ? 2131752516 : 2131749508, null)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject2)));
                    org.telegram.ui.Components.a51 w11 = org.telegram.ui.Components.a51.w(tLObject2);
                    w11.L(org.telegram.messenger.o5.d(tLObject2) == org.telegram.messenger.o5.d(s31Var.S1));
                    arrayList.add(w11);
                }
            }
            if (r31Var3.f) {
                arrayList.add(org.telegram.ui.Components.a51.p(i10));
                arrayList.add(org.telegram.ui.Components.a51.p(i10));
                arrayList.add(org.telegram.ui.Components.a51.p(i10));
            }
            if (user == null || hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(s31Var.P1) ? 2131752288 : 2131749437, null)));
                hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(user)));
                org.telegram.ui.Components.a51 w12 = org.telegram.ui.Components.a51.w(user);
                w12.L(org.telegram.messenger.o5.d(user) == org.telegram.messenger.o5.d(s31Var.S1));
                arrayList.add(w12);
                z11 = false;
            }
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj6 = arrayList3.get(i14);
                i14++;
                TLObject tLObject3 = (TLObject) obj6;
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(tLObject3)))) {
                    if (z11) {
                        arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(s31Var.P1) ? 2131752288 : 2131749437, null)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject3)));
                    org.telegram.ui.Components.a51 w13 = org.telegram.ui.Components.a51.w(tLObject3);
                    w13.L(org.telegram.messenger.o5.d(tLObject3) == org.telegram.messenger.o5.d(s31Var.S1));
                    arrayList.add(w13);
                }
            }
            if (arrayList3.isEmpty() || !r31Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.a51.p(i10));
            arrayList.add(org.telegram.ui.Components.a51.p(i10));
            arrayList.add(org.telegram.ui.Components.a51.p(i10));
        }
    }

    private final void c(Object obj, Object obj2) {
        m51 m51Var = (m51) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LinearLayout linearLayout = m51Var.Q1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.a51.k(linearLayout));
        }
        LinearLayout linearLayout2 = m51Var.R1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.a51.k(linearLayout2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat L0;
        g61 g61Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TL_stories.StoryItem storyItem;
        char c10 = 1;
        char c11 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                a5 a5Var = (a5) this.b;
                a5Var.w.setBackground(new BitmapDrawable((Bitmap) obj));
                a5Var.x = false;
                hi.b bVar = a5Var.h;
                bVar.a((Bitmap) obj2);
                yg.d.c(bVar, a5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = a5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                j9 j9Var = (j9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = j9Var.G.isEmpty();
                ArrayList arrayList2 = j9Var.y;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.a51 c12 = org.telegram.ui.Components.a51.c(1, R.drawable.menu_call_create, org.telegram.messenger.cd.L0(2131749499, null));
                    c12.q = true;
                    arrayList.add(c12);
                    if (!j9Var.getUserConfig().W) {
                        org.telegram.ui.Components.a51 c13 = org.telegram.ui.Components.a51.c(2, R.drawable.menu_add_tab_24, org.telegram.messenger.cd.L0(2131749470, null));
                        c13.q = true;
                        arrayList.add(c13);
                    }
                    arrayList.add(org.telegram.ui.Components.a51.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = j9Var.G;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (L0 = j9Var.getMessagesController().L0(l4)) != null) {
                            k8 k8Var = new k8(j9Var, i10);
                            int i12 = h9.b;
                            org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(h9.class);
                            K.G = L0;
                            K.D = k8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.a51.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj4 = arrayList2.get(i10);
                        i10++;
                        g9 g9Var = (g9) obj4;
                        ag.t0 t0Var = new ag.t0(28, j9Var, g9Var);
                        int i13 = e9.b;
                        org.telegram.ui.Components.a51 K2 = org.telegram.ui.Components.a51.K(e9.class);
                        K2.G = g9Var;
                        K2.D = t0Var;
                        K2.L(j9Var.j0(g9Var.c));
                        arrayList.add(K2);
                    }
                    if (!j9Var.F) {
                        arrayList.add(org.telegram.ui.Components.a51.q(-1, 8));
                        arrayList.add(org.telegram.ui.Components.a51.q(-2, 8));
                        arrayList.add(org.telegram.ui.Components.a51.q(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                le leVar = (le) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                leVar.R0 = -1;
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(leVar.o0).L0(Long.valueOf(-leVar.p0));
                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(leVar.o0).M0(-leVar.p0);
                int i14 = M0 != null ? M0.stats_dc : -1;
                if (leVar.b1) {
                    arrayList4.add(org.telegram.ui.Components.a51.g(leVar.s0));
                    g61 g61Var2 = leVar.l1;
                    if (g61Var2 != null && !g61Var2.l) {
                        arrayList4.add(org.telegram.ui.Components.a51.h(5, i14, g61Var2));
                        arrayList4.add(org.telegram.ui.Components.a51.B(-1, null));
                    }
                    g61 g61Var3 = leVar.m1;
                    if (g61Var3 != null && !g61Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.a51.h(2, i14, g61Var3));
                        arrayList4.add(org.telegram.ui.Components.a51.B(-2, null));
                    }
                }
                if (leVar.c1 && (g61Var = leVar.n1) != null && !g61Var.l) {
                    arrayList4.add(org.telegram.ui.Components.a51.h(2, i14, g61Var));
                    arrayList4.add(org.telegram.ui.Components.a51.B(-3, null));
                }
                if (leVar.o1) {
                    arrayList4.add(org.telegram.ui.Components.a51.b(org.telegram.messenger.cd.L0(2131748400, null)));
                    arrayList4.add(org.telegram.ui.Components.a51.v(leVar.p1));
                    arrayList4.add(org.telegram.ui.Components.a51.v(leVar.q1));
                    arrayList4.add(org.telegram.ui.Components.a51.v(leVar.r1));
                    arrayList4.add(org.telegram.ui.Components.a51.B(-4, leVar.u0));
                }
                if (L02 != null && L02.creator) {
                    if (leVar.b1) {
                        arrayList4.add(org.telegram.ui.Components.a51.b(org.telegram.messenger.cd.L0(2131748421, null)));
                        arrayList4.add(org.telegram.ui.Components.a51.k(leVar.w0));
                        arrayList4.add(org.telegram.ui.Components.a51.B(-5, leVar.t0));
                        int i15 = org.telegram.messenger.vp.r1(leVar.o0).A4;
                        String L03 = org.telegram.messenger.cd.L0(2131748380, null);
                        int i16 = leVar.r0 < i15 ? i15 : 0;
                        if (i16 > 0) {
                            Context context = org.telegram.messenger.w0.b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(0, new org.telegram.ui.ActionBar.y2(i16, context, null, false));
                            dqVar.s = org.telegram.messenger.i0.L(1.0f);
                            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            L03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.a51 i17 = org.telegram.ui.Components.a51.i(1, L03);
                        i17.L(leVar.r0 >= i15 && leVar.j1);
                        arrayList4.add(i17);
                        arrayList4.add(org.telegram.ui.Components.a51.B(-8, org.telegram.messenger.cd.L0(2131748379, null)));
                    }
                    if (leVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.a51.b(org.telegram.messenger.cd.L0(2131748388, null)));
                        arrayList4.add(org.telegram.ui.Components.a51.j(3, leVar.C0));
                        arrayList4.add(org.telegram.ui.Components.a51.B(-6, leVar.v0));
                    }
                }
                if (org.telegram.messenger.w3.V(org.telegram.messenger.vp.r1(leVar.o0).L0(Long.valueOf(-leVar.p0))) && org.telegram.messenger.vp.r1(leVar.o0).h6) {
                    arrayList4.add(xh.e.i(4, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ik, leVar.n0), oo.h0(org.telegram.messenger.cd.L0(2131752474, null)), org.telegram.messenger.cd.L0(2131752475, null)));
                    arrayList4.add(org.telegram.ui.Components.a51.B(-7, null));
                }
                if (leVar.a1.a()) {
                    leVar.R0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.a51.n(leVar.T0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.a51.B(-10, null));
                    break;
                }
                break;
            case 3:
                fe feVar = (fe) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                he heVar = feVar.f;
                int i18 = feVar.d;
                int i19 = he.y;
                ArrayList arrayList6 = i18 == 0 ? heVar.r : heVar.n;
                int size3 = arrayList6.size();
                while (i10 < size3) {
                    Object obj5 = arrayList6.get(i10);
                    i10++;
                    int i20 = rh.b8.b;
                    org.telegram.ui.Components.a51 K3 = org.telegram.ui.Components.a51.K(rh.b8.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.q = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i18 == 0 ? heVar.s : heVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.a51.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.a51.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.a51.q(arrayList5.size(), 7));
                    break;
                }
                break;
            case 4:
                oo ooVar = (oo) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ooVar.getClass();
                    org.telegram.ui.Components.cc.a0(ooVar).f0(tL_error, false);
                }
                org.telegram.messenger.i0.E2(ooVar.j0);
                org.telegram.messenger.i0.E2(ooVar.g0);
                org.telegram.messenger.i0.E2(ooVar.i0);
                break;
            case 5:
                org.telegram.messenger.i0.h3(new jq((pr) this.b, c10 == true ? 1 : 0), 1000L);
                break;
            case 6:
                ((m4.c) this.b).X(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                ns nsVar = (ns) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
                arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.V));
                arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.b));
                arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.c));
                if (TextUtils.isEmpty(nsVar.f0())) {
                    arrayList7.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748424, null)), org.telegram.messenger.h20.j(Z1, true), "%1$s")));
                } else if (nsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("MobileVisibleInfo", null, 2131748423, org.telegram.messenger.h20.j(Z1, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.a51.C(null));
                }
                if (nsVar.I && nsVar.K) {
                    org.telegram.ui.Components.a51 i21 = org.telegram.ui.Components.a51.i(2, org.telegram.messenger.cd.L0(2131754447, null));
                    i21.L(nsVar.X);
                    arrayList7.add(i21);
                    arrayList7.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.a0(null, null, 2131754446, org.telegram.messenger.h20.j(Z1, true))));
                }
                arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.d));
                arrayList7.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131754394, null)));
                if (!nsVar.I) {
                    TLRPC.UserFull a2 = nsVar.getMessagesController().a2(nsVar.H);
                    if (a2 != null && a2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.y));
                    arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.D));
                    if (Z1 != null && (userProfilePhoto = Z1.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.E));
                    }
                    arrayList7.add(org.telegram.ui.Components.a51.C(null));
                    org.telegram.ui.Components.a51 e = org.telegram.ui.Components.a51.e(1, org.telegram.messenger.cd.L0(2131751553, null));
                    e.r = true;
                    arrayList7.add(e);
                }
                arrayList7.add(org.telegram.ui.Components.a51.C(null));
                if (nsVar.Y) {
                    org.telegram.messenger.i0.g3(new fs(nsVar, Z1, i10));
                    nsVar.Y = false;
                    org.telegram.messenger.i0.h3(new ds(nsVar, c11 == true ? 1 : 0), 200L);
                    break;
                }
                break;
            case 8:
                lt.a((lt) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                gt gtVar = (gt) this.b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj2;
                lt ltVar = gtVar.a;
                jt jtVar = ltVar.l;
                if (jtVar != null) {
                    jtVar.N(charSequence, TextUtils.join("", ltVar.o), q20Var != null ? new org.telegram.ui.Components.vg(15, gtVar, q20Var) : null);
                    if (q20Var == null) {
                        ltVar.o();
                        break;
                    }
                }
                break;
            case 10:
                ut utVar = (ut) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(org.telegram.ui.Components.a51.k(utVar.P1));
                arrayList8.add(org.telegram.ui.Components.a51.C(null));
                ArrayList arrayList9 = utVar.S1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131749498, null)));
                    while (i10 < arrayList9.size()) {
                        Long l10 = (Long) arrayList9.get(i10);
                        l10.getClass();
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(utVar.a).Z1(l10);
                        if (Z12 == null) {
                            break;
                        } else {
                            int i22 = qg.j.b;
                            org.telegram.ui.Components.a51 K4 = org.telegram.ui.Components.a51.K(qg.j.class);
                            K4.G = Z12;
                            K4.L(utVar.T1.contains(l10));
                            arrayList8.add(K4);
                            i10++;
                        }
                    }
                    break;
                }
                break;
            case 11:
                ay ayVar = (ay) this.b;
                ayVar.P1 = (Long) obj;
                ayVar.f5();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                qy qyVar = (qy) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String L04 = org.telegram.messenger.cd.L0(2131744014, null);
                org.telegram.ui.Components.a51 a51Var = new org.telegram.ui.Components.a51(2);
                a51Var.l = L04;
                a51Var.k = R.raw.topics_top;
                arrayList10.add(a51Var);
                org.telegram.ui.Components.a51 i23 = org.telegram.ui.Components.a51.i(1, org.telegram.messenger.cd.L0(2131744015, null));
                i23.L(qyVar.c);
                arrayList10.add(i23);
                if (qyVar.c) {
                    arrayList10.add(org.telegram.ui.Components.a51.C(null));
                    arrayList10.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131744013, null)));
                    s3 s3Var = new s3(qyVar, 6);
                    int i24 = oy.b;
                    org.telegram.ui.Components.a51 K5 = org.telegram.ui.Components.a51.K(oy.class);
                    K5.d = 2;
                    K5.G = s3Var;
                    K5.z = qyVar.e ? 2 : qyVar.d ? 0 : 1;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131744012, null)));
                    break;
                }
                break;
            case 14:
                ua0 ua0Var = (ua0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ua0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.vp.r1(ua0Var.b).V3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.m5.n(null, 2131754974, ua0.d(), R.raw.error, 36);
                        break;
                    } else {
                        ua0.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                kt0 kt0Var = (kt0) this.b;
                hi.b bVar2 = kt0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                kt0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                kt0Var.x = paint;
                Bitmap bitmap2 = kt0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                kt0Var.w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix, org.telegram.ui.ActionBar.t6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.i0.h(colorMatrix, org.telegram.ui.ActionBar.t6.I.q() ? -0.02f : -0.04f);
                kt0Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                kt0Var.y = new Matrix();
                bVar2.a(bitmap);
                yg.d.c(bVar2, kt0Var.c);
                kt0Var.G.d();
                break;
            case 16:
                rt0 rt0Var = (rt0) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                String L05 = org.telegram.messenger.cd.L0(2131754276, null);
                org.telegram.ui.Components.a51 a51Var2 = new org.telegram.ui.Components.a51(2);
                a51Var2.l = L05;
                a51Var2.k = R.raw.bubble;
                arrayList11.add(a51Var2);
                org.telegram.ui.Components.a51 i25 = org.telegram.ui.Components.a51.i(1, org.telegram.messenger.cd.L0(2131754277, null));
                i25.L(rt0Var.n);
                arrayList11.add(i25);
                arrayList11.add(org.telegram.ui.Components.a51.B(2, null));
                if (rt0Var.n) {
                    arrayList11.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131746890, null)));
                    int[] a10 = org.telegram.ui.Cells.x7.a(new int[]{0, 10, 50, 100, org.telegram.messenger.zs.e3, org.telegram.messenger.zs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) rt0Var.getMessagesController().J6);
                    org.telegram.ui.Components.z11 z11Var = new org.telegram.ui.Components.z11(22);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a10;
                    w7Var.d = 20;
                    w7Var.e = z11Var;
                    rt0Var.b.d((int) Utilities.k(rt0Var.r, 10000L, 0L), w7Var, new s3(rt0Var, 19));
                    arrayList11.add(org.telegram.ui.Components.a51.j(3, rt0Var.b));
                    arrayList11.add(org.telegram.ui.Components.a51.B(4, rt0Var.r > 0 ? rt0Var.a0() : null));
                    TLRPC.Chat L06 = rt0Var.getMessagesController().L0(Long.valueOf(rt0Var.a));
                    if (L06 != null && !TextUtils.isEmpty(org.telegram.messenger.w3.K(L06, false))) {
                        rt0Var.c.setLink(rt0Var.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(L06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.a51.j(5, rt0Var.c));
                        break;
                    }
                }
                break;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.E0(true);
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                hi.b bVar3 = profileActivity.I6;
                bVar3.a((Bitmap) obj2);
                yg.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.J6.d();
                break;
            case 19:
                b01 b01Var = (b01) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.u51 u51Var = b01Var.f;
                c01 c01Var = b01Var.w;
                ArrayList arrayList13 = c01Var.o1;
                jg.b1 b1Var = b01Var.h;
                if (b1Var.getMeasuredHeight() <= 0) {
                    b1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.a51 D = org.telegram.ui.Components.a51.D(b1Var.getMeasuredHeight());
                D.d = -1;
                D.s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((b1Var.getMeasuredHeight() / org.telegram.messenger.i0.p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b01Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || b01Var.c != null || b01Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || b01Var.c != null) {
                        Context context2 = b01Var.getContext();
                        int i26 = org.telegram.ui.ActionBar.t6.L6;
                        int i27 = c01.s1;
                        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context2, i26, 21, 0, 0, false, false, c01Var.I0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = b01Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            p4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b01Var.c;
                            if (tL_reportResultChooseOption != null) {
                                p4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, p4Var, c01Var.I0);
                        org.telegram.ui.Components.a51 k10 = org.telegram.ui.Components.a51.k(p4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (b01Var.b != null) {
                        for (int i28 = 0; i28 < b01Var.b.options.size(); i28++) {
                            org.telegram.ui.Components.a51 a51Var3 = new org.telegram.ui.Components.a51(30);
                            a51Var3.l = b01Var.b.options.get(i28).text;
                            a51Var3.k = R.drawable.msg_arrowright;
                            a51Var3.d = i28;
                            arrayList12.add(a51Var3);
                            measuredHeight += 50;
                        }
                    } else if (b01Var.c != null) {
                        for (int i29 = 0; i29 < b01Var.c.options.size(); i29++) {
                            org.telegram.ui.Components.a51 a51Var4 = new org.telegram.ui.Components.a51(30);
                            a51Var4.l = b01Var.c.options.get(i29).text;
                            a51Var4.k = R.drawable.msg_arrowright;
                            a51Var4.d = i29;
                            arrayList12.add(a51Var4);
                            measuredHeight += 50;
                        }
                    } else if (b01Var.d != null) {
                        if (b01Var.n == null) {
                            Context context3 = b01Var.getContext();
                            int i30 = c01.s1;
                            zz0 zz0Var = new zz0(b01Var, context3, c01Var.I0);
                            b01Var.n = zz0Var;
                            zz0Var.setShowLimitWhenNear(100);
                        }
                        b01Var.n.d.setHint(org.telegram.messenger.cd.L0(b01Var.d.optional ? 2131746253 : 2131746259, null));
                        org.telegram.ui.Components.a51 k11 = org.telegram.ui.Components.a51.k(b01Var.n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j10 = c01Var.q1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            arrayList12.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(arrayList13.size() > 1 ? 2131746255 : 2131746258, null)));
                        } else if (org.telegram.messenger.o5.E(j10)) {
                            arrayList12.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131746254, null)));
                        } else if (org.telegram.messenger.w3.V(org.telegram.messenger.vp.r1(c01Var.a).L0(Long.valueOf(-j10)))) {
                            arrayList12.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131746257, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131746256, null)));
                        }
                        if (b01Var.r == null) {
                            vh.d dVar = new vh.d(b01Var.getContext(), c01Var.I0, true);
                            b01Var.s = dVar;
                            dVar.i(org.telegram.messenger.cd.L0(2131746252, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(b01Var.getContext());
                            b01Var.r = frameLayout;
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, frameLayout, c01Var.I0);
                            b01Var.r.addView(b01Var.s, w7.b6.d(-1, 48.0f, org.telegram.messenger.zs.E1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(b01Var.getContext());
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, c01Var.I0);
                            b01Var.r.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.p, 48));
                        }
                        b01Var.s.setEnabled(b01Var.d.optional || !TextUtils.isEmpty(b01Var.n.getText()));
                        b01Var.s.setOnClickListener(new f50(b01Var, 29));
                        org.telegram.ui.Components.a51 k12 = org.telegram.ui.Components.a51.k(b01Var.r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += org.telegram.messenger.zs.x1;
                    }
                    ((org.telegram.ui.Components.a51) i0.a.g(1, arrayList12)).j = true;
                    if (c01Var.l1 && b01Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(b01Var.getContext());
                        Drawable mutate = b01Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.a7.y(frameLayout2, mutate, org.telegram.ui.ActionBar.t6.b7, c01Var.I0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.a7.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.t6.a7, c01Var.I0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(colorDrawable, mutate, 0, 0);
                        eqVar.x = true;
                        frameLayout2.setBackground(eqVar);
                        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(b01Var.getContext(), null);
                        p80Var.setTextSize(1, 14.0f);
                        p80Var.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.L0(2131746250, null), c01Var.I0, null));
                        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.A6, c01Var.I0);
                        p80Var.setGravity(17);
                        frameLayout2.addView(p80Var, w7.b6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.a51 k13 = org.telegram.ui.Components.a51.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (u51Var != null) {
                    int i31 = c01.s1;
                    if (c01Var.b.getMeasuredHeight() - org.telegram.messenger.i0.m < org.telegram.messenger.i0.L(measuredHeight)) {
                        u51Var.e3.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList12);
                        u51Var.e3.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.a51.k(((g01) this.b).P1));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.a51.k(((org.telegram.ui.Components.e30) this.b).Q1));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                b(obj, obj2);
                break;
            case 24:
                r31 r31Var = (r31) this.b;
                ArrayList arrayList14 = r31Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i32 = r31Var.a;
                ArrayList arrayList15 = r31Var.d;
                if (tL_error3 != null) {
                    if (r31Var.r) {
                        arrayList15.clear();
                        r31Var.r = false;
                    }
                    r31Var.h = true;
                    r31Var.f = false;
                    int size4 = arrayList14.size();
                    while (i10 < size4) {
                        Object obj6 = arrayList14.get(i10);
                        i10++;
                        ((Runnable) obj6).run();
                    }
                    break;
                } else {
                    org.telegram.messenger.vp.r1(i32).V3(channels_channelparticipants.users, false);
                    org.telegram.messenger.vp.r1(i32).P3(channels_channelparticipants.chats, false);
                    if (r31Var.r) {
                        arrayList15.clear();
                        r31Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                    int size5 = arrayList16.size();
                    int i33 = 0;
                    while (i33 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i33);
                        i33++;
                        TLObject d22 = org.telegram.messenger.vp.r1(i32).d2(org.telegram.messenger.o5.o(channelParticipant.peer));
                        if (d22 != null) {
                            arrayList15.add(d22);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        r31Var.h = true;
                    }
                    r31Var.f = false;
                    int size6 = arrayList14.size();
                    while (i10 < size6) {
                        Object obj7 = arrayList14.get(i10);
                        i10++;
                        ((Runnable) obj7).run();
                    }
                    break;
                }
            case 25:
                t31 t31Var = (t31) this.b;
                ArrayList arrayList17 = (ArrayList) obj;
                int i34 = t31Var.T1;
                th.x4 x4Var = t31Var.R1;
                if (x4Var != null) {
                    arrayList17.add(org.telegram.ui.Components.a51.D(org.telegram.messenger.i0.L(16.0f)));
                    ArrayList arrayList18 = x4Var.i;
                    int size7 = arrayList18.size();
                    int i35 = i34;
                    int i36 = 0;
                    while (i36 < size7) {
                        Object obj8 = arrayList18.get(i36);
                        i36++;
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj8;
                        int i37 = b71.c;
                        org.telegram.ui.Components.a51 K6 = org.telegram.ui.Components.a51.K(b71.class);
                        K6.u = 1;
                        K6.z = 0;
                        K6.G = jjVar;
                        K6.B = (jjVar == null || (storyItem = jjVar.l) == null) ? -1L : storyItem.id;
                        K6.f = true;
                        K6.v = i34;
                        K6.L(t31Var.S1.containsKey(Integer.valueOf(jjVar.f1())));
                        K6.u = 1;
                        arrayList17.add(K6);
                        i35--;
                        if (i35 == 0) {
                            i35 = i34;
                        }
                    }
                    if (x4Var.k() || !x4Var.r) {
                        while (true) {
                            if (i10 < (i35 <= 0 ? i34 : i35)) {
                                i10++;
                                org.telegram.ui.Components.a51 q6 = org.telegram.ui.Components.a51.q(i10, 34);
                                q6.u = 1;
                                arrayList17.add(q6);
                            }
                        }
                    }
                    arrayList17.add(org.telegram.ui.Components.a51.D(org.telegram.messenger.i0.L(68.0f)));
                    break;
                }
                break;
            case 26:
                e51.e0((e51) this.b, (ArrayList) obj);
                break;
            case 27:
                c(obj, obj2);
                break;
            default:
                x91 x91Var = (x91) this.b;
                hi.b bVar4 = x91Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                x91Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                x91Var.w = paint2;
                Bitmap bitmap4 = x91Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                x91Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix2, org.telegram.ui.ActionBar.t6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.i0.h(colorMatrix2, org.telegram.ui.ActionBar.t6.I.q() ? -0.02f : -0.04f);
                x91Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                x91Var.x = new Matrix();
                bVar4.a(bitmap3);
                yg.d.c(bVar4, x91Var.b);
                x91Var.F.d();
                break;
        }
    }
}
