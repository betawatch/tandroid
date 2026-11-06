package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.ua;
import c8.ha;
import fi.u2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.x31;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class l extends n41 {
    public h f;
    public final Runnable h;
    public final org.telegram.ui.q n;
    public org.telegram.ui.ActionBar.r0 r;
    public org.telegram.ui.ActionBar.r0 s;
    public String w;
    public NumberTextView x;
    public final h e = new h(null, this.currentAccount, new k(this, 0));
    public final HashSet y = new HashSet();
    public final HashSet D = new HashSet();

    public l(org.telegram.ui.a0 a0Var, org.telegram.ui.q qVar) {
        this.h = a0Var;
        this.n = qVar;
    }

    public static /* synthetic */ void d0(l lVar, HashSet hashSet) {
        qp.s1(lVar.currentAccount).Z(new ArrayList(hashSet), null, null, p10.i(lVar.currentAccount).e(), 0, true, 0);
        lVar.e.b(new ArrayList(hashSet));
        h hVar = lVar.f;
        if (hVar != null) {
            hVar.b(new ArrayList(hashSet));
        }
        lVar.y.clear();
        lVar.actionBar.u();
        lVar.a.f3.O(true);
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !jg.g.A(" ", lowerCase2, lowerCase) && !jg.g.A(".", lowerCase2, lowerCase)) {
            String O3 = org.telegram.messenger.g0.O3(lowerCase);
            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
            if (!O3.startsWith(O32) && !O3.contains(" ".concat(O32)) && !O3.contains(".".concat(O32))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.n41
    public final void Z(ArrayList arrayList, l41 l41Var) {
        CharSequence charSequence;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.D;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.w);
        h hVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = hVar.a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                ij ijVar = (ij) obj;
                String a10 = j.a(ijVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = f.b;
                    x31 K = x31.K(f.class);
                    K.z = 3;
                    K.q = false;
                    K.H = ijVar;
                    K.L(j0(ijVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!hVar.f) {
                arrayList.add(x31.q(arrayList.size(), 32));
                arrayList.add(x31.q(arrayList.size(), 32));
                arrayList.add(x31.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = hVar.a;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                ij ijVar2 = (ij) obj2;
                String a11 = j.a(ijVar2);
                if (!TextUtils.isEmpty(a11) && !a11.startsWith("#") && !a11.startsWith("$") && !a11.startsWith("@")) {
                    hashSet.add(a11);
                    String K0 = org.telegram.messenger.g0.K0(a11, true);
                    a2 a12 = b2.b().a(K0);
                    TLRPC.Message message = ijVar2.k;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    String str = (webPage == null || TextUtils.isEmpty(webPage.site_name)) ? (a12 == null || TextUtils.isEmpty(a12.d)) ? null : a12.d : webPage.site_name;
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (k0(K0, this.w) || k0(str, this.w) || k0(str2, this.w)) {
                        String str3 = this.w;
                        int i12 = f.b;
                        x31 K2 = x31.K(f.class);
                        K2.z = 3;
                        K2.q = false;
                        K2.H = ijVar2;
                        K2.m = str3;
                        K2.L(j0(ijVar2));
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
                ij ijVar3 = (ij) obj3;
                String a13 = j.a(ijVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.w;
                    int i14 = f.b;
                    x31 K3 = x31.K(f.class);
                    K3.z = 3;
                    K3.q = false;
                    K3.H = ijVar3;
                    K3.m = str4;
                    K3.L(j0(ijVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f.f) {
                arrayList.add(x31.q(arrayList.size(), 32));
                arrayList.add(x31.q(arrayList.size(), 32));
                arrayList.add(x31.q(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(x31.C(charSequence));
    }

    @Override // org.telegram.ui.Components.n41
    public final CharSequence a0() {
        return hd.M0(2131742940, null);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b0(x31 x31Var, View view) {
        if (x31Var.H(f.class)) {
            if (this.actionBar.v()) {
                h0(x31Var, view);
                return;
            }
            finishFragment();
            this.n.a(j.a((ij) x31Var.H));
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c0(x31 x31Var, View view) {
        if (!x31Var.H(f.class)) {
            return false;
        }
        h0(x31Var, view);
        return true;
    }

    @Override // org.telegram.ui.Components.n41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = k6.d6;
        r6.i(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 5, i10, getResourceProvider());
        r6.m(this.actionBar, 3, k6.z8, getResourceProvider());
        r6.m(this.actionBar, 1, i10, getResourceProvider());
        r6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 21));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n(null);
        NumberTextView numberTextView = new NumberTextView(n10.getContext());
        this.x = numberTextView;
        numberTextView.setTextSize(18);
        this.x.setTypeface(org.telegram.messenger.g0.o());
        this.x.setTextColor(getThemedColor(k6.y8));
        this.x.setOnTouchListener(new ei.b(2));
        n10.addView(this.x, ha.m(1.0f, 0, -1, 65, 0, 0));
        this.s = n10.h(R.id.menu_link, R.drawable.msg_message, org.telegram.messenger.g0.L(54.0f), hd.M0(2131754877, null));
        n10.h(R.id.menu_delete, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), hd.M0(2131751599, null));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.q().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.N();
        c10.H = new u2(this);
        this.r = c10;
        c10.setSearchFieldHint(hd.M0(2131745837, null));
        this.r.setContentDescription(hd.M0(2131745837, null));
        EditTextBoldCursor searchField = this.r.getSearchField();
        r6.V(searchField, i10, getResourceProvider());
        r6.E(searchField, k6.Gj, getResourceProvider());
        r6.w(searchField, i10, getResourceProvider());
        this.a.j(new ui(this, 24));
        av0 av0Var = new av0(context, null, 1, null);
        av0Var.d.setText(hd.M0(2131742920, null));
        av0Var.e.setVisibility(8);
        av0Var.e(false, false);
        av0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(av0Var, ha.c(-1.0f, -1));
        this.a.setEmptyView(av0Var);
        return this.fragmentView;
    }

    public final void h0(x31 x31Var, View view) {
        g gVar = (g) view;
        ij ijVar = (ij) x31Var.H;
        boolean j02 = j0(ijVar);
        HashSet hashSet = this.y;
        if (j02) {
            if (ijVar != null) {
                hashSet.remove(Integer.valueOf(ijVar.f1()));
            }
            gVar.setChecked(false);
        } else {
            if (ijVar != null) {
                hashSet.add(Integer.valueOf(ijVar.f1()));
            }
            gVar.setChecked(true);
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
        long e10 = p10.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.g0.i3(new ua(e10, intValue, 3), 80L);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(getThemedColor(k6.d6)) > 0.721f;
    }

    public final boolean j0(ij ijVar) {
        if (ijVar != null) {
            return this.y.contains(Integer.valueOf(ijVar.f1()));
        }
        return false;
    }

    public final void l0() {
        int i7;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= this.a.getChildCount()) {
                i7 = 0;
                break;
            }
            View childAt = this.a.getChildAt(i11);
            this.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                i7 = childAt.getTop();
                i10 = R;
                break;
            } else {
                i11++;
                i10 = R;
            }
        }
        this.a.f3.O(true);
        if (i10 >= 0) {
            this.a.e3.h1(i10, i7);
        } else {
            this.a.e3.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        this.e.a();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.e.c();
    }

    @Override // org.telegram.ui.ActionBar.f2
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
            org.telegram.ui.ActionBar.r0 r0Var = this.r;
            if (r0Var == null || r0Var.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(k6.G6));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
