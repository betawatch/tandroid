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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qg0 extends org.telegram.ui.Components.na {
    public static qg0 m2;
    public final og0 P1;
    public final ng0 Q1;
    public final l00 R1;
    public final mg0 S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final HashSet V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final HashMap Y1;
    public final ArrayList Z1;
    public final LinkedHashMap a2;
    public String b2;
    public xg.i c2;
    public int d2;
    public int e2;
    public float f2;
    public org.telegram.ui.Components.yo g2;
    public final int h2;
    public final pg0 i2;
    public final Boolean j2;
    public final Boolean k2;
    public final m4 l2;

    public qg0(org.telegram.ui.ActionBar.f2 f2Var, int i7, Boolean bool, Boolean bool2, pg0 pg0Var) {
        super(f2Var, true, false, f2Var.getResourceProvider());
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
        this.d2 = org.telegram.messenger.g0.L(120.0f);
        this.e2 = -1;
        this.l2 = new m4(this, 13);
        this.h2 = i7;
        this.j2 = bool;
        this.k2 = bool2;
        this.i2 = pg0Var;
        this.l1.setTitle(O0());
        mg0 mg0Var = new mg0(0, getContext(), this.I0);
        this.S1 = mg0Var;
        mg0Var.setOnCloseClickListener(new kg0(this, 0));
        mg0Var.setText(O0());
        mg0Var.setCloseImageVisible(false);
        mg0Var.f.c(false, 0.0f);
        this.g2 = new org.telegram.ui.Components.yo(this, 2);
        ng0 ng0Var = new ng0(this, getContext(), this.I0, 0);
        this.Q1 = ng0Var;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.r6.i(i10, ng0Var, this.I0);
        ng0Var.setOnSearchTextChange(new r3(this, 14));
        ng0Var.b.r(org.telegram.messenger.hd.M0(2131745837, null), false);
        l00 l00Var = new l00(2, getContext(), this);
        this.R1 = l00Var;
        ViewGroup viewGroup = this.b;
        int i11 = this.t0;
        viewGroup.addView(mg0Var, 0, c8.ha.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.b;
        int i12 = this.t0;
        viewGroup2.addView(ng0Var, c8.ha.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.b;
        int i13 = this.t0;
        viewGroup3.addView(l00Var, c8.ha.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), this.I0, (org.telegram.ui.Components.pj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.r6.i(i10, aVar, this.I0);
        og0 og0Var = new og0(this, getContext(), this.I0, 0);
        this.P1 = og0Var;
        og0Var.setOnClickListener(new lg0(this, 0));
        aVar.addView(og0Var, c8.ha.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i14 = this.t0;
        viewGroup4.addView(aVar, c8.ha.f(-2.0f, -1, 87, i14, 0, i14, 0));
        xg.i iVar = this.c2;
        org.telegram.ui.Components.pj0 pj0Var = this.k1;
        iVar.n = arrayList;
        iVar.f = pj0Var;
        int i15 = this.t0;
        pj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(60.0f));
        this.k1.j(new g3(this, 21));
        this.k1.setOnItemClickListener(new l2.q(this, i7, 14));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.k1.setItemAnimator(kVar);
        this.k1.i(new fi.o1(this, 6));
        ng0Var.setText("");
        ng0Var.d.b(false);
        ng0Var.b(false, hashSet, new kg0(this, 1), null);
        mg0Var.setText(O0());
        e1(false);
        arrayList2.addAll(org.telegram.messenger.g5.r(this.a).e0);
        hashMap.putAll(org.telegram.messenger.g5.r(this.a).g0);
        arrayList4.addAll(org.telegram.messenger.g5.r(this.a).h0);
        arrayList3.addAll(org.telegram.messenger.ui.b0(this.a).i1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.ui.b0(this.a).l1);
        }
        g1(false, true);
        N();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        m2 = null;
        org.telegram.messenger.g0.r(this.l2);
    }

    @Override // org.telegram.ui.Components.na
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        xg.i iVar = new xg.i(getContext(), this.I0, true);
        this.c2 = iVar;
        iVar.s = true;
        return iVar;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        Boolean bool = this.j2;
        if (bool == null || !bool.booleanValue()) {
            return org.telegram.messenger.hd.M0(2131752109, null);
        }
        return org.telegram.messenger.hd.M0(this.h2 > 1 ? 2131752136 : 2131752137, null);
    }

    @Override // org.telegram.ui.Components.na
    public final void R0(Canvas canvas, int i7) {
        float f10 = org.telegram.messenger.g0.m;
        mg0 mg0Var = this.S1;
        mg0Var.setTranslationY(Math.max(i7, (((mg0Var.getMeasuredHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + f10) + org.telegram.messenger.g0.L(8.0f));
        float translationY = mg0Var.getTranslationY() + mg0Var.getMeasuredHeight();
        ng0 ng0Var = this.Q1;
        ng0Var.setTranslationY(translationY);
        float translationY2 = ng0Var.getTranslationY() + ng0Var.getMeasuredHeight();
        this.R1.setTranslationY(translationY2);
        this.k1.setTranslationY((r2.getMeasuredHeight() + (ng0Var.getMeasuredHeight() + mg0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void c0(Configuration configuration) {
        f1(false, true);
    }

    public final boolean d1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.j2;
        if (bool != null && org.telegram.messenger.t10.t(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.k2;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.Q1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z9) {
        og0 og0Var = this.P1;
        og0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.V1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.g2, 0, 1, 33);
            Boolean bool = this.j2;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752109, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(this.h2 > 1 ? 2131752136 : 2131752137, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749660, null));
        }
        og0Var.c(hashSet.size(), true);
        og0Var.i(spannableStringBuilder, z9, false);
        og0Var.setEnabled(true);
    }

    public final void f1(boolean z9, boolean z10) {
        float f10;
        int i7;
        long j3;
        int i10;
        float f11;
        xg.i iVar;
        ArrayList arrayList = this.T1;
        arrayList.clear();
        ArrayList arrayList2 = this.U1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.b2);
        float f12 = 56.0f;
        HashSet hashSet = this.V1;
        if (isEmpty) {
            ArrayList arrayList3 = this.W1;
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
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (!a22.self && !a22.bot && !org.telegram.messenger.t10.A(a22.id) && !org.telegram.messenger.t10.x(a22) && d1(a22)) {
                        i7 += org.telegram.messenger.g0.L(56.0f);
                        arrayList4.add(xg.h.c(a22, hashSet.contains(Long.valueOf(a22.id))));
                    }
                    size = i12;
                }
                f10 = 32.0f;
                if (!arrayList4.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(32.0f);
                    arrayList2.add(xg.h.b(org.telegram.messenger.hd.M0(2131749671, null)));
                    arrayList2.addAll(arrayList4);
                }
            }
            long e10 = org.telegram.messenger.p10.i(this.a).e();
            Boolean bool = this.j2;
            if (bool == null || !bool.booleanValue()) {
                j3 = e10;
            } else {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = org.telegram.messenger.qp.s1(this.a).y;
                int size2 = arrayList6.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj2;
                    long j10 = e10;
                    if (dialog.id >= 0) {
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(dialog.id));
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
                    arrayList2.add(xg.h.b(org.telegram.messenger.hd.M0(2131745823, null)));
                    arrayList2.addAll(arrayList5);
                }
            }
            ArrayList arrayList7 = this.Z1;
            int size3 = arrayList7.size();
            i10 = i7;
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList7.get(i14);
                i14++;
                String str = (String) obj3;
                ArrayList arrayList8 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.Y1.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f12;
                        if (tL_contact.user_id == j3) {
                            f11 = f10;
                        } else {
                            f11 = f10;
                            TLRPC.User a24 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(tL_contact.user_id));
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
            ArrayList arrayList9 = this.X1;
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
                xg.i iVar2 = this.c2;
                lg0 lg0Var = new lg0(this, 1);
                org.telegram.ui.Cells.x3 x3Var = iVar2.w;
                if (x3Var != null) {
                    x3Var.a(org.telegram.messenger.hd.M0(2131743631, null), lg0Var);
                }
            } else {
                org.telegram.ui.Cells.x3 x3Var2 = this.c2.w;
                if (x3Var2 != null) {
                    x3Var2.setRightText(null);
                }
            }
        }
        if (!z10 || (iVar = this.c2) == null) {
            return;
        }
        if (z9) {
            iVar.E(arrayList, arrayList2);
        } else {
            iVar.f();
        }
    }

    public final void g1(boolean z9, boolean z10) {
        int R;
        f1(z9, z10);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.pj0 pj0Var = this.k1;
            if (i10 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) > 0) {
                if (i7 == -1) {
                    i7 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.U1;
                    if (i12 < arrayList.size()) {
                        xg.h hVar = (xg.h) arrayList.get(i12);
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(hVar.k, z9);
                        TLRPC.Chat chat = hVar.e;
                        if (chat != null) {
                            rVar.i(z9, this.c2.F(chat) > 200 ? 0.3f : 1.0f);
                        } else {
                            rVar.i(z9, 1.0f);
                        }
                    }
                }
                i11 = R;
            }
            i10++;
        }
        if (z9) {
            this.c2.k(0, i7);
            xg.i iVar = this.c2;
            iVar.k(i11, iVar.b() - i11);
        }
        e1(z9);
    }
}
