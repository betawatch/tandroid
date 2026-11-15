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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qg0 extends org.telegram.ui.Components.ja {
    public static qg0 q2;
    public final og0 T1;
    public final ng0 U1;
    public final rv V1;
    public final mg0 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final ArrayList a2;
    public final ArrayList b2;
    public final HashMap c2;
    public final ArrayList d2;
    public final LinkedHashMap e2;
    public String f2;
    public xg.i g2;
    public int h2;
    public int i2;
    public float j2;
    public org.telegram.ui.Components.hp k2;
    public final int l2;
    public final pg0 m2;
    public final Boolean n2;
    public final Boolean o2;
    public final m4 p2;

    public qg0(org.telegram.ui.ActionBar.e2 e2Var, int i7, Boolean bool, Boolean bool2, pg0 pg0Var) {
        super(e2Var, true, false, e2Var.getResourceProvider());
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
        this.m2 = pg0Var;
        this.p1.setTitle(O0());
        mg0 mg0Var = new mg0(0, getContext(), this.J0);
        this.W1 = mg0Var;
        mg0Var.setOnCloseClickListener(new kg0(this, 0));
        mg0Var.setText(O0());
        mg0Var.setCloseImageVisible(false);
        mg0Var.f.c(false, 0.0f);
        this.k2 = new org.telegram.ui.Components.hp(this, 2);
        ng0 ng0Var = new ng0(this, getContext(), this.J0, 0);
        this.U1 = ng0Var;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        org.telegram.ui.ActionBar.q6.h(i10, ng0Var, this.J0);
        ng0Var.setOnSearchTextChange(new r3(this, 14));
        ng0Var.b.r(org.telegram.messenger.hd.M0(2131745836, null), false);
        rv rvVar = new rv(3, getContext(), this);
        this.V1 = rvVar;
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.addView(mg0Var, 0, c8.ja.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.b;
        int i12 = this.u0;
        viewGroup2.addView(ng0Var, c8.ja.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.b;
        int i13 = this.u0;
        viewGroup3.addView(rvVar, c8.ja.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (org.telegram.ui.Components.uj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.q6.h(i10, aVar, this.J0);
        og0 og0Var = new og0(this, getContext(), this.J0, 0);
        this.T1 = og0Var;
        og0Var.setOnClickListener(new lg0(this, 0));
        aVar.addView(og0Var, c8.ja.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i14 = this.u0;
        viewGroup4.addView(aVar, c8.ja.f(-2.0f, -1, 87, i14, 0, i14, 0));
        xg.i iVar = this.g2;
        org.telegram.ui.Components.uj0 uj0Var = this.o1;
        iVar.n = arrayList;
        iVar.f = uj0Var;
        int i15 = this.u0;
        uj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(60.0f));
        this.o1.j(new g3(this, 21));
        this.o1.setOnItemClickListener(new ai.r1(this, i7, 17));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.m = false;
        this.o1.setItemAnimator(kVar);
        this.o1.i(new ai.h0(this, 7));
        ng0Var.setText("");
        ng0Var.d.b(false);
        ng0Var.b(false, hashSet, new kg0(this, 1), null);
        mg0Var.setText(O0());
        e1(false);
        arrayList2.addAll(org.telegram.messenger.g5.r(this.a).f0);
        hashMap.putAll(org.telegram.messenger.g5.r(this.a).h0);
        arrayList4.addAll(org.telegram.messenger.g5.r(this.a).i0);
        arrayList3.addAll(org.telegram.messenger.si.b0(this.a).j1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.si.b0(this.a).m1);
        }
        g1(false, true);
        O();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        q2 = null;
        org.telegram.messenger.g0.r(this.p2);
    }

    @Override // org.telegram.ui.Components.ja
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        xg.i iVar = new xg.i(getContext(), this.J0, true);
        this.g2 = iVar;
        iVar.s = true;
        return iVar;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        Boolean bool = this.n2;
        if (bool == null || !bool.booleanValue()) {
            return org.telegram.messenger.hd.M0(2131752109, null);
        }
        return org.telegram.messenger.hd.M0(this.l2 > 1 ? 2131752136 : 2131752137, null);
    }

    @Override // org.telegram.ui.Components.ja
    public final void R0(Canvas canvas, int i7) {
        float f10 = org.telegram.messenger.g0.m;
        mg0 mg0Var = this.W1;
        mg0Var.setTranslationY(Math.max(i7, (((mg0Var.getMeasuredHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + f10) + org.telegram.messenger.g0.L(8.0f));
        float translationY = mg0Var.getTranslationY() + mg0Var.getMeasuredHeight();
        ng0 ng0Var = this.U1;
        ng0Var.setTranslationY(translationY);
        float translationY2 = ng0Var.getTranslationY() + ng0Var.getMeasuredHeight();
        this.V1.setTranslationY(translationY2);
        this.o1.setTranslationY((r2.getMeasuredHeight() + (ng0Var.getMeasuredHeight() + mg0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void c0(Configuration configuration) {
        f1(false, true);
    }

    public final boolean d1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.n2;
        if (bool != null && org.telegram.messenger.q10.t(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.o2;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z10) {
        og0 og0Var = this.T1;
        og0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Z1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.k2, 0, 1, 33);
            Boolean bool = this.n2;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752109, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(this.l2 > 1 ? 2131752136 : 2131752137, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749661, null));
        }
        og0Var.c(hashSet.size(), true);
        og0Var.i(spannableStringBuilder, z10, false);
        og0Var.setEnabled(true);
    }

    public final void f1(boolean z10, boolean z11) {
        float f10;
        int i7;
        long j3;
        int i10;
        float f11;
        xg.i iVar;
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
                    TLRPC.User a22 = org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (!a22.self && !a22.bot && !org.telegram.messenger.q10.A(a22.id) && !org.telegram.messenger.q10.x(a22) && d1(a22)) {
                        i7 += org.telegram.messenger.g0.L(56.0f);
                        arrayList4.add(xg.h.c(a22, hashSet.contains(Long.valueOf(a22.id))));
                    }
                    size = i12;
                }
                f10 = 32.0f;
                if (!arrayList4.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(32.0f);
                    arrayList2.add(xg.h.b(org.telegram.messenger.hd.M0(2131749672, null)));
                    arrayList2.addAll(arrayList4);
                }
            }
            long e10 = org.telegram.messenger.m10.i(this.a).e();
            Boolean bool = this.n2;
            if (bool == null || !bool.booleanValue()) {
                j3 = e10;
            } else {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = org.telegram.messenger.np.s1(this.a).y;
                int size2 = arrayList6.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj2;
                    long j10 = e10;
                    if (dialog.id >= 0) {
                        TLRPC.User a23 = org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(dialog.id));
                        if (d1(a23)) {
                            i7 += org.telegram.messenger.g0.L(56.0f);
                            arrayList5.add(xg.h.c(a23, hashSet.contains(Long.valueOf(a23.id))));
                        }
                    }
                    e10 = j10;
                }
                j3 = e10;
                if (!arrayList5.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(f10);
                    arrayList2.add(xg.h.b(org.telegram.messenger.hd.M0(2131745822, null)));
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
                            TLRPC.User a24 = org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(tL_contact.user_id));
                            if (d1(a24)) {
                                i10 += org.telegram.messenger.g0.L(f13);
                                arrayList8.add(xg.h.c(a24, hashSet.contains(Long.valueOf(a24.id))));
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
                        xg.h hVar = new xg.h(7, false);
                        hVar.g = upperCase;
                        arrayList2.add(hVar);
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
                arrayList2.add(xg.h.c(user, hashSet.contains(Long.valueOf(user.id))));
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.h(5, false));
            i10 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i10);
        xg.h hVar2 = new xg.h(-1, false);
        hVar2.l = max;
        arrayList2.add(hVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                xg.i iVar2 = this.g2;
                lg0 lg0Var = new lg0(this, 1);
                org.telegram.ui.Cells.x3 x3Var = iVar2.w;
                if (x3Var != null) {
                    x3Var.a(org.telegram.messenger.hd.M0(2131743630, null), lg0Var);
                }
            } else {
                org.telegram.ui.Cells.x3 x3Var2 = this.g2.w;
                if (x3Var2 != null) {
                    x3Var2.setRightText(null);
                }
            }
        }
        if (!z11 || (iVar = this.g2) == null) {
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
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.uj0 uj0Var = this.o1;
            if (i10 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) > 0) {
                if (i7 == -1) {
                    i7 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.Y1;
                    if (i12 < arrayList.size()) {
                        xg.h hVar = (xg.h) arrayList.get(i12);
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(hVar.k, z10);
                        TLRPC.Chat chat = hVar.e;
                        if (chat != null) {
                            rVar.i(z10, this.g2.F(chat) > 200 ? 0.3f : 1.0f);
                        } else {
                            rVar.i(z10, 1.0f);
                        }
                    }
                }
                i11 = R;
            }
            i10++;
        }
        if (z10) {
            this.g2.k(0, i7);
            xg.i iVar = this.g2;
            iVar.k(i11, iVar.b() - i11);
        }
        e1(z10);
    }
}
