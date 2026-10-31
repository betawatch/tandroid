package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wh0 extends org.telegram.ui.Components.ha {
    public static wh0 m2;
    public final mg.g2 P1;
    public final mg.f2 Q1;
    public final bi.t0 R1;
    public final mg.e2 S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final HashSet V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final HashMap Y1;
    public final ArrayList Z1;
    public final LinkedHashMap a2;
    public String b2;
    public ng.i c2;
    public int d2;
    public int e2;
    public float f2;
    public mg.d2 g2;
    public final int h2;
    public final vh0 i2;
    public final Boolean j2;
    public final Boolean k2;
    public final m4 l2;

    public wh0(org.telegram.ui.ActionBar.k2 k2Var, int i10, Boolean bool, Boolean bool2, vh0 vh0Var) {
        super(k2Var, true, false, k2Var.getResourceProvider());
        this.T1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.U1 = arrayList;
        HashSet hashSet = new HashSet();
        this.V1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.W1 = arrayList3;
        this.X1 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.Y1 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.Z1 = arrayList4;
        this.a2 = new LinkedHashMap();
        this.d2 = org.telegram.messenger.i0.L(120.0f);
        this.e2 = -1;
        this.l2 = new m4(this, 13);
        this.h2 = i10;
        this.j2 = bool;
        this.k2 = bool2;
        this.i2 = vh0Var;
        this.l1.setTitle(O0());
        mg.e2 e2Var = new mg.e2(1, getContext(), this.I0);
        this.S1 = e2Var;
        e2Var.setOnCloseClickListener(new th0(this, 0));
        e2Var.setText(O0());
        e2Var.setCloseImageVisible(false);
        e2Var.f.c(false, 0.0f);
        this.g2 = new mg.d2(this, 3);
        mg.f2 f2Var = new mg.f2(this, getContext(), this.I0, 1);
        this.Q1 = f2Var;
        int i11 = org.telegram.ui.ActionBar.t6.h5;
        org.telegram.ui.ActionBar.a7.i(i11, f2Var, this.I0);
        f2Var.setOnSearchTextChange(new s3(this, 13));
        f2Var.b.r(org.telegram.messenger.cd.L0(2131745853, null), false);
        bi.t0 t0Var = new bi.t0(this, getContext(), 28);
        this.R1 = t0Var;
        ViewGroup viewGroup = this.b;
        int i12 = this.t0;
        viewGroup.addView(e2Var, 0, w7.b6.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.b;
        int i13 = this.t0;
        viewGroup2.addView(f2Var, w7.b6.f(-2.0f, -1, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.b;
        int i14 = this.t0;
        viewGroup3.addView(t0Var, w7.b6.f(1.0f, -1, 55, i14, 0, i14, 0));
        m10 m10Var = new m10(getContext(), this.I0, (org.telegram.ui.Components.tk0) null);
        m10Var.setClickable(true);
        m10Var.setOrientation(1);
        m10Var.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        org.telegram.ui.ActionBar.a7.i(i11, m10Var, this.I0);
        mg.g2 g2Var = new mg.g2(this, getContext(), this.I0, 1);
        this.P1 = g2Var;
        g2Var.setOnClickListener(new uh0(this, 0));
        m10Var.addView(g2Var, w7.b6.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i15 = this.t0;
        viewGroup4.addView(m10Var, w7.b6.f(-2.0f, -1, 87, i15, 0, i15, 0));
        ng.i iVar = this.c2;
        org.telegram.ui.Components.tk0 tk0Var = this.k1;
        iVar.n = arrayList;
        iVar.f = tk0Var;
        int i16 = this.t0;
        tk0Var.setPadding(i16, 0, i16, org.telegram.messenger.i0.L(60.0f));
        this.k1.j(new h3(this, 21));
        this.k1.setOnItemClickListener(new i2.q(this, i10, 16));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.k1.setItemAnimator(jVar);
        this.k1.i(new mg.u1(this, 7));
        f2Var.setText("");
        f2Var.d.b(false);
        f2Var.b(false, hashSet, new th0(this, 1), null);
        e2Var.setText(O0());
        e1(false);
        arrayList2.addAll(org.telegram.messenger.i5.r(this.a).e0);
        hashMap.putAll(org.telegram.messenger.i5.r(this.a).g0);
        arrayList4.addAll(org.telegram.messenger.i5.r(this.a).h0);
        arrayList3.addAll(org.telegram.messenger.ui.b0(this.a).i1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.ui.b0(this.a).l1);
        }
        g1(false, true);
        O();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        m2 = null;
        org.telegram.messenger.i0.r(this.l2);
    }

    @Override // org.telegram.ui.Components.ha
    public final org.telegram.ui.Components.sk0 L0(org.telegram.ui.Components.tk0 tk0Var) {
        ng.i iVar = new ng.i(getContext(), this.I0, true);
        this.c2 = iVar;
        iVar.s = true;
        return iVar;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        Boolean bool = this.j2;
        if (bool == null || !bool.booleanValue()) {
            return org.telegram.messenger.cd.L0(2131752109, null);
        }
        return org.telegram.messenger.cd.L0(this.h2 > 1 ? 2131752136 : 2131752137, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void R0(Canvas canvas, int i10) {
        float f7 = org.telegram.messenger.i0.m;
        mg.e2 e2Var = this.S1;
        e2Var.setTranslationY(Math.max(i10, (((e2Var.getMeasuredHeight() - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(40.0f)) / 2.0f) + f7) + org.telegram.messenger.i0.L(8.0f));
        float translationY = e2Var.getTranslationY() + e2Var.getMeasuredHeight();
        mg.f2 f2Var = this.Q1;
        f2Var.setTranslationY(translationY);
        float translationY2 = f2Var.getTranslationY() + f2Var.getMeasuredHeight();
        this.R1.setTranslationY(translationY2);
        this.k1.setTranslationY((r2.getMeasuredHeight() + (f2Var.getMeasuredHeight() + e2Var.getMeasuredHeight())) - org.telegram.messenger.i0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void c0(Configuration configuration) {
        f1(false, true);
    }

    public final boolean d1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.j2;
        if (bool != null && org.telegram.messenger.h20.t(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.k2;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        org.telegram.messenger.i0.v1(this.Q1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z10) {
        mg.g2 g2Var = this.P1;
        g2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.V1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.g2, 0, 1, 33);
            Boolean bool = this.j2;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131752109, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(this.h2 > 1 ? 2131752136 : 2131752137, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131749670, null));
        }
        g2Var.c(hashSet.size(), true);
        g2Var.i(spannableStringBuilder, z10, false);
        g2Var.setEnabled(true);
    }

    public final void f1(boolean z10, boolean z11) {
        float f7;
        int i10;
        long j10;
        int i11;
        float f10;
        ng.i iVar;
        ArrayList arrayList = this.T1;
        arrayList.clear();
        ArrayList arrayList2 = this.U1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.b2);
        float f11 = 56.0f;
        HashSet hashSet = this.V1;
        if (isEmpty) {
            ArrayList arrayList3 = this.W1;
            if (arrayList3.isEmpty()) {
                f7 = 32.0f;
                i10 = 0;
            } else {
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                i10 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    int i13 = size;
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (!Z1.self && !Z1.bot && !org.telegram.messenger.h20.A(Z1.id) && !org.telegram.messenger.h20.x(Z1) && d1(Z1)) {
                        i10 += org.telegram.messenger.i0.L(56.0f);
                        arrayList4.add(ng.h.c(Z1, hashSet.contains(Long.valueOf(Z1.id))));
                    }
                    size = i13;
                }
                f7 = 32.0f;
                if (!arrayList4.isEmpty()) {
                    i10 += org.telegram.messenger.i0.L(32.0f);
                    arrayList2.add(ng.h.b(org.telegram.messenger.cd.L0(2131749681, null)));
                    arrayList2.addAll(arrayList4);
                }
            }
            long e = org.telegram.messenger.d20.i(this.a).e();
            Boolean bool = this.j2;
            if (bool == null || !bool.booleanValue()) {
                j10 = e;
            } else {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = org.telegram.messenger.vp.r1(this.a).y;
                int size2 = arrayList6.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList6.get(i14);
                    i14++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj2;
                    long j11 = e;
                    if (dialog.id >= 0) {
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(dialog.id));
                        if (d1(Z12)) {
                            i10 += org.telegram.messenger.i0.L(56.0f);
                            arrayList5.add(ng.h.c(Z12, hashSet.contains(Long.valueOf(Z12.id))));
                        }
                    }
                    e = j11;
                }
                j10 = e;
                if (!arrayList5.isEmpty()) {
                    i10 += org.telegram.messenger.i0.L(f7);
                    arrayList2.add(ng.h.b(org.telegram.messenger.cd.L0(2131745839, null)));
                    arrayList2.addAll(arrayList5);
                }
            }
            ArrayList arrayList7 = this.Z1;
            int size3 = arrayList7.size();
            i11 = i10;
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList7.get(i15);
                i15++;
                String str = (String) obj3;
                ArrayList arrayList8 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.Y1.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f12 = f11;
                        if (tL_contact.user_id == j10) {
                            f10 = f7;
                        } else {
                            f10 = f7;
                            TLRPC.User Z13 = org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(tL_contact.user_id));
                            if (d1(Z13)) {
                                i11 += org.telegram.messenger.i0.L(f12);
                                arrayList8.add(ng.h.c(Z13, hashSet.contains(Long.valueOf(Z13.id))));
                            }
                        }
                        f7 = f10;
                        f11 = f12;
                    }
                    float f13 = f11;
                    float f14 = f7;
                    if (!arrayList8.isEmpty()) {
                        int L = org.telegram.messenger.i0.L(f14) + i11;
                        String upperCase = str.toUpperCase();
                        ng.h hVar = new ng.h(7, false);
                        hVar.g = upperCase;
                        arrayList2.add(hVar);
                        arrayList2.addAll(arrayList8);
                        i11 = L;
                    }
                    f7 = f14;
                    f11 = f13;
                }
            }
        } else {
            ArrayList arrayList9 = this.X1;
            int size4 = arrayList9.size();
            i11 = 0;
            int i16 = 0;
            while (i16 < size4) {
                Object obj4 = arrayList9.get(i16);
                i16++;
                TLRPC.User user = (TLRPC.User) obj4;
                i11 += org.telegram.messenger.i0.L(56.0f);
                arrayList2.add(ng.h.c(user, hashSet.contains(Long.valueOf(user.id))));
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ng.h(5, false));
            i11 += org.telegram.messenger.i0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.i0.q.y * 0.6f)) - i11);
        ng.h hVar2 = new ng.h(-1, false);
        hVar2.l = max;
        arrayList2.add(hVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                ng.i iVar2 = this.c2;
                uh0 uh0Var = new uh0(this, 1);
                org.telegram.ui.Cells.z3 z3Var = iVar2.w;
                if (z3Var != null) {
                    z3Var.a(org.telegram.messenger.cd.L0(2131743656, null), uh0Var);
                }
            } else {
                org.telegram.ui.Cells.z3 z3Var2 = this.c2.w;
                if (z3Var2 != null) {
                    z3Var2.setRightText(null);
                }
            }
        }
        if (!z11 || (iVar = this.c2) == null) {
            return;
        }
        if (z10) {
            iVar.E(arrayList, arrayList2);
        } else {
            iVar.f();
        }
    }

    public final void g1(boolean z10, boolean z11) {
        int R;
        f1(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.tk0 tk0Var = this.k1;
            if (i11 >= tk0Var.getChildCount()) {
                break;
            }
            View childAt = tk0Var.getChildAt(i11);
            if ((childAt instanceof qg.k) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.U1;
                    if (i13 < arrayList.size()) {
                        ng.h hVar = (ng.h) arrayList.get(i13);
                        qg.k kVar = (qg.k) childAt;
                        kVar.c(hVar.k, z10);
                        TLRPC.Chat chat = hVar.e;
                        if (chat != null) {
                            kVar.i(z10, this.c2.F(chat) > 200 ? 0.3f : 1.0f);
                        } else {
                            kVar.i(z10, 1.0f);
                        }
                    }
                }
                i12 = R;
            }
            i11++;
        }
        if (z10) {
            this.c2.k(0, i10);
            ng.i iVar = this.c2;
            iVar.k(i12, iVar.b() - i12);
        }
        e1(z10);
    }
}
