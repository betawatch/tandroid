package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r51;
import org.telegram.ui.go0;
import org.telegram.ui.y01;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class m extends r51 {
    public h f;
    public final Runnable h;
    public final org.telegram.ui.p n;
    public org.telegram.ui.ActionBar.t0 r;
    public org.telegram.ui.ActionBar.t0 s;
    public String w;
    public NumberTextView x;
    public final h e = new h(null, this.currentAccount, new k(this, 0));
    public final HashSet y = new HashSet();
    public final HashSet D = new HashSet();

    public m(org.telegram.ui.y yVar, org.telegram.ui.p pVar) {
        this.h = yVar;
        this.n = pVar;
    }

    public static /* synthetic */ void c0(m mVar, HashSet hashSet) {
        vp.r1(mVar.currentAccount).Z(new ArrayList(hashSet), null, null, d20.i(mVar.currentAccount).e(), 0, true, 0);
        mVar.e.b(new ArrayList(hashSet));
        h hVar = mVar.f;
        if (hVar != null) {
            hVar.b(new ArrayList(hashSet));
        }
        mVar.y.clear();
        mVar.actionBar.t();
        mVar.a.f3.O(true);
    }

    public static boolean j0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !sc.e.y(" ", lowerCase2, lowerCase) && !sc.e.y(".", lowerCase2, lowerCase)) {
            String N3 = org.telegram.messenger.i0.N3(lowerCase);
            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
            if (!N3.startsWith(N32) && !N3.contains(" ".concat(N32)) && !N3.contains(".".concat(N32))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.r51
    public final void Y(ArrayList arrayList, p51 p51Var) {
        CharSequence charSequence;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.D;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.w);
        h hVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = hVar.a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                jj jjVar = (jj) obj;
                String a2 = j.a(jjVar);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = f.b;
                    a51 K = a51.K(f.class);
                    K.z = 3;
                    K.q = false;
                    K.H = jjVar;
                    K.L(i0(jjVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!hVar.f) {
                arrayList.add(a51.q(arrayList.size(), 32));
                arrayList.add(a51.q(arrayList.size(), 32));
                arrayList.add(a51.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = hVar.a;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                jj jjVar2 = (jj) obj2;
                String a10 = j.a(jjVar2);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    String K0 = org.telegram.messenger.i0.K0(a10, true);
                    c2 a11 = d2.b().a(K0);
                    TLRPC.Message message = jjVar2.k;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    String str = (webPage == null || TextUtils.isEmpty(webPage.site_name)) ? (a11 == null || TextUtils.isEmpty(a11.d)) ? null : a11.d : webPage.site_name;
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (j0(K0, this.w) || j0(str, this.w) || j0(str2, this.w)) {
                        String str3 = this.w;
                        int i13 = f.b;
                        a51 K2 = a51.K(f.class);
                        K2.z = 3;
                        K2.q = false;
                        K2.H = jjVar2;
                        K2.m = str3;
                        K2.L(i0(jjVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f.a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                jj jjVar3 = (jj) obj3;
                String a12 = j.a(jjVar3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.w;
                    int i15 = f.b;
                    a51 K3 = a51.K(f.class);
                    K3.z = 3;
                    K3.q = false;
                    K3.H = jjVar3;
                    K3.m = str4;
                    K3.L(i0(jjVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f.f) {
                arrayList.add(a51.q(arrayList.size(), 32));
                arrayList.add(a51.q(arrayList.size(), 32));
                arrayList.add(a51.q(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(a51.C(charSequence));
    }

    @Override // org.telegram.ui.Components.r51
    public final CharSequence Z() {
        return cd.L0(2131742965, null);
    }

    @Override // org.telegram.ui.Components.r51
    public final void a0(a51 a51Var, View view) {
        if (a51Var.H(f.class)) {
            if (this.actionBar.u()) {
                g0(a51Var, view);
                return;
            }
            finishFragment();
            this.n.a(j.a((jj) a51Var.H));
        }
    }

    @Override // org.telegram.ui.Components.r51
    public final boolean b0(a51 a51Var, View view) {
        if (!a51Var.H(f.class)) {
            return false;
        }
        g0(a51Var, view);
        return true;
    }

    @Override // org.telegram.ui.Components.r51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = t6.d6;
        a7.i(i10, lVar, getResourceProvider());
        this.actionBar.setActionModeColor(t6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = t6.G6;
        a7.m(lVar2, 5, i11, getResourceProvider());
        a7.m(this.actionBar, 3, t6.z8, getResourceProvider());
        a7.m(this.actionBar, 1, i11, getResourceProvider());
        a7.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 12));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m(null);
        NumberTextView numberTextView = new NumberTextView(m10.getContext());
        this.x = numberTextView;
        numberTextView.setTextSize(18);
        this.x.setTypeface(org.telegram.messenger.i0.o());
        this.x.setTextColor(getThemedColor(t6.y8));
        this.x.setOnTouchListener(new n2(1));
        m10.addView(this.x, b6.m(1.0f, 0, -1, 65, 0, 0));
        this.s = m10.h(R.id.menu_link, R.drawable.msg_message, cd.L0(2131754877, null), org.telegram.messenger.i0.L(54.0f));
        m10.h(R.id.menu_delete, R.drawable.msg_delete, cd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
        org.telegram.ui.ActionBar.t0 c10 = this.actionBar.p().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.N();
        c10.H = new go0(this);
        this.r = c10;
        c10.setSearchFieldHint(cd.L0(2131745853, null));
        this.r.setContentDescription(cd.L0(2131745853, null));
        EditTextBoldCursor searchField = this.r.getSearchField();
        a7.V(searchField, i11, getResourceProvider());
        a7.E(searchField, t6.Gj, getResourceProvider());
        a7.w(searchField, i11, getResourceProvider());
        this.a.j(new bu0(this, 9));
        dw0 dw0Var = new dw0(context, null, 1, null);
        dw0Var.d.setText(cd.L0(2131742945, null));
        dw0Var.e.setVisibility(8);
        dw0Var.e(false, false);
        dw0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(dw0Var, b6.c(-1.0f, -1));
        this.a.setEmptyView(dw0Var);
        return this.fragmentView;
    }

    public final void g0(a51 a51Var, View view) {
        g gVar = (g) view;
        jj jjVar = (jj) a51Var.H;
        boolean i02 = i0(jjVar);
        HashSet hashSet = this.y;
        if (i02) {
            if (jjVar != null) {
                hashSet.remove(Integer.valueOf(jjVar.f1()));
            }
            gVar.setChecked(false);
        } else {
            if (jjVar != null) {
                hashSet.add(Integer.valueOf(jjVar.f1()));
            }
            gVar.setChecked(true);
        }
        this.x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.t();
        } else {
            this.actionBar.O(null, null);
        }
        org.telegram.messenger.i0.U3(this.s, hashSet.size() == 1, true);
    }

    public final void h0() {
        HashSet hashSet = this.y;
        if (hashSet.size() != 1) {
            return;
        }
        long e = d20.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.i0.h3(new l(e, intValue, 0), 80L);
    }

    public final boolean i0(jj jjVar) {
        if (jjVar != null) {
            return this.y.contains(Integer.valueOf(jjVar.f1()));
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.i0.B(getThemedColor(t6.d6)) > 0.721f;
    }

    public final void k0() {
        int i10;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= this.a.getChildCount()) {
                i10 = 0;
                break;
            }
            View childAt = this.a.getChildAt(i12);
            this.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                i10 = childAt.getTop();
                i11 = R;
                break;
            } else {
                i12++;
                i11 = R;
            }
        }
        this.a.f3.O(true);
        if (i11 >= 0) {
            this.a.e3.h1(i11, i10);
        } else {
            this.a.e3.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.e.a();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.e.c();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.setActionModeColor(t6.x0(null, t6.d6, false));
            }
            NumberTextView numberTextView = this.x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(t6.y8));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.r;
            if (t0Var == null || t0Var.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(t6.G6));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
