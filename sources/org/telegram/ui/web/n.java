package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import ci.s9;
import gi.s2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class n extends h41 {
    public j f;
    public final Runnable h;
    public final org.telegram.ui.q n;
    public org.telegram.ui.ActionBar.q0 r;
    public org.telegram.ui.ActionBar.q0 s;
    public String w;
    public NumberTextView x;
    public final j e = new j(null, this.currentAccount, new m(this, 0));
    public final HashSet y = new HashSet();
    public final HashSet E = new HashSet();

    public n(org.telegram.ui.b0 b0Var, org.telegram.ui.q qVar) {
        this.h = b0Var;
        this.n = qVar;
    }

    public static /* synthetic */ void d0(n nVar, HashSet hashSet) {
        hp.s1(nVar.currentAccount).Z(new ArrayList(hashSet), null, null, h10.i(nVar.currentAccount).e(), 0, true, 0);
        nVar.e.b(new ArrayList(hashSet));
        j jVar = nVar.f;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        nVar.y.clear();
        nVar.actionBar.u();
        nVar.a.g3.O(true);
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !k2.p1.z(" ", lowerCase2, lowerCase) && !k2.p1.z(".", lowerCase2, lowerCase)) {
            String O3 = org.telegram.messenger.g0.O3(lowerCase);
            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
            if (!O3.startsWith(O32) && !O3.contains(" ".concat(O32)) && !O3.contains(".".concat(O32))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, f41 f41Var) {
        CharSequence charSequence;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.w);
        j jVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = jVar.a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                zi ziVar = (zi) obj;
                String a10 = l.a(ziVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = h.b;
                    r31 K = r31.K(h.class);
                    K.z = 3;
                    K.q = false;
                    K.H = ziVar;
                    K.L(j0(ziVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!jVar.f) {
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.a;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                zi ziVar2 = (zi) obj2;
                String a11 = l.a(ziVar2);
                if (!TextUtils.isEmpty(a11) && !a11.startsWith("#") && !a11.startsWith("$") && !a11.startsWith("@")) {
                    hashSet.add(a11);
                    String K0 = org.telegram.messenger.g0.K0(a11, true);
                    y1 a12 = z1.b().a(K0);
                    TLRPC.Message message = ziVar2.k;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    String str = (webPage == null || TextUtils.isEmpty(webPage.site_name)) ? (a12 == null || TextUtils.isEmpty(a12.d)) ? null : a12.d : webPage.site_name;
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (k0(K0, this.w) || k0(str, this.w) || k0(str2, this.w)) {
                        String str3 = this.w;
                        int i12 = h.b;
                        r31 K2 = r31.K(h.class);
                        K2.z = 3;
                        K2.q = false;
                        K2.H = ziVar2;
                        K2.m = str3;
                        K2.L(j0(ziVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f.a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                zi ziVar3 = (zi) obj3;
                String a13 = l.a(ziVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.w;
                    int i14 = h.b;
                    r31 K3 = r31.K(h.class);
                    K3.z = 3;
                    K3.q = false;
                    K3.H = ziVar3;
                    K3.m = str4;
                    K3.L(j0(ziVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f.f) {
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(r31.C(charSequence));
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131742949, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
        if (r31Var.H(h.class)) {
            if (this.actionBar.v()) {
                h0(r31Var, view);
                return;
            }
            finishFragment();
            this.n.a(l.a((zi) r31Var.H));
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        if (!r31Var.H(h.class)) {
            return false;
        }
        h0(r31Var, view);
        return true;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = k6.d6;
        r6.i(i3, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i3, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 5, i10, getResourceProvider());
        r6.m(this.actionBar, 3, k6.z8, getResourceProvider());
        r6.m(this.actionBar, 1, i10, getResourceProvider());
        r6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 22));
        org.telegram.ui.ActionBar.x n4 = this.actionBar.n(null);
        NumberTextView numberTextView = new NumberTextView(n4.getContext());
        this.x = numberTextView;
        numberTextView.setTextSize(18);
        this.x.setTypeface(org.telegram.messenger.g0.o());
        this.x.setTextColor(getThemedColor(k6.y8));
        this.x.setOnTouchListener(new fi.a(2));
        n4.addView(this.x, mf.m(1.0f, 0, -1, 65, 0, 0));
        this.s = n4.h(R.id.menu_link, R.drawable.msg_message, org.telegram.messenger.g0.L(54.0f), bd.M0(2131754877, null));
        n4.h(R.id.menu_delete, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), bd.M0(2131751599, null));
        org.telegram.ui.ActionBar.q0 c2 = this.actionBar.q().c(0, R.drawable.outline_header_search, getResourceProvider());
        c2.N();
        c2.I = new s2(this);
        this.r = c2;
        c2.setSearchFieldHint(bd.M0(2131745846, null));
        this.r.setContentDescription(bd.M0(2131745846, null));
        EditTextBoldCursor searchField = this.r.getSearchField();
        r6.V(searchField, i10, getResourceProvider());
        r6.E(searchField, k6.Gj, getResourceProvider());
        r6.w(searchField, i10, getResourceProvider());
        this.a.j(new ji(this, 26));
        zu0 zu0Var = new zu0(context, null, 1, null);
        zu0Var.d.setText(bd.M0(2131742929, null));
        zu0Var.e.setVisibility(8);
        zu0Var.e(false, false);
        zu0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(zu0Var, mf.c(-1.0f, -1));
        this.a.setEmptyView(zu0Var);
        return this.fragmentView;
    }

    public final void h0(r31 r31Var, View view) {
        i iVar = (i) view;
        zi ziVar = (zi) r31Var.H;
        boolean j02 = j0(ziVar);
        HashSet hashSet = this.y;
        if (j02) {
            if (ziVar != null) {
                hashSet.remove(Integer.valueOf(ziVar.f1()));
            }
            iVar.setChecked(false);
        } else {
            if (ziVar != null) {
                hashSet.add(Integer.valueOf(ziVar.f1()));
            }
            iVar.setChecked(true);
        }
        this.x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.u();
        } else {
            this.actionBar.O(null, null);
        }
        org.telegram.messenger.g0.V3(this.s, hashSet.size() == 1, true);
    }

    public final void i0() {
        HashSet hashSet = this.y;
        if (hashSet.size() != 1) {
            return;
        }
        long e10 = h10.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.g0.i3(new s9(e10, intValue, 3), 80L);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(getThemedColor(k6.d6)) > 0.721f;
    }

    public final boolean j0(zi ziVar) {
        if (ziVar != null) {
            return this.y.contains(Integer.valueOf(ziVar.f1()));
        }
        return false;
    }

    public final void l0() {
        int i3;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= this.a.getChildCount()) {
                i3 = 0;
                break;
            }
            View childAt = this.a.getChildAt(i11);
            this.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                i3 = childAt.getTop();
                i10 = R;
                break;
            } else {
                i11++;
                i10 = R;
            }
        }
        this.a.g3.O(true);
        if (i10 >= 0) {
            this.a.f3.h1(i10, i3);
        } else {
            this.a.f3.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.e.a();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.e.c();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(k6.x0(null, k6.d6, false));
            }
            NumberTextView numberTextView = this.x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.r;
            if (q0Var == null || q0Var.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(k6.G6));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
