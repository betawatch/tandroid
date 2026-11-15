package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ja;
import di.j9;
import hi.s2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ri;
import org.telegram.ui.ct0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class m extends r41 {
    public i f;
    public final Runnable h;
    public final org.telegram.ui.q n;
    public org.telegram.ui.ActionBar.q0 r;
    public org.telegram.ui.ActionBar.q0 s;
    public String w;
    public NumberTextView x;
    public final i e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet y = new HashSet();
    public final HashSet E = new HashSet();

    public m(org.telegram.ui.z zVar, org.telegram.ui.q qVar) {
        this.h = zVar;
        this.n = qVar;
    }

    public static /* synthetic */ void d0(m mVar, HashSet hashSet) {
        np.s1(mVar.currentAccount).Z(new ArrayList(hashSet), null, null, m10.i(mVar.currentAccount).e(), 0, true, 0);
        mVar.e.b(new ArrayList(hashSet));
        i iVar = mVar.f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        mVar.y.clear();
        mVar.actionBar.w();
        mVar.a.g3.O(true);
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !i5.c.A(" ", lowerCase2, lowerCase) && !i5.c.A(".", lowerCase2, lowerCase)) {
            String N3 = org.telegram.messenger.g0.N3(lowerCase);
            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
            if (!N3.startsWith(N32) && !N3.contains(" ".concat(N32)) && !N3.contains(".".concat(N32))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, p41 p41Var) {
        CharSequence charSequence;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.w);
        i iVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                gj gjVar = (gj) obj;
                String a10 = k.a(gjVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = g.b;
                    b41 K = b41.K(g.class);
                    K.z = 3;
                    K.q = false;
                    K.H = gjVar;
                    K.L(j0(gjVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!iVar.f) {
                arrayList.add(b41.q(arrayList.size(), 32));
                arrayList.add(b41.q(arrayList.size(), 32));
                arrayList.add(b41.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.a;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                gj gjVar2 = (gj) obj2;
                String a11 = k.a(gjVar2);
                if (!TextUtils.isEmpty(a11) && !a11.startsWith("#") && !a11.startsWith("$") && !a11.startsWith("@")) {
                    hashSet.add(a11);
                    String K0 = org.telegram.messenger.g0.K0(a11, true);
                    z1 a12 = a2.b().a(K0);
                    TLRPC.Message message = gjVar2.k;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    String str = (webPage == null || TextUtils.isEmpty(webPage.site_name)) ? (a12 == null || TextUtils.isEmpty(a12.d)) ? null : a12.d : webPage.site_name;
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (k0(K0, this.w) || k0(str, this.w) || k0(str2, this.w)) {
                        String str3 = this.w;
                        int i12 = g.b;
                        b41 K2 = b41.K(g.class);
                        K2.z = 3;
                        K2.q = false;
                        K2.H = gjVar2;
                        K2.m = str3;
                        K2.L(j0(gjVar2));
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
                gj gjVar3 = (gj) obj3;
                String a13 = k.a(gjVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.w;
                    int i14 = g.b;
                    b41 K3 = b41.K(g.class);
                    K3.z = 3;
                    K3.q = false;
                    K3.H = gjVar3;
                    K3.m = str4;
                    K3.L(j0(gjVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f.f) {
                arrayList.add(b41.q(arrayList.size(), 32));
                arrayList.add(b41.q(arrayList.size(), 32));
                arrayList.add(b41.q(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(b41.C(charSequence));
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return hd.M0(2131742939, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
        if (b41Var.H(g.class)) {
            if (this.actionBar.x()) {
                h0(b41Var, view);
                return;
            }
            finishFragment();
            this.n.a(k.a((gj) b41Var.H));
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        if (!b41Var.H(g.class)) {
            return false;
        }
        h0(b41Var, view);
        return true;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = j6.d6;
        q6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(j6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        q6.l(kVar2, 5, i10, getResourceProvider());
        q6.l(this.actionBar, 3, j6.z8, getResourceProvider());
        q6.l(this.actionBar, 1, i10, getResourceProvider());
        q6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 22));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.x = numberTextView;
        numberTextView.setTextSize(18);
        this.x.setTypeface(org.telegram.messenger.g0.o());
        this.x.setTextColor(getThemedColor(j6.y8));
        this.x.setOnTouchListener(new gi.a(2));
        p10.addView(this.x, ja.m(1.0f, 0, -1, 65, 0, 0));
        this.s = p10.h(R.id.menu_link, R.drawable.msg_message, org.telegram.messenger.g0.L(54.0f), hd.M0(2131754877, null));
        p10.h(R.id.menu_delete, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), hd.M0(2131751598, null));
        org.telegram.ui.ActionBar.q0 c10 = this.actionBar.s().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.O();
        c10.I = new s2(this);
        this.r = c10;
        c10.setSearchFieldHint(hd.M0(2131745836, null));
        this.r.setContentDescription(hd.M0(2131745836, null));
        EditTextBoldCursor searchField = this.r.getSearchField();
        q6.U(searchField, i10, getResourceProvider());
        q6.D(searchField, j6.Jj, getResourceProvider());
        q6.v(searchField, i10, getResourceProvider());
        this.a.j(new ri(this, 26));
        cv0 cv0Var = new cv0(context, null, 1, null);
        cv0Var.d.setText(hd.M0(2131742919, null));
        cv0Var.e.setVisibility(8);
        cv0Var.e(false, false);
        cv0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(cv0Var, ja.c(-1.0f, -1));
        this.a.setEmptyView(cv0Var);
        return this.fragmentView;
    }

    public final void h0(b41 b41Var, View view) {
        h hVar = (h) view;
        gj gjVar = (gj) b41Var.H;
        boolean j02 = j0(gjVar);
        HashSet hashSet = this.y;
        if (j02) {
            if (gjVar != null) {
                hashSet.remove(Integer.valueOf(gjVar.e1()));
            }
            hVar.setChecked(false);
        } else {
            if (gjVar != null) {
                hashSet.add(Integer.valueOf(gjVar.e1()));
            }
            hVar.setChecked(true);
        }
        this.x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.w();
        } else {
            this.actionBar.R(null, null);
        }
        org.telegram.messenger.g0.U3(this.s, hashSet.size() == 1, true);
    }

    public final void i0() {
        HashSet hashSet = this.y;
        if (hashSet.size() != 1) {
            return;
        }
        long e10 = m10.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.g0.i3(new j9(e10, intValue, 3), 80L);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(getThemedColor(j6.d6)) > 0.721f;
    }

    public final boolean j0(gj gjVar) {
        if (gjVar != null) {
            return this.y.contains(Integer.valueOf(gjVar.e1()));
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
        this.a.g3.O(true);
        if (i10 >= 0) {
            this.a.f3.h1(i10, i7);
        } else {
            this.a.f3.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        this.e.a();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.e.c();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(j6.x0(null, j6.d6, false));
            }
            NumberTextView numberTextView = this.x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(j6.y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.r;
            if (q0Var == null || q0Var.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(j6.G6));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
