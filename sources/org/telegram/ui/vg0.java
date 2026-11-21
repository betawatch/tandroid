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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class vg0 extends org.telegram.ui.Components.sa {
    public static vg0 q2;
    public final tg0 T1;
    public final sg0 U1;
    public final uv V1;
    public final rg0 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final ArrayList a2;
    public final ArrayList b2;
    public final HashMap c2;
    public final ArrayList d2;
    public final LinkedHashMap e2;
    public String f2;
    public xg.h g2;
    public int h2;
    public int i2;
    public float j2;
    public org.telegram.ui.Components.qp k2;
    public final int l2;
    public final ug0 m2;
    public final Boolean n2;
    public final Boolean o2;
    public final m4 p2;

    public vg0(org.telegram.ui.ActionBar.g2 g2Var, int i7, Boolean bool, Boolean bool2, ug0 ug0Var) {
        super(g2Var, true, false, g2Var.getResourceProvider());
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Z1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.a2 = arrayList3;
        this.b2 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.c2 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.d2 = arrayList4;
        this.e2 = new LinkedHashMap();
        this.h2 = org.telegram.messenger.g0.L(120.0f);
        this.i2 = -1;
        this.p2 = new m4(this, 13);
        this.l2 = i7;
        this.n2 = bool;
        this.o2 = bool2;
        this.m2 = ug0Var;
        this.p1.setTitle(P0());
        rg0 rg0Var = new rg0(0, getContext(), this.J0);
        this.W1 = rg0Var;
        rg0Var.setOnCloseClickListener(new pg0(this, 0));
        rg0Var.setText(P0());
        rg0Var.setCloseImageVisible(false);
        rg0Var.f.c(false, 0.0f);
        this.k2 = new org.telegram.ui.Components.qp(this, 2);
        sg0 sg0Var = new sg0(this, getContext(), this.J0, 0);
        this.U1 = sg0Var;
        int i10 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.t6.h(i10, sg0Var, this.J0);
        sg0Var.setOnSearchTextChange(new r3(this, 15));
        sg0Var.b.r(org.telegram.messenger.gd.N0(2131745640, null), false);
        uv uvVar = new uv(3, getContext(), this);
        this.V1 = uvVar;
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.addView(rg0Var, 0, c8.ma.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.b;
        int i12 = this.u0;
        viewGroup2.addView(sg0Var, c8.ma.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.b;
        int i13 = this.u0;
        viewGroup3.addView(uvVar, c8.ma.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (org.telegram.ui.Components.ek0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.t6.h(i10, aVar, this.J0);
        tg0 tg0Var = new tg0(this, getContext(), this.J0, 0);
        this.T1 = tg0Var;
        tg0Var.setOnClickListener(new qg0(this, 0));
        aVar.addView(tg0Var, c8.ma.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i14 = this.u0;
        viewGroup4.addView(aVar, c8.ma.f(-2.0f, -1, 87, i14, 0, i14, 0));
        xg.h hVar = this.g2;
        org.telegram.ui.Components.ek0 ek0Var = this.o1;
        hVar.n = arrayList;
        hVar.f = ek0Var;
        int i15 = this.u0;
        ek0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(60.0f));
        this.o1.j(new g3(this, 21));
        this.o1.setOnItemClickListener(new ai.u1(this, i7, 17));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.m = false;
        this.o1.setItemAnimator(kVar);
        this.o1.i(new ai.j0(this, 7));
        sg0Var.setText("");
        sg0Var.d.b(false);
        sg0Var.b(false, hashSet, new pg0(this, 1), null);
        rg0Var.setText(P0());
        f1(false);
        arrayList2.addAll(org.telegram.messenger.i5.r(this.a).f0);
        hashMap.putAll(org.telegram.messenger.i5.r(this.a).h0);
        arrayList4.addAll(org.telegram.messenger.i5.r(this.a).i0);
        arrayList3.addAll(org.telegram.messenger.ri.d0(this.a).j1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.ri.d0(this.a).m1);
        }
        h1(false, true);
        O();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        q2 = null;
        org.telegram.messenger.g0.r(this.p2);
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, true);
        this.g2 = hVar;
        hVar.s = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        Boolean bool = this.n2;
        if (bool == null || !bool.booleanValue()) {
            return org.telegram.messenger.gd.N0(2131752097, null);
        }
        return org.telegram.messenger.gd.N0(this.l2 > 1 ? 2131752124 : 2131752125, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final void S0(Canvas canvas, int i7) {
        float f10 = org.telegram.messenger.g0.m;
        rg0 rg0Var = this.W1;
        rg0Var.setTranslationY(Math.max(i7, (((rg0Var.getMeasuredHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + f10) + org.telegram.messenger.g0.L(8.0f));
        float translationY = rg0Var.getTranslationY() + rg0Var.getMeasuredHeight();
        sg0 sg0Var = this.U1;
        sg0Var.setTranslationY(translationY);
        float translationY2 = sg0Var.getTranslationY() + sg0Var.getMeasuredHeight();
        this.V1.setTranslationY(translationY2);
        this.o1.setTranslationY((r2.getMeasuredHeight() + (sg0Var.getMeasuredHeight() + rg0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void c0(Configuration configuration) {
        g1(false, true);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.U1.getEditText());
        super.dismiss();
    }

    public final boolean e1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.n2;
        if (bool != null && org.telegram.messenger.o10.u(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.o2;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    public final void f1(boolean z10) {
        tg0 tg0Var = this.T1;
        tg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Z1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.k2, 0, 1, 33);
            Boolean bool = this.n2;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131752097, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(this.l2 > 1 ? 2131752124 : 2131752125, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131749488, null));
        }
        tg0Var.c(hashSet.size(), true);
        tg0Var.i(spannableStringBuilder, z10, false);
        tg0Var.setEnabled(true);
    }

    public final void g1(boolean z10, boolean z11) {
        float f10;
        int i7;
        long j3;
        int i10;
        float f11;
        xg.h hVar;
        ArrayList arrayList = this.X1;
        arrayList.clear();
        ArrayList arrayList2 = this.Y1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f2);
        float f12 = 56.0f;
        HashSet hashSet = this.Z1;
        if (isEmpty) {
            ArrayList arrayList3 = this.a2;
            if (arrayList3.isEmpty()) {
                f10 = 32.0f;
                i7 = 0;
            } else {
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                i7 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList3.get(i11);
                    i11++;
                    int i12 = size;
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (!c22.self && !c22.bot && !org.telegram.messenger.o10.B(c22.id) && !org.telegram.messenger.o10.y(c22) && e1(c22)) {
                        i7 += org.telegram.messenger.g0.L(56.0f);
                        arrayList4.add(xg.g.c(c22, hashSet.contains(Long.valueOf(c22.id))));
                    }
                    size = i12;
                }
                f10 = 32.0f;
                if (!arrayList4.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(32.0f);
                    arrayList2.add(xg.g.b(org.telegram.messenger.gd.N0(2131749499, null)));
                    arrayList2.addAll(arrayList4);
                }
            }
            long e10 = org.telegram.messenger.j10.i(this.a).e();
            Boolean bool = this.n2;
            if (bool == null || !bool.booleanValue()) {
                j3 = e10;
            } else {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = org.telegram.messenger.mp.u1(this.a).y;
                int size2 = arrayList6.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj2;
                    long j10 = e10;
                    if (dialog.id >= 0) {
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(dialog.id));
                        if (e1(c23)) {
                            i7 += org.telegram.messenger.g0.L(56.0f);
                            arrayList5.add(xg.g.c(c23, hashSet.contains(Long.valueOf(c23.id))));
                        }
                    }
                    e10 = j10;
                }
                j3 = e10;
                if (!arrayList5.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(f10);
                    arrayList2.add(xg.g.b(org.telegram.messenger.gd.N0(2131745626, null)));
                    arrayList2.addAll(arrayList5);
                }
            }
            ArrayList arrayList7 = this.d2;
            int size3 = arrayList7.size();
            i10 = i7;
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList7.get(i14);
                i14++;
                String str = (String) obj3;
                ArrayList arrayList8 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.c2.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f12;
                        if (tL_contact.user_id == j3) {
                            f11 = f10;
                        } else {
                            f11 = f10;
                            TLRPC.User c24 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(tL_contact.user_id));
                            if (e1(c24)) {
                                i10 += org.telegram.messenger.g0.L(f13);
                                arrayList8.add(xg.g.c(c24, hashSet.contains(Long.valueOf(c24.id))));
                            }
                        }
                        f10 = f11;
                        f12 = f13;
                    }
                    float f14 = f12;
                    float f15 = f10;
                    if (!arrayList8.isEmpty()) {
                        int L = org.telegram.messenger.g0.L(f15) + i10;
                        String upperCase = str.toUpperCase();
                        xg.g gVar = new xg.g(7, false);
                        gVar.f = upperCase;
                        arrayList2.add(gVar);
                        arrayList2.addAll(arrayList8);
                        i10 = L;
                    }
                    f10 = f15;
                    f12 = f14;
                }
            }
        } else {
            ArrayList arrayList9 = this.b2;
            int size4 = arrayList9.size();
            i10 = 0;
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList9.get(i15);
                i15++;
                TLRPC.User user = (TLRPC.User) obj4;
                i10 += org.telegram.messenger.g0.L(56.0f);
                arrayList2.add(xg.g.c(user, hashSet.contains(Long.valueOf(user.id))));
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.g(5, false));
            i10 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i10);
        xg.g gVar2 = new xg.g(-1, false);
        gVar2.k = max;
        arrayList2.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                xg.h hVar2 = this.g2;
                qg0 qg0Var = new qg0(this, 1);
                org.telegram.ui.Cells.y3 y3Var = hVar2.w;
                if (y3Var != null) {
                    y3Var.a(org.telegram.messenger.gd.N0(2131743387, null), qg0Var);
                }
            } else {
                org.telegram.ui.Cells.y3 y3Var2 = this.g2.w;
                if (y3Var2 != null) {
                    y3Var2.setRightText(null);
                }
            }
        }
        if (!z11 || (hVar = this.g2) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.f();
        }
    }

    public final void h1(boolean z10, boolean z11) {
        int R;
        g1(z10, z11);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.ek0 ek0Var = this.o1;
            if (i10 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) > 0) {
                if (i7 == -1) {
                    i7 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.Y1;
                    if (i12 < arrayList.size()) {
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(((xg.g) arrayList.get(i12)).j, z10);
                        rVar.i(z10, 1.0f);
                    }
                }
                i11 = R;
            }
            i10++;
        }
        if (z10) {
            this.g2.k(0, i7);
            xg.h hVar = this.g2;
            hVar.k(i11, hVar.b() - i11);
        }
        f1(z10);
    }
}
