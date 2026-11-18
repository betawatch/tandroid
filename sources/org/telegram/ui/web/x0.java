package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.cb;
import c8.ma;
import hi.t2;
import hi.t6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.hs0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class x0 extends b51 {
    public final x10 e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.r0 x;
    public kv0 y;
    public ArrayList f = cb.a(new t6(this, 23));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public x0(org.telegram.ui.z zVar, x10 x10Var) {
        this.e = x10Var;
    }

    @Override // org.telegram.ui.Components.b51
    public final void Z(ArrayList arrayList, z41 z41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) this.f.get(size);
                    calendar.setTimeInMillis(w0Var.b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(l41.r(gd.u(w0Var.b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.r;
                    int i13 = g.b;
                    l41 K = l41.K(g.class);
                    K.A = 3;
                    K.r = false;
                    K.I = w0Var;
                    K.n = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                w0 w0Var2 = (w0) arrayList3.get(size2);
                calendar.setTimeInMillis(w0Var2.b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(l41.r(gd.u(w0Var2.b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.r;
                int i16 = g.b;
                l41 K2 = l41.K(g.class);
                K2.A = 3;
                K2.r = false;
                K2.I = w0Var2;
                K2.n = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.n) {
                arrayList.add(l41.p(32));
                arrayList.add(l41.p(32));
                arrayList.add(l41.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(l41.C(null));
    }

    @Override // org.telegram.ui.Components.b51
    public final CharSequence a0() {
        return gd.M0(2131742662, null);
    }

    @Override // org.telegram.ui.Components.b51
    public final void b0(l41 l41Var, View view) {
        if (!l41Var.H(g.class) || this.actionBar.y()) {
            return;
        }
        finishFragment();
        this.e.a((w0) l41Var.I);
    }

    @Override // org.telegram.ui.Components.b51
    public final boolean c0(l41 l41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.b51, org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = n6.d6;
        u6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(n6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = n6.G6;
        u6.l(kVar2, 5, i10, getResourceProvider());
        u6.l(this.actionBar, 3, n6.z8, getResourceProvider());
        u6.l(this.actionBar, 1, i10, getResourceProvider());
        u6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new hs0(this, 25));
        org.telegram.ui.ActionBar.z q10 = this.actionBar.q(null);
        NumberTextView numberTextView = new NumberTextView(q10.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setTextColor(getThemedColor(n6.y8));
        this.s.setOnTouchListener(new gi.a(2));
        q10.addView(this.s, ma.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.t().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.O();
        c10.I = new t2(this);
        this.x = c10;
        c10.setSearchFieldHint(gd.M0(2131745641, null));
        this.x.setContentDescription(gd.M0(2131745641, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        u6.U(searchField, i10, getResourceProvider());
        u6.D(searchField, n6.Jj, getResourceProvider());
        u6.v(searchField, i10, getResourceProvider());
        kv0 kv0Var = new kv0(context, null, 1, null);
        this.y = kv0Var;
        kv0Var.d.setText(gd.M0(TextUtils.isEmpty(this.r) ? 2131742660 : 2131742659, null));
        this.y.e.setVisibility(8);
        this.y.e(false, false);
        this.y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.y, ma.c(-1.0f, -1));
        this.a.setEmptyView(this.y);
        this.a.j(new oa(this, 28));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(getThemedColor(n6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(n6.x0(null, n6.d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(n6.y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.x;
            if (r0Var == null || r0Var.getSearchField() == null) {
                return;
            }
            this.x.getSearchField().setCursorColor(getThemedColor(n6.G6));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
